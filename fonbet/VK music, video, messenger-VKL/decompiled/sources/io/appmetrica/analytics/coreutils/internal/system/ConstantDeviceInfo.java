package io.appmetrica.analytics.coreutils.internal.system;

import android.annotation.SuppressLint;
import android.os.Build;

/* loaded from: classes8.dex */
public final class ConstantDeviceInfo {
    public static final String APP_PLATFORM = "android";
    public static final ConstantDeviceInfo INSTANCE = new ConstantDeviceInfo();
    public static final String MANUFACTURER = Build.MANUFACTURER;
    public static final String MODEL = Build.MODEL;
    public static final String OS_VERSION = Build.VERSION.RELEASE;

    @SuppressLint({"AnnotateVersionCheck"})
    public static final int OS_API_LEVEL = Build.VERSION.SDK_INT;
    public static final String DEVICE_ROOT_STATUS = String.valueOf(RootChecker.isRootedPhone());

    private ConstantDeviceInfo() {
    }
}
