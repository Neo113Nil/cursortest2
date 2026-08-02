package defpackage;

import java.util.Enumeration;

/* loaded from: classes4.dex */
public final class njj extends o2 {
    public byte[] a;
    public xr1 b;

    public njj(xr1 xr1Var, byte[] bArr) {
        this.a = rza1.b(bArr);
        this.b = xr1Var;
    }

    public static njj m(a2 a2Var) {
        if (a2Var instanceof njj) {
            return (njj) a2Var;
        }
        if (a2Var == null) {
            return null;
        }
        i3 z = i3.z(a2Var);
        njj njjVar = new njj();
        Enumeration B = z.B();
        njjVar.b = xr1.m(B.nextElement());
        njjVar.a = w2.x(B.nextElement()).a;
        return njjVar;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(2);
        c2Var.a(this.b);
        c2Var.a(new dqf(this.a));
        return new jqf(c2Var);
    }
}
