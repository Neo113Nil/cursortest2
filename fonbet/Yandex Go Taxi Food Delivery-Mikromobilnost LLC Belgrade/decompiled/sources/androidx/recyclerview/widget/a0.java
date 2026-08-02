package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.bw31;
import defpackage.cw31;
import defpackage.myt0;
import defpackage.xm50;

/* loaded from: classes10.dex */
public final class a0 {
    public final cw31 a;
    public final myt0 b;
    public final RecyclerView.Adapter c;
    public final xm50 d;
    public int e;

    public a0(RecyclerView.Adapter adapter, xm50 xm50Var, bw31 bw31Var, myt0 myt0Var) {
        z zVar = new z(this);
        this.c = adapter;
        this.d = xm50Var;
        bw31Var.getClass();
        this.a = new k1(bw31Var, this);
        this.b = myt0Var;
        this.e = adapter.getItemCount();
        adapter.registerAdapterDataObserver(zVar);
    }
}
