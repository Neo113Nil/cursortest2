package xsna;

import android.view.View;
import android.view.ViewGroup;
import xsna.qpn0;

/* compiled from: SystemBarStateMonitor.java */
/* loaded from: classes12.dex */
public final class rpn0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ qpn0.a c;

    public rpn0(ViewGroup viewGroup, qpn0.a aVar) {
        this.b = viewGroup;
        this.c = aVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.b.addView(this.c, 0);
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b.addView(this.c, 0);
        view.removeOnAttachStateChangeListener(this);
    }
}
