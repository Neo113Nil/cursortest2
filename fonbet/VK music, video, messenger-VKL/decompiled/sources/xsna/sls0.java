package xsna;

import android.view.View;

/* compiled from: ViewExt.kt */
/* loaded from: classes2.dex */
public final class sls0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ tls0 d;

    public sls0(View view, View view2, tls0 tls0Var) {
        this.b = view;
        this.c = view2;
        this.d = tls0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b.removeOnAttachStateChangeListener(this);
        this.c.getViewTreeObserver().removeOnGlobalLayoutListener(this.d);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
