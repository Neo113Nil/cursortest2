package defpackage;

import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes15.dex */
public abstract class gdy0 {
    public static final void a(sls slsVar, tls tlsVar, tls tlsVar2, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(2110446346);
        if ((i & 6) == 0) {
            i2 = (btsVar2.e(slsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.e(tlsVar2) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar2.k(f530Var) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= 8192;
        }
        if ((i2 & 9363) == 9362 && btsVar2.E()) {
            btsVar2.Y();
            aii0 v = btsVar2.v();
            if (v != null) {
                v.d = new c8i0((Object) slsVar, (cms) tlsVar, (cms) tlsVar2, f530Var, i, 16);
                return;
            }
            return;
        }
        btsVar2.a0();
        if ((i & 1) == 0 || btsVar2.C()) {
            btsVar2.e0(-897180073);
            rs31 b = jjo.b(btsVar2);
            hs31 a = jjo.a(btsVar2);
            btsVar2.e0(544794079);
            boolean e = btsVar2.e(a);
            Object Q = btsVar2.Q();
            if (e || Q == did.a) {
                Q = new w4(a, 27);
                btsVar2.o0(Q);
            }
            btsVar2.t(false);
            btsVar = btsVar2;
            yr31 G = ooc.G(qoi0.a(idy0.class), b, null, vfc.h(idy0.class, new zwv(), (tls) Q), b instanceof q7u ? ((q7u) b).getDefaultViewModelCreationExtras() : w8f.b, btsVar);
            btsVar.t(false);
        } else {
            btsVar2.Y();
            btsVar = btsVar2;
        }
        btsVar.u();
        btsVar.m(q1z.a).getClass();
        ny61.u();
    }
}
