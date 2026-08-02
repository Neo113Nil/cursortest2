package xsna;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.media.MediaRouter2;
import androidx.annotation.NonNull;
import java.util.Iterator;

/* compiled from: SystemOutputSwitcherDialogController.java */
/* loaded from: classes12.dex */
public final class arn0 {

    /* compiled from: SystemOutputSwitcherDialogController.java */
    public static class a {
        public static MediaRouter2 a(Context context) {
            return MediaRouter2.getInstance(context);
        }
    }

    /* compiled from: SystemOutputSwitcherDialogController.java */
    public static class b {
        public static boolean a(MediaRouter2 mediaRouter2) {
            return mediaRouter2.showSystemOutputSwitcher();
        }
    }

    public static boolean a(@NonNull Context context) {
        ApplicationInfo applicationInfo;
        Intent putExtra = new Intent().addFlags(268435456).setAction("com.android.settings.panel.action.MEDIA_OUTPUT").putExtra("com.android.settings.panel.extra.PACKAGE_NAME", context.getPackageName());
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(putExtra, 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && (applicationInfo = activityInfo.applicationInfo) != null && (applicationInfo.flags & 129) != 0) {
                putExtra.setPackage(applicationInfo.packageName);
                context.startActivity(putExtra);
                return true;
            }
        }
        return false;
    }
}
