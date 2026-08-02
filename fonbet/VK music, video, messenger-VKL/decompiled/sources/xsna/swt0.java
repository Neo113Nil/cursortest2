package xsna;

import android.view.View;

/* compiled from: ViewExt.kt */
/* loaded from: classes18.dex */
public final class swt0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ zs6 b;

    public swt0(zs6 zs6Var) {
        this.b = zs6Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        wvv wvvVar = wvv.a;
        wvv.a(this.b);
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
