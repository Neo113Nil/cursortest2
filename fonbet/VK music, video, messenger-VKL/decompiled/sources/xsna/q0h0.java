package xsna;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;
import me.leolin.shortcutbadger.impl.DefaultBadger;

/* compiled from: SamsungHomeBadger.java */
/* loaded from: classes11.dex */
public final class q0h0 implements gz5 {
    public static final String[] b = {"_id", "class"};
    public final DefaultBadger a = new DefaultBadger();

    public static ContentValues c(ComponentName componentName, int i, boolean z) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i));
        return contentValues;
    }

    @Override // xsna.gz5
    public final List<String> a() {
        return Arrays.asList("com.sec.android.app.launcher", "com.sec.android.app.twlauncher");
    }

    @Override // xsna.gz5
    public final void b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(new Intent("android.intent.action.BADGE_COUNT_UPDATE"), 0);
        if (queryBroadcastReceivers == null) {
            queryBroadcastReceivers = Collections.EMPTY_LIST;
        }
        if (queryBroadcastReceivers.size() <= 0) {
            List<ResolveInfo> queryBroadcastReceivers2 = context.getPackageManager().queryBroadcastReceivers(new Intent("me.leolin.shortcutbadger.BADGE_COUNT_UPDATE"), 0);
            if (queryBroadcastReceivers2 == null) {
                queryBroadcastReceivers2 = Collections.EMPTY_LIST;
            }
            if (queryBroadcastReceivers2.size() <= 0) {
                Uri parse = Uri.parse("content://com.sec.badge/apps?notify=true");
                ContentResolver contentResolver = context.getContentResolver();
                Cursor cursor = null;
                try {
                    cursor = contentResolver.query(parse, b, "package=?", new String[]{componentName.getPackageName()}, null);
                    if (cursor != null) {
                        String className = componentName.getClassName();
                        boolean z = false;
                        while (cursor.moveToNext()) {
                            contentResolver.update(parse, c(componentName, i, false), "_id=?", new String[]{String.valueOf(cursor.getInt(0))});
                            if (className.equals(cursor.getString(cursor.getColumnIndex("class")))) {
                                z = true;
                            }
                        }
                        if (!z) {
                            contentResolver.insert(parse, c(componentName, i, true));
                        }
                    }
                    vua0.d(cursor);
                    return;
                } catch (Throwable th) {
                    vua0.d(cursor);
                    throw th;
                }
            }
        }
        this.a.b(context, componentName, i);
    }
}
