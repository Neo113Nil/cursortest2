package xsna;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;

/* compiled from: EverythingMeHomeBadger.java */
/* loaded from: classes11.dex */
public final class l1q implements gz5 {
    @Override // xsna.gz5
    public final List<String> a() {
        return Arrays.asList("me.everything.launcher");
    }

    @Override // xsna.gz5
    public final void b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        ContentValues contentValues = new ContentValues();
        contentValues.put("package_name", componentName.getPackageName());
        contentValues.put("activity_name", componentName.getClassName());
        contentValues.put("count", Integer.valueOf(i));
        context.getContentResolver().insert(Uri.parse("content://me.everything.badger/apps"), contentValues);
    }
}
