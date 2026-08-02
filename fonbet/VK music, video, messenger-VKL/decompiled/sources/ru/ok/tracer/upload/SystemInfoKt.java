package ru.ok.tracer.upload;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import ru.ok.tracer.HasTracerSystemInfo;
import ru.ok.tracer.base.compat.PackageManagerCompat;
import ru.ok.tracer.base.process.ProcessUtils;

/* compiled from: SystemInfo.kt */
/* loaded from: classes11.dex */
public final class SystemInfoKt {
    private static final String getOperatorInfo(Context context) {
        Object systemService = context.getSystemService("phone");
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        if (telephonyManager != null) {
            return telephonyManager.getNetworkOperatorName();
        }
        return null;
    }

    public static final Map<String, String> getSystemProperties(Context context) {
        MapBuilder mapBuilder = new MapBuilder();
        Object applicationContext = context.getApplicationContext();
        if (applicationContext instanceof HasTracerSystemInfo) {
            try {
                mapBuilder.putAll(((HasTracerSystemInfo) applicationContext).getTracerSystemInfo());
            } catch (Throwable unused) {
            }
        }
        mapBuilder.put("board", Build.BOARD);
        mapBuilder.put("brand", Build.BRAND);
        mapBuilder.put("cpuABI", TextUtils.join(", ", Build.SUPPORTED_ABIS));
        mapBuilder.put("device", Build.DEVICE);
        mapBuilder.put("manufacturer", Build.MANUFACTURER);
        mapBuilder.put("model", Build.MODEL);
        mapBuilder.put("cpuCount", String.valueOf(Runtime.getRuntime().availableProcessors()));
        mapBuilder.put("osVersionSdkInt", String.valueOf(Build.VERSION.SDK_INT));
        mapBuilder.put("osVersionRelease", Build.VERSION.RELEASE);
        String simpleProcessName = ProcessUtils.getSimpleProcessName(context);
        if (simpleProcessName != null) {
        }
        String operatorInfo = getOperatorInfo(context);
        if (operatorInfo != null) {
        }
        String installerPackageNameCompat = PackageManagerCompat.getInstallerPackageNameCompat(context.getPackageManager(), context.getPackageName());
        if (installerPackageNameCompat != null) {
            mapBuilder.put("installer", installerPackageNameCompat);
        }
        return mapBuilder.h();
    }
}
