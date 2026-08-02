package xsna;

import android.view.View;
import xsna.ffh;

/* compiled from: CommunityProfileContentAlbumAdapter.kt */
/* loaded from: classes5.dex */
public final class efh implements View.OnAttachStateChangeListener {
    public final /* synthetic */ ffh.a b;

    public efh(ffh.a aVar) {
        this.b = aVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.b.o.a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b.o.b();
    }
}
