package defpackage;

import com.yandex.messaging.ui.settings.privacy.blocked.a;

/* loaded from: classes15.dex */
public abstract class o46 {
    public static final void a(f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(947628268);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i2 & 19) == 18 && btsVar.E()) {
            btsVar.Y();
            aii0 v = btsVar.v();
            if (v != null) {
                v.d = new dc0(f530Var, i, 3);
                return;
            }
            return;
        }
        btsVar.a0();
        if ((i & 1) == 0 || btsVar.C()) {
            btsVar.e0(-897180073);
            rs31 b = jjo.b(btsVar);
            hs31 a = jjo.a(btsVar);
            btsVar.e0(544794079);
            boolean e = btsVar.e(a);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new w4(a, i3);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            yr31 G = ooc.G(qoi0.a(a.class), b, null, vfc.h(a.class, new zwv(), (tls) Q), b instanceof q7u ? ((q7u) b).getDefaultViewModelCreationExtras() : w8f.b, btsVar);
            btsVar.t(false);
        } else {
            btsVar.Y();
        }
        btsVar.u();
        btsVar.m(q1z.a).getClass();
        ny61.u();
    }
}
