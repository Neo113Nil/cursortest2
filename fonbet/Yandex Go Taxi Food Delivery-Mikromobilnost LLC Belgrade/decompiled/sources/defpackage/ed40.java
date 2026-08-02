package defpackage;

import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.vb40;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.masstransit.ui.compat.a;

/* loaded from: classes6.dex */
public abstract class ed40 {
    public static final void A(fi40 fi40Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-169855565);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(fi40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 o = an91.o(m4m0.b(an91.k(ymb1.l(ljs0.c(c530Var, 1.0f), cyk0.c(20.0f)), 2.0f), tje.n(AppColor$Palette.Background, btsVar), cyk0.c(20.0f)), 0.0f, 8.0f, 0.0f, 0.0f, 13);
            so5 so5Var = x4c.G;
            g43 g43Var = lr20.c;
            sic a = qic.a(g43Var, so5Var, btsVar, 0);
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
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o2);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar2 = d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            int i3 = i2;
            f530 n = an91.n(c530Var, 16.0f, 8.0f, 16.0f, 14.0f);
            sic a2 = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d2 = b.d(btsVar, n);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d2);
            q(fi40Var.a.a, btsVar, 0);
            p(fi40Var.a.b, btsVar, 0);
            btsVar.t(true);
            yrl.c(null, null, btsVar, 0, 7);
            di40 di40Var = fi40Var.b;
            w(di40Var.a, di40Var.b, di40Var.c, di40Var.d, btsVar, 0);
            yrl.c(null, null, btsVar, 0, 7);
            wh40 wh40Var = fi40Var.c;
            CharSequence charSequence = wh40Var.a;
            CharSequence charSequence2 = wh40Var.b;
            CharSequence charSequence3 = wh40Var.c;
            vb40.m mVar = wh40Var.d;
            uc40 uc40Var = vb40.m.Companion;
            t(charSequence, charSequence2, charSequence3, mVar, tlsVar, btsVar, 4096 | ((i3 << 9) & HProv.ALG_CLASS_ALL));
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nxu(fi40Var, tlsVar, i, 19);
        }
    }

    public static final void B(CharSequence charSequence, fid fidVar, int i) {
        int i2;
        CharSequence charSequence2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-810469266);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(charSequence) : btsVar.e(charSequence) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            charSequence2 = charSequence;
            h(charSequence2, null, xya1.e(btsVar).f.c, AppColor$Palette.Text, new sjy0(3), 2, 0, null, btsVar, (i2 & 14) | 199680, 194);
        } else {
            charSequence2 = charSequence;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new cn1(charSequence2, i, 6, (byte) 0);
        }
    }

    public static final void C(f530 f530Var, CharSequence charSequence, CharSequence charSequence2, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(186807672);
        int i2 = (btsVar.k(f530Var) ? 4 : 2) | i | (btsVar.k(charSequence) ? 32 : 16) | (btsVar.k(charSequence2) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            f530 m = an91.m(f530Var, 0.0f, 8.0f, 1);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 48);
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            D(charSequence, btsVar, (i2 >> 3) & 14);
            oeb1.c(btsVar, ljs0.e(c530.a, 4.0f));
            B(charSequence2, btsVar, (i2 >> 6) & 14);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ad40(f530Var, charSequence, charSequence2, i, 1);
        }
    }

    public static final void D(CharSequence charSequence, fid fidVar, int i) {
        int i2;
        CharSequence charSequence2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1349365470);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(charSequence) : btsVar.e(charSequence) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            charSequence2 = charSequence;
            h(charSequence2, null, xya1.e(btsVar).h.a, AppColor$Palette.TextMinor, new sjy0(3), 2, 0, null, btsVar, (i2 & 14) | 199680, 194);
        } else {
            charSequence2 = charSequence;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new cn1(charSequence2, i, 2, (byte) 0);
        }
    }

    public static final void E(final ei40 ei40Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1821494262);
        int i2 = (btsVar.k(ei40Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        final int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 k = an91.k(m4m0.b(ljs0.c(c530Var, 1.0f), tje.n(AppColor$Palette.BgMinor, btsVar), cyk0.c(24.0f)), 8.0f);
            lhl0 a = khl0.a(lr20.f, x4c.D, btsVar, 6);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, k);
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            f530 c = ljs0.c(c530Var, 1.0f);
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            f530 k2 = c.k(new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            ButtonStyle buttonStyle = !ei40Var.a ? ButtonStyle.Floating : ButtonStyle.Ghost;
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new s140(15, tlsVar);
                btsVar.o0(Q);
            }
            d17.c(k2, false, null, buttonStyle, null, (sls) Q, wwg.S(-978823178, true, new zls() { // from class: cd40
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i3;
                    zy11 zy11Var = zy11.a;
                    ei40 ei40Var2 = ei40Var;
                    switch (i5) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                btsVar2.Y();
                                break;
                            } else {
                                ed40.h(ei40Var2.b, null, xya1.e(btsVar2).g.b, !ei40Var2.a ? AppColor$Palette.Text : AppColor$Palette.TextMinor, null, 0, 0, null, btsVar2, 0, 242);
                                break;
                            }
                        default:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                btsVar3.Y();
                                break;
                            } else {
                                ed40.h(ei40Var2.d, null, xya1.e(btsVar3).g.b, ei40Var2.a ? AppColor$Palette.Text : AppColor$Palette.TextMinor, null, 0, 0, null, btsVar3, 0, 242);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), btsVar, 1572864, 22);
            f530 c2 = ljs0.c(c530Var, 1.0f);
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            f530 k3 = c2.k(new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            ButtonStyle buttonStyle2 = ei40Var.a ? ButtonStyle.Floating : ButtonStyle.Ghost;
            boolean z2 = i4 == 32;
            Object Q2 = btsVar.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new s140(16, tlsVar);
                btsVar.o0(Q2);
            }
            final int i5 = 1;
            d17.c(k3, false, null, buttonStyle2, null, (sls) Q2, wwg.S(-2129540115, true, new zls() { // from class: cd40
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i52 = i5;
                    zy11 zy11Var = zy11.a;
                    ei40 ei40Var2 = ei40Var;
                    switch (i52) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                btsVar2.Y();
                                break;
                            } else {
                                ed40.h(ei40Var2.b, null, xya1.e(btsVar2).g.b, !ei40Var2.a ? AppColor$Palette.Text : AppColor$Palette.TextMinor, null, 0, 0, null, btsVar2, 0, 242);
                                break;
                            }
                        default:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                btsVar3.Y();
                                break;
                            } else {
                                ed40.h(ei40Var2.d, null, xya1.e(btsVar3).g.b, ei40Var2.a ? AppColor$Palette.Text : AppColor$Palette.TextMinor, null, 0, 0, null, btsVar3, 0, 242);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), btsVar, 1572864, 22);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new dd40(ei40Var, tlsVar, i, 0);
        }
    }

    public static final void F(Integer num, Integer num2, Integer num3, String str, String str2, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1558471266);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(num) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(num2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(num3) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(str) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.k(str2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.e(tlsVar) ? 131072 : 65536;
        }
        if (!btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            btsVar.Y();
        } else if (num == null) {
            btsVar.e0(-178692922);
            btsVar.t(false);
        } else {
            btsVar.e0(-178692921);
            int i3 = (458752 & i2) | 100663296;
            int i4 = i2 << 9;
            ncb1.a(num.intValue(), null, false, num2 != null ? num2.intValue() : 0, num3 != null ? num3.intValue() : 0, tlsVar, str, str2, ButtonSize.M, btsVar, i3 | (3670016 & i4) | (i4 & 29360128), 6);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ew0((Object) num, (Object) num2, (Object) num3, (Object) str, (Object) str2, tlsVar, i, 6);
        }
    }

    public static final void G(CharSequence charSequence, CharSequence charSequence2, fid fidVar, int i) {
        CharSequence charSequence3;
        CharSequence charSequence4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-641176168);
        int i2 = (btsVar.k(charSequence) ? 4 : 2) | i | (btsVar.k(charSequence2) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 & 14;
            boolean z = (i3 == 4) | ((i2 & 112) == 32);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new vwb(charSequence, charSequence2, 2);
                btsVar.o0(Q);
            }
            f530 a = fnq0.a(c530.a, (tls) Q);
            sic a2 = qic.a(lr20.c, x4c.H, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, a);
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
            qje.W(btsVar, d.d, d);
            h(charSequence, null, xya1.e(btsVar).g.b, null, new sjy0(3), 2, 0, null, btsVar, i3 | ImageMetadata.EDGE_MODE, 202);
            charSequence4 = charSequence2;
            charSequence3 = charSequence;
            h(charSequence4, null, xya1.e(btsVar).h.a, AppColor$Palette.TextMinor, new sjy0(3), 2, 0, null, btsVar, ((i2 >> 3) & 14) | 199680, 194);
            btsVar.t(true);
        } else {
            charSequence3 = charSequence;
            charSequence4 = charSequence2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zga(i, 7, charSequence3, charSequence4);
        }
    }

    public static final void H(CharSequence charSequence, CharSequence charSequence2, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-989266045);
        int i2 = (btsVar.k(charSequence) ? 4 : 2) | i | (btsVar.k(charSequence2) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            crb1.b(null, wwg.S(-445263785, true, new sg0(25, tlsVar), btsVar), null, wwg.S(-1056532843, true, new zga(charSequence, charSequence2, 5), btsVar), null, null, null, btsVar, 3120, HProv.PP_NK_SYNC);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t240((Object) charSequence, (Object) charSequence2, tlsVar, i, 5);
        }
    }

    public static final void I(ovi0 ovi0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(2051399250);
        int i2 = (btsVar.k(ovi0Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            v0b1.a(ovi0Var, ljs0.m(c530.a, 40.0f), null, null, null, null, null, null, 0.0f, 0, btsVar, (i2 & 14) | 48, 1020);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gp30(ovi0Var, i, 1);
        }
    }

    public static final void J(gi40 gi40Var, fi40 fi40Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(698806865);
        int i2 = (btsVar.k(gi40Var) ? 4 : 2) | i | (btsVar.k(fi40Var) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            c530 c530Var = c530.a;
            f530 k = an91.k(m4m0.b(ljs0.c(c530Var, 1.0f), tje.n(AppColor$Palette.BgMinor, btsVar), cyk0.c(24.0f)), 4.0f);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, k);
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            int i3 = i2 & 14;
            int i4 = i2 >> 3;
            K(gi40Var, tlsVar, btsVar, i3 | (i4 & 112));
            oeb1.c(btsVar, ljs0.e(c530Var, 4.0f));
            A(fi40Var, tlsVar, btsVar, i4 & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t240((Object) gi40Var, (Object) fi40Var, tlsVar, i, 6);
        }
    }

    public static final void K(gi40 gi40Var, tls tlsVar, fid fidVar, int i) {
        tls tlsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-118692284);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(gi40Var) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 k = an91.k(ljs0.c(c530Var, 1.0f), 8.0f);
            to5 to5Var = x4c.E;
            lhl0 a = khl0.a(lr20.f, to5Var, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, k);
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
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar3 = d.h;
            qje.M(btsVar, tlsVar3);
            wls wlsVar4 = d.d;
            x2y d2 = n.d(btsVar, d, wlsVar4, 1.0f, true);
            lhl0 a2 = khl0.a(lr20.a, to5Var, btsVar, 48);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = b.d(btsVar, d2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar3);
            qje.W(btsVar, wlsVar4, d3);
            if (gi40Var.a != null) {
                btsVar.e0(1031311993);
                I(gi40Var.a, btsVar, 0);
                nnm.s(c530Var, 8.0f, btsVar, false);
            } else {
                btsVar.e0(1031447494);
                btsVar.t(false);
            }
            sic a3 = qic.a(lr20.e, x4c.G, btsVar, 6);
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d4 = b.d(btsVar, c530Var);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a3);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode3, btsVar, wlsVar3, btsVar, tlsVar3);
            qje.W(btsVar, wlsVar4, d4);
            M(gi40Var.b, btsVar, 0);
            L(gi40Var.c, btsVar, 0);
            btsVar.t(true);
            btsVar.t(true);
            if (jl40.l(gi40Var.d, Boolean.TRUE)) {
                btsVar.e0(2050349256);
                int i3 = (i2 << 3) & 896;
                tlsVar2 = tlsVar;
                g(gi40Var.e, gi40Var.f, tlsVar2, btsVar, i3);
                btsVar.t(false);
            } else {
                tlsVar2 = tlsVar;
                btsVar.e0(2050558754);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            tlsVar2 = tlsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nxu(gi40Var, tlsVar2, i, 21);
        }
    }

    public static final void L(CharSequence charSequence, fid fidVar, int i) {
        CharSequence charSequence2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1520243470);
        int i2 = (btsVar.k(charSequence) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            charSequence2 = charSequence;
            h(charSequence2, null, xya1.e(btsVar).h.a, AppColor$Palette.Text, new sjy0(5), 2, 0, null, btsVar, (i2 & 14) | 199680, 194);
        } else {
            charSequence2 = charSequence;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new un1(i, 15, charSequence2);
        }
    }

    public static final void M(CharSequence charSequence, fid fidVar, int i) {
        CharSequence charSequence2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(340377031);
        int i2 = (btsVar.k(charSequence) ? 4 : 2) | i;
        int i3 = 14;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            charSequence2 = charSequence;
            h(charSequence2, null, xya1.e(btsVar).g.b, AppColor$Palette.Text, new sjy0(3), 2, 0, null, btsVar, (i2 & 14) | 199680, 194);
        } else {
            charSequence2 = charSequence;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new un1(i, i3, charSequence2);
        }
    }

    public static final void a(CharSequence charSequence, CharSequence charSequence2, Integer num, Integer num2, Integer num3, String str, String str2, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(669702807);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar2.k(charSequence) : btsVar2.e(charSequence) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar2.k(charSequence2) : btsVar2.e(charSequence2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.k(num) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar2.k(num2) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar2.k(num3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar2.k(str) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= btsVar2.k(str2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= btsVar2.e(tlsVar) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if (btsVar2.V(i2 & 1, (4793491 & i2) != 4793490)) {
            f530 c = ljs0.c(c530.a, 1.0f);
            lhl0 a = khl0.a(lr20.g, x4c.E, btsVar2, 54);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = b.d(btsVar2, c);
            ohd.G1.getClass();
            sls slsVar = d.b;
            int i3 = i2;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, d.f, a);
            qje.W(btsVar2, d.e, o);
            qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, d.h);
            qje.W(btsVar2, d.d, d);
            o(charSequence, charSequence2, btsVar2, i3 & HProv.PP_DELETE_SAVED_PASSWD);
            boolean z = (i3 & 29360128) == 8388608;
            Object Q = btsVar2.Q();
            if (z || Q == did.a) {
                Q = new adp(22, tlsVar);
                btsVar2.o0(Q);
            }
            F(num, num2, num3, str, str2, (tls) Q, btsVar2, (i3 >> 6) & 65534);
            btsVar = btsVar2;
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zc40(charSequence, charSequence2, num, num2, num3, str, str2, tlsVar, i, 0);
        }
    }

    public static final void b(y940 y940Var, aj31 aj31Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        wi70 wi70Var;
        tls tlsVar2 = tlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1600818986);
        int i3 = i & 6;
        cj6 cj6Var = cj6.a;
        if (i3 == 0) {
            i2 = (btsVar.k(cj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(y940Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? btsVar.k(aj31Var) : btsVar.e(aj31Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 2048 : 1024;
        }
        int i4 = i2;
        if (btsVar.V(i4 & 1, (i4 & 1171) != 1170)) {
            uo5 uo5Var = x4c.B;
            c530 c530Var = c530.a;
            f530 c = hbb1.c(ljs0.c(cj6Var.a(c530Var, uo5Var), 1.0f), dbb1.c(btsVar), false, 0.0f, null, 14);
            AppColor$Palette appColor$Palette = AppColor$Palette.BgFloating;
            qwd qwdVar = uy2.c;
            f530 k = an91.k(i9a1.d(ymb1.l(bzk0.c(c, appColor$Palette, ((nx2) btsVar.m(qwdVar)).a), ((nx2) btsVar.m(qwdVar)).a)), 8.0f);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, k);
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            hb40 hb40Var = y940Var.a;
            c((hb40Var == null || (wi70Var = hb40Var.c) == null) ? null : wi70Var.a, hb40Var, tlsVar, aj31Var, btsVar, ((i4 << 3) & 7168) | ((i4 >> 3) & 896) | 64);
            tlsVar2 = tlsVar;
            oeb1.c(btsVar, ljs0.e(c530Var, 8.0f));
            hb40 hb40Var2 = y940Var.a;
            e(hb40Var2 != null ? hb40Var2.e : null, tlsVar2, btsVar, (i4 >> 6) & 112);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ivy(y940Var, aj31Var, tlsVar2, i, 12);
        }
    }

    public static final void c(CharSequence charSequence, hb40 hb40Var, tls tlsVar, aj31 aj31Var, fid fidVar, int i) {
        int i2;
        ib40 ib40Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-815240848);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(charSequence) : btsVar.e(charSequence) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(hb40Var) : btsVar.e(hb40Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= (i & 4096) == 0 ? btsVar.k(aj31Var) : btsVar.e(aj31Var) ? 2048 : 1024;
        }
        int i3 = i2;
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            boolean l = jl40.l(hb40Var != null ? Boolean.valueOf(hb40Var.f) : null, Boolean.TRUE);
            c530 c530Var = c530.a;
            f530 c = !l ? ljs0.c(c530Var, 1.0f) : tra1.b(ofb1.b(ljs0.c(c530Var, 1.0f), false, null, 15), 0.5f);
            lhl0 a = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c);
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            if (hb40Var == null || (ib40Var = hb40Var.d) == null || !ib40Var.a()) {
                ib40Var = null;
            }
            if (ib40Var == null) {
                btsVar.e0(1813144465);
                btsVar.t(false);
            } else {
                btsVar.e0(1813144466);
                f530 n = ljs0.n(c530Var, 64.0f, 56.0f);
                boolean z = (i3 & 896) == 256;
                Object Q = btsVar.Q();
                if (z || Q == did.a) {
                    Q = new s140(14, tlsVar);
                    btsVar.o0(Q);
                }
                a.a(q791.d(n, false, null, null, (sls) Q, 15), ib40Var.a, true, aj31Var, btsVar, (i3 & 7168) | 384, 0);
                btsVar.t(false);
            }
            d(charSequence, hb40Var, tlsVar, btsVar, (i3 & 14) | 64 | (i3 & 112) | (i3 & 896));
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new squ(charSequence, hb40Var, tlsVar, aj31Var, i, 20);
        }
    }

    public static final void d(CharSequence charSequence, hb40 hb40Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1260384684);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(charSequence) : btsVar.e(charSequence) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(hb40Var) : btsVar.e(hb40Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        boolean z = false;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            f530 c = ljs0.c(c530.a, 1.0f);
            boolean z2 = (i2 & 896) == 256;
            if ((i2 & 112) == 32 || ((i2 & 64) != 0 && btsVar.e(hb40Var))) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object Q = btsVar.Q();
            if (z3 || Q == did.a) {
                Q = new ve30(16, tlsVar, hb40Var);
                btsVar.o0(Q);
            }
            ohb1.b(c, false, null, (sls) Q, wwg.S(-1300080743, true, new or9(8, charSequence), btsVar), btsVar, 24582, 6);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ivy(charSequence, hb40Var, tlsVar, i, 13);
        }
    }

    public static final void e(CharSequence charSequence, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(365212450);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(charSequence) : btsVar.e(charSequence) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 m = an91.m(ljs0.c(c530.a, 1.0f), 32.0f, 0.0f, 2);
            ety0 a = ety0.a(xya1.e(btsVar).h.a, tje.n(AppColor$Palette.TextMinor, btsVar), 0L, null, null, null, 0L, null, null, null, 3, 0L, null, null, 16744446);
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new adp(24, tlsVar);
                btsVar.o0(Q);
            }
            h(charSequence, m, a, null, null, 0, Integer.MAX_VALUE, (tls) Q, btsVar, (i2 & 14) | 1572912, 56);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nxu(charSequence, tlsVar, i, 20);
        }
    }

    public static final void f(CharSequence charSequence, CharSequence charSequence2, Integer num, Integer num2, Integer num3, String str, String str2, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-681321483);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar2.k(charSequence) : btsVar2.e(charSequence) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar2.k(charSequence2) : btsVar2.e(charSequence2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.k(num) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar2.k(num2) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar2.k(num3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar2.k(str) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= btsVar2.k(str2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= btsVar2.e(tlsVar) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if (btsVar2.V(i2 & 1, (4793491 & i2) != 4793490)) {
            f530 c = ljs0.c(c530.a, 1.0f);
            lhl0 a = khl0.a(lr20.g, x4c.E, btsVar2, 54);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = b.d(btsVar2, c);
            ohd.G1.getClass();
            sls slsVar = d.b;
            int i3 = i2;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, d.f, a);
            qje.W(btsVar2, d.e, o);
            qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, d.h);
            qje.W(btsVar2, d.d, d);
            o(charSequence, charSequence2, btsVar2, i3 & HProv.PP_DELETE_SAVED_PASSWD);
            boolean z = (i3 & 29360128) == 8388608;
            Object Q = btsVar2.Q();
            if (z || Q == did.a) {
                Q = new adp(23, tlsVar);
                btsVar2.o0(Q);
            }
            F(num, num2, num3, str, str2, (tls) Q, btsVar2, (i3 >> 6) & 65534);
            btsVar = btsVar2;
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zc40(charSequence, charSequence2, num, num2, num3, str, str2, tlsVar, i, 1);
        }
    }

    public static final void g(CharSequence charSequence, be40 be40Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(406414449);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(charSequence) : btsVar.e(charSequence) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(be40Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (!btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            btsVar.Y();
        } else if (charSequence == null) {
            btsVar.e0(-19737691);
            btsVar.t(false);
        } else {
            btsVar.e0(-19737690);
            f530 l = ymb1.l(c530.a, cyk0.c(100.0f));
            ButtonSize buttonSize = ButtonSize.XS;
            boolean z = ((i2 & 896) == 256) | ((i2 & 14) == 4 || ((i2 & 8) != 0 && btsVar.e(charSequence))) | ((i2 & 112) == 32);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new b700(8, charSequence, be40Var, tlsVar);
                btsVar.o0(Q);
            }
            d17.c(l, false, buttonSize, null, null, (sls) Q, wwg.S(344297765, true, new or9(7, charSequence), btsVar), btsVar, 1573248, 26);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ivy(charSequence, be40Var, tlsVar, i, 9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(CharSequence charSequence, f530 f530Var, ety0 ety0Var, wp2 wp2Var, sjy0 sjy0Var, int i, int i2, tls tlsVar, fid fidVar, int i3, int i4) {
        int i5;
        f530 f530Var2;
        int i6;
        wp2 wp2Var2;
        int i7;
        sjy0 sjy0Var2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        bts btsVar;
        tls tlsVar2;
        f530 f530Var3;
        wp2 wp2Var3;
        sjy0 sjy0Var3;
        int i13;
        int i14;
        aii0 v;
        tls tlsVar3;
        int i15;
        wp2 wp2Var4;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1899798251);
        if ((i3 & 6) == 0) {
            i5 = ((i3 & 8) == 0 ? btsVar2.k(charSequence) : btsVar2.e(charSequence) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i16 = i4 & 2;
        if (i16 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            f530Var2 = f530Var;
            i5 |= btsVar2.k(f530Var2) ? 32 : 16;
            if ((i3 & 384) == 0) {
                i5 |= btsVar2.k(ety0Var) ? 256 : 128;
            }
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i3 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                wp2Var2 = wp2Var;
                i5 |= btsVar2.k(wp2Var2) ? 2048 : 1024;
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                } else if ((i3 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    sjy0Var2 = sjy0Var;
                    i5 |= btsVar2.k(sjy0Var2) ? 16384 : 8192;
                    i8 = i4 & 32;
                    if (i8 == 0) {
                        i5 |= ImageMetadata.EDGE_MODE;
                    } else if ((196608 & i3) == 0) {
                        i9 = i;
                        i5 |= btsVar2.c(i9) ? 131072 : 65536;
                        i10 = i4 & 64;
                        if (i10 != 0) {
                            i5 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i5 |= btsVar2.c(i2) ? 1048576 : 524288;
                        }
                        i11 = i4 & 128;
                        if (i11 != 0) {
                            i5 |= 12582912;
                        } else if ((i3 & 12582912) == 0) {
                            i12 = i11;
                            i5 |= btsVar2.e(tlsVar) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                            if (btsVar2.V(i5 & 1, (i5 & 4793491) == 4793490)) {
                                btsVar = btsVar2;
                                btsVar.Y();
                                tlsVar2 = tlsVar;
                                f530Var3 = f530Var2;
                                wp2Var3 = wp2Var2;
                                sjy0Var3 = sjy0Var2;
                                i13 = i9;
                                i14 = i2;
                            } else {
                                btsVar2.a0();
                                if ((i3 & 1) == 0 || btsVar2.C()) {
                                    if (i16 != 0) {
                                        f530Var2 = c530.a;
                                    }
                                    if (i6 != 0) {
                                        wp2Var2 = tp2.a;
                                    }
                                    if (i7 != 0) {
                                        sjy0Var2 = null;
                                    }
                                    if (i8 != 0) {
                                        i9 = 1;
                                    }
                                    int i17 = i10 != 0 ? 2 : i2;
                                    tlsVar3 = i12 != 0 ? null : tlsVar;
                                    i15 = i17;
                                } else {
                                    btsVar2.Y();
                                    i15 = i2;
                                    tlsVar3 = tlsVar;
                                }
                                sjy0 sjy0Var4 = sjy0Var2;
                                int i18 = i9;
                                btsVar2.u();
                                if (charSequence == null) {
                                    btsVar2.e0(-2105314616);
                                    btsVar2.t(false);
                                    btsVar = btsVar2;
                                    f530Var3 = f530Var2;
                                    wp2Var4 = wp2Var2;
                                } else {
                                    btsVar2.e0(-2105314615);
                                    f530Var3 = f530Var2;
                                    wp2Var4 = wp2Var2;
                                    qgy.b(charSequence, null, f530Var3, wp2Var4, 0L, 0L, sjy0Var4, 0L, i18, i15, 0, ety0Var, tlsVar3, btsVar2, (i5 & 14) | ((i5 << 3) & 896) | (i5 & 7168) | ((i5 << 9) & 29360128) | ((i5 << 12) & 1879048192), ((i5 >> 18) & 14) | (i5 & 896) | ((i5 >> 12) & 7168), 2418);
                                    btsVar = btsVar2;
                                    btsVar.t(false);
                                }
                                wp2Var3 = wp2Var4;
                                sjy0Var3 = sjy0Var4;
                                i13 = i18;
                                i14 = i15;
                                tlsVar2 = tlsVar3;
                            }
                            v = btsVar.v();
                            if (v == null) {
                                v.d = new iiy(charSequence, f530Var3, ety0Var, wp2Var3, sjy0Var3, i13, i14, tlsVar2, i3, i4);
                                return;
                            }
                            return;
                        }
                        i12 = i11;
                        if (btsVar2.V(i5 & 1, (i5 & 4793491) == 4793490)) {
                        }
                        v = btsVar.v();
                        if (v == null) {
                        }
                    }
                    i9 = i;
                    i10 = i4 & 64;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 128;
                    if (i11 != 0) {
                    }
                    i12 = i11;
                    if (btsVar2.V(i5 & 1, (i5 & 4793491) == 4793490)) {
                    }
                    v = btsVar.v();
                    if (v == null) {
                    }
                }
                sjy0Var2 = sjy0Var;
                i8 = i4 & 32;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 64;
                if (i10 != 0) {
                }
                i11 = i4 & 128;
                if (i11 != 0) {
                }
                i12 = i11;
                if (btsVar2.V(i5 & 1, (i5 & 4793491) == 4793490)) {
                }
                v = btsVar.v();
                if (v == null) {
                }
            }
            wp2Var2 = wp2Var;
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            sjy0Var2 = sjy0Var;
            i8 = i4 & 32;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i4 & 64;
            if (i10 != 0) {
            }
            i11 = i4 & 128;
            if (i11 != 0) {
            }
            i12 = i11;
            if (btsVar2.V(i5 & 1, (i5 & 4793491) == 4793490)) {
            }
            v = btsVar.v();
            if (v == null) {
            }
        }
        f530Var2 = f530Var;
        if ((i3 & 384) == 0) {
        }
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        wp2Var2 = wp2Var;
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        sjy0Var2 = sjy0Var;
        i8 = i4 & 32;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i4 & 64;
        if (i10 != 0) {
        }
        i11 = i4 & 128;
        if (i11 != 0) {
        }
        i12 = i11;
        if (btsVar2.V(i5 & 1, (i5 & 4793491) == 4793490)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void i(CharSequence charSequence, CharSequence charSequence2, fid fidVar, int i) {
        CharSequence charSequence3;
        CharSequence charSequence4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1023823192);
        int i2 = (btsVar.k(charSequence) ? 4 : 2) | i | (btsVar.k(charSequence2) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 & 14;
            boolean z = (i3 == 4) | ((i2 & 112) == 32);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new vwb(charSequence, charSequence2, 1);
                btsVar.o0(Q);
            }
            c530 c530Var = c530.a;
            f530 a = fnq0.a(c530Var, (tls) Q);
            sic a2 = qic.a(lr20.c, x4c.H, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, a);
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
            qje.W(btsVar, d.d, d);
            h(charSequence, null, xya1.e(btsVar).g.b, null, new sjy0(3), 2, 0, null, btsVar, i3 | ImageMetadata.EDGE_MODE, 202);
            charSequence3 = charSequence;
            charSequence4 = charSequence2;
            h(charSequence4, ofb1.b(c530Var, false, null, 15), xya1.e(btsVar).h.a, AppColor$Palette.Text, new sjy0(3), 2, 0, null, btsVar, ((i2 >> 3) & 14) | 199728, 192);
            btsVar.t(true);
        } else {
            charSequence3 = charSequence;
            charSequence4 = charSequence2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zga(i, 6, charSequence3, charSequence4);
        }
    }

    public static final void j(CharSequence charSequence, CharSequence charSequence2, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1087377219);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(charSequence) : btsVar.e(charSequence) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(charSequence2) : btsVar.e(charSequence2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            crb1.b(null, wwg.S(164784111, true, new sg0(24, tlsVar), btsVar), null, wwg.S(1568653297, true, new zga(charSequence, charSequence2, i3), btsVar), null, null, null, btsVar, 3120, HProv.PP_NK_SYNC);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ivy(charSequence, charSequence2, tlsVar, i, 11);
        }
    }

    public static final void k(xd40 xd40Var, aj31 aj31Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(915330908);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(xd40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(aj31Var) : btsVar.e(aj31Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            qy20.a(null, null, null, false, wwg.S(-391171846, true, new bz41(i3, tlsVar, xd40Var, aj31Var), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 15);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ivy(xd40Var, aj31Var, tlsVar, i, 10);
        }
    }

    public static final void l(ud40 ud40Var, aj31 aj31Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1575056200);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(ud40Var) ? 4 : 2) | (btsVar.k(aj31Var) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d2 = b.d(btsVar, c530Var);
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
            qje.W(btsVar, wlsVar, d);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar2 = d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d2);
            k3r k3rVar = ljs0.c;
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = b.d(btsVar, k3rVar);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d3);
            int i3 = i2 & 896;
            H(ud40Var.a, ud40Var.b, tlsVar, btsVar, i3);
            f530 o3 = an91.o(an91.m(n.e(c530Var, 8.0f, btsVar, c530Var, 1.0f), 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 124.0f, 7);
            i43 i43Var = new i43(8.0f, true, new quz(11));
            boolean z = ((i2 & 14) == 4) | (i3 == 256);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new t130(17, ud40Var, tlsVar);
                btsVar.o0(Q);
            }
            adb1.a(o3, null, null, i43Var, null, null, false, null, (tls) Q, btsVar, 24582, 494);
            btsVar.t(true);
            int i4 = i2 << 3;
            b(ud40Var.f, aj31Var, tlsVar, btsVar, (i4 & 7168) | (i4 & 896) | 6);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t240((Object) ud40Var, (Object) aj31Var, tlsVar, i, 4);
        }
    }

    public static final void m(wd40 wd40Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(112051549);
        dmw0 dmw0Var = btsVar.a;
        int i2 = (btsVar.k(wd40Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            k3r k3rVar = ljs0.c;
            so5 so5Var = x4c.G;
            g43 g43Var = lr20.c;
            sic a = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, k3rVar);
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
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar2 = d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            j(wd40Var.a, wd40Var.b, tlsVar, btsVar, (i2 << 3) & 896);
            c530 c530Var = c530.a;
            f530 n = an91.n(c530Var, 16.0f, 8.0f, 16.0f, 50.0f);
            sic a2 = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, n);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d2);
            com.yandex.go.design.compose.loading.b.a(ljs0.e(ljs0.c(c530Var, 1.0f), 385.0f), cyk0.c(24.0f), false, null, null, null, false, btsVar, 6, 252);
            oeb1.c(btsVar, ljs0.e(c530Var, 8.0f));
            com.yandex.go.design.compose.loading.b.a(ljs0.e(ljs0.c(c530Var, 1.0f), 64.0f), cyk0.c(24.0f), false, null, null, null, false, btsVar, 6, 252);
            oeb1.c(btsVar, ljs0.e(c530Var, 8.0f));
            com.yandex.go.design.compose.loading.b.a(ljs0.e(ljs0.c(c530Var, 1.0f), 64.0f), cyk0.c(24.0f), false, null, null, null, false, btsVar, 6, 252);
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new iu30(wd40Var, tlsVar, i, 8);
        }
    }

    public static final void n(ei40 ei40Var, tls tlsVar, fid fidVar, int i) {
        Boolean bool;
        int i2;
        int i3;
        Boolean bool2;
        c530 c530Var;
        tls tlsVar2 = tlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(99046685);
        int i4 = (btsVar.k(ei40Var) ? 4 : 2) | i | (btsVar.e(tlsVar2) ? 32 : 16);
        if (btsVar.V(i4 & 1, (i4 & 19) != 18)) {
            Boolean bool3 = ei40Var.e;
            Boolean bool4 = ei40Var.m;
            Boolean bool5 = Boolean.TRUE;
            if (jl40.l(bool3, bool5) || jl40.l(bool4, bool5)) {
                btsVar.e0(57648419);
                c530 c530Var2 = c530.a;
                f530 n = an91.n(m4m0.b(ljs0.c(c530Var2, 1.0f), tje.n(AppColor$Palette.BgMinor, btsVar), cyk0.c(24.0f)), 20.0f, 16.0f, 10.0f, 16.0f);
                sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o = btsVar.o();
                f530 d = b.d(btsVar, n);
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
                qje.W(btsVar, d.f, a);
                qje.W(btsVar, d.e, o);
                qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                qje.M(btsVar, d.h);
                qje.W(btsVar, d.d, d);
                if (jl40.l(ei40Var.e, bool5)) {
                    btsVar.e0(1035735789);
                    int i5 = (i4 << 18) & 29360128;
                    i2 = i4;
                    c530Var = c530Var2;
                    i3 = 29360128;
                    bool = bool5;
                    bool2 = bool4;
                    a(ei40Var.f, ei40Var.g, ei40Var.h, ei40Var.i, ei40Var.j, ei40Var.k, ei40Var.l, tlsVar2, btsVar, i5);
                    btsVar.t(false);
                } else {
                    bool = bool5;
                    i2 = i4;
                    i3 = 29360128;
                    bool2 = bool4;
                    c530Var = c530Var2;
                    btsVar.e0(1036357556);
                    btsVar.t(false);
                }
                if (jl40.l(bool2, bool)) {
                    tse0.s(btsVar, 1036523592, c530Var, 8.0f, btsVar);
                    tlsVar2 = tlsVar;
                    f(ei40Var.n, ei40Var.o, ei40Var.p, ei40Var.q, ei40Var.r, ei40Var.k, ei40Var.l, tlsVar2, btsVar, (i2 << 18) & i3);
                    btsVar.t(false);
                } else {
                    tlsVar2 = tlsVar;
                    btsVar.e0(1037211668);
                    btsVar.t(false);
                }
                btsVar.t(true);
                btsVar.t(false);
            } else {
                btsVar.e0(59556965);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new dd40(ei40Var, tlsVar2, i, 1);
        }
    }

    public static final void o(CharSequence charSequence, CharSequence charSequence2, fid fidVar, int i) {
        int i2;
        CharSequence charSequence3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2042683304);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(charSequence) : btsVar.e(charSequence) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(charSequence2) : btsVar.e(charSequence2) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new teb(20);
                btsVar.o0(Q);
            }
            f530 b = fnq0.b(c530.a, true, (tls) Q);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, b);
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            h(charSequence, null, xya1.e(btsVar).g.b, AppColor$Palette.Text, null, 0, 0, null, btsVar, (i2 & 14) | HProv.ALG_TYPE_SECURECHANNEL, 242);
            charSequence3 = charSequence2;
            h(charSequence3, null, xya1.e(btsVar).h.a, AppColor$Palette.TextMinor, null, 0, 0, null, btsVar, ((i2 >> 3) & 14) | HProv.ALG_TYPE_SECURECHANNEL, 242);
            btsVar.t(true);
        } else {
            charSequence3 = charSequence2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new dia(charSequence, charSequence3, i);
        }
    }

    public static final void p(CharSequence charSequence, fid fidVar, int i) {
        CharSequence charSequence2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1558910033);
        int i2 = (btsVar.k(charSequence) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            charSequence2 = charSequence;
            h(charSequence2, null, xya1.d(btsVar).f.a, AppColor$Palette.Text, new sjy0(5), 0, 0, null, btsVar, (i2 & 14) | HProv.ALG_TYPE_SECURECHANNEL, 226);
        } else {
            charSequence2 = charSequence;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new un1(i, 16, charSequence2);
        }
    }

    public static final void q(CharSequence charSequence, fid fidVar, int i) {
        CharSequence charSequence2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-722583065);
        int i2 = (btsVar.k(charSequence) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            charSequence2 = charSequence;
            h(charSequence2, null, xya1.e(btsVar).h.a, AppColor$Palette.TextMinor, new sjy0(3), 2, 0, null, btsVar, (i2 & 14) | 199680, 194);
        } else {
            charSequence2 = charSequence;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new un1(i, 17, charSequence2);
        }
    }

    public static final void r(CharSequence charSequence, fid fidVar, int i) {
        int i2;
        CharSequence charSequence2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-840196942);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(charSequence) : btsVar.e(charSequence) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            charSequence2 = charSequence;
            h(charSequence2, null, xya1.e(btsVar).f.c, AppColor$Palette.Text, new sjy0(3), 2, 0, null, btsVar, (i2 & 14) | 199680, 194);
        } else {
            charSequence2 = charSequence;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new cn1(charSequence2, i, 8, (byte) 0);
        }
    }

    public static final void s(CharSequence charSequence, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-589372486);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(charSequence) : btsVar.e(charSequence) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            h(charSequence, null, ety0.a(xya1.e(btsVar).h.a, tje.n(AppColor$Palette.TextMinor, btsVar), 0L, null, null, null, 0L, null, null, null, 5, 0L, null, null, 16744446), null, null, 0, Integer.MAX_VALUE, null, btsVar, (i2 & 14) | 1572864, 186);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new cn1(charSequence, i, 7, (byte) 0);
        }
    }

    public static final void t(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, vb40.m mVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(35920802);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(charSequence) : btsVar.e(charSequence) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(charSequence2) : btsVar.e(charSequence2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? btsVar.k(charSequence3) : btsVar.e(charSequence3) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= (i & 4096) == 0 ? btsVar.k(mVar) : btsVar.e(mVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(tlsVar) ? 16384 : 8192;
        }
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z2 = ((i2 & 7168) == 2048 || ((i2 & 4096) != 0 && btsVar.e(mVar))) | ((57344 & i2) == 16384);
            Object Q = btsVar.Q();
            if (z2 || Q == did.a) {
                Q = new ve30(15, mVar, tlsVar);
                btsVar.o0(Q);
            }
            c530 c530Var = c530.a;
            f530 m = an91.m(fj91.c(ljs0.c(q791.d(c530Var, false, null, null, (sls) Q, 15), 1.0f), IntrinsicSize.Min), 0.0f, 6.0f, 1);
            lhl0 a = khl0.a(rh10.e, x4c.D, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, m);
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
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar2 = d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            v(an91.n(ljs0.c(c530Var, 1.0f).k(new x2y(1.0f, true)), 16.0f, 8.0f, 16.0f, 6.0f), charSequence, charSequence2, charSequence3, btsVar, (i2 << 3) & 8176);
            if (mVar != null) {
                btsVar.e0(81168924);
                f530 o2 = an91.o(ljs0.s(c530Var, 32.0f, 0.0f, 2).k(ljs0.b), 0.0f, 0.0f, 8.0f, 0.0f, 11);
                z910 d2 = pi6.d(x4c.b, false);
                int hashCode2 = Long.hashCode(btsVar.T);
                r1b0 o3 = btsVar.o();
                f530 d3 = b.d(btsVar, o2);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar, d2);
                qje.W(btsVar, wlsVar2, o3);
                vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
                qje.W(btsVar, wlsVar4, d3);
                z = true;
                sya1.a(llb1.b(), cj6.a.a(c530Var, x4c.y), null, AppColor$Palette.Text, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 4);
                btsVar.t(true);
                btsVar.t(false);
            } else {
                z = true;
                btsVar.e0(81484132);
                btsVar.t(false);
            }
            btsVar.t(z);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nc0(charSequence, charSequence2, charSequence3, mVar, tlsVar, i);
        }
    }

    public static final void u(CharSequence charSequence, fid fidVar, int i) {
        int i2;
        CharSequence charSequence2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1639975074);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(charSequence) : btsVar.e(charSequence) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            charSequence2 = charSequence;
            h(charSequence2, null, xya1.e(btsVar).h.a, AppColor$Palette.TextMinor, new sjy0(3), 2, 0, null, btsVar, (i2 & 14) | 199680, 194);
        } else {
            charSequence2 = charSequence;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new cn1(charSequence2, i, 4, (byte) 0);
        }
    }

    public static final void v(f530 f530Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1723641132);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(charSequence) : btsVar.e(charSequence) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? btsVar.k(charSequence2) : btsVar.e(charSequence2) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= (i & 4096) == 0 ? btsVar.k(charSequence3) : btsVar.e(charSequence3) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            sic a = qic.a(lr20.c, x4c.G, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var);
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            if (charSequence3 == null || charSequence3.length() == 0) {
                btsVar.e0(580684738);
                u(charSequence, btsVar, (i2 >> 3) & 14);
                btsVar.t(false);
            } else {
                btsVar.e0(580736632);
                btsVar.t(false);
            }
            r(charSequence2, btsVar, (i2 >> 6) & 14);
            if (charSequence3 == null || charSequence3.length() == 0) {
                btsVar.e0(581017368);
                btsVar.t(false);
            } else {
                btsVar.e0(580871296);
                oeb1.c(btsVar, ljs0.e(c530.a, 13.5f));
                s(charSequence3, btsVar, (i2 >> 9) & 14);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new squ(f530Var, charSequence, charSequence2, charSequence3, i, 19);
        }
    }

    public static final void w(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(777818722);
        int i2 = i | (btsVar.k(charSequence) ? 4 : 2) | (btsVar.k(charSequence2) ? 32 : 16) | (btsVar.k(charSequence3) ? 256 : 128) | (btsVar.k(charSequence4) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            vqr.a(an91.l(ljs0.c(c530.a, 1.0f), 16.0f, 6.0f), null, null, null, 0, 0, wwg.S(-1276983397, true, new r5y(charSequence, charSequence2, charSequence3, charSequence4, 8), btsVar), btsVar, 1572870);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wzr(charSequence, charSequence2, charSequence3, charSequence4, i, 22);
        }
    }

    public static final void x(CharSequence charSequence, fid fidVar, int i) {
        int i2;
        CharSequence charSequence2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1686540331);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(charSequence) : btsVar.e(charSequence) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            charSequence2 = charSequence;
            h(charSequence2, null, xya1.e(btsVar).f.c, AppColor$Palette.Text, new sjy0(3), 2, 0, null, btsVar, (i2 & 14) | 199680, 194);
        } else {
            charSequence2 = charSequence;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new cn1(charSequence2, i, 5, (byte) 0);
        }
    }

    public static final void y(f530 f530Var, CharSequence charSequence, CharSequence charSequence2, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1540940705);
        int i2 = (btsVar.k(f530Var) ? 4 : 2) | i | (btsVar.k(charSequence) ? 32 : 16) | (btsVar.k(charSequence2) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            f530 m = an91.m(f530Var, 0.0f, 8.0f, 1);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 48);
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            z(charSequence, btsVar, (i2 >> 3) & 14);
            oeb1.c(btsVar, ljs0.e(c530.a, 4.0f));
            x(charSequence2, btsVar, (i2 >> 6) & 14);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ad40(f530Var, charSequence, charSequence2, i, 0);
        }
    }

    public static final void z(CharSequence charSequence, fid fidVar, int i) {
        int i2;
        CharSequence charSequence2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1961385445);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(charSequence) : btsVar.e(charSequence) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            charSequence2 = charSequence;
            h(charSequence2, null, xya1.e(btsVar).h.a, AppColor$Palette.TextMinor, new sjy0(3), 2, 0, null, btsVar, (i2 & 14) | 199680, 194);
        } else {
            charSequence2 = charSequence;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new cn1(charSequence2, i, 3, (byte) 0);
        }
    }
}
