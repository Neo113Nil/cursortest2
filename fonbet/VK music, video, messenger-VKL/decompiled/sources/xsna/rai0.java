package xsna;

import java.util.List;
import xsna.us2;
import xsna.v4s;

/* compiled from: SelectableTextAnnotatedStringElement.kt */
/* loaded from: classes11.dex */
public final class rai0 extends d730<sai0> {
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
    public final jci0 k;
    public final o7g l;

    public rai0() {
        throw null;
    }

    public rai0(us2 us2Var, nmo0 nmo0Var, v4s.a aVar, izs izsVar, int i, boolean z, int i2, int i3, List list, izs izsVar2, jci0 jci0Var, o7g o7gVar) {
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
        this.k = jci0Var;
        this.l = o7gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rai0)) {
            return false;
        }
        rai0 rai0Var = (rai0) obj;
        if (!epx.f(this.l, rai0Var.l) || !epx.f(this.a, rai0Var.a) || !epx.f(this.b, rai0Var.b) || !epx.f(this.i, rai0Var.i) || !epx.f(this.c, rai0Var.c)) {
            return false;
        }
        rai0Var.getClass();
        return this.d == rai0Var.d && this.e == rai0Var.e && this.f == rai0Var.f && this.g == rai0Var.g && this.h == rai0Var.h && this.j == rai0Var.j && epx.f(this.k, rai0Var.k);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + yga0.b(this.b, this.a.hashCode() * 31, 31)) * 31;
        izs<ljo0, s3q0> izsVar = this.d;
        int b = (((qoy.b(shy.a(this.e, (hashCode + (izsVar != null ? izsVar.hashCode() : 0)) * 31, 31), 31, this.f) + this.g) * 31) + this.h) * 31;
        List<us2.d<esa0>> list = this.i;
        int hashCode2 = (b + (list != null ? list.hashCode() : 0)) * 31;
        izs<List<zhf0>, s3q0> izsVar2 = this.j;
        int hashCode3 = (hashCode2 + (izsVar2 != null ? izsVar2.hashCode() : 0)) * 31;
        jci0 jci0Var = this.k;
        int hashCode4 = (hashCode3 + (jci0Var != null ? jci0Var.hashCode() : 0)) * 961;
        o7g o7gVar = this.l;
        return hashCode4 + (o7gVar != null ? o7gVar.hashCode() : 0);
    }

    @Override // xsna.d730
    public final sai0 r() {
        return new sai0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r4.a.c(r1.a) != false) goto L10;
     */
    @Override // xsna.d730
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(sai0 sai0Var) {
        boolean z;
        sai0 sai0Var2 = sai0Var;
        sbo0 sbo0Var = sai0Var2.s;
        o7g o7gVar = sbo0Var.A;
        o7g o7gVar2 = this.l;
        boolean f = epx.f(o7gVar2, o7gVar);
        sbo0Var.A = o7gVar2;
        nmo0 nmo0Var = this.b;
        if (f) {
            nmo0 nmo0Var2 = sbo0Var.q;
            if (nmo0Var == nmo0Var2) {
                nmo0Var.getClass();
            }
            z = false;
            boolean n2 = sbo0Var.n2(this.a);
            boolean m2 = sai0Var2.s.m2(nmo0Var, this.i, this.h, this.g, this.f, this.c, this.e);
            izs<ljo0, s3q0> izsVar = this.d;
            izs<List<zhf0>, s3q0> izsVar2 = this.j;
            jci0 jci0Var = this.k;
            sbo0Var.i2(z, n2, m2, sbo0Var.l2(izsVar, izsVar2, jci0Var, null));
            sai0Var2.r = jci0Var;
            itl.f(sai0Var2).Q();
        }
        z = true;
        boolean n22 = sbo0Var.n2(this.a);
        boolean m22 = sai0Var2.s.m2(nmo0Var, this.i, this.h, this.g, this.f, this.c, this.e);
        izs<ljo0, s3q0> izsVar3 = this.d;
        izs<List<zhf0>, s3q0> izsVar22 = this.j;
        jci0 jci0Var2 = this.k;
        sbo0Var.i2(z, n22, m22, sbo0Var.l2(izsVar3, izsVar22, jci0Var2, null));
        sai0Var2.r = jci0Var2;
        itl.f(sai0Var2).Q();
    }
}
