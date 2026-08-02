package xsna;

import android.view.View;

/* compiled from: View.kt */
/* loaded from: classes2.dex */
public final class j2l implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ k2l c;

    public j2l(View view, k2l k2lVar) {
        this.b = view;
        this.c = k2lVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b.removeOnAttachStateChangeListener(this);
        this.c.b = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
