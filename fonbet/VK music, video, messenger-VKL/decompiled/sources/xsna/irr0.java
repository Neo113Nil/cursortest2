package xsna;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: VhFirstDrawPerfTrackerImpl.kt */
/* loaded from: classes16.dex */
public final class irr0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ ViewTreeObserver b;
    public final /* synthetic */ jrr0 c;

    public irr0(ViewTreeObserver viewTreeObserver, jrr0 jrr0Var) {
        this.b = viewTreeObserver;
        this.c = jrr0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.b;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnDrawListener(this.c);
        }
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
