package xsna;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;

/* compiled from: ZukHomeBadger.java */
/* loaded from: classes11.dex */
public final class w7y0 implements gz5 {
    public final Uri a = Uri.parse("content://com.android.badge/badge");

    @Override // xsna.gz5
    public final List<String> a() {
        return Collections.singletonList("com.zui.launcher");
    }

    @Override // xsna.gz5
    @TargetApi(11)
    public final void b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        context.getContentResolver().call(this.a, "setAppBadgeCount", (String) null, ar.b(i, "app_badge_count"));
    }
}
