package xsna;

import android.view.View;

/* compiled from: TipAnchorView.kt */
/* loaded from: classes17.dex */
public final class dzo0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ tu80 c;

    public dzo0(View view, tu80 tu80Var) {
        this.b = view;
        this.c = tu80Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b.removeOnAttachStateChangeListener(this);
        this.c.invoke();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
