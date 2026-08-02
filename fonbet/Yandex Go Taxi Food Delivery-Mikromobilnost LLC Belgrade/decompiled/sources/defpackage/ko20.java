package defpackage;

/* loaded from: classes8.dex */
public final class ko20 implements p8w {
    @Override // defpackage.p8w
    public final kvj0 intercept(m8w m8wVar) {
        zci0 zci0Var = (zci0) m8wVar;
        d5j0 d5j0Var = zci0Var.e;
        d5j0Var.getClass();
        g0c a = qoi0.a(Object.class);
        Object cast = a.a().cast(d5j0Var.e.o(a));
        kwu kwuVar = d5j0Var.a;
        ho20 ho20Var = cast instanceof ho20 ? (ho20) cast : null;
        if (ho20Var == null) {
            return zci0Var.b(d5j0Var);
        }
        String str = ho20Var.a;
        if (jl40.l(str, kwuVar.d)) {
            return zci0Var.b(d5j0Var);
        }
        jwu g = kwuVar.g();
        g.h(str);
        kwu e = g.e();
        t4j0 b = d5j0Var.b();
        b.a = e;
        b.c.g("Host", kwuVar.d);
        return zci0Var.b(new d5j0(b));
    }
}
