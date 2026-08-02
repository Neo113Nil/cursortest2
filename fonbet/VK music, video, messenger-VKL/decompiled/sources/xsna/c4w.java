package xsna;

import android.view.View;

/* compiled from: ViewExt.kt */
/* loaded from: classes2.dex */
public final class c4w implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ e4w c;

    public c4w(View view, e4w e4wVar) {
        this.b = view;
        this.c = e4wVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b.removeOnAttachStateChangeListener(this);
        this.c.a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
