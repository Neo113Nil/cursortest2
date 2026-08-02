package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import xsna.agh0;

/* compiled from: ScrollPerformanceChecker.kt */
/* loaded from: classes3.dex */
public final class bgh0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ gfs b;
    public final /* synthetic */ RecyclerView c;
    public final /* synthetic */ agh0.a d;

    public bgh0(gfs gfsVar, RecyclerView recyclerView, agh0.a aVar) {
        this.b = gfsVar;
        this.c = recyclerView;
        this.d = aVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        gfs gfsVar = this.b;
        gfsVar.a.removeFrameCallback(gfsVar.i);
        agh0.a aVar = this.d;
        RecyclerView recyclerView = this.c;
        recyclerView.removeOnScrollListener(aVar);
        recyclerView.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
