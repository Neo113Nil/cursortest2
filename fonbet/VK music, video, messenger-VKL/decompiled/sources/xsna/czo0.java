package xsna;

import android.view.View;

/* compiled from: TipAnchorView.kt */
/* loaded from: classes17.dex */
public final class czo0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ m84 c;

    public czo0(View view, m84 m84Var) {
        this.b = view;
        this.c = m84Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.b.removeOnAttachStateChangeListener(this);
        this.c.invoke();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
