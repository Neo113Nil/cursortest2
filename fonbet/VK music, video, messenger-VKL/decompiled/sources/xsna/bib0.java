package xsna;

import android.view.View;
import xsna.aib0;

/* compiled from: PodcastPageBottomSheet.kt */
/* loaded from: classes3.dex */
public final class bib0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ aib0.b b;

    public bib0(aib0.b bVar) {
        this.b = bVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        aib0.b bVar = this.b;
        bVar.n.a(bVar);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        aib0.b bVar = this.b;
        bVar.n.c(bVar);
    }
}
