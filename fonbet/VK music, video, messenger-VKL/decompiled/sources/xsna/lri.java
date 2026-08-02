package xsna;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: View.kt */
/* loaded from: classes17.dex */
public final class lri implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ ComposeView c;
    public final /* synthetic */ jai d;

    public lri(ComposeView composeView, ComposeView composeView2, jai jaiVar) {
        this.b = composeView;
        this.c = composeView2;
        this.d = jaiVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.b.removeOnAttachStateChangeListener(this);
        this.c.setContent(this.d);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
