package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* compiled from: ContextExt.kt */
/* loaded from: classes11.dex */
public final class gnj {
    public static final Bundle a(Context context) throws PackageManager.NameNotFoundException {
        Bundle bundle;
        ApplicationInfo applicationInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 128).applicationInfo;
        return (applicationInfo == null || (bundle = applicationInfo.metaData) == null) ? new Bundle() : bundle;
    }

    public static final Activity b(Context context) {
        boolean z;
        while (true) {
            z = context instanceof Activity;
            if (z || !(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (z) {
            return (Activity) context;
        }
        return null;
    }
}
