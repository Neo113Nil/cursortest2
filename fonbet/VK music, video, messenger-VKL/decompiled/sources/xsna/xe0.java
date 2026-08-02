package xsna;

import android.view.View;
import xsna.ye0;

/* compiled from: AdDelegate.kt */
/* loaded from: classes18.dex */
public final class xe0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ ye0.a.C4096a b;

    public xe0(ye0.a.C4096a c4096a) {
        this.b = c4096a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.b.d(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b.d(false);
    }
}
