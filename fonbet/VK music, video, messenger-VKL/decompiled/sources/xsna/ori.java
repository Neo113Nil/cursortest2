package xsna;

import android.view.View;
import xsna.nri;

/* compiled from: ViewExt.kt */
/* loaded from: classes7.dex */
public final class ori implements View.OnAttachStateChangeListener {
    public final /* synthetic */ spo0 b;

    public ori(spo0 spo0Var, nri nriVar) {
        this.b = spo0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b.removeOnAttachStateChangeListener(this);
        if (androidx.compose.runtime.b.d()) {
            return;
        }
        androidx.compose.runtime.b.a = new nri.a(nri.c.a, new nri.b(false));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
