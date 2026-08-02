package xsna;

import android.view.View;
import xsna.z0o;

/* compiled from: DonutNewBannerItem.kt */
/* loaded from: classes5.dex */
public final class y0o implements View.OnAttachStateChangeListener {
    public final /* synthetic */ z0o.a b;

    public y0o(z0o.a aVar) {
        this.b = aVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        z0o.a aVar = this.b;
        if (aVar.q != null) {
            owi.a(aVar.r, 300L, new m1i(aVar, 8));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        z0o.a aVar = this.b;
        owi.b(aVar.r);
        aVar.n = false;
        aVar.o = false;
    }
}
