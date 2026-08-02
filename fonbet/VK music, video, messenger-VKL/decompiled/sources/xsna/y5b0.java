package xsna;

import android.view.View;

/* compiled from: PlayingIndicationHelperViewStateListener.kt */
/* loaded from: classes3.dex */
public final class y5b0 implements View.OnAttachStateChangeListener {
    public final x5b0<?>[] b;

    public y5b0(x5b0<?>... x5b0VarArr) {
        this.b = x5b0VarArr;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        for (x5b0<?> x5b0Var : this.b) {
            x5b0Var.b.P0(x5b0Var, true);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        for (x5b0<?> x5b0Var : this.b) {
            x5b0Var.b.n0(x5b0Var);
        }
    }
}
