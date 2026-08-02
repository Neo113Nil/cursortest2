package xsna;

import android.app.Activity;
import android.content.SharedPreferences;
import xsna.c63;

/* compiled from: HeadsetAppResumedListener.kt */
/* loaded from: classes.dex */
public final class vyu extends c63.a {
    @Override // xsna.c63.b
    public final void x(Activity activity) {
        bn40.f("HSNMan", "onAppForeground");
        bzu bzuVar = bzu.b;
        boolean d = bzu.d();
        boolean z = System.currentTimeMillis() - ((SharedPreferences) bzu.f.getValue()).getLong("__KEY_LAST_INSERTED_TIME__", 0L) < 10000;
        bn40.f("HSNMan", "isNotificationRequestedInBg:", Boolean.valueOf(z), "isPlayingMusic:", Boolean.valueOf(d));
        if (z) {
            bzu.b();
            if (d) {
                return;
            }
            bzu.e();
        }
    }
}
