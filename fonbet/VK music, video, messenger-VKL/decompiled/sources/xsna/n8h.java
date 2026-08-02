package xsna;

import android.view.View;
import xsna.j8h;

/* compiled from: CommunityLiveCoverHeaderRedesignItem.kt */
/* loaded from: classes5.dex */
public final class n8h implements View.OnAttachStateChangeListener {
    public final /* synthetic */ j8h.b b;

    public n8h(j8h.b bVar) {
        this.b = bVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        j8h.b bVar = this.b;
        bVar.w.getClass();
        view.getViewTreeObserver().addOnWindowFocusChangeListener(bVar.z);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnWindowFocusChangeListener(this.b.z);
    }
}
