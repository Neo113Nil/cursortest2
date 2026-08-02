package xsna;

import android.view.View;

/* compiled from: VideoLiveViewExt.kt */
/* loaded from: classes3.dex */
public final class sss0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ e6 c;

    public sss0(View view, e6 e6Var) {
        this.b = view;
        this.c = e6Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b.removeOnAttachStateChangeListener(this);
        view.removeCallbacks(this.c);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
