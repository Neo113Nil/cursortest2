package defpackage;

/* loaded from: classes3.dex */
public abstract class e2b1 {
    public static final void a(dsn0 dsn0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-399771452);
        int i3 = 2;
        int i4 = 4;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(dsn0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            rzo.b(null, "default", wwg.S(-294913678, true, new bpn0(i3, dsn0Var, tlsVar), btsVar), btsVar, 3456, 3);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new apn0(dsn0Var, tlsVar, i, i4);
        }
    }

    public static void b(jw3 jw3Var, String str) {
        ((nv3) jw3Var).a.c(str);
    }
}
