package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: RecyclerExt.kt */
/* loaded from: classes17.dex */
public final class tif0 implements RecyclerView.q {
    public final /* synthetic */ m4 b;
    public final /* synthetic */ q8e c;

    public tif0(m4 m4Var, q8e q8eVar) {
        this.b = m4Var;
        this.c = q8eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void k(View view) {
        this.b.invoke();
        this.c.removeOnChildAttachStateChangeListener(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void g(View view) {
    }
}
