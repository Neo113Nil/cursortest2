package xsna;

import android.view.View;

/* compiled from: UserProfileMainInfoViewHolder.kt */
/* loaded from: classes5.dex */
public final class trq0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ vrq0 b;

    public trq0(vrq0 vrq0Var) {
        this.b = vrq0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        vrq0 vrq0Var = this.b;
        vrq0Var.n.getViewTreeObserver().addOnGlobalLayoutListener(vrq0Var.H);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        vrq0 vrq0Var = this.b;
        vrq0Var.n.getViewTreeObserver().removeOnGlobalLayoutListener(vrq0Var.H);
    }
}
