package xsna;

import android.view.View;

/* compiled from: ExpandableSearchFeatureQueryActionMenuItem.kt */
/* loaded from: classes5.dex */
public final class o8q implements View.OnAttachStateChangeListener {
    public final /* synthetic */ n8q b;

    public o8q(n8q n8qVar) {
        this.b = n8qVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        dhr0.a.a(this.b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        dhr0.a.d(this.b);
    }
}
