package defpackage;

/* loaded from: classes9.dex */
public final class ey2 implements p8w {
    public final ky2 a;

    public ey2(ky2 ky2Var) {
        this.a = ky2Var;
    }

    @Override // defpackage.p8w
    public final kvj0 intercept(m8w m8wVar) {
        d5j0 d5j0Var;
        if (this.a.a) {
            d5j0Var = ((zci0) m8wVar).e;
        } else {
            t4j0 b = ((zci0) m8wVar).e.b();
            b.c.g("X-YaTaxi-App-State", "idle=true");
            d5j0Var = new d5j0(b);
        }
        return ((zci0) m8wVar).b(d5j0Var);
    }
}
