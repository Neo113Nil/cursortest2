package xsna;

import android.view.View;

/* compiled from: MotionLayoutAnimationChecker.kt */
/* loaded from: classes3.dex */
public final class pa30 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ gfs b;
    public final /* synthetic */ wa30 c;

    public pa30(gfs gfsVar, wa30 wa30Var) {
        this.b = gfsVar;
        this.c = wa30Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        gfs gfsVar = this.b;
        gfsVar.a.removeFrameCallback(gfsVar.i);
        wa30 wa30Var = this.c;
        wa30Var.b = null;
        wa30Var.a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
