package xsna;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class qc60 implements izs {
    public final /* synthetic */ sc60 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ RecyclerView d;
    public final /* synthetic */ Runnable e;
    public final /* synthetic */ Runnable f;
    public final /* synthetic */ List g;
    public final /* synthetic */ c9x h;

    public /* synthetic */ qc60(sc60 sc60Var, int i, RecyclerView recyclerView, Runnable runnable, Runnable runnable2, List list, c9x c9xVar) {
        this.b = sc60Var;
        this.c = i;
        this.d = recyclerView;
        this.e = runnable;
        this.f = runnable2;
        this.g = list;
        this.h = c9xVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        m.d dVar = (m.d) obj;
        sc60 sc60Var = this.b;
        if (sc60Var.e == this.c) {
            wjf0.c(this.d, new j6k(this.e, new rc60(sc60Var, this.g, this.h, dVar, 0), this.f, 4));
        }
        return s3q0.a;
    }
}
