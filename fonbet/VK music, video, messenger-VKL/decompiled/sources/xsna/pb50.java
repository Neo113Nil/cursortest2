package xsna;

import android.view.View;
import xsna.qb50;

/* compiled from: MusicTrackHeaderAdapter.kt */
/* loaded from: classes3.dex */
public final class pb50 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ qb50.a b;

    public pb50(qb50.a aVar) {
        this.b = aVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        qb50.a aVar = this.b;
        aVar.o.a(aVar);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        qb50.a aVar = this.b;
        aVar.o.c(aVar);
    }
}
