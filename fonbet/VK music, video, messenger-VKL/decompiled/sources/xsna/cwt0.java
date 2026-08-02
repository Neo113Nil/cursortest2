package xsna;

import android.view.View;

/* compiled from: ViewExt.kt */
/* loaded from: classes18.dex */
public final class cwt0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ gzs<s3q0> c;

    public cwt0(View view, gzs<s3q0> gzsVar) {
        this.b = view;
        this.c = gzsVar;
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
