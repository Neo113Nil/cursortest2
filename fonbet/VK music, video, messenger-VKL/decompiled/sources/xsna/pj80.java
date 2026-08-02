package xsna;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: ViewExt.kt */
/* loaded from: classes17.dex */
public final class pj80 implements ViewTreeObserver.OnDrawListener, View.OnAttachStateChangeListener {
    public static final Handler g = new Handler(Looper.getMainLooper());
    public final View b;
    public final gzs<s3q0> c;
    public final boolean d;
    public ViewTreeObserver e;
    public boolean f;

    public pj80(View view, gzs<s3q0> gzsVar, boolean z) {
        this.b = view;
        this.c = gzsVar;
        this.d = z;
        this.e = view.getViewTreeObserver();
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.f) {
            return;
        }
        if (!this.d || f4m.h(this.b)) {
            this.c.invoke();
            this.f = true;
            g.post(new kyc(this, 5));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.e = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.e.isAlive();
        View view2 = this.b;
        if (isAlive) {
            this.e.removeOnDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
