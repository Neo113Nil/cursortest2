package xsna;

import android.app.Activity;
import android.os.Looper;
import xsna.c63;

/* compiled from: LayoutPreInflater.kt */
/* loaded from: classes.dex */
public final class rpy extends c63.b {
    @Override // xsna.c63.b
    public final void x(Activity activity) {
        c63 c63Var = c63.a;
        c63.c(this);
        Looper.myQueue().addIdleHandler(new qpy());
    }
}
