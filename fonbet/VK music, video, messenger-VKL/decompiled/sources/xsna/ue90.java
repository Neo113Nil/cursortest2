package xsna;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import xsna.sav0;

/* compiled from: ViewExt.kt */
/* loaded from: classes18.dex */
public final class ue90 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ sav0 c;

    public ue90(LinearLayout linearLayout, sav0 sav0Var) {
        this.b = linearLayout;
        this.c = sav0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b.removeOnAttachStateChangeListener(this);
        sav0 sav0Var = this.c;
        RecyclerView.Adapter<?> adapter = sav0Var.c;
        sav0.b bVar = sav0Var.f;
        sav0.a aVar = sav0Var.e;
        if (aVar != null) {
            sav0Var.b.g(aVar);
        }
        if (adapter != null && bVar != null) {
            adapter.unregisterAdapterDataObserver(bVar);
        }
        sav0Var.e = null;
        sav0Var.c = null;
        sav0Var.f = null;
        sav0Var.d = false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
