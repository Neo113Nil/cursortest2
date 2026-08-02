package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.component.control.a;

/* loaded from: classes5.dex */
public abstract class c991 {
    public static final int[] a = {0, 0, 0, 0, 0, 4096, HProv.CALG_RSA_SIGN, 21504, 35840, 44032, 53248, 63488, 74752, 87040, 93696, 100864, 104704, 106752, 108928, 113536, 115968, 118528, 119872, 121280, 122016};
    public static final int[] b = {0, 0, 0, 0, 10, 10, 11, 11, 10, 10, 10, 10, 10, 9, 9, 8, 7, 7, 8, 7, 7, 6, 6, 5, 5};

    public static final int a(double d) {
        int i = (int) d;
        if (i == d) {
            return i;
        }
        throw new IllegalStateException((d + " cannot be converted to Int").toString());
    }

    public static final long b(double d) {
        long j = (long) d;
        if (j == d) {
            return j;
        }
        throw new IllegalStateException((d + " cannot be converted to Long").toString());
    }

    public static final double c(long j) {
        double d = j;
        if (((long) d) == j) {
            return d;
        }
        throw new IllegalStateException((j + " cannot be converted to Double").toString());
    }

    public static final int d(long j) {
        int i = (int) j;
        if (i == j) {
            return i;
        }
        throw new IllegalStateException((j + " cannot be converted to Int").toString());
    }

    public static final void e(exh exhVar, sls slsVar, fid fidVar, int i) {
        int i2;
        bts btsVar;
        long g;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1312035581);
        int i3 = i & 6;
        nhl0 nhl0Var = nhl0.a;
        if (i3 == 0) {
            i2 = (btsVar2.k(nhl0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(exhVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.e(slsVar) ? 256 : 128;
        }
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            if (exhVar.c) {
                btsVar2.e0(1854198318);
                g = ((el51) btsVar2.m(gl51.a)).f();
            } else {
                btsVar2.e0(1854199471);
                g = ((el51) btsVar2.m(gl51.a)).g();
            }
            btsVar2.t(false);
            btsVar = btsVar2;
            a.b(slsVar, ljs0.e(nhl0Var.a(c530.a, 1.0f, true), 56.0f), null, g, 0L, null, null, null, false, null, null, null, wwg.S(2029886244, true, new ota(15, exhVar), btsVar2), btsVar, (i2 >> 6) & 14, 384, 4084);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zyd(exhVar, slsVar, i, 9);
        }
    }

    public static final void f(exh exhVar, exh exhVar2, sls slsVar, sls slsVar2, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(596720999);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(exhVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(exhVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(slsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(slsVar2) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            f530 l = an91.l(ljs0.c(c530.a, 1.0f), 8.0f, 8.0f);
            lhl0 a2 = khl0.a(new i43(4.0f, true, new quz(11)), x4c.E, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, l);
            ohd.G1.getClass();
            sls slsVar3 = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar3);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d);
            e(exhVar, slsVar, btsVar, ((i2 << 3) & 112) | 6 | (i2 & 896));
            e(exhVar2, slsVar2, btsVar, ((i2 >> 3) & 896) | (i2 & 112) | 6);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new g0(exhVar, exhVar2, slsVar, slsVar2, i, 17);
        }
    }

    public static final void g(List list, tls tlsVar, fid fidVar, int i) {
        tls tlsVar2 = tlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-228426818);
        char c = 2;
        int i2 = (i & 6) == 0 ? (btsVar.e(list) ? 4 : 2) | i : i;
        int i3 = 32;
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 32 : 16;
        }
        int i4 = i2;
        boolean z = false;
        boolean z2 = true;
        if (btsVar.V(i4 & 1, (i4 & 19) != 18)) {
            int i5 = 0;
            for (Object obj : list) {
                int i6 = i5 + 1;
                androidx.compose.runtime.internal.a aVar = null;
                if (i5 < 0) {
                    scc.m();
                    throw null;
                }
                fxh fxhVar = (fxh) obj;
                c530 c530Var = c530.a;
                f530 c2 = ljs0.c(c530Var, 1.0f);
                boolean k = ((i4 & 112) == i3 ? z2 : z) | btsVar.k(fxhVar);
                Object Q = btsVar.Q();
                if (k || Q == did.a) {
                    Q = new bmh(6, tlsVar2, fxhVar);
                    btsVar.o0(Q);
                }
                f530 d = q791.d(c2, false, null, null, (sls) Q, 15);
                v4v v4vVar = fxhVar.b;
                if (v4vVar == null) {
                    btsVar.e0(-1587161570);
                    btsVar.t(z);
                } else {
                    btsVar.e0(-1587161569);
                    aVar = wwg.S(773225756, z2, new mb(v4vVar, 5), btsVar);
                    btsVar.t(z);
                }
                androidx.compose.runtime.internal.a S = wwg.S(-1992371977, z2, new tbb(19, fxhVar), btsVar);
                o6d.a.getClass();
                boolean z3 = z2;
                int i7 = i3;
                boolean z4 = z;
                bts btsVar2 = btsVar;
                int i8 = i5;
                web1.c(d, 56.0f, false, 0.0f, null, aVar, S, null, null, o6d.b, null, oa01.a, false, btsVar2, 806879232, 0, 5532);
                btsVar = btsVar2;
                if (i8 != scc.f(list)) {
                    btsVar.e0(-1586901634);
                    dk91.a(0.0f, 6, 6, 0L, btsVar, an91.o(c530Var, 56.0f, 0.0f, 16.0f, 0.0f, 10));
                    btsVar.t(z4);
                } else {
                    btsVar.e0(-1586823793);
                    btsVar.t(z4);
                }
                c = 2;
                z = z4;
                i5 = i6;
                z2 = z3;
                i3 = i7;
                tlsVar2 = tlsVar;
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i7a(list, tlsVar, i, 2);
        }
    }

