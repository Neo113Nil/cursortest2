package xsna;

import java.util.List;
import xsna.sbo0;
import xsna.us2;
import xsna.v4s;

/* compiled from: TextAnnotatedStringElement.kt */
/* loaded from: classes11.dex */
public final class rbo0 extends d730<sbo0> {
    public final us2 a;
    public final nmo0 b;
    public final v4s.a c;
    public final izs<ljo0, s3q0> d;
    public final int e;
    public final boolean f;
    public final int g;
    public final int h;
    public final List<us2.d<esa0>> i;
    public final izs<List<zhf0>, s3q0> j;
    public final o7g k;
    public final izs<sbo0.a, s3q0> l;

    public rbo0() {
        throw null;
    }

    public rbo0(us2 us2Var, nmo0 nmo0Var, v4s.a aVar, izs izsVar, int i, boolean z, int i2, int i3, List list, izs izsVar2, o7g o7gVar, izs izsVar3) {
        this.a = us2Var;
        this.b = nmo0Var;
        this.c = aVar;
        this.d = izsVar;
        this.e = i;
        this.f = z;
        this.g = i2;
        this.h = i3;
        this.i = list;
        this.j = izsVar2;
        this.k = o7gVar;
        this.l = izsVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbo0)) {
            return false;
        }
        rbo0 rbo0Var = (rbo0) obj;
        return epx.f(this.k, rbo0Var.k) && epx.f(this.a, rbo0Var.a) && epx.f(this.b, rbo0Var.b) && epx.f(this.i, rbo0Var.i) && epx.f(this.c, rbo0Var.c) && this.d == rbo0Var.d && this.l == rbo0Var.l && this.e == rbo0Var.e && this.f == rbo0Var.f && this.g == rbo0Var.g && this.h == rbo0Var.h && this.j == rbo0Var.j;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + yga0.b(this.b, this.a.hashCode() * 31, 31)) * 31;
        izs<ljo0, s3q0> izsVar = this.d;
        int b = (((qoy.b(shy.a(this.e, (hashCode + (izsVar != null ? izsVar.hashCode() : 0)) * 31, 31), 31, this.f) + this.g) * 31) + this.h) * 31;
        List<us2.d<esa0>> list = this.i;
        int hashCode2 = (b + (list != null ? list.hashCode() : 0)) * 31;
        izs<List<zhf0>, s3q0> izsVar2 = this.j;
        int hashCode3 = (hashCode2 + (izsVar2 != null ? izsVar2.hashCode() : 0)) * 961;
        o7g o7gVar = this.k;
        int hashCode4 = (hashCode3 + (o7gVar != null ? o7gVar.hashCode() : 0)) * 31;
        izs<sbo0.a, s3q0> izsVar3 = this.l;
        return hashCode4 + (izsVar3 != null ? izsVar3.hashCode() : 0);
    }

    @Override // xsna.d730
    public final sbo0 r() {
        return new sbo0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, null, this.k, this.l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r1.a.c(r10.a) != false) goto L10;
     */
    @Override // xsna.d730
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(sbo0 sbo0Var) {
        boolean z;
        sbo0 sbo0Var2 = sbo0Var;
        o7g o7gVar = sbo0Var2.A;
        o7g o7gVar2 = this.k;
        boolean f = epx.f(o7gVar2, o7gVar);
        sbo0Var2.A = o7gVar2;
        if (f) {
            nmo0 nmo0Var = sbo0Var2.q;
            nmo0 nmo0Var2 = this.b;
            if (nmo0Var2 == nmo0Var) {
                nmo0Var2.getClass();
            }
            z = false;
            sbo0Var2.i2(z, sbo0Var2.n2(this.a), sbo0Var2.m2(this.b, this.i, this.h, this.g, this.f, this.c, this.e), sbo0Var2.l2(this.d, this.j, null, this.l));
        }
        z = true;
        sbo0Var2.i2(z, sbo0Var2.n2(this.a), sbo0Var2.m2(this.b, this.i, this.h, this.g, this.f, this.c, this.e), sbo0Var2.l2(this.d, this.j, null, this.l));
    }
}
