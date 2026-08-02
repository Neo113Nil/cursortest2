package xsna;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: View.kt */
/* loaded from: classes4.dex */
public final class fsj0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ gsj0 c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ View e;

    public fsj0(View view, gsj0 gsj0Var, ViewGroup viewGroup, View view2) {
        this.b = view;
        this.c = gsj0Var;
        this.d = viewGroup;
        this.e = view2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.b.removeOnAttachStateChangeListener(this);
        f4m.q(gsj0.R6(this.c, this.d), this.e);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
