package xsna;

import java.util.List;
import xsna.dt1;

/* compiled from: LazyList.kt */
/* loaded from: classes11.dex */
public final class cvy extends jvy {
    public final /* synthetic */ boolean g;
    public final /* synthetic */ qty h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ dt1.b k;
    public final /* synthetic */ dt1.c l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ long o;
    public final /* synthetic */ xvy p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvy(long j, boolean z, yuy yuyVar, qty qtyVar, int i, int i2, dt1.b bVar, dt1.c cVar, int i3, int i4, long j2, xvy xvyVar) {
        super(j, z, yuyVar, qtyVar);
        this.g = z;
        this.h = qtyVar;
        this.i = i;
        this.j = i2;
        this.k = bVar;
        this.l = cVar;
        this.m = i3;
        this.n = i4;
        this.o = j2;
        this.p = xvyVar;
    }

    @Override // xsna.jvy
    public final ivy w0(int i, Object obj, Object obj2, List<? extends tra0> list, long j) {
        return new ivy(i, list, this.g, this.k, this.l, this.h.c.getLayoutDirection(), this.m, this.n, i == this.i + (-1) ? 0 : this.j, this.o, obj, obj2, this.p.o, j);
    }
}
