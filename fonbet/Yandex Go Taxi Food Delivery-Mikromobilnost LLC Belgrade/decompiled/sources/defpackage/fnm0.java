package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public abstract class fnm0 {
    public static final byk0 a = cyk0.e(0.0f, 0.0f, 24.0f, 24.0f, 3);

    public static final void a(int i, fid fidVar, tls tlsVar, f530 f530Var, String str) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-457483502);
        dmw0 dmw0Var = btsVar.a;
        int i2 = ((i & 6) == 0 ? (btsVar.k(str) ? 4 : 2) | i : i) | 48;
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            AppColor$Palette appColor$Palette = AppColor$Palette.Background;
            gji0 gji0Var = qke.q;
            c530 c530Var = c530.a;
            f530 c = bzk0.c(c530Var, appColor$Palette, gji0Var);
            so5 so5Var = x4c.G;
            g43 g43Var = lr20.c;
            sic a2 = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a2);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar2 = d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            qza1.b(false, tlsVar, btsVar, ((i2 >> 3) & 112) | 6);
            lhl0 a3 = khl0.a(lr20.a, x4c.E, btsVar, 48);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530Var2 = c530Var;
            f530 d2 = b.d(btsVar, f530Var2);
            btsVar.i0();
            int i3 = i2;
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a3);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
            x2y d3 = n.d(btsVar, d2, wlsVar4, 1.0f, true);
            sic a4 = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d4 = b.d(btsVar, d3);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a4);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode3, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d4);
            tfb1.b(ljs0.c(f530Var2, 1.0f), btsVar, 6);
            tfb1.b(ljs0.c(f530Var2, 1.0f), btsVar, 6);
            btsVar.t(true);
            au2 c2 = b0b1.c();
            boolean z = (i3 & 14) == 4;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new dcc0(str, 24);
                btsVar.o0(Q);
            }
            sya1.a(c2, an91.k(an91.o(fnq0.b(f530Var2, false, (tls) Q), 0.0f, 0.0f, 8.0f, 0.0f, 11), 8.0f), null, null, btsVar, 0, 12);
            btsVar.t(true);
            f530 l = an91.l(f530Var2, 12.0f, 8.0f);
            lhl0 a5 = khl0.a(new i43(4.0f, true, new quz(11)), x4c.D, btsVar, 6);
            int hashCode4 = Long.hashCode(btsVar.T);
            r1b0 o4 = btsVar.o();
            f530 d5 = b.d(btsVar, l);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a5);
            qje.W(btsVar, wlsVar2, o4);
            vfc.v(hashCode4, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d5);
            btsVar.e0(-1908016300);
            for (int i4 = 0; i4 < 2; i4++) {
                aka1.c(null, btsVar, 0);
            }
            tse0.t(btsVar, false, true, true);
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xwr(str, f530Var2, tlsVar, i);
        }
    }

    public static final void b(boolean z, s7u0 s7u0Var, List list, boolean z2, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        boolean z3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-760445193);
        if ((i & 6) == 0) {
            i2 = (btsVar.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(s7u0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(list) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.a(z2) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.k(f530Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.e(tlsVar) ? 131072 : 65536;
        }
        int i3 = i2;
        if (btsVar.V(i3 & 1, (74899 & i3) != 74898)) {
            ehr0 ehr0Var = z2 ? a : qke.q;
            f530 d = ooc.d(bzk0.c(hbb1.b(f530Var, igr0.a(dbb1.b(btsVar), null, 5), ehr0Var, z2 && !z, 8), AppColor$Palette.Background, ehr0Var), sb2.K(100, 0, null, 6), 2);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, d);
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
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            if (z) {
                btsVar.e0(-1619200363);
                int i4 = (i3 >> 12) & 112;
                qza1.b(true, tlsVar, btsVar, i4 | 6);
                int i5 = 458752 & i3;
                boolean z4 = i5 == 131072;
                Object Q = btsVar.Q();
                o430 o430Var = did.a;
                if (z4 || Q == o430Var) {
                    Q = new wzl0(1, tlsVar);
                    btsVar.o0(Q);
                }
                sls slsVar2 = (sls) Q;
                boolean z5 = i5 == 131072;
                Object Q2 = btsVar.Q();
                if (z5 || Q2 == o430Var) {
                    Q2 = new wzl0(2, tlsVar);
                    btsVar.o0(Q2);
                }
                sls slsVar3 = (sls) Q2;
                boolean z6 = i5 == 131072;
                Object Q3 = btsVar.Q();
                if (z6 || Q3 == o430Var) {
                    Q3 = new wzl0(3, tlsVar);
                    btsVar.o0(Q3);
                }
                tfb1.e(s7u0Var, slsVar2, slsVar3, (sls) Q3, null, btsVar, (i3 >> 3) & 14);
                aka1.b(((i3 >> 6) & 14) | 384 | i4, btsVar, tlsVar, list, true);
                btsVar.t(false);
            } else {
                btsVar.e0(-1618618059);
                qza1.a(s7u0Var.a.getText(), s7u0Var.b.getText(), btsVar, 0);
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (((lt) it.next()).f) {
                            btsVar.e0(-1618429889);
                            z3 = false;
                            yrl.b(0, 7, btsVar, null);
                            aka1.b(((i3 >> 6) & 14) | 384 | ((i3 >> 12) & 112), btsVar, tlsVar, list, false);
                            btsVar.t(false);
                            break;
                        }
                    }
                }
                z3 = false;
                btsVar.e0(-1618274207);
                btsVar.t(false);
                btsVar.t(z3);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new rz9(z, s7u0Var, list, z2, f530Var, tlsVar, i);
        }
    }
}
