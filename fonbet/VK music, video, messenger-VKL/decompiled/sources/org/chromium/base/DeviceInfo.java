package org.chromium.base;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import internal.org.jni_zero.CalledByNative;
import xsna.e6m;
import xsna.f6m;

/* loaded from: classes8.dex */
public final class DeviceInfo {
    private static final Object CREATION_LOCK = new Object();
    private static final String TAG = "DeviceInfo";
    private static String sGmsVersionCodeForTesting;
    private static boolean sInitialized;
    private static DeviceInfo sInstance;
    private static Boolean sIsAutomotiveForTesting;
    private static boolean sIsXrForTesting;
    private final IDeviceInfo mIDeviceInfo;

    public interface Natives {
        void fillFields(String str, boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5);
    }

    private DeviceInfo() {
        boolean z;
        FeatureInfo[] systemAvailableFeatures;
        IDeviceInfo iDeviceInfo = new IDeviceInfo();
        this.mIDeviceInfo = iDeviceInfo;
        sInitialized = true;
        int i = 0;
        PackageInfo packageInfo = PackageUtils.getPackageInfo("com.google.android.gms", 0);
        iDeviceInfo.gmsVersionCode = packageInfo != null ? String.valueOf(packageVersionCode(packageInfo)) : "gms versionCode not available.";
        String str = sGmsVersionCodeForTesting;
        if (str != null) {
            iDeviceInfo.gmsVersionCode = str;
        }
        Context applicationContext = ContextUtils.getApplicationContext();
        PackageManager packageManager = applicationContext.getPackageManager();
        UiModeManager uiModeManager = (UiModeManager) applicationContext.getSystemService("uimode");
        iDeviceInfo.isTv = uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
        try {
            z = packageManager.hasSystemFeature("android.hardware.type.automotive");
        } catch (SecurityException e) {
            Log.e(TAG, "Unable to query for Automotive system feature", (Throwable) e);
            z = false;
        }
        IDeviceInfo iDeviceInfo2 = this.mIDeviceInfo;
        iDeviceInfo2.isAutomotive = z;
        Boolean bool = sIsAutomotiveForTesting;
        if (bool != null) {
            iDeviceInfo2.isAutomotive = bool.booleanValue();
        }
        IDeviceInfo iDeviceInfo3 = this.mIDeviceInfo;
        int i2 = Build.VERSION.SDK_INT;
        iDeviceInfo3.isFoldable = i2 >= 30 && packageManager.hasSystemFeature("android.hardware.sensor.hinge_angle");
        this.mIDeviceInfo.isDesktop = CommandLine.getInstance().hasSwitch(BaseSwitches.FORCE_DESKTOP_ANDROID);
        if (i2 >= 33 && (systemAvailableFeatures = packageManager.getSystemAvailableFeatures()) != null) {
            int length = systemAvailableFeatures.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                FeatureInfo featureInfo = systemAvailableFeatures[i3];
                if ("android.software.vulkan.deqp.level".equals(featureInfo.name)) {
                    i = featureInfo.version;
                    break;
                }
                i3++;
            }
        }
        IDeviceInfo iDeviceInfo4 = this.mIDeviceInfo;
        iDeviceInfo4.vulkanDeqpLevel = i;
        iDeviceInfo4.isXr = packageManager.hasSystemFeature(PackageManagerUtils.XR_OPENXR_FEATURE_NAME);
    }

    public static IDeviceInfo getAidlInfo() {
        return getInstance().mIDeviceInfo;
    }

    public static String getGmsVersionCode() {
        return getInstance().mIDeviceInfo.gmsVersionCode;
    }

    private static DeviceInfo getInstance() {
        DeviceInfo deviceInfo;
        synchronized (CREATION_LOCK) {
            try {
                if (sInstance == null) {
                    sInstance = new DeviceInfo();
                }
                deviceInfo = sInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return deviceInfo;
    }

    public static int getVulkanDeqpLevel() {
        return getInstance().mIDeviceInfo.vulkanDeqpLevel;
    }

    public static boolean isAutomotive() {
        return getInstance().mIDeviceInfo.isAutomotive;
    }

    public static boolean isDesktop() {
        return getInstance().mIDeviceInfo.isDesktop;
    }

    public static boolean isFoldable() {
        return getInstance().mIDeviceInfo.isFoldable;
    }

    public static boolean isInitializedForTesting() {
        return sInitialized;
    }

    public static boolean isTV() {
        return getInstance().mIDeviceInfo.isTv;
    }

    public static boolean isXr() {
        return getInstance().mIDeviceInfo.isXr;
    }

    @CalledByNative
    private static void nativeReadyForFields() {
        sendToNative(getInstance().mIDeviceInfo);
    }

    public static long packageVersionCode(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static void resetIsXrForTesting() {
        sIsXrForTesting = false;
    }

    public static void sendToNative(IDeviceInfo iDeviceInfo) {
        DeviceInfoJni.get().fillFields(iDeviceInfo.gmsVersionCode, iDeviceInfo.isTv, iDeviceInfo.isAutomotive, iDeviceInfo.isFoldable, iDeviceInfo.isDesktop, iDeviceInfo.vulkanDeqpLevel, sIsXrForTesting ? true : iDeviceInfo.isXr);
    }

    public static void setGmsVersionCodeForTest(String str) {
        sGmsVersionCodeForTesting = str;
        ResettersForTesting.register(new f6m(0));
    }

    public static void setIsAutomotiveForTesting(boolean z) {
        sIsAutomotiveForTesting = Boolean.valueOf(z);
        ResettersForTesting.register(new e6m());
    }

    public static void setIsXrForTesting() {
        sIsXrForTesting = true;
    }
}
