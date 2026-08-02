package xsna;

import android.view.View;

/* compiled from: ViewUtil.kt */
/* loaded from: classes6.dex */
public final class q1u0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ ape0 b;

    public q1u0(ape0 ape0Var) {
        this.b = ape0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        this.b.invoke(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
