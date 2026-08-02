package xsna;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: WriteBarOverlayFragment.kt */
/* loaded from: classes4.dex */
public final class k1y0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ ViewGroup b;

    public k1y0(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        zmp0.b(this.b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
