package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class da31 extends m65 {
    public static final da31 a = new da31();

    public static Long a(Context context) {
        Object failure;
        long longVersionCode;
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = context.getPackageManager();
                String packageName = context.getPackageName();
                of = PackageManager.PackageInfoFlags.of(0L);
                packageInfo = packageManager.getPackageInfo(packageName, of);
                longVersionCode = packageInfo.getLongVersionCode();
            } else {
                longVersionCode = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).getLongVersionCode();
            }
            failure = Long.valueOf(longVersionCode);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (Long) failure;
    }
}
