package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;

/* compiled from: ZTEHomeBadger.java */
/* loaded from: classes11.dex */
public final class a6y0 implements gz5 {
    @Override // xsna.gz5
    public final List<String> a() {
        return new ArrayList(0);
    }

    @Override // xsna.gz5
    public final void b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Bundle b = ar.b(i, "app_badge_count");
        b.putString("app_badge_component_name", componentName.flattenToString());
        context.getContentResolver().call(Uri.parse("content://com.android.launcher3.cornermark.unreadbadge"), "setAppUnreadCount", (String) null, b);
    }
}
