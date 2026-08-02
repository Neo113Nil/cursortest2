package xsna;

import android.view.View;

/* compiled from: rememberAuthorHeaderPicturePaneHeight.kt */
/* loaded from: classes5.dex */
public final class vtf0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ wh50<Boolean> b;

    public vtf0(wh50<Boolean> wh50Var) {
        this.b = wh50Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.b.setValue(Boolean.TRUE);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b.setValue(Boolean.FALSE);
    }
}
