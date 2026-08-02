package xsna;

import android.view.View;

/* compiled from: ViewExt.kt */
/* loaded from: classes18.dex */
public final class l3r implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ k5h c;

    public l3r(View view, k5h k5hVar) {
        this.b = view;
        this.c = k5hVar;
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
