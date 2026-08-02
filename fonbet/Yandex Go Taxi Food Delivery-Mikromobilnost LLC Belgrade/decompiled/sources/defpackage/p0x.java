package defpackage;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public final class p0x extends o2 {
    public jc51 a;
    public l2 b;

    public p0x(h79 h79Var) {
        c4x0 c4x0Var = h79Var.b;
        this.a = c4x0Var.x;
        this.b = c4x0Var.c;
    }

    public static p0x m(o2 o2Var) {
        if (o2Var instanceof p0x) {
            return (p0x) o2Var;
        }
        if (o2Var == null) {
            return null;
        }
        i3 z = i3.z(o2Var);
        p0x p0xVar = new p0x();
        p0xVar.a = jc51.m(z.A(0));
        p0xVar.b = (l2) z.A(1);
        return p0xVar;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(2);
        c2Var.a(this.a);
        c2Var.a(this.b);
        return new jqf(c2Var);
    }

    public p0x(jc51 jc51Var, BigInteger bigInteger) {
        this.a = jc51Var;
        this.b = new l2(bigInteger);
    }
}
