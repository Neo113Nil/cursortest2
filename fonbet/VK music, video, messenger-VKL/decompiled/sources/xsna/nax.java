package xsna;

import android.content.Intent;

/* compiled from: IntentExt.kt */
/* loaded from: classes17.dex */
public final class nax {
    public static final boolean a(Intent intent) {
        String str = intent.getPackage();
        return str == null || str.length() == 0 || intent.getComponent() == null;
    }

    public static final boolean b(Intent intent) {
        return intent != null && intent.hasCategory("android.intent.category.LAUNCHER") && epx.f(intent.getAction(), "android.intent.action.MAIN");
    }

    public static final boolean c(Intent intent) {
        if (a(intent)) {
            String action = intent.getAction();
            if (action != null ? brm0.B(action, "android.", false) : false) {
                return true;
            }
        }
        return false;
    }
}
