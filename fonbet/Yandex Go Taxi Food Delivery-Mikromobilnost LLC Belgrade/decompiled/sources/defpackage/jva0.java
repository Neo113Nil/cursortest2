package defpackage;

import java.util.Arrays;

/* loaded from: classes8.dex */
public final class jva0 implements p8w {
    public final awa0 a;

    public jva0(awa0 awa0Var) {
        this.a = awa0Var;
    }

    @Override // defpackage.p8w
    public final kvj0 intercept(m8w m8wVar) {
        zci0 zci0Var = (zci0) m8wVar;
        d5j0 d5j0Var = zci0Var.e;
        if (jl40.l(d5j0Var.c(String.class), "SKIP_PERFORMANCE")) {
            return zci0Var.b(d5j0Var);
        }
        String format = String.format("Api.Response.Time.%s", Arrays.copyOf(new Object[]{d5j0Var.a.b()}, 1));
        awa0 awa0Var = this.a;
        awa0Var.getClass();
        zva0 zva0Var = new zva0(awa0Var, format);
        try {
            kvj0 b = ((zci0) m8wVar).b(((zci0) m8wVar).e);
            zva0Var.a();
            return b;
        } finally {
        }
    }
}
