package xsna;

import java.util.List;

/* compiled from: LazyStaggeredGridMeasure.kt */
/* loaded from: classes11.dex */
public final class exy {
    public final uxy a;
    public final List<Integer> b;
    public final uwy c;
    public final sxy d;
    public final long e;
    public final boolean f;
    public final qty g;
    public final int h;
    public final long i;
    public final int j;
    public final int k;
    public final int l;
    public final yvj m;
    public final boolean n;
    public final List<twy> o;
    public final kdu p;
    public final dxy q;
    public final bxy r;
    public final int s;

    public exy(uxy uxyVar, List list, uwy uwyVar, sxy sxyVar, long j, boolean z, qty qtyVar, int i, long j2, int i2, int i3, int i4, yvj yvjVar, boolean z2, List list2, kdu kduVar) {
        this.a = uxyVar;
        this.b = list;
        this.c = uwyVar;
        this.d = sxyVar;
        this.e = j;
        this.f = z;
        this.g = qtyVar;
        this.h = i;
        this.i = j2;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = yvjVar;
        this.n = z2;
        this.o = list2;
        this.p = kduVar;
        this.q = new dxy(this, z, uwyVar, qtyVar, sxyVar);
        this.r = uxyVar.e;
        this.s = ((int[]) sxyVar.b).length;
    }

    public final long a(uwy uwyVar, int i, int i2) {
        uwyVar.d().e(i);
        return (i2 << 32) | ((i2 + 1) & 4294967295L);
    }
}
