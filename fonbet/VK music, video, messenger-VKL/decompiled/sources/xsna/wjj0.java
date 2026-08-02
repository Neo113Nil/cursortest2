package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ShowcaseSectionOpenPerfTracker.kt */
/* loaded from: classes16.dex */
public final class wjj0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ RecyclerView b;
    public final /* synthetic */ xjj0 c;

    public wjj0(RecyclerView recyclerView, xjj0 xjj0Var) {
        this.b = recyclerView;
        this.c = xjj0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        RecyclerView recyclerView = this.b;
        recyclerView.getViewTreeObserver().removeOnPreDrawListener(this.c);
        recyclerView.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
