package defpackage;

/* loaded from: classes10.dex */
public abstract class mic {
    public static final a7u0 a = new a7u0(new z2c(10));

    public static final long a(long j, fid fidVar) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(-583917585);
        lic licVar = (lic) btsVar.m(a);
        long c = licVar.c();
        oz40 oz40Var = licVar.i;
        oz40 oz40Var2 = licVar.h;
        long b = ldc.c(j, c) ? ((ldc) oz40Var2.getValue()).a : ldc.c(j, ((ldc) licVar.b.getValue()).a) ? ((ldc) oz40Var2.getValue()).a : ldc.c(j, ((ldc) licVar.c.getValue()).a) ? ((ldc) oz40Var.getValue()).a : ldc.c(j, ((ldc) licVar.d.getValue()).a) ? ((ldc) oz40Var.getValue()).a : ldc.c(j, ((ldc) licVar.e.getValue()).a) ? ((ldc) licVar.j.getValue()).a : ldc.c(j, licVar.d()) ? licVar.b() : ldc.c(j, licVar.a()) ? ((ldc) licVar.l.getValue()).a : ldc.m;
        if (b == 16) {
            b = ((ldc) btsVar.m(cfe.a)).a;
        }
        btsVar.t(false);
        return b;
    }
}
