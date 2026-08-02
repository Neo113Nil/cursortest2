package defpackage;

/* loaded from: classes15.dex */
public abstract class ew11 {
    public static final void a(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(927817231);
        if (((i | 22) & 19) == 18 && btsVar.E()) {
            btsVar.Y();
            aii0 v = btsVar.v();
            if (v != null) {
                v.d = new jiz0(i, 20);
                return;
            }
            return;
        }
        btsVar.a0();
        if ((i & 1) != 0 && !btsVar.C()) {
            btsVar.Y();
            btsVar.u();
            throw null;
        }
        btsVar.e0(-897180073);
        rs31 b = jjo.b(btsVar);
        hs31 a = jjo.a(btsVar);
        btsVar.e0(544794079);
        boolean e = btsVar.e(a);
        Object Q = btsVar.Q();
        if (e || Q == did.a) {
            Q = new w4(a, 28);
            btsVar.o0(Q);
        }
        tls tlsVar = (tls) Q;
        btsVar.t(false);
        ooc.G(qoi0.a(fw11.class), b, null, vfc.h(fw11.class, new zwv(), tlsVar), b instanceof q7u ? ((q7u) b).getDefaultViewModelCreationExtras() : w8f.b, btsVar);
        btsVar.t(false);
        ny61.u();
    }
}
