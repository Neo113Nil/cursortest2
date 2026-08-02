package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ViewExt.kt */
/* loaded from: classes6.dex */
public final class ibf0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ RecyclerView b;
    public final /* synthetic */ RecyclerView c;
    public final /* synthetic */ dcl0 d;

    public ibf0(RecyclerView recyclerView, RecyclerView recyclerView2, dcl0 dcl0Var) {
        this.b = recyclerView;
        this.c = recyclerView2;
        this.d = dcl0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b.removeOnAttachStateChangeListener(this);
        this.c.removeOnScrollListener(this.d);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
