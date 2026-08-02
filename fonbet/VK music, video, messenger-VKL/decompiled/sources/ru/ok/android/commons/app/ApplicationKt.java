package ru.ok.android.commons.app;

import android.app.Application;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.Result;

/* compiled from: Application.kt */
/* loaded from: classes9.dex */
public final class ApplicationKt {
    public static final String getInstallerPackageName(Application application) {
        Object failure;
        InstallSourceInfo installSourceInfo;
        PackageManager packageManager = application.getPackageManager();
        String packageName = application.getPackageName();
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                installSourceInfo = packageManager.getInstallSourceInfo(packageName);
                failure = installSourceInfo.getInstallingPackageName();
            } else {
                failure = packageManager.getInstallerPackageName(packageName);
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (String) failure;
    }

    public static final PackageInfo getPackageInfo(Application application, int i) throws PackageManager.NameNotFoundException {
        return application.getPackageManager().getPackageInfo(application.getPackageName(), i);
    }

    public static final boolean isDebuggable(Application application) {
        return ApplicationInfoKt.isDebuggable(application.getApplicationInfo());
    }
}
