package xsna;

import android.view.View;

/* compiled from: AudioBookBottomSheetRenderExtension.kt */
/* loaded from: classes3.dex */
public final class ud4 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ vd4 b;

    public ud4(vd4 vd4Var) {
        this.b = vd4Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        vd4 vd4Var = this.b;
        vd4Var.e.a(vd4Var);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        vd4 vd4Var = this.b;
        vd4Var.e.c(vd4Var);
    }
}
