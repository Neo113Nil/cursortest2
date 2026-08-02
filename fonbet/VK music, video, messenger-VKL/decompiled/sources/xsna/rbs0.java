package xsna;

import android.view.View;

/* compiled from: View.kt */
/* loaded from: classes4.dex */
public final class rbs0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ sbs0 c;

    public rbs0(View view, sbs0 sbs0Var) {
        this.b = view;
        this.c = sbs0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b.removeOnAttachStateChangeListener(this);
        this.c.b();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
