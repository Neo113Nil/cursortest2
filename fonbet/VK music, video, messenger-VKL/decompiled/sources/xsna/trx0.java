package xsna;

import android.view.View;
import androidx.compose.runtime.Recomposer;

/* compiled from: WindowRecomposer.android.kt */
/* loaded from: classes11.dex */
public final class trx0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ Recomposer c;

    public trx0(View view, Recomposer recomposer) {
        this.b = view;
        this.c = recomposer;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b.removeOnAttachStateChangeListener(this);
        this.c.A();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
