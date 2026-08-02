package defpackage;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ljfq0;", "Lj530;", "Lkfq0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class jfq0 extends j530 {
    public final int A;
    public final List B;
    public final tls C;
    public final lkq0 D;
    public final xfc E;
    public final xt3 F;
    public final kk2 a;
    public final ety0 b;
    public final dyr c;
    public final tls w;
    public final int x;
    public final boolean y;
    public final int z;

    public jfq0(kk2 kk2Var, ety0 ety0Var, dyr dyrVar, tls tlsVar, int i, boolean z, int i2, int i3, List list, tls tlsVar2, lkq0 lkq0Var, xfc xfcVar, xt3 xt3Var) {
        this.a = kk2Var;
        this.b = ety0Var;
        this.c = dyrVar;
        this.w = tlsVar;
        this.x = i;
        this.y = z;
        this.z = i2;
        this.A = i3;
        this.B = list;
        this.C = tlsVar2;
        this.D = lkq0Var;
        this.E = xfcVar;
        this.F = xt3Var;
    }

    @Override // defpackage.j530
    public final e530 a() {
        return new kfq0(this.a, this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfq0)) {
            return false;
        }
        jfq0 jfq0Var = (jfq0) obj;
        return jl40.l(this.E, jfq0Var.E) && jl40.l(this.a, jfq0Var.a) && jl40.l(this.b, jfq0Var.b) && jl40.l(this.B, jfq0Var.B) && jl40.l(this.c, jfq0Var.c) && jl40.l(this.F, jfq0Var.F) && this.w == jfq0Var.w && this.x == jfq0Var.x && this.y == jfq0Var.y && this.z == jfq0Var.z && this.A == jfq0Var.A && this.C == jfq0Var.C && jl40.l(this.D, jfq0Var.D);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r4.a.c(r1.a) != false) goto L10;
     */
    @Override // defpackage.j530
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(e530 e530Var) {
        boolean z;
        kfq0 kfq0Var = (kfq0) e530Var;
        yjy0 yjy0Var = kfq0Var.w;
        xfc xfcVar = yjy0Var.E;
        xfc xfcVar2 = this.E;
        boolean l = jl40.l(xfcVar2, xfcVar);
        yjy0Var.E = xfcVar2;
        ety0 ety0Var = this.b;
        if (l) {
            ety0 ety0Var2 = yjy0Var.b;
            if (ety0Var == ety0Var2) {
                ety0Var.getClass();
            }
            z = false;
            boolean J0 = yjy0Var.J0(this.a);
            boolean I0 = kfq0Var.w.I0(ety0Var, this.B, this.A, this.z, this.y, this.c, this.x, this.F);
            tls tlsVar = this.w;
            tls tlsVar2 = this.C;
            lkq0 lkq0Var = this.D;
            yjy0Var.E0(z, J0, I0, yjy0Var.H0(tlsVar, tlsVar2, lkq0Var, null));
            kfq0Var.c = lkq0Var;
            qje.P(kfq0Var).C();
        }
        z = true;
        boolean J02 = yjy0Var.J0(this.a);
        boolean I02 = kfq0Var.w.I0(ety0Var, this.B, this.A, this.z, this.y, this.c, this.x, this.F);
        tls tlsVar3 = this.w;
        tls tlsVar22 = this.C;
        lkq0 lkq0Var2 = this.D;
        yjy0Var.E0(z, J02, I02, yjy0Var.H0(tlsVar3, tlsVar22, lkq0Var2, null));
        kfq0Var.c = lkq0Var2;
        qje.P(kfq0Var).C();
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + tse0.b(this.b, this.a.hashCode() * 31, 31)) * 31;
        tls tlsVar = this.w;
        int e = (((unr0.e(oyr.b(this.x, (hashCode + (tlsVar != null ? tlsVar.hashCode() : 0)) * 31, 31), 31, this.y) + this.z) * 31) + this.A) * 31;
        List list = this.B;
        int hashCode2 = (e + (list != null ? list.hashCode() : 0)) * 31;
        tls tlsVar2 = this.C;
        int hashCode3 = (hashCode2 + (tlsVar2 != null ? tlsVar2.hashCode() : 0)) * 31;
        lkq0 lkq0Var = this.D;
        int hashCode4 = (hashCode3 + (lkq0Var != null ? lkq0Var.hashCode() : 0)) * 31;
        xt3 xt3Var = this.F;
        int hashCode5 = (hashCode4 + (xt3Var != null ? xt3Var.hashCode() : 0)) * 31;
        xfc xfcVar = this.E;
        return hashCode5 + (xfcVar != null ? xfcVar.hashCode() : 0);
    }
}
