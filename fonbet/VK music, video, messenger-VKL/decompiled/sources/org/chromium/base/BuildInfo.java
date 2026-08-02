package org.chromium.base;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Process;
import com.facebook.soloader.MinElf;
import internal.org.chromium.build.NativeLibraries;
import internal.org.jni_zero.CalledByNative;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Deprecated
/* loaded from: classes8.dex */
public class BuildInfo {
    private static final String TAG = "BuildInfo";
    public final String abiString;
    public final String androidBuildFingerprint;
    public final String hostPackageLabel;
    public final String hostPackageName;
    public final String hostVersionCode;
    public final String installerPackageName;
    public final boolean isAutomotive;
    public final boolean isFoldable;
    public final boolean isTV;
    private final Object mCertLock;
    private String mHostSigningCertSha256;
    public final String packageName;
    public final String resourcesVersion;
    public final long versionCode;
    public final String versionName;
    public final int vulkanDeqpLevel;

    public static class Holder {
        private static final BuildInfo INSTANCE = new BuildInfo(0);

        private Holder() {
        }
    }

    public /* synthetic */ BuildInfo(int i) {
        this();
    }

    public static String getArch() {
        boolean is64Bit = Process.is64Bit();
        return NativeLibraries.sCpuFamily == 1 ? is64Bit ? "arm64" : "arm" : NativeLibraries.sCpuFamily == 3 ? is64Bit ? MinElf.ISA.X86_64 : MinElf.ISA.X86 : "";
    }

    public static BuildInfo getInstance() {
        return Holder.INSTANCE;
    }

    private int getPackageInfoFlags() {
        return 134217728;
    }

    private Signature[] getPackageSignatures(PackageInfo packageInfo) {
        SigningInfo signingInfo = packageInfo.signingInfo;
        if (signingInfo == null) {
            return null;
        }
        return signingInfo.getSigningCertificateHistory();
    }

    public static boolean isDebugAndroid() {
        return AndroidInfo.isDebugAndroid();
    }

    public static boolean isDebugAndroidOrApp() {
        return isDebugAndroid() || isDebugApp();
    }

    public static boolean isDebugApp() {
        return ApkInfo.isDebugApp();
    }

    @CalledByNative
    private static String lazyGetHostSigningCertSha256() {
        return getInstance().getHostSigningCertSha256();
    }

    public static long packageVersionCode(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static void setBrowserPackageInfo(PackageInfo packageInfo) {
        ApkInfo.setBrowserPackageInfo(packageInfo);
    }

    public static void setGmsVersionCodeForTest(String str) {
        DeviceInfo.setGmsVersionCodeForTest(str);
    }

    public ApplicationInfo getBrowserApplicationInfo() {
        return ApkInfo.getInstance().getBrowserApplicationInfo();
    }

    public String getGmsVersionCode() {
        return DeviceInfo.getGmsVersionCode();
    }

    public String getHostSigningCertSha256() {
        String str;
        synchronized (this.mCertLock) {
            if (this.mHostSigningCertSha256 == null) {
                String str2 = "";
                Signature[] packageSignatures = getPackageSignatures(PackageUtils.getPackageInfo(ContextUtils.getApplicationContext().getPackageName(), getPackageInfoFlags()));
                if (packageSignatures != null) {
                    try {
                        str2 = PackageUtils.byteArrayToHexString(MessageDigest.getInstance("SHA-256").digest(packageSignatures[packageSignatures.length - 1].toByteArray()));
                    } catch (NoSuchAlgorithmException e) {
                        Log.w(TAG, "Unable to hash host app signature", (Throwable) e);
                    }
                }
                this.mHostSigningCertSha256 = str2;
            }
            str = this.mHostSigningCertSha256;
        }
        return str;
    }

    private BuildInfo() {
        this.versionCode = 1L;
        this.mCertLock = new Object();
        this.hostPackageName = ApkInfo.getHostPackageName();
        this.hostPackageLabel = ApkInfo.getHostPackageLabel();
        this.hostVersionCode = ApkInfo.getHostVersionCode();
        this.packageName = ApkInfo.getPackageName();
        this.versionName = ApkInfo.getPackageVersionName();
        this.installerPackageName = ApkInfo.getInstallerPackageName();
        this.abiString = AndroidInfo.getAndroidSupportedAbis();
        this.androidBuildFingerprint = AndroidInfo.getAndroidBuildFingerprint();
        this.resourcesVersion = ApkInfo.getResourcesVersion();
        this.isTV = DeviceInfo.isTV();
        this.isAutomotive = DeviceInfo.isAutomotive();
        this.isFoldable = DeviceInfo.isFoldable();
        this.vulkanDeqpLevel = DeviceInfo.getVulkanDeqpLevel();
    }
}