    public static final void h(f530 f530Var, hxh hxhVar, tls tlsVar, sls slsVar, sls slsVar2, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-745208165);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(hxhVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(slsVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(slsVar2) ? 16384 : 8192;
        }
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var);
            ohd.G1.getClass();
            sls slsVar3 = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar3);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d);
            if (hxhVar.a != null) {
                btsVar.e0(1983760542);
                l(hxhVar.a, an91.k(new ypu(x4c.H), 16.0f), btsVar, 0);
                btsVar.t(false);
            } else {
                btsVar.e0(1983982502);
                ly3.B(c530.a, 20.0f, btsVar, false);
            }
            j(hxhVar.c, hxhVar.d, btsVar, 0);
            int i3 = i2 >> 3;
            g(hxhVar.e, tlsVar, btsVar, i3 & 112);
            f(hxhVar.f, hxhVar.g, slsVar, slsVar2, btsVar, i3 & 8064);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nc0(f530Var, (Object) hxhVar, (Object) tlsVar, (Object) slsVar, (Object) slsVar2, i, 11);
        }
    }

    public static final void i(dxh dxhVar, tls tlsVar, sls slsVar, sls slsVar2, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(671931077);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(dxhVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(slsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(slsVar2) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            f530 c = ljs0.c(c530.a, 1.0f);
            if (dxhVar.equals(ixh.a)) {
                btsVar.e0(1480679827);
                k(btsVar, 0);
                btsVar.t(false);
            } else {
                if (!(dxhVar instanceof hxh)) {
                    throw unr0.y(1480678327, btsVar, false);
                }
                btsVar.e0(1480681886);
                int i3 = i2 << 3;
                h(c, (hxh) dxhVar, tlsVar, slsVar, slsVar2, btsVar, (i3 & 112) | 6 | (i3 & 896) | (i3 & 7168) | (i3 & HProv.ALG_CLASS_ALL));
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new g0((Object) dxhVar, tlsVar, (cms) slsVar, (Object) slsVar2, i, 16);
        }
    }

    public static final void j(CharSequence charSequence, CharSequence charSequence2, fid fidVar, int i) {
        CharSequence charSequence3;
        CharSequence charSequence4;
        c530 c530Var;
        float f;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1275662556);
        int i2 = (btsVar.e(charSequence) ? 4 : 2) | i | (btsVar.e(charSequence2) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var2 = c530.a;
            f530 m = an91.m(c530Var2, 16.0f, 0.0f, 2);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, m);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d);
            if (charSequence == null) {
                btsVar.e0(968511131);
                btsVar.t(false);
                f = 16.0f;
                c530Var = c530Var2;
            } else {
                btsVar.e0(968511132);
                c530Var = c530Var2;
                f = 16.0f;
                zgb1.a(charSequence, an91.o(c530Var2, 0.0f, 0.0f, 0.0f, charSequence2 != null ? 12.0f : 0.0f, 7), 8388611, false, null, null, false, null, btsVar, 384, 248);
                btsVar.t(false);
            }
            if (charSequence2 == null) {
                btsVar.e0(968750296);
                btsVar.t(false);
                charSequence4 = charSequence2;
                charSequence3 = charSequence;
            } else {
                btsVar.e0(968750297);
                charSequence4 = charSequence2;
                charSequence3 = charSequence;
                zgb1.a(charSequence4, null, 8388611, false, null, null, false, null, btsVar, 384, 250);
                btsVar.t(false);
            }
            if (charSequence3 == null && charSequence4 == null) {
                btsVar.e0(968978364);
                btsVar.t(false);
            } else {
                tse0.s(btsVar, 968926470, c530Var, f, btsVar);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            charSequence3 = charSequence;
            charSequence4 = charSequence2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zga(i, 2, charSequence3, charSequence4);
        }
    }

    public static final void k(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-110785374);
        if (btsVar.V(i & 1, i != 0)) {
            c530 c530Var = c530.a;
            f530 l = an91.l(ljs0.c(c530Var, 1.0f), 16.0f, 32.0f);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, l);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d);
            mdb1.a(319.0f, an91.o(ljs0.c(c530Var, 1.0f), 0.0f, 0.0f, 16.0f, 0.0f, 11), btsVar, 438, 0);
            oeb1.c(btsVar, ljs0.e(c530Var, 24.0f));
            mdb1.a(255.0f, null, btsVar, 54, 4);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gse(i, 18);
        }
    }

    public static final void l(gxh gxhVar, f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1878729141);
        int i2 = (btsVar.k(gxhVar) ? 4 : 2) | i | (btsVar.k(f530Var) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, f530Var);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            c530 c530Var = c530.a;
            s3b1.f(gxhVar.b, ymb1.l(ljs0.m(c530Var, 84.0f), cyk0.a), mhe.a, btsVar, 384, 0);
            String str = gxhVar.a;
            if (str == null) {
                btsVar.e0(-858709160);
                btsVar.t(false);
            } else {
                btsVar.e0(-858709159);
                y3b1.b(str, an91.m(cj6.a.a(c530Var, x4c.w), 3.0f, 0.0f, 2), 0L, 0L, btsVar, 0);
                btsVar = btsVar;
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mjf(gxhVar, f530Var, i, 8);
        }
    }

    public static final void m(vv90 vv90Var, ArrayList arrayList, ryj0 ryj0Var) {
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (l7b1.a((vcq0) it.next()) instanceof PaymentMethod.SbpToken) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            ryj0Var.onSuccess(arrayList);
        }
        ((yv90) vv90Var).b(new xv90(arrayList, ryj0Var));
    }
}
