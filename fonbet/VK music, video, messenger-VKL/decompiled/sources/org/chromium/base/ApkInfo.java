package org.chromium.base;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import internal.org.jni_zero.CalledByNative;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.chromium.base.version_info.VersionInfo;
import xsna.pzl;

/* loaded from: classes11.dex */
public final class ApkInfo {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Object CREATION_LOCK = new Object();
    private static final String TAG = "ApkInfo";
    private static PackageInfo sBrowserPackageInfo;
    private static boolean sInitialized;
    private static volatile ApkInfo sInstance;
    private final ApplicationInfo mBrowserApplicationInfo;
    private final IApkInfo mIApkInfo;

    public interface Natives {
        void fillFields(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, int i);
    }

    private ApkInfo() {
        Long l;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String[] packagesForUid;
        sInitialized = true;
        IApkInfo iApkInfo = new IApkInfo();
        this.mIApkInfo = iApkInfo;
        Context applicationContext = ContextUtils.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        PackageManager packageManager = applicationContext.getPackageManager();
        iApkInfo.packageVersionCode = String.valueOf(1L);
        if (CommandLine.isInitialized()) {
            CommandLine commandLine = CommandLine.getInstance();
            str = commandLine.getSwitchValue(BaseSwitches.HOST_PACKAGE_NAME);
            str2 = commandLine.getSwitchValue(BaseSwitches.HOST_PACKAGE_LABEL);
            str3 = commandLine.getSwitchValue(BaseSwitches.PACKAGE_NAME);
            str4 = commandLine.getSwitchValue(BaseSwitches.PACKAGE_VERSION_NAME);
            String switchValue = commandLine.getSwitchValue(BaseSwitches.HOST_VERSION_CODE);
            l = switchValue != null ? Long.valueOf(Long.parseLong(switchValue)) : null;
        } else {
            l = null;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
        }
        boolean z = (str == null || str2 == null || l == null || str3 == null || str4 == null) ? false : true;
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        iApkInfo.isDebugApp = (applicationInfo.flags & 2) != 0;
        if (z) {
            iApkInfo.hostPackageName = str;
            iApkInfo.hostPackageLabel = str2;
            iApkInfo.hostVersionCode = String.valueOf(l);
            iApkInfo.packageVersionName = str4;
            iApkInfo.packageName = str3;
        } else {
            if (!ContextUtils.isSdkSandboxProcess() || (packagesForUid = packageManager.getPackagesForUid(Process.myUid() - 10000)) == null || packagesForUid.length <= 0) {
                str5 = packageName;
                str6 = str5;
            } else {
                str5 = packagesForUid[0];
                str6 = pzl.b(packageName, StringUtils.PROCESS_POSTFIX_DELIMITER, str5);
            }
            iApkInfo.hostPackageName = str6;
            iApkInfo.hostPackageLabel = nullToEmpty(packageManager.getApplicationLabel(applicationInfo));
            if (sBrowserPackageInfo != null) {
                iApkInfo.hostVersionCode = String.valueOf(PackageUtils.packageVersionCode(PackageUtils.getPackageInfo(str5, 0)));
                PackageInfo packageInfo = sBrowserPackageInfo;
                iApkInfo.packageName = packageInfo.packageName;
                iApkInfo.packageVersionName = nullToEmpty(packageInfo.versionName);
                applicationInfo = sBrowserPackageInfo.applicationInfo;
                sBrowserPackageInfo = null;
            } else {
                iApkInfo.packageName = packageName;
                iApkInfo.hostVersionCode = String.valueOf(1L);
                iApkInfo.packageVersionName = VersionInfo.getProductVersion();
            }
            packageName = str5;
        }
        this.mBrowserApplicationInfo = applicationInfo;
        iApkInfo.installerPackageName = nullToEmpty(packageManager.getInstallerPackageName(packageName));
        iApkInfo.resourcesVersion = "Not Enabled";
        iApkInfo.targetSdkVersion = applicationInfo.targetSdkVersion;
    }

    public static IApkInfo getAidlInfo() {
        return getInstance().mIApkInfo;
    }

    public static String getHostPackageLabel() {
        return getInstance().mIApkInfo.hostPackageLabel;
    }

    public static String getHostPackageName() {
        return getInstance().mIApkInfo.hostPackageName;
    }

    public static String getHostVersionCode() {
        return getInstance().mIApkInfo.hostVersionCode;
    }

    public static String getInstallerPackageName() {
        return getInstance().mIApkInfo.installerPackageName;
    }

    public static ApkInfo getInstance() {
        if (sInstance == null) {
            synchronized (CREATION_LOCK) {
                try {
                    if (sInstance == null) {
                        sInstance = new ApkInfo();
                    }
                } finally {
                }
            }
        }
        return sInstance;
    }

    public static String getPackageName() {
        return getInstance().mIApkInfo.packageName;
    }

    public static String getPackageVersionCode() {
        return getInstance().mIApkInfo.packageVersionCode;
    }

    public static String getPackageVersionName() {
        return getInstance().mIApkInfo.packageVersionName;
    }

    public static String getResourcesVersion() {
        return getInstance().mIApkInfo.resourcesVersion;
    }

    public static boolean isDebugApp() {
        return getInstance().mIApkInfo.isDebugApp;
    }

    public static boolean isInitializedForTesting() {
        return sInitialized;
    }

    @CalledByNative
    private static void nativeReadyForFields() {
        sendToNative(getInstance().mIApkInfo);
    }

    private static String nullToEmpty(CharSequence charSequence) {
        return charSequence == null ? "" : charSequence.toString();
    }

    public static void sendToNative(IApkInfo iApkInfo) {
        ApkInfoJni.get().fillFields(iApkInfo.hostPackageName, iApkInfo.hostVersionCode, iApkInfo.hostPackageLabel, iApkInfo.packageVersionCode, iApkInfo.packageVersionName, iApkInfo.packageName, iApkInfo.resourcesVersion, iApkInfo.installerPackageName, iApkInfo.isDebugApp, iApkInfo.targetSdkVersion);
    }

    public static void setBrowserPackageInfo(PackageInfo packageInfo) {
        sBrowserPackageInfo = packageInfo;
    }

    public static boolean targetAtLeastB() {
        return ContextUtils.getApplicationContext().getApplicationInfo().targetSdkVersion >= 36;
    }

    public ApplicationInfo getBrowserApplicationInfo() {
        return this.mBrowserApplicationInfo;
    }
}
