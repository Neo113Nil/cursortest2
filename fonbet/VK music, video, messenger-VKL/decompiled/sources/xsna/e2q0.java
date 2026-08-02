package xsna;

import android.view.View;

/* compiled from: UiViewedTimeChecker.kt */
/* loaded from: classes17.dex */
public final class e2q0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ c2q0<Object> b;

    public e2q0(c2q0<Object> c2q0Var) {
        this.b = c2q0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b.b();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
