package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;

/* compiled from: OPPOHomeBader.java */
/* loaded from: classes11.dex */
public final class to70 implements gz5 {
    public int a = -1;

    @Override // xsna.gz5
    public final List<String> a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    @Override // xsna.gz5
    public final void b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        if (this.a == i) {
            return;
        }
        this.a = i;
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i);
        context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
    }
}
