package defpackage;

import androidx.compose.animation.core.a;
import androidx.compose.ui.platform.j;

/* loaded from: classes11.dex */
public abstract class bmb1 {
    public static au2 a;

    public static final void a(qor qorVar, up2 up2Var, wp2 wp2Var, f530 f530Var, jj2 jj2Var, float f, int i, fid fidVar, int i2) {
        qor qorVar2;
        wp2 wp2Var2;
        jj2 jj2Var2;
        int i3;
        bts btsVar;
        float f2;
        jj2 K;
        final float f3;
        final int i4;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1490864743);
        int i5 = i2 | (btsVar2.k(up2Var) ? 32 : 16) | 745472;
        if (btsVar2.V(i5 & 1, (599187 & i5) != 599186)) {
            btsVar2.a0();
            if ((i2 & 1) == 0 || btsVar2.C()) {
                K = sb2.K(0, 0, null, 7);
                f3 = 2.5f;
                i4 = 1;
            } else {
                btsVar2.Y();
                K = jj2Var;
                f3 = f;
                i4 = i;
            }
            btsVar2.u();
            qorVar2 = qorVar;
            final a b = com.yandex.go.rida.bids.utils.a.b(qorVar2, K, btsVar2, 54);
            final long n = tje.n(up2Var, btsVar2);
            wp2Var2 = wp2Var;
            final long n2 = tje.n(wp2Var2, btsVar2);
            xab1.a(f530Var, x4c.y, wwg.S(1750254723, true, new zls() { // from class: ovb
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    dj6 dj6Var = (dj6) obj;
                    fid fidVar2 = (fid) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= ((bts) fidVar2).k(dj6Var) ? 4 : 2;
                    }
                    bts btsVar3 = (bts) fidVar2;
                    if (btsVar3.V(intValue & 1, (intValue & 19) != 18)) {
                        float min = Math.min(dj6Var.d(), dj6Var.c());
                        float w0 = ((fwi) btsVar3.m(j.h)).w0(f3);
                        jvu0 jvu0Var = new jvu0(i4, 0, 26, w0, 0.0f);
                        f530 m = ljs0.m(c530.a, min);
                        boolean b2 = btsVar3.b(w0);
                        long j = n2;
                        boolean d = b2 | btsVar3.d(j) | btsVar3.e(jvu0Var);
                        a aVar = b;
                        boolean e = d | btsVar3.e(aVar);
                        long j2 = n;
                        boolean d2 = btsVar3.d(j2) | e;
                        Object Q = btsVar3.Q();
                        if (d2 || Q == did.a) {
                            evr0 evr0Var = new evr0(w0, j, jvu0Var, aVar, j2);
                            btsVar3.o0(evr0Var);
                            Q = evr0Var;
                        }
                        qeb1.a(0, btsVar3, (tls) Q, m);
                    } else {
                        btsVar3.Y();
                    }
                    return zy11.a;
                }
            }, btsVar2), btsVar2, 3126, 4);
            jj2Var2 = K;
            btsVar = btsVar2;
            i3 = i4;
            f2 = f3;
        } else {
            qorVar2 = qorVar;
            wp2Var2 = wp2Var;
            btsVar2.Y();
            jj2Var2 = jj2Var;
            i3 = i;
            btsVar = btsVar2;
            f2 = f;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ls7(qorVar2, up2Var, wp2Var2, f530Var, jj2Var2, f2, i3, i2);
        }
    }

    public static final au2 b() {
        au2 au2Var = a;
        if (au2Var != null) {
            return au2Var;
        }
        lgv lgvVar = new lgv("MinusM", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        a6t0 a6t0Var = new a6t0(iq2.g);
        uq90 uq90Var = new uq90();
        uq90Var.j(6.0f, 13.0f);
        uq90Var.g(12.0f);
        uq90Var.p(-2.0f);
        uq90Var.f(6.0f);
        uq90Var.c();
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", uq90Var.a);
        au2 a2 = rya1.a(lgvVar.d(), true);
        a = a2;
        return a2;
    }

    public static final void c(oz40 oz40Var, String str) {
        if (jl40.l(((hoy0) oz40Var.getValue()).a.b, str)) {
            return;
        }
        hoy0 hoy0Var = (hoy0) oz40Var.getValue();
        int length = str.length();
        oz40Var.setValue(hoy0.b(hoy0Var, str, eja1.c(length, length), 4));
    }
}
