package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;

/* compiled from: AsusHomeBadger.java */
/* loaded from: classes11.dex */
public final class lx3 implements gz5 {
    @Override // xsna.gz5
    public final List<String> a() {
        return Arrays.asList("com.asus.launcher");
    }

    @Override // xsna.gz5
    public final void b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i);
        intent.putExtra("badge_count_package_name", componentName.getPackageName());
        intent.putExtra("badge_count_class_name", componentName.getClassName());
        intent.putExtra("badge_vip_count", 0);
        Intent intent2 = new Intent(intent);
        intent2.setAction("me.leolin.shortcutbadger.BADGE_COUNT_UPDATE");
        try {
            kg8.a(context, intent2);
        } catch (ShortcutBadgeException unused) {
            kg8.a(context, intent);
        }
    }
}
