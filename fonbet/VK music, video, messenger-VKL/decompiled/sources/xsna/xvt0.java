package xsna;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: ViewExt.kt */
/* loaded from: classes7.dex */
public final class xvt0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ ValueAnimator c;

    public xvt0(View view, ValueAnimator valueAnimator) {
        this.b = view;
        this.c = valueAnimator;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b.removeOnAttachStateChangeListener(this);
        this.c.cancel();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
