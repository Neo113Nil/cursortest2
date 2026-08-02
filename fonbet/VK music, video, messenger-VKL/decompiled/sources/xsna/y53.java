package xsna;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import com.vk.appredirects.entity.App;

/* compiled from: App.kt */
/* loaded from: classes15.dex */
public final class y53 {
    public static final int a(App app2, Context context) {
        try {
            Cursor query = context.getContentResolver().query(Uri.parse("content://" + app2.i() + "/version"), null, null, null, null);
            if (query != null) {
                try {
                    if (!query.isAfterLast()) {
                        query.moveToFirst();
                        int columnIndex = query.getColumnIndex("version");
                        if (columnIndex == -1) {
                            ro.e(query, null);
                            return 0;
                        }
                        int i = query.getInt(columnIndex);
                        ro.e(query, null);
                        return i;
                    }
                } finally {
                }
            }
            ro.e(query, null);
        } catch (Exception unused) {
        }
        return 0;
    }

    public static final String b(App app2, Context context) {
        ApplicationInfo applicationInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(app2.j().getPackageName(), 0);
            if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null) {
                String obj = packageManager.getApplicationLabel(applicationInfo).toString();
                if (obj != null) {
                    return obj;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return "unknown";
    }
}
