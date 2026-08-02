package xsna;

import android.view.View;

/* compiled from: ViewExt.kt */
/* loaded from: classes17.dex */
public final class k8v0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ mi1 c;

    public k8v0(View view, mi1 mi1Var) {
        this.b = view;
        this.c = mi1Var;
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
