package defpackage;

/* loaded from: classes11.dex */
public abstract class ltm {
    public static final a7u0 a = new a7u0(new jbm(29));
    public static final a7u0 b = new a7u0(new ktm(0));
    public static final a7u0 c = new a7u0(new ktm(1));

    public static final void a(qom qomVar, xtm xtmVar, wls wlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(243340635);
        int i2 = (btsVar.k(qomVar) ? 4 : 2) | i | (btsVar.k(xtmVar) ? 32 : 16) | (btsVar.e(wlsVar) ? 256 : 128);
        if ((i2 & 147) == 146 && btsVar.E()) {
            btsVar.Y();
        } else {
            sb2.c(new vvf0[]{a.a(qomVar), c.a(xtmVar)}, wlsVar, btsVar, ((i2 >> 3) & 112) | 8);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new j9a(qomVar, xtmVar, wlsVar, i, 28);
        }
    }

    public static final xtm b(fid fidVar) {
        return (xtm) ((bts) fidVar).m(c);
    }
}
