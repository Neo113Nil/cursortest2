package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.core.app.b;
import com.fluttercandies.photo_manager.core.entity.PermissionResult;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public abstract class lya0 {
    public ozj0 a;

    public static boolean d(Context context, String str) {
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (Build.VERSION.SDK_INT >= 33) {
            PackageManager packageManager = context.getPackageManager();
            String str2 = applicationInfo.packageName;
            of = PackageManager.PackageInfoFlags.of(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
            packageInfo = packageManager.getPackageInfo(str2, of);
        } else {
            packageInfo = context.getPackageManager().getPackageInfo(applicationInfo.packageName, 4096);
        }
        String[] strArr = packageInfo.requestedPermissions;
        return strArr != null && j73.y(strArr, str) && qke.h(context, str) == 0;
    }

    public static void h(t0b0 t0b0Var, ArrayList arrayList, int i) {
        Activity activity = t0b0Var.a;
        if (activity == null) {
            ny61.t("Activity for the permission request is not exist.");
            return;
        }
        ArrayList arrayList2 = t0b0Var.d;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        b.J(activity, (String[]) arrayList.toArray(new String[0]), i);
        wfz.d("requestPermission: " + arrayList + " for code " + i);
    }

    public abstract PermissionResult a(Application application, int i);

    public void b(t0b0 t0b0Var, Context context, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i) {
        throw new UnsupportedOperationException("handlePermissionResult is not implemented, please implement it in your delegate.");
    }

    public abstract boolean c(Context context);

    public final boolean e(Context context, String... strArr) {
        int length = strArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = true;
                break;
            }
            if (!d(context, strArr[i])) {
                break;
            }
            i++;
        }
        StringBuilder r = xvz.r("[", getClass().getSimpleName(), "] havePermissions: ", j73.d0(strArr), ", result: ");
        r.append(z);
        wfz.d(r.toString());
        return z;
    }

    public void f(t0b0 t0b0Var, int i, ozj0 ozj0Var) {
        wfz.d("[" + getClass().getSimpleName() + "] presentLimited is not implemented");
        ozj0Var.a(null);
    }

    public abstract void g(t0b0 t0b0Var, Context context, int i, boolean z);
}
