package defpackage;

/* loaded from: classes4.dex */
public final class byo extends n2 {
    public static final t2 w = ly3.f("2.5.29.17");
    public t2 a;
    public boolean b;
    public v2 c;

    @Override // defpackage.n2
    public final boolean equals(Object obj) {
        if (!(obj instanceof byo)) {
            return false;
        }
        byo byoVar = (byo) obj;
        return byoVar.a.l(this.a) && byoVar.c.l(this.c) && byoVar.b == this.b;
    }

    @Override // defpackage.n2
    public final int hashCode() {
        t2 t2Var = this.a;
        boolean z = this.b;
        v2 v2Var = this.c;
        return z ? ffx.T(v2Var.a) ^ t2Var.a.hashCode() : ~(ffx.T(v2Var.a) ^ t2Var.a.hashCode());
    }

    @Override // defpackage.z1
    public final a3 toASN1Primitive() {
        b2 b2Var = new b2(3);
        b2Var.a(this.a);
        if (this.b) {
            b2Var.a(v1.w);
        }
        b2Var.a(this.c);
        return new iqf(b2Var);
    }
}
