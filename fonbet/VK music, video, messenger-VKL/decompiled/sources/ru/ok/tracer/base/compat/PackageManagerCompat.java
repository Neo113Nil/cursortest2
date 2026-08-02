package ru.ok.tracer.base.compat;

import android.content.ComponentName;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Build;

/* compiled from: PackageManagerCompat.kt */
/* loaded from: classes11.dex */
public final class PackageManagerCompat {
    public static final ApplicationInfo getApplicationInfoCompat(PackageManager packageManager, String str, int i) {
        PackageManager.ApplicationInfoFlags of;
        ApplicationInfo applicationInfo;
        if (Build.VERSION.SDK_INT < 33) {
            return packageManager.getApplicationInfo(str, i);
        }
        of = PackageManager.ApplicationInfoFlags.of(i);
        applicationInfo = packageManager.getApplicationInfo(str, of);
        return applicationInfo;
    }

    public static final String getInstallerPackageNameCompat(PackageManager packageManager, String str) {
        InstallSourceInfo installSourceInfo;
        String installingPackageName;
        if (Build.VERSION.SDK_INT < 30) {
            return packageManager.getInstallerPackageName(str);
        }
        installSourceInfo = packageManager.getInstallSourceInfo(str);
        installingPackageName = installSourceInfo.getInstallingPackageName();
        return installingPackageName;
    }

    public static final PackageInfo getPackageInfoCompat(PackageManager packageManager, String str, int i) {
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        if (Build.VERSION.SDK_INT < 33) {
            return packageManager.getPackageInfo(str, i);
        }
        of = PackageManager.PackageInfoFlags.of(i);
        packageInfo = packageManager.getPackageInfo(str, of);
        return packageInfo;
    }

    public static final ProviderInfo getProviderInfoCompat(PackageManager packageManager, ComponentName componentName, int i) {
        PackageManager.ComponentInfoFlags of;
        ProviderInfo providerInfo;
        if (Build.VERSION.SDK_INT < 33) {
            return packageManager.getProviderInfo(componentName, i);
        }
        of = PackageManager.ComponentInfoFlags.of(i);
        providerInfo = packageManager.getProviderInfo(componentName, of);
        return providerInfo;
    }
}
