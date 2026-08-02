package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import java.io.File;
import java.util.List;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Pair;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class a8a1 {
    public static final void a(m611 m611Var, f530 f530Var, boolean z, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(963028488);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(m611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z) ? 256 : 128;
        }
        if (!btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            btsVar.Y();
        } else if (z) {
            btsVar.e0(-799680057);
            c(m611Var, f530Var, null, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(false);
        } else {
            btsVar.e0(-799623513);
            b(m611Var, f530Var, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kj5(m611Var, f530Var, z, i, 3);
        }
    }

    public static final void b(m611 m611Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1709895951);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (btsVar.e(m611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        int i4 = 0;
        int i5 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 c = ljs0.c(f530Var, 1.0f);
            boolean e = btsVar.e(m611Var);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new j0o(m611Var, i4);
                btsVar.o0(Q);
            }
            ydb1.a(fnq0.a(c, (tls) Q), wwg.S(764183451, true, new k0o(m611Var, i4), btsVar), wwg.S(428537344, true, new k0o(m611Var, i5), btsVar), null, wwg.S(1536872966, true, new k0o(m611Var, i3), btsVar), null, SlotSize.L, false, btsVar, 1597872, JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zyd(m611Var, f530Var, i, 19);
        }
    }

    public static final void c(m611 m611Var, f530 f530Var, ety0 ety0Var, fid fidVar, int i) {
        int i2;
        ety0 ety0Var2;
        ety0 ety0Var3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1073123256);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (btsVar.e(m611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                ety0Var3 = xya1.d(btsVar).f.c;
            } else {
                btsVar.Y();
                ety0Var3 = ety0Var;
            }
            btsVar.u();
            String str = m611Var.c;
            boolean e = btsVar.e(m611Var);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new j0o(m611Var, i4);
                btsVar.o0(Q);
            }
            a5l0.d(str, fnq0.a(f530Var, (tls) Q), 0.0f, 0.0f, null, 0.0f, ety0Var3, null, wwg.S(237117378, true, new k0o(m611Var, 3), btsVar), wwg.S(268089944, true, new a6n(i3, m611Var, ety0Var3), btsVar), btsVar, 905969664, 188);
            ety0Var2 = ety0Var3;
        } else {
            btsVar.Y();
            ety0Var2 = ety0Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new etm((Object) m611Var, f530Var, (Object) ety0Var2, i, 6);
        }
    }

    public static final void d(int i, fid fidVar, f530 f530Var, String str) {
        String str2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-384817867);
        dmw0 dmw0Var = btsVar2.a;
        int i2 = i | (btsVar2.k(str) ? 4 : 2);
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            lhl0 a = khl0.a(lr20.a, x4c.E, btsVar2, 48);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = b.d(btsVar2, f530Var);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar2, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar2, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar2, wlsVar3, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar2, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar2, wlsVar4, d);
            byk0 c = cyk0.c(6.0f);
            c530 c530Var = c530.a;
            f530 m = an91.m(m4m0.b(ljs0.a(ymb1.l(c530Var, c), 20.0f, 20.0f), tje.n(new up2(cq2.d), btsVar2), qke.q), 4.0f, 0.0f, 2);
            z910 d2 = pi6.d(x4c.y, false);
            int hashCode2 = Long.hashCode(btsVar2.T);
            r1b0 o2 = btsVar2.o();
            f530 d3 = b.d(btsVar2, m);
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, wlsVar, d2);
            qje.W(btsVar2, wlsVar2, o2);
            vfc.v(hashCode2, btsVar2, wlsVar3, btsVar2, tlsVar);
            qje.W(btsVar2, wlsVar4, d3);
            jeb1.f(str, null, AppColor$Palette.Control, 0L, 0L, null, null, 0L, 0, false, 1, 0, null, xya1.e(btsVar2).h.b, btsVar2, (i2 & 14) | 384, 48, 14330);
            btsVar2.t(true);
            oeb1.c(btsVar2, ljs0.q(c530Var, 6.0f));
            str2 = str;
            jeb1.f(ohb1.e(btsVar2, kyh0.mt_exit), null, AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar2).h.a, btsVar2, 384, 0, 16378);
            btsVar = btsVar2;
            btsVar.t(true);
        } else {
            str2 = str;
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kga(str2, f530Var, i, 2);
        }
    }

    public static final void e(kt60 kt60Var, fid fidVar, int i) {
        kt60 kt60Var2;
        mie mieVar;
        mie mieVar2;
        g43 g43Var;
        wls wlsVar;
        mie mieVar3;
        boolean z;
        float f;
        boolean z2;
        mie mieVar4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1732828887);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(kt60Var) ? 4 : 2);
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            f530 o = an91.o(ljs0.c, 13.0f, 0.0f, 16.0f, 0.0f, 10);
            lhl0 a = khl0.a(lr20.a, x4c.E, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = b.d(btsVar, o);
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
            wls wlsVar2 = d.f;
            qje.W(btsVar, wlsVar2, a);
            wls wlsVar3 = d.e;
            qje.W(btsVar, wlsVar3, o2);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar4 = d.g;
            qje.W(btsVar, wlsVar4, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar5 = d.d;
            qje.W(btsVar, wlsVar5, d);
            so5 so5Var = x4c.G;
            g43 g43Var2 = lr20.c;
            sic a2 = qic.a(g43Var2, so5Var, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            c530 c530Var = c530.a;
            f530 d2 = b.d(btsVar, c530Var);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar2, a2);
            qje.W(btsVar, wlsVar3, o3);
            vfc.v(hashCode2, btsVar, wlsVar4, btsVar, tlsVar);
            qje.W(btsVar, wlsVar5, d2);
            mie mieVar5 = kt60Var.a;
            mie mieVar6 = kt60Var.d;
            mie mieVar7 = kt60Var.b;
            mie mieVar8 = kt60Var.c;
            if (mieVar5 == null) {
                btsVar.e0(-740820529);
                btsVar.t(false);
                g43Var = g43Var2;
                mieVar = mieVar8;
                mieVar2 = mieVar6;
                mieVar3 = mieVar7;
                wlsVar = wlsVar5;
                z = false;
            } else {
                btsVar.e0(-740820528);
                mieVar = mieVar8;
                mieVar2 = mieVar6;
                g43Var = g43Var2;
                wlsVar = wlsVar5;
                mieVar3 = mieVar7;
                z = false;
                f(null, mieVar5, kt60Var.e, btsVar, 0, 1);
                btsVar.t(false);
            }
            if (kt60Var.a == null || mieVar == null) {
                btsVar.e0(-740632141);
                btsVar.t(z);
            } else {
                tse0.s(btsVar, -740677308, c530Var, 1.0f, btsVar);
                btsVar.t(z);
            }
            if (mieVar == null) {
                btsVar.e0(-740597329);
                btsVar.t(z);
                f = 1.0f;
            } else {
                btsVar.e0(-740597328);
                f = 1.0f;
                f(null, mieVar, kt60Var.e, btsVar, 0, 1);
                btsVar.t(z);
            }
            btsVar.t(true);
            oeb1.c(btsVar, new x2y(f, true));
            f530 s = ljs0.s(c530Var, 0.0f, 80.0f, 1);
            sic a3 = qic.a(g43Var, x4c.I, btsVar, 48);
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o4 = btsVar.o();
            f530 d3 = b.d(btsVar, s);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar2, a3);
            qje.W(btsVar, wlsVar3, o4);
            vfc.v(hashCode3, btsVar, wlsVar4, btsVar, tlsVar);
            qje.W(btsVar, wlsVar, d3);
            if (mieVar3 == null) {
                btsVar.e0(-696612090);
                z2 = false;
                btsVar.t(false);
                kt60Var2 = kt60Var;
                mieVar4 = mieVar3;
            } else {
                z2 = false;
                btsVar.e0(-696612089);
                kt60Var2 = kt60Var;
                mieVar4 = mieVar3;
                f(null, mieVar4, kt60Var2.e, btsVar, 0, 1);
                btsVar.t(false);
            }
            if (mieVar4 == null || mieVar2 == null) {
                btsVar.e0(-696427670);
                btsVar.t(z2);
            } else {
                tse0.s(btsVar, -696472837, c530Var, f, btsVar);
                btsVar.t(z2);
            }
            if (mieVar2 == null) {
                btsVar.e0(-696394842);
                btsVar.t(z2);
            } else {
                btsVar.e0(-696394841);
                f(null, mieVar2, kt60Var2.e, btsVar, 0, 1);
                btsVar.t(z2);
            }
            btsVar.t(true);
            btsVar.t(true);
        } else {
            kt60Var2 = kt60Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new l131(kt60Var2, i);
        }
    }

    public static final void f(f530 f530Var, mie mieVar, wp2 wp2Var, fid fidVar, int i, int i2) {
        f530 f530Var2;
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(751769651);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            f530Var2 = f530Var;
        } else if ((i & 6) == 0) {
            f530Var2 = f530Var;
            i3 = (btsVar.k(f530Var2) ? 4 : 2) | i;
        } else {
            f530Var2 = f530Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.k(mieVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar.k(wp2Var) ? 256 : 128;
        }
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            c530 c530Var = c530.a;
            f530 f530Var3 = i4 != 0 ? c530Var : f530Var2;
            if (mieVar instanceof lie) {
                btsVar.e0(2010339035);
                n8p.a(((lie) mieVar).a, wp2Var, f530Var3, null, null, btsVar, ((i3 >> 3) & 112) | ((i3 << 6) & 896), 24);
                f530Var2 = f530Var3;
                btsVar.t(false);
            } else {
                f530Var2 = f530Var3;
                if (!(mieVar instanceof kie)) {
                    throw unr0.y(896132604, btsVar, false);
                }
                btsVar.e0(2010507489);
                f530 c = bzk0.c(ljs0.m(c530Var, 20.0f), AppColor$Palette.BgFloating, cyk0.c(6.0f));
                ovi0 ovi0Var = ((kie) mieVar).a;
                ffd.a.getClass();
                v0b1.a(ovi0Var, c, null, ffd.b, null, null, null, null, 0.0f, 0, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 1012);
                btsVar = btsVar;
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gk11(f530Var2, mieVar, wp2Var, i, i2);
        }
    }

    public static final void g(f530 f530Var, kt60 kt60Var, sls slsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1371434957);
        int i2 = (btsVar.k(f530Var) ? 4 : 2) | i | (btsVar.k(kt60Var) ? 32 : 16) | (btsVar.e(slsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            ButtonSize buttonSize = ButtonSize.L;
            d17.b(bzk0.c(ljs0.c(f530Var, 1.0f), kt60Var.e, cyk0.c(16.0f)), true, null, null, buttonSize.getSize(), tcb1.c(buttonSize, btsVar), false, slsVar, wwg.S(1711123678, true, new jvx0(24, kt60Var), btsVar), btsVar, ((i2 << 15) & 29360128) | 102239664);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nvs0(f530Var, kt60Var, slsVar, i, 25);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v33 */
    public static final void h(a0x0 a0x0Var, wp2 wp2Var, fid fidVar, int i) {
        Pair pair;
        to5 to5Var;
        int i2;
        wls wlsVar;
        tls tlsVar;
        wls wlsVar2;
        ?? r2;
        boolean z;
        wp2 wp2Var2 = wp2Var;
        Pair pair2 = a0x0Var.a;
        to5 to5Var2 = x4c.D;
        bts btsVar = (bts) fidVar;
        btsVar.g0(882493852);
        dmw0 dmw0Var = btsVar.a;
        int i3 = (btsVar.k(a0x0Var) ? 4 : 2) | i | (btsVar.k(wp2Var2) ? 32 : 16);
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            f530 o = an91.o(ljs0.c, 13.0f, 0.0f, 16.0f, 0.0f, 10);
            sic a = qic.a(lr20.e, x4c.G, btsVar, 6);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = b.d(btsVar, o);
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
            wls wlsVar3 = d.f;
            qje.W(btsVar, wlsVar3, a);
            wls wlsVar4 = d.e;
            qje.W(btsVar, wlsVar4, o2);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar5 = d.g;
            qje.W(btsVar, wlsVar5, valueOf);
            tls tlsVar2 = d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar6 = d.d;
            qje.W(btsVar, wlsVar6, d);
            Pair pair3 = a0x0Var.b;
            f43 f43Var = lr20.a;
            c530 c530Var = c530.a;
            if (pair2 == null) {
                btsVar.e0(350311610);
                r2 = 0;
                btsVar.t(false);
                pair = pair2;
                to5Var = to5Var2;
                i2 = i3;
                wlsVar = wlsVar3;
                wlsVar2 = wlsVar4;
                tlsVar = tlsVar2;
            } else {
                btsVar.e0(350311611);
                mie mieVar = (mie) pair2.getFirst();
                mie mieVar2 = (mie) pair2.getSecond();
                f530 c = ljs0.c(c530Var, 1.0f);
                pair = pair2;
                lhl0 a2 = khl0.a(f43Var, to5Var2, btsVar, 0);
                to5Var = to5Var2;
                i2 = i3;
                int hashCode2 = Long.hashCode(btsVar.T);
                r1b0 o3 = btsVar.o();
                f530 d2 = b.d(btsVar, c);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar3, a2);
                qje.W(btsVar, wlsVar4, o3);
                vfc.v(hashCode2, btsVar, wlsVar5, btsVar, tlsVar2);
                qje.W(btsVar, wlsVar6, d2);
                int i4 = (i2 << 3) & 896;
                wlsVar = wlsVar3;
                tlsVar = tlsVar2;
                wlsVar2 = wlsVar4;
                f(null, mieVar, wp2Var, btsVar, i4, 1);
                oeb1.c(btsVar, new x2y(1.0f, true));
                f(ljs0.s(c530Var, 0.0f, 80.0f, 1), mieVar2, wp2Var, btsVar, i4 | 6, 0);
                btsVar.t(true);
                r2 = 0;
                btsVar.t(false);
            }
            if (pair == null || pair3 == null) {
                btsVar.e0(350752400);
                btsVar.t(r2);
            } else {
                tse0.s(btsVar, 350700506, c530Var, 1.0f, btsVar);
                btsVar.t(r2);
            }
            if (pair3 == null) {
                btsVar.e0(350787367);
                btsVar.t(r2);
                wp2Var2 = wp2Var;
                z = true;
            } else {
                btsVar.e0(350787368);
                mie mieVar3 = (mie) pair3.getFirst();
                mie mieVar4 = (mie) pair3.getSecond();
                f530 c2 = ljs0.c(c530Var, 1.0f);
                lhl0 a3 = khl0.a(f43Var, to5Var, btsVar, r2);
                int hashCode3 = Long.hashCode(btsVar.T);
                r1b0 o4 = btsVar.o();
                f530 d3 = b.d(btsVar, c2);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar, a3);
                qje.W(btsVar, wlsVar2, o4);
                vfc.v(hashCode3, btsVar, wlsVar5, btsVar, tlsVar);
                qje.W(btsVar, wlsVar6, d3);
                z = true;
                int i5 = ((i2 << 3) & 896) | 6;
                wp2Var2 = wp2Var;
                f(ljs0.s(c530Var, 0.0f, 80.0f, 1), mieVar3, wp2Var2, btsVar, i5, 0);
                oeb1.c(btsVar, new x2y(1.0f, true));
                f(ljs0.s(c530Var, 0.0f, 80.0f, 1), mieVar4, wp2Var2, btsVar, i5, 0);
                btsVar.t(true);
                btsVar.t(false);
            }
            btsVar.t(z);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hex0(a0x0Var, wp2Var2, i, 25);
        }
    }

    public static final void i(vzu vzuVar, tls tlsVar, f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1533933552);
        int i2 = i | (btsVar.k(vzuVar) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16) | (btsVar.k(f530Var) ? 256 : 128);
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            List list = vzuVar.b;
            int i4 = vzuVar.a;
            int size = ((list.size() + i4) - 1) / i4;
            f530 e = ljs0.e(f530Var, size * 64);
            int i5 = i2 & 14;
            boolean c = btsVar.c(size) | (i5 == 4);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (c || Q == o430Var) {
                Q = new zc31(size, vzuVar, i3);
                btsVar.o0(Q);
            }
            f530 b = fnq0.b(e, false, (tls) Q);
            t0u t0uVar = new t0u(i4);
            int i6 = 11;
            i43 i43Var = new i43(8.0f, true, new quz(i6));
            i43 i43Var2 = new i43(8.0f, true, new quz(i6));
            boolean z = (i5 == 4) | ((i2 & 112) == 32);
            Object Q2 = btsVar.Q();
            if (z || Q2 == o430Var) {
                Q2 = new e331(7, vzuVar, tlsVar);
                btsVar.o0(Q2);
            }
            cdb1.a(t0uVar, b, null, null, i43Var, i43Var2, null, false, null, (tls) Q2, btsVar, 102432768);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nvs0(vzuVar, tlsVar, f530Var, i, 24);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if (r2 != 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final dy61 j(int i, Context context) {
        long j;
        a081 a081Var;
        jb71 jb71Var = rj71.a;
        boolean z = ew71.a;
        ew71.a = Log.isLoggable("Yandex Mobile Ads", 2);
        ew71.a = false;
        mk71 mk71Var = new mk71();
        context.getApplicationContext();
        Context applicationContext = context.getApplicationContext();
        SSLSocketFactory a = mk71Var.a(applicationContext);
        hka1.a(applicationContext);
        pw71 pw71Var = new pw71(new eu71(new o291(a)));
        File a2 = rl81.a(context, "mobileads-volley-cache");
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        gg81 a3 = a081Var2.a(context);
        if (a3 != null) {
            j = a3.d;
        }
        j = 52428800;
        dy61 dy61Var = new dy61(new oi81(a2, (int) gja1.a(context, 10485760L, j)), pw71Var, i);
        k981 k981Var = new k981();
        synchronized (dy61Var.k) {
            dy61Var.k.add(k981Var);
        }
        return dy61Var;
    }

    public static cif0 k() {
        return cif0.c;
    }
}
