package xsna;

import android.view.View;

/* compiled from: WindowRecomposer.android.kt */
/* loaded from: classes11.dex */
public final class qrx0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ yok0 b;

    public qrx0(yok0 yok0Var) {
        this.b = yok0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        this.b.b(null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
