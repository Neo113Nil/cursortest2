package xsna;

import android.view.View;

/* compiled from: ViewExt.kt */
/* loaded from: classes14.dex */
public final class i120 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ h120 c;

    public i120(View view, h120 h120Var) {
        this.b = view;
        this.c = h120Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b.removeOnAttachStateChangeListener(this);
        io.reactivex.rxjava3.disposables.c cVar = this.c.l;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
