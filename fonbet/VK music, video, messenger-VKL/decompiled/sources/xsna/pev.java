package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: View.kt */
/* loaded from: classes16.dex */
public final class pev implements View.OnAttachStateChangeListener {
    public final /* synthetic */ kfv b;
    public final /* synthetic */ lca c;
    public final /* synthetic */ androidx.recyclerview.widget.r d;
    public final /* synthetic */ RecyclerView e;

    public pev(kfv kfvVar, lca lcaVar, androidx.recyclerview.widget.r rVar, RecyclerView recyclerView) {
        this.b = kfvVar;
        this.c = lcaVar;
        this.d = rVar;
        this.e = recyclerView;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.b.removeOnAttachStateChangeListener(this);
        lca lcaVar = this.c;
        androidx.recyclerview.widget.r rVar = this.d;
        lcaVar.j = rVar;
        rVar.l(this.e);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
