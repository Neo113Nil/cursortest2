package defpackage;

import android.graphics.drawable.PictureDrawable;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.caverock.androidsvg.l;
import com.caverock.androidsvg.q;
import com.yandex.go.design.compose.button.ButtonForm;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.modal.bottomsheet.c;
import defpackage.an91;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.did;
import defpackage.djb1;
import defpackage.f530;
import defpackage.fid;
import defpackage.j690;
import defpackage.jl40;
import defpackage.jla;
import defpackage.kla;
import defpackage.ohd;
import defpackage.ola;
import defpackage.ooc;
import defpackage.pi6;
import defpackage.pla;
import defpackage.qje;
import defpackage.qla;
import defpackage.r1b0;
import defpackage.sib1;
import defpackage.sls;
import defpackage.tls;
import defpackage.unr0;
import defpackage.wls;
import defpackage.x4c;
import defpackage.z910;
import defpackage.zpn;
import defpackage.zy11;
import java.io.ByteArrayInputStream;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class djb1 {
    public static final void a(qla qlaVar, oip0 oip0Var, z0a0 z0a0Var, String str, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-893332124);
        int i2 = 16;
        int i3 = i | (btsVar.k(qlaVar) ? 4 : 2) | (btsVar.k(oip0Var) ? 32 : 16) | (btsVar.k(z0a0Var) ? 256 : 128) | (btsVar.k(str) ? 2048 : 1024) | (btsVar.e(tlsVar) ? 16384 : 8192);
        if (!btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
            btsVar.Y();
        } else if (qlaVar instanceof pla) {
            btsVar.e0(501297112);
            b(((i3 >> 6) & 896) | (i3 & HProv.PP_DELETE_SAVED_PASSWD), (pla) qlaVar, btsVar, tlsVar, oip0Var);
            btsVar.t(false);
        } else if (qlaVar instanceof kla) {
            btsVar.e0(501300108);
            c(oip0Var, btsVar, (i3 >> 3) & 14);
            btsVar.t(false);
        } else if (qlaVar instanceof ola) {
            btsVar.e0(-1639473826);
            ola olaVar = (ola) qlaVar;
            hfa0 hfa0Var = olaVar.j;
            int i4 = 57344 & i3;
            boolean z = i4 == 16384;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new dv9(i2, tlsVar);
                btsVar.o0(Q);
            }
            tls tlsVar2 = (tls) Q;
            boolean z2 = i4 == 16384;
            Object Q2 = btsVar.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new fv9(11, tlsVar);
                btsVar.o0(Q2);
            }
            sls slsVar = (sls) Q2;
            boolean z3 = i4 == 16384;
            Object Q3 = btsVar.Q();
            if (z3 || Q3 == o430Var) {
                Q3 = new dv9(17, tlsVar);
                btsVar.o0(Q3);
            }
            iub1.b(olaVar, hfa0Var, z0a0Var, str, tlsVar2, slsVar, (tls) Q3, btsVar, i3 & 8078);
            btsVar.t(false);
        } else {
            if (!(qlaVar instanceof jla)) {
                throw unr0.y(501295777, btsVar, false);
            }
            btsVar.e0(501318248);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b0(qlaVar, oip0Var, z0a0Var, str, tlsVar, i, 6);
        }
    }

    public static final void b(int i, pla plaVar, fid fidVar, tls tlsVar, oip0 oip0Var) {
        boolean z;
        f530 f530Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1521919784);
        dmw0 dmw0Var = btsVar.a;
        int i2 = (btsVar.k(plaVar) ? 4 : 2) | i | (btsVar.k(oip0Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            igr0 c = dbb1.c(btsVar);
            m3u0 c2 = hhb1.c(oip0Var, btsVar);
            c530 c530Var = c530.a;
            c530 c530Var2 = c530Var;
            f530 o = an91.o(ljs0.c(hbb1.c(c530Var, c, false, 0.0f, c2, 6), 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13);
            AppColor$Palette appColor$Palette = AppColor$Palette.Background;
            gji0 gji0Var = qke.q;
            f530 c3 = bzk0.c(o, appColor$Palette, gji0Var);
            z910 d = pi6.d(x4c.b, false);
            boolean z2 = true;
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, c3);
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
            qje.W(btsVar, wlsVar2, o2);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar2 = d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d2);
            List list = plaVar.c;
            boolean z3 = plaVar.d;
            if (list.isEmpty()) {
                z = true;
                btsVar.e0(98617732);
                btsVar.t(false);
            } else {
                btsVar.e0(97584657);
                f530 k = an91.k(i9a1.d(bzk0.c(ymb1.l(ljs0.c(c530Var2, 1.0f), cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12)), AppColor$Palette.BgFloating, gji0Var)), 8.0f);
                boolean b = btsVar.b(4.0f) | btsVar.c(2) | btsVar.a(false);
                Object Q = btsVar.Q();
                o430 o430Var = did.a;
                if (b || Q == o430Var) {
                    Q = new jg0(10);
                    btsVar.o0(Q);
                }
                z910 z910Var = (z910) Q;
                int hashCode2 = Long.hashCode(btsVar.T);
                r1b0 o3 = btsVar.o();
                f530 d3 = b.d(btsVar, k);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar, z910Var);
                qje.W(btsVar, wlsVar2, o3);
                vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
                qje.W(btsVar, wlsVar4, d3);
                f530 b2 = z3 ? ofb1.b(c530Var2, false, null, 15) : c530Var2;
                btsVar.e0(-1256679275);
                for (wj90 wj90Var : plaVar.c) {
                    gz6 gz6Var = new gz6(wj90Var.b, AppColor$Palette.TextOnControl);
                    ButtonForm buttonForm = ButtonForm.Squircle;
                    ButtonSize buttonSize = ButtonSize.L;
                    boolean z4 = !z3;
                    f530 k2 = ljs0.c(c530Var2, 1.0f).k(b2);
                    boolean e = btsVar.e(wj90Var) | ((i2 & 896) == 256 ? z2 : false);
                    Object Q2 = btsVar.Q();
                    if (e || Q2 == o430Var) {
                        f530Var = k2;
                        Q2 = new ifa(wj90Var, tlsVar, 2);
                        btsVar.o0(Q2);
                    } else {
                        f530Var = k2;
                    }
                    d17.d(f530Var, z4, buttonSize, gz6Var, buttonForm, (sls) Q2, wwg.S(814753237, z2, new jka(wj90Var, 0), btsVar), btsVar, 1597824, 0);
                    i2 = i2;
                    o430Var = o430Var;
                    c530Var2 = c530Var2;
                    z2 = z2;
                    b2 = b2;
                }
                z = z2;
                tse0.t(btsVar, false, z, false);
            }
            btsVar.t(z);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s09((Object) plaVar, (Object) oip0Var, tlsVar, i, 10);
        }
    }

    public static final void c(oip0 oip0Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1853919295);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(oip0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            igr0 c = dbb1.c(btsVar);
            m3u0 c2 = hhb1.c(oip0Var, btsVar);
            c530 c530Var = c530.a;
            f530 o = an91.o(ljs0.c(hbb1.c(c530Var, c, false, 0.0f, c2, 6), 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13);
            AppColor$Palette appColor$Palette = AppColor$Palette.Background;
            gji0 gji0Var = qke.q;
            f530 c3 = bzk0.c(o, appColor$Palette, gji0Var);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, c3);
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
            qje.W(btsVar, wlsVar2, o2);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d2);
            f530 k = an91.k(i9a1.d(an91.o(bzk0.c(ymb1.l(ljs0.c(c530Var, 1.0f), cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12)), AppColor$Palette.BgFloating, gji0Var), 0.0f, 0.0f, 0.0f, 29.0f, 7)), 8.0f);
            boolean c4 = btsVar.c(2) | btsVar.b(4.0f) | btsVar.a(false);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (c4 || Q == o430Var) {
                Q = new jg0(11);
                btsVar.o0(Q);
            }
            z910 z910Var = (z910) Q;
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d3 = b.d(btsVar, k);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, z910Var);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d3);
            ButtonStyle buttonStyle = ButtonStyle.Minor;
            f530 c5 = ljs0.c(c530Var, 1.0f);
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new bgc(12);
                btsVar.o0(Q2);
            }
            h5d.a.getClass();
            d17.c(c5, false, null, buttonStyle, null, (sls) Q2, h5d.b, btsVar, 1772598, 20);
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z4(oip0Var, i, 7);
        }
    }

    public static final void d(final qla qlaVar, z0a0 z0a0Var, String str, final tls tlsVar, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(91212093);
        int i2 = i | (btsVar2.k(qlaVar) ? 4 : 2) | (btsVar2.k(z0a0Var) ? 32 : 16) | (btsVar2.k(str) ? 256 : 128) | (btsVar2.e(tlsVar) ? 2048 : 1024);
        if (btsVar2.V(i2 & 1, (i2 & 1171) != 1170)) {
            final oip0 o = pw91.o(btsVar2);
            c.a(null, com.yandex.go.design.compose.modal.bottomsheet.b.a(false, 0.0f, null, false, null, null, null, null, btsVar2, 48, 0, 8189), null, false, false, null, null, wwg.S(-2123326965, true, new wg0(12, tlsVar), btsVar2), null, null, wwg.S(-212495031, true, new vg0((Object) qlaVar, (Object) o, (Object) z0a0Var, (Object) str, tlsVar, 4), btsVar2), wwg.S(-1283968867, true, new bms() { // from class: com.yandex.go.chargers.passes.ui.a
                @Override // defpackage.bms
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    j690 j690Var = (j690) obj2;
                    fid fidVar2 = (fid) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 48) == 0) {
                        intValue |= ((bts) fidVar2).k(j690Var) ? 32 : 16;
                    }
                    bts btsVar3 = (bts) fidVar2;
                    if (btsVar3.V(intValue & 1, (intValue & 145) != 144)) {
                        f530 j = an91.j(ooc.d(c530.a, null, 3), j690Var);
                        z910 d = pi6.d(x4c.b, false);
                        int hashCode = Long.hashCode(btsVar3.T);
                        r1b0 o2 = btsVar3.o();
                        f530 d2 = androidx.compose.ui.b.d(btsVar3, j);
                        ohd.G1.getClass();
                        sls slsVar = androidx.compose.ui.node.d.b;
                        if (btsVar3.a == null) {
                            cma1.b0();
                            throw null;
                        }
                        btsVar3.i0();
                        if (btsVar3.S) {
                            btsVar3.n(slsVar);
                        } else {
                            btsVar3.r0();
                        }
                        qje.W(btsVar3, androidx.compose.ui.node.d.f, d);
                        qje.W(btsVar3, androidx.compose.ui.node.d.e, o2);
                        qje.W(btsVar3, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
                        qje.M(btsVar3, androidx.compose.ui.node.d.h);
                        qje.W(btsVar3, androidx.compose.ui.node.d.d, d2);
                        kla klaVar = kla.a;
                        qla qlaVar2 = qla.this;
                        if (jl40.l(qlaVar2, klaVar)) {
                            btsVar3.e0(-2071992472);
                            djb1.e(btsVar3, 0);
                            btsVar3.t(false);
                        } else {
                            boolean z = qlaVar2 instanceof pla;
                            tls tlsVar2 = tlsVar;
                            if (z) {
                                btsVar3.e0(-2071878888);
                                djb1.f(0, (pla) qlaVar2, btsVar3, tlsVar2, o);
                                btsVar3.t(false);
                            } else if (qlaVar2 instanceof ola) {
                                btsVar3.e0(-2071668708);
                                sib1.a((ola) qlaVar2, tlsVar2, null, btsVar3, 0);
                                btsVar3.t(false);
                            } else {
                                if (!(qlaVar2 instanceof jla)) {
                                    throw unr0.y(902991601, btsVar3, false);
                                }
                                btsVar3.e0(-2071492628);
                                boolean k = btsVar3.k(tlsVar2) | btsVar3.e(qlaVar2);
                                Object Q = btsVar3.Q();
                                if (k || Q == did.a) {
                                    Q = new ChargersPassesScreenKt$ChargersPassesScreen$3$1$1$1(tlsVar2, qlaVar2, null);
                                    btsVar3.o0(Q);
                                }
                                zpn.e(btsVar3, (wls) Q, qlaVar2);
                                btsVar3.t(false);
                            }
                        }
                        btsVar3.t(true);
                    } else {
                        btsVar3.Y();
                    }
                    return zy11.a;
                }
            }, btsVar2), btsVar2, 12582912, 54, 893);
            btsVar = btsVar2;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new rb0((Object) qlaVar, (Object) z0a0Var, (Object) str, tlsVar, i, 17);
        }
    }

    public static final void e(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1769843736);
        int i2 = 1;
        if (btsVar.V(i & 1, i != 0)) {
            byk0 c = cyk0.c(24.0f);
            c530 c530Var = c530.a;
            f530 c2 = ljs0.c(c530Var, 1.0f);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c2);
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
            com.yandex.go.design.compose.loading.b.a(ljs0.c(ljs0.e(an91.o(c530Var, 16.0f, 40.0f, 16.0f, 0.0f, 8), 16.0f), 1.0f), cyk0.c(100.0f), false, null, null, null, false, btsVar, 0, 252);
            com.yandex.go.design.compose.loading.b.a(ljs0.c(ljs0.e(an91.o(c530Var, 16.0f, 24.0f, 16.0f, 0.0f, 8), 107.0f), 1.0f), c, false, null, null, null, false, btsVar, 0, 252);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qha(i, i2);
        }
    }

    public static final void f(int i, pla plaVar, fid fidVar, tls tlsVar, oip0 oip0Var) {
        tls tlsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-893598700);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(oip0Var) ? 4 : 2) | (btsVar.k(plaVar) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            boolean z = plaVar.d;
            c530 c530Var = c530.a;
            f530 k = tra1.b(bzk0.c(pw91.u(ljs0.c(c530Var, 1.0f), oip0Var, 14), AppColor$Palette.Background, qke.q), z ? 0.3f : 1.0f).k(z ? ofb1.b(c530Var, false, null, 15) : c530Var);
            so5 so5Var = x4c.G;
            sic a = qic.a(lr20.c, so5Var, btsVar, 0);
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
            qje.W(btsVar, wlsVar4, d);
            int i3 = i2;
            qgy.b(plaVar.a, null, an91.o(ljs0.c(c530Var, 1.0f), 16.0f, 20.0f, 16.0f, 0.0f, 8), null, uh6.E(24), 0L, null, 0L, 2, 2, 0, xya1.b(btsVar).e, null, btsVar, 805331328, 6, 10730);
            btsVar = btsVar;
            oeb1.c(btsVar, ljs0.e(c530Var, 16.0f));
            sic a2 = qic.a(new i43(8.0f, true, new quz(11)), so5Var, btsVar, 6);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, c530Var);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar3);
            qje.W(btsVar, wlsVar4, d2);
            btsVar.e0(-1617349438);
            for (hfa hfaVar : plaVar.b) {
                boolean z2 = !z;
                f530 m = an91.m(c530Var, 12.0f, 0.0f, 2);
                int i4 = i3;
                boolean z3 = (i4 & 896) == 256;
                Object Q = btsVar.Q();
                if (z3 || Q == did.a) {
                    tlsVar2 = tlsVar;
                    Q = new fv9(12, tlsVar2);
                    btsVar.o0(Q);
                } else {
                    tlsVar2 = tlsVar;
                }
                u691.b(hfaVar, z2, m, tlsVar2, tlsVar, (sls) Q, btsVar, ((i4 << 6) & HProv.ALG_CLASS_ALL) | ((i4 << 3) & 7168) | 384);
                i3 = i4;
            }
            tse0.t(btsVar, false, true, true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new j9a(oip0Var, plaVar, tlsVar, i, 5);
        }
    }

    public static void g(long j, String str) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + Extension.O_BRAKE_SPACE + j + ") must be >= 0");
    }

    public static PictureDrawable h(ByteArrayInputStream byteArrayInputStream) {
        l f = new q().f(byteArrayInputStream);
        if (f.c() != null) {
            return new PictureDrawable(f.g(null));
        }
        float d = f.d();
        float b = f.b();
        if (d > 0.0f && b > 0.0f) {
            f.i(d, b);
        }
        return new PictureDrawable(f.g(null));
    }
}
