package defpackage;

import android.content.Context;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseExitCardAnalytics$OpenReasonV2;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseExitCardAnalytics$TransportTypeV2;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseStationCardAnalytics$OpenReasonV2;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseStationCardAnalytics$TransportTypeV2;

/* loaded from: classes5.dex */
public abstract class khb1 {
    public static final void a(tu9 tu9Var, ir9 ir9Var, boolean z, tls tlsVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(352419047);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(tu9Var) : btsVar.e(tu9Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(ir9Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.k(f530Var) ? 16384 : 8192;
        }
        if (!btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            btsVar.Y();
        } else if (tu9Var instanceof nu9) {
            btsVar.e0(2016032849);
            int i3 = 8 | (i2 & 14);
            int i4 = i2 >> 6;
            b((nu9) tu9Var, tlsVar, f530Var, btsVar, (i4 & 896) | i3 | (i4 & 112));
            btsVar.t(false);
        } else if (tu9Var instanceof ru9) {
            btsVar.e0(2016156756);
            d((ru9) tu9Var, z, ir9Var, tlsVar, f530Var, btsVar, 8 | (i2 & 14) | ((i2 >> 3) & 112) | ((i2 << 3) & 896) | (i2 & 7168) | (i2 & HProv.ALG_CLASS_ALL));
            btsVar.t(false);
        } else if (tu9Var instanceof pu9) {
            btsVar.e0(-627694332);
            int i5 = 8 | (i2 & 14);
            int i6 = i2 >> 6;
            c((pu9) tu9Var, tlsVar, f530Var, btsVar, (i6 & 896) | i5 | (i6 & 112));
            btsVar.t(false);
        } else {
            if (!(tu9Var instanceof su9)) {
                throw unr0.y(-627704921, btsVar, false);
            }
            btsVar.e0(-627690789);
            int i7 = 8 | (i2 & 14);
            int i8 = i2 >> 6;
            lhb1.a((su9) tu9Var, tlsVar, f530Var, btsVar, (i8 & 896) | i7 | (i8 & 112));
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ym1(tu9Var, ir9Var, z, tlsVar, f530Var, i, 3);
        }
    }

    public static final void b(final nu9 nu9Var, tls tlsVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-878551358);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(nu9Var) : btsVar.e(nu9Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(f530Var) ? 256 : 128;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            uo5 uo5Var = x4c.y;
            f530 g = ljs0.g(bzk0.c(f530Var, AppColor$Palette.BgMinor, cyk0.c(20.0f)), 64.0f, 0.0f, 2);
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4 || ((i2 & 8) != 0 && btsVar.e(nu9Var)));
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new u08(19, nu9Var, tlsVar);
                btsVar.o0(Q);
            }
            f530 d = q791.d(g, false, null, null, (sls) Q, 15);
            z910 d2 = pi6.d(uo5Var, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d3 = b.d(btsVar, d);
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
            qje.W(btsVar, d.f, d2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d3);
            ydb1.a(ljs0.c(c530.a, 1.0f), wwg.S(947092390, true, new zls() { // from class: hs9
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i3;
                    zy11 zy11Var = zy11.a;
                    c530 c530Var = c530.a;
                    nu9 nu9Var2 = nu9Var;
                    switch (i5) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                f530 b = ljs0.b(c530Var, 16.0f, 0.0f, 2);
                                z910 d4 = pi6.d(x4c.b, false);
                                int hashCode2 = Long.hashCode(btsVar2.T);
                                r1b0 o2 = btsVar2.o();
                                f530 d5 = b.d(btsVar2, b);
                                ohd.G1.getClass();
                                sls slsVar2 = d.b;
                                if (btsVar2.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar2.i0();
                                if (btsVar2.S) {
                                    btsVar2.n(slsVar2);
                                } else {
                                    btsVar2.r0();
                                }
                                qje.W(btsVar2, d.f, d4);
                                qje.W(btsVar2, d.e, o2);
                                qje.W(btsVar2, d.g, Integer.valueOf(hashCode2));
                                qje.M(btsVar2, d.h);
                                qje.W(btsVar2, d.d, d5);
                                v0b1.a(mja1.a(nu9Var2.b, null, 6), ljs0.m(c530Var, 64.0f), null, null, null, null, null, null, 0.0f, 0, btsVar2, 48, 1020);
                                btsVar2.t(true);
                            } else {
                                btsVar2.Y();
                            }
                            return zy11Var;
                        default:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            boolean V = btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16);
                            dmw0 dmw0Var = btsVar3.a;
                            if (V) {
                                i43 i43Var = new i43(2.0f, false, new m6(8, x4c.E));
                                f530 c = ljs0.c(c530Var, 1.0f);
                                sic a = qic.a(i43Var, x4c.G, btsVar3, 6);
                                int hashCode3 = Long.hashCode(btsVar3.T);
                                r1b0 o3 = btsVar3.o();
                                f530 d6 = b.d(btsVar3, c);
                                ohd.G1.getClass();
                                sls slsVar3 = d.b;
                                if (dmw0Var == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar3.i0();
                                if (btsVar3.S) {
                                    btsVar3.n(slsVar3);
                                } else {
                                    btsVar3.r0();
                                }
                                wls wlsVar = d.f;
                                qje.W(btsVar3, wlsVar, a);
                                wls wlsVar2 = d.e;
                                qje.W(btsVar3, wlsVar2, o3);
                                Integer valueOf = Integer.valueOf(hashCode3);
                                wls wlsVar3 = d.g;
                                qje.W(btsVar3, wlsVar3, valueOf);
                                tls tlsVar2 = d.h;
                                qje.M(btsVar3, tlsVar2);
                                wls wlsVar4 = d.d;
                                qje.W(btsVar3, wlsVar4, d6);
                                f530 c2 = ljs0.c(c530Var, 1.0f);
                                lhl0 a2 = khl0.a(lr20.a, x4c.D, btsVar3, 0);
                                int hashCode4 = Long.hashCode(btsVar3.T);
                                r1b0 o4 = btsVar3.o();
                                f530 d7 = b.d(btsVar3, c2);
                                btsVar3.i0();
                                if (btsVar3.S) {
                                    btsVar3.n(slsVar3);
                                } else {
                                    btsVar3.r0();
                                }
                                qje.W(btsVar3, wlsVar, a2);
                                qje.W(btsVar3, wlsVar2, o4);
                                vfc.v(hashCode4, btsVar3, wlsVar3, btsVar3, tlsVar2);
                                qje.W(btsVar3, wlsVar4, d7);
                                qgy.b(nu9Var2.c, null, new x2y(1.0f, true), null, 0L, 0L, null, 0L, 2, 1, 0, xya1.e(btsVar3).g.b, null, btsVar3, 805306368, 6, 10746);
                                qgy.b(nu9Var2.e, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar3).h.a, null, btsVar3, 0, 0, 12286);
                                btsVar3.t(true);
                                qgy.b(nu9Var2.d, null, null, null, 0L, 0L, null, 0L, 2, 1, 0, xya1.e(btsVar3).h.a, null, btsVar3, 805306368, 6, 10750);
                                btsVar3.t(true);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11Var;
                    }
                }
            }, btsVar), wwg.S(-738056629, true, new zls() { // from class: hs9
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    c530 c530Var = c530.a;
                    nu9 nu9Var2 = nu9Var;
                    switch (i5) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                f530 b = ljs0.b(c530Var, 16.0f, 0.0f, 2);
                                z910 d4 = pi6.d(x4c.b, false);
                                int hashCode2 = Long.hashCode(btsVar2.T);
                                r1b0 o2 = btsVar2.o();
                                f530 d5 = b.d(btsVar2, b);
                                ohd.G1.getClass();
                                sls slsVar2 = d.b;
                                if (btsVar2.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar2.i0();
                                if (btsVar2.S) {
                                    btsVar2.n(slsVar2);
                                } else {
                                    btsVar2.r0();
                                }
                                qje.W(btsVar2, d.f, d4);
                                qje.W(btsVar2, d.e, o2);
                                qje.W(btsVar2, d.g, Integer.valueOf(hashCode2));
                                qje.M(btsVar2, d.h);
                                qje.W(btsVar2, d.d, d5);
                                v0b1.a(mja1.a(nu9Var2.b, null, 6), ljs0.m(c530Var, 64.0f), null, null, null, null, null, null, 0.0f, 0, btsVar2, 48, 1020);
                                btsVar2.t(true);
                            } else {
                                btsVar2.Y();
                            }
                            return zy11Var;
                        default:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            boolean V = btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16);
                            dmw0 dmw0Var = btsVar3.a;
                            if (V) {
                                i43 i43Var = new i43(2.0f, false, new m6(8, x4c.E));
                                f530 c = ljs0.c(c530Var, 1.0f);
                                sic a = qic.a(i43Var, x4c.G, btsVar3, 6);
                                int hashCode3 = Long.hashCode(btsVar3.T);
                                r1b0 o3 = btsVar3.o();
                                f530 d6 = b.d(btsVar3, c);
                                ohd.G1.getClass();
                                sls slsVar3 = d.b;
                                if (dmw0Var == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar3.i0();
                                if (btsVar3.S) {
                                    btsVar3.n(slsVar3);
                                } else {
                                    btsVar3.r0();
                                }
                                wls wlsVar = d.f;
                                qje.W(btsVar3, wlsVar, a);
                                wls wlsVar2 = d.e;
                                qje.W(btsVar3, wlsVar2, o3);
                                Integer valueOf = Integer.valueOf(hashCode3);
                                wls wlsVar3 = d.g;
                                qje.W(btsVar3, wlsVar3, valueOf);
                                tls tlsVar2 = d.h;
                                qje.M(btsVar3, tlsVar2);
                                wls wlsVar4 = d.d;
                                qje.W(btsVar3, wlsVar4, d6);
                                f530 c2 = ljs0.c(c530Var, 1.0f);
                                lhl0 a2 = khl0.a(lr20.a, x4c.D, btsVar3, 0);
                                int hashCode4 = Long.hashCode(btsVar3.T);
                                r1b0 o4 = btsVar3.o();
                                f530 d7 = b.d(btsVar3, c2);
                                btsVar3.i0();
                                if (btsVar3.S) {
                                    btsVar3.n(slsVar3);
                                } else {
                                    btsVar3.r0();
                                }
                                qje.W(btsVar3, wlsVar, a2);
                                qje.W(btsVar3, wlsVar2, o4);
                                vfc.v(hashCode4, btsVar3, wlsVar3, btsVar3, tlsVar2);
                                qje.W(btsVar3, wlsVar4, d7);
                                qgy.b(nu9Var2.c, null, new x2y(1.0f, true), null, 0L, 0L, null, 0L, 2, 1, 0, xya1.e(btsVar3).g.b, null, btsVar3, 805306368, 6, 10746);
                                qgy.b(nu9Var2.e, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar3).h.a, null, btsVar3, 0, 0, 12286);
                                btsVar3.t(true);
                                qgy.b(nu9Var2.d, null, null, null, 0L, 0L, null, 0L, 2, 1, 0, xya1.e(btsVar3).h.a, null, btsVar3, 805306368, 6, 10750);
                                btsVar3.t(true);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11Var;
                    }
                }
            }, btsVar), null, null, null, SlotSize.L, false, btsVar, 1573302, 184);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s09(nu9Var, tlsVar, f530Var, i, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static final void c(pu9 pu9Var, tls tlsVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar;
        boolean z;
        int i3;
        f530 f530Var2;
        sls slsVar;
        tls tlsVar2;
        wls wlsVar;
        sls slsVar2;
        wls wlsVar2;
        c530 c530Var;
        wls wlsVar3;
        g43 g43Var;
        so5 so5Var;
        ?? r3;
        float f;
        bts btsVar2;
        up2 up2Var;
        sls slsVar3;
        Integer num;
        Integer num2;
        bts btsVar3;
        CharSequence charSequence;
        CharSequence charSequence2;
        Integer valueOf;
        bts btsVar4 = (bts) fidVar;
        btsVar4.g0(-1219133134);
        dmw0 dmw0Var = btsVar4.a;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar4.k(pu9Var) : btsVar4.e(pu9Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar4.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar4.k(f530Var) ? 256 : 128;
        }
        if (btsVar4.V(i2 & 1, (i2 & 147) != 146)) {
            ou9 ou9Var = pu9Var.j;
            c530 c530Var2 = c530.a;
            if (ou9Var == null || (charSequence2 = ou9Var.a) == null || !(!evu0.J(charSequence2))) {
                z = true;
                i3 = 0;
                btsVar4.e0(-951103214);
                btsVar4.t(false);
                f530Var2 = c530Var2;
            } else {
                btsVar4.e0(-951446446);
                kdc kdcVar = ou9Var.b;
                if (kdcVar == null) {
                    btsVar4.e0(-951289711);
                    btsVar4.t(false);
                    valueOf = null;
                } else {
                    btsVar4.e0(939144560);
                    int m = s8o.m(kdcVar, (Context) btsVar4.m(AndroidCompositionLocals_androidKt.b));
                    btsVar4.t(false);
                    valueOf = Integer.valueOf(m);
                }
                z = true;
                up2 up2Var2 = new up2(tje.c(0.1f, fq2.a));
                if (valueOf != null) {
                    up2Var2 = new up2(rzo.d(valueOf.intValue()));
                }
                f530Var2 = bzk0.c(c530Var2, up2Var2, cyk0.c(20.0f));
                i3 = 0;
                btsVar4.t(false);
            }
            f530 k = f530Var.k(f530Var2);
            so5 so5Var2 = x4c.G;
            g43 g43Var2 = lr20.c;
            sic a = qic.a(g43Var2, so5Var2, btsVar4, i3);
            int hashCode = Long.hashCode(btsVar4.T);
            r1b0 o = btsVar4.o();
            f530 d = b.d(btsVar4, k);
            ohd.G1.getClass();
            sls slsVar4 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar4.i0();
            if (btsVar4.S) {
                btsVar4.n(slsVar4);
            } else {
                btsVar4.r0();
            }
            wls wlsVar4 = d.f;
            qje.W(btsVar4, wlsVar4, a);
            wls wlsVar5 = d.e;
            qje.W(btsVar4, wlsVar5, o);
            Integer valueOf2 = Integer.valueOf(hashCode);
            wls wlsVar6 = d.g;
            qje.W(btsVar4, wlsVar6, valueOf2);
            tls tlsVar3 = d.h;
            qje.M(btsVar4, tlsVar3);
            wls wlsVar7 = d.d;
            qje.W(btsVar4, wlsVar7, d);
            f530 d2 = ooc.d(ljs0.c(c530Var2, 1.0f), null, 3);
            z910 d3 = pi6.d(x4c.b, false);
            int hashCode2 = Long.hashCode(btsVar4.T);
            r1b0 o2 = btsVar4.o();
            f530 d4 = b.d(btsVar4, d2);
            btsVar4.i0();
            int i4 = i2;
            if (btsVar4.S) {
                slsVar = slsVar4;
                btsVar4.n(slsVar);
            } else {
                slsVar = slsVar4;
                btsVar4.r0();
            }
            qje.W(btsVar4, wlsVar4, d3);
            qje.W(btsVar4, wlsVar5, o2);
            vfc.v(hashCode2, btsVar4, wlsVar6, btsVar4, tlsVar3);
            qje.W(btsVar4, wlsVar7, d4);
            if (ou9Var == null || (charSequence = ou9Var.a) == null || (!evu0.J(charSequence)) != z) {
                tlsVar2 = tlsVar3;
                wlsVar = wlsVar6;
                slsVar2 = slsVar;
                wlsVar2 = wlsVar5;
                c530Var = c530Var2;
                wlsVar3 = wlsVar7;
                g43Var = g43Var2;
                so5Var = so5Var2;
                r3 = 0;
                f = 20.0f;
                btsVar4.e0(2135535060);
                btsVar4.t(false);
                btsVar2 = btsVar4;
            } else {
                btsVar4.e0(2135169632);
                f = 20.0f;
                tlsVar2 = tlsVar3;
                wlsVar = wlsVar6;
                wlsVar2 = wlsVar5;
                c530Var = c530Var2;
                wlsVar3 = wlsVar7;
                g43Var = g43Var2;
                slsVar2 = slsVar;
                so5Var = so5Var2;
                r3 = 0;
                qgy.b(ou9Var.a, null, an91.l(ljs0.c(c530Var2, 1.0f), 12.0f, 9.0f), new up2(fq2.a), 0L, 0L, new sjy0(3), 0L, 2, 2, 0, xya1.e(btsVar4).h.a, null, btsVar4, 805306752, 6, 10610);
                bts btsVar5 = btsVar4;
                btsVar5.t(false);
                btsVar2 = btsVar5;
            }
            btsVar2.t(true);
            kdc kdcVar2 = pu9Var.i;
            if (kdcVar2 == null) {
                btsVar2.e0(-884273629);
                btsVar2.t(r3);
                up2Var = null;
            } else {
                btsVar2.e0(-884273628);
                long d5 = rzo.d(s8o.m(kdcVar2, (Context) btsVar2.m(AndroidCompositionLocals_androidKt.b)));
                btsVar2.t(r3);
                up2Var = new up2(d5);
            }
            if (up2Var == null) {
                up2Var = new up2(rzo.e(r3, 173, 255, 255));
            }
            c530 c530Var3 = c530Var;
            f530 c = bzk0.c(c530Var3, up2Var, cyk0.c(f));
            boolean z2 = ((i4 & 112) == 32 ? true : r3) | (((i4 & 14) == 4 || ((i4 & 8) != 0 && btsVar2.e(pu9Var))) ? true : r3);
            Object Q = btsVar2.Q();
            if (z2 || Q == did.a) {
                Q = new u08(20, pu9Var, tlsVar);
                btsVar2.o0(Q);
            }
            f530 m2 = an91.m(q791.d(c, false, null, null, (sls) Q, 15), 0.0f, 16.0f, 1);
            sic a2 = qic.a(g43Var, so5Var, btsVar2, r3);
            int hashCode3 = Long.hashCode(btsVar2.T);
            r1b0 o3 = btsVar2.o();
            f530 d6 = b.d(btsVar2, m2);
            btsVar2.i0();
            if (btsVar2.S) {
                slsVar3 = slsVar2;
                btsVar2.n(slsVar3);
            } else {
                slsVar3 = slsVar2;
                btsVar2.r0();
            }
            qje.W(btsVar2, wlsVar4, a2);
            wls wlsVar8 = wlsVar2;
            qje.W(btsVar2, wlsVar8, o3);
            wls wlsVar9 = wlsVar;
            tls tlsVar4 = tlsVar2;
            vfc.v(hashCode3, btsVar2, wlsVar9, btsVar2, tlsVar4);
            wls wlsVar10 = wlsVar3;
            qje.W(btsVar2, wlsVar10, d6);
            f530 o4 = an91.o(ljs0.c(c530Var3, 1.0f), 16.0f, 0.0f, 12.0f, 0.0f, 10);
            lhl0 a3 = khl0.a(lr20.a, x4c.D, btsVar2, r3);
            int hashCode4 = Long.hashCode(btsVar2.T);
            r1b0 o5 = btsVar2.o();
            f530 d7 = b.d(btsVar2, o4);
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar3);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, wlsVar4, a3);
            qje.W(btsVar2, wlsVar8, o5);
            vfc.v(hashCode4, btsVar2, wlsVar9, btsVar2, tlsVar4);
            qje.W(btsVar2, wlsVar10, d7);
            CharSequence charSequence3 = pu9Var.b;
            ety0 ety0Var = xya1.e(btsVar2).g.b;
            AppColor$Palette appColor$Palette = AppColor$Palette.EverFront;
            fid fidVar2 = btsVar2;
            qgy.b(charSequence3, null, new x2y(1.0f, true), appColor$Palette, 0L, 0L, null, 0L, 2, 1, 0, ety0Var, null, fidVar2, 805309440, 6, 10738);
            bts btsVar6 = fidVar2;
            tn9 tn9Var = pu9Var.h;
            if (tn9Var == null) {
                btsVar6.e0(1053118087);
                btsVar6.t(r3);
                num = null;
            } else {
                btsVar6.e0(1053118088);
                num = null;
                chb1.a(tn9Var, null, btsVar6, r3, 2);
                btsVar6.t(r3);
            }
            btsVar6.t(true);
            if (evu0.J(pu9Var.c)) {
                num2 = num;
                btsVar6.e0(-915177340);
                btsVar6.t(r3);
                btsVar3 = btsVar6;
            } else {
                btsVar6.e0(-915495679);
                num2 = num;
                qgy.b(pu9Var.c, null, an91.o(ljs0.c(c530Var3, 1.0f), 16.0f, 0.0f, 16.0f, 0.0f, 10), appColor$Palette, 0L, 0L, null, 0L, 2, 1, 0, xya1.e(btsVar6).h.a, null, btsVar6, 805309824, 6, 10738);
                bts btsVar7 = btsVar6;
                btsVar7.t(r3);
                btsVar3 = btsVar7;
            }
            lna lnaVar = pu9Var.d;
            lna lnaVar2 = pu9Var.e;
            int i5 = pu9Var.f;
            wp2 wp2Var = appColor$Palette;
            int i6 = pu9Var.g;
            Integer num3 = lnaVar != null ? lnaVar.d : num2;
            wp2 up2Var3 = num3 != null ? new up2(rzo.d(num3.intValue())) : wp2Var;
            lna lnaVar3 = pu9Var.e;
            Integer num4 = lnaVar3 != null ? lnaVar3.d : num2;
            if (num4 != null) {
                wp2Var = new up2(rzo.d(num4.intValue()));
            }
            q8a1.a(lnaVar, lnaVar2, i5, i6, null, up2Var3, wp2Var, an91.n(ljs0.c(c530Var3, 1.0f), 16.0f, f, 16.0f, 4.0f), new up2(rzo.e(r3, 173, 255, 255)), btsVar3, 12607488);
            btsVar3.t(true);
            btsVar3.t(true);
            btsVar = btsVar3;
        } else {
            btsVar4.Y();
            btsVar = btsVar4;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s09(pu9Var, tlsVar, f530Var, i, 3);
        }
    }

    public static final void d(ru9 ru9Var, boolean z, ir9 ir9Var, tls tlsVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        sls slsVar;
        wls wlsVar;
        tls tlsVar2;
        wls wlsVar2;
        wls wlsVar3;
        o430 o430Var;
        so5 so5Var;
        int i3;
        int i4;
        to5 to5Var;
        boolean z2;
        sls slsVar2;
        boolean z3;
        ir9 ir9Var2 = ir9Var;
        tls tlsVar3 = tlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1939368716);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(ru9Var) : btsVar.e(ru9Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.a(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(ir9Var2) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar3) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.k(f530Var) ? 16384 : 8192;
        }
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            f530 l = ymb1.l(ljs0.g(bzk0.c(f530Var, AppColor$Palette.BgMinor, cyk0.c(20.0f)), 64.0f, 0.0f, 2), cyk0.c(20.0f));
            int i5 = i2 & 14;
            int i6 = i2 & 7168;
            boolean z4 = (i5 == 4 || ((i2 & 8) != 0 && btsVar.e(ru9Var))) | (i6 == 2048);
            Object Q = btsVar.Q();
            o430 o430Var2 = did.a;
            if (z4 || Q == o430Var2) {
                Q = new u08(21, ru9Var, tlsVar3);
                btsVar.o0(Q);
            }
            f530 d = q791.d(l, false, null, null, (sls) Q, 15);
            so5 so5Var2 = x4c.G;
            sic a = qic.a(lr20.c, so5Var2, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, d);
            ohd.G1.getClass();
            sls slsVar3 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar3);
            } else {
                btsVar.r0();
            }
            wls wlsVar4 = d.f;
            qje.W(btsVar, wlsVar4, a);
            wls wlsVar5 = d.e;
            qje.W(btsVar, wlsVar5, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar6 = d.g;
            qje.W(btsVar, wlsVar6, valueOf);
            tls tlsVar4 = d.h;
            qje.M(btsVar, tlsVar4);
            wls wlsVar7 = d.d;
            qje.W(btsVar, wlsVar7, d2);
            to5 to5Var2 = x4c.E;
            c530 c530Var = c530.a;
            int i7 = i2;
            f530 c = ljs0.c(c530Var, 1.0f);
            f43 f43Var = lr20.a;
            lhl0 a2 = khl0.a(f43Var, to5Var2, btsVar, 48);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = b.d(btsVar, c);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar3);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar4, a2);
            qje.W(btsVar, wlsVar5, o2);
            vfc.v(hashCode2, btsVar, wlsVar6, btsVar, tlsVar4);
            qje.W(btsVar, wlsVar7, d3);
            if (evu0.J(ru9Var.b)) {
                slsVar = slsVar3;
                wlsVar = wlsVar7;
                tlsVar2 = tlsVar4;
                wlsVar2 = wlsVar6;
                wlsVar3 = wlsVar5;
                o430Var = o430Var2;
                so5Var = so5Var2;
                i3 = i6;
                i4 = i5;
                to5Var = to5Var2;
                z2 = true;
                btsVar.e0(1099370405);
                oeb1.c(btsVar, ljs0.q(c530Var, 12.0f));
                btsVar.t(false);
            } else {
                btsVar.e0(1099157342);
                ovi0 a3 = mja1.a(ru9Var.b, null, 6);
                f530 m = ljs0.m(c530Var, 64.0f);
                m4d.a.getClass();
                tlsVar2 = tlsVar4;
                o430Var = o430Var2;
                slsVar = slsVar3;
                so5Var = so5Var2;
                i3 = i6;
                i4 = i5;
                to5Var = to5Var2;
                wlsVar = wlsVar7;
                wlsVar2 = wlsVar6;
                wlsVar3 = wlsVar5;
                z2 = true;
                v0b1.a(a3, m, null, null, m4d.b, null, null, null, 0.0f, 0, btsVar, 24624, 1004);
                btsVar = btsVar;
                btsVar.t(false);
            }
            i43 i43Var = new i43(2.0f, z2, new quz(11));
            nhl0 nhl0Var = nhl0.a;
            f530 n = an91.n(nhl0Var.a(c530Var, 1.0f, z2), 0.0f, 12.0f, 12.0f, 12.0f);
            sic a4 = qic.a(i43Var, so5Var, btsVar, 6);
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d4 = b.d(btsVar, n);
            btsVar.i0();
            if (btsVar.S) {
                slsVar2 = slsVar;
                btsVar.n(slsVar2);
            } else {
                slsVar2 = slsVar;
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar4, a4);
            wls wlsVar8 = wlsVar3;
            qje.W(btsVar, wlsVar8, o3);
            wls wlsVar9 = wlsVar2;
            tls tlsVar5 = tlsVar2;
            vfc.v(hashCode3, btsVar, wlsVar9, btsVar, tlsVar5);
            wls wlsVar10 = wlsVar;
            qje.W(btsVar, wlsVar10, d4);
            f530 c2 = ljs0.c(c530Var, 1.0f);
            to5 to5Var3 = to5Var;
            lhl0 a5 = khl0.a(f43Var, to5Var3, btsVar, 48);
            int hashCode4 = Long.hashCode(btsVar.T);
            r1b0 o4 = btsVar.o();
            f530 d5 = b.d(btsVar, c2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar4, a5);
            qje.W(btsVar, wlsVar8, o4);
            vfc.v(hashCode4, btsVar, wlsVar9, btsVar, tlsVar5);
            qje.W(btsVar, wlsVar10, d5);
            sls slsVar4 = slsVar2;
            bts btsVar2 = btsVar;
            int i8 = i4;
            qgy.b(ru9Var.c, null, nhl0Var.a(c530Var, 1.0f, true), null, 0L, 0L, null, 0L, 2, 1, 0, xya1.e(btsVar).g.b, null, btsVar2, 805306368, 6, 10746);
            qgy.b(ru9Var.e, null, an91.o(c530Var, 12.0f, 0.0f, 0.0f, 0.0f, 14), null, 0L, 0L, null, 0L, 0, 1, 0, xya1.e(btsVar2).h.a, null, btsVar2, 384, 6, 11258);
            btsVar2.t(true);
            qgy.b(ru9Var.d, null, null, null, 0L, 0L, null, 0L, 2, 1, 0, xya1.e(btsVar2).h.a, null, btsVar2, 805306368, 6, 10750);
            btsVar = btsVar2;
            btsVar.t(true);
            btsVar.t(true);
            if (z) {
                btsVar.e0(405336627);
                yrl.b(6, 6, btsVar, an91.m(ljs0.c(c530Var, 1.0f), 16.0f, 0.0f, 2));
                f530 g = ljs0.g(ljs0.c(c530Var, 1.0f), 48.0f, 0.0f, 2);
                lhl0 a6 = khl0.a(f43Var, to5Var3, btsVar, 48);
                int hashCode5 = Long.hashCode(btsVar.T);
                r1b0 o5 = btsVar.o();
                f530 d6 = b.d(btsVar, g);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar4);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar4, a6);
                qje.W(btsVar, wlsVar8, o5);
                vfc.v(hashCode5, btsVar, wlsVar9, btsVar, tlsVar5);
                qje.W(btsVar, wlsVar10, d6);
                qgy.b(ru9Var.g, null, an91.o(nhl0Var.a(c530Var, 1.0f, true), 20.0f, 0.0f, 8.0f, 0.0f, 10), AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 2, 1, 0, xya1.e(btsVar).h.a, null, btsVar, 805309440, 6, 10738);
                btsVar = btsVar;
                qu9 qu9Var = ru9Var.f;
                boolean z5 = qu9Var.a;
                boolean z6 = qu9Var.b;
                f530 n2 = an91.n(c530Var, 8.0f, 8.0f, 16.0f, 8.0f);
                ir9Var2 = ir9Var;
                boolean e = (i8 == 4 || ((i7 & 8) != 0 && btsVar.e(ru9Var))) | (i3 == 2048) | btsVar.e(ir9Var2);
                Object Q2 = btsVar.Q();
                if (e || Q2 == o430Var) {
                    tlsVar3 = tlsVar;
                    z3 = true;
                    Q2 = new f89(1 == true ? 1 : 0, tlsVar3, ru9Var, ir9Var2);
                    btsVar.o0(Q2);
                } else {
                    tlsVar3 = tlsVar;
                    z3 = true;
                }
                ijb1.b(z6, n2, null, null, null, (tls) Q2, z5, btsVar, 0, 28);
                btsVar.t(z3);
                btsVar.t(false);
            } else {
                ir9Var2 = ir9Var;
                tlsVar3 = tlsVar;
                z3 = true;
                btsVar.e0(406387000);
                btsVar.t(false);
            }
            btsVar.t(z3);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ym1(i, 4, ru9Var, ir9Var2, tlsVar3, f530Var, z);
        }
    }

    public static final yn40 e(lmo lmoVar) {
        return new yn40(lmoVar.c, lmoVar.b.b);
    }

    public static final ao40 f(j7u0 j7u0Var) {
        return new ao40(j7u0Var.c, j7u0Var.b);
    }

    public static final MultiTransportChooseExitCardAnalytics$OpenReasonV2 g(MultiTransportChooseStationCardAnalytics$OpenReasonV2 multiTransportChooseStationCardAnalytics$OpenReasonV2) {
        for (MultiTransportChooseExitCardAnalytics$OpenReasonV2 multiTransportChooseExitCardAnalytics$OpenReasonV2 : MultiTransportChooseExitCardAnalytics$OpenReasonV2.a()) {
            if (jl40.l(multiTransportChooseExitCardAnalytics$OpenReasonV2.getEventValue(), multiTransportChooseStationCardAnalytics$OpenReasonV2.getEventValue())) {
                return multiTransportChooseExitCardAnalytics$OpenReasonV2;
            }
        }
        w511.i("Collection contains no element matching the predicate.");
        return null;
    }

    public static final MultiTransportChooseExitCardAnalytics$TransportTypeV2 h(MultiTransportChooseStationCardAnalytics$TransportTypeV2 multiTransportChooseStationCardAnalytics$TransportTypeV2) {
        for (MultiTransportChooseExitCardAnalytics$TransportTypeV2 multiTransportChooseExitCardAnalytics$TransportTypeV2 : MultiTransportChooseExitCardAnalytics$TransportTypeV2.a()) {
            if (jl40.l(multiTransportChooseExitCardAnalytics$TransportTypeV2.getEventValue(), multiTransportChooseStationCardAnalytics$TransportTypeV2.getEventValue())) {
                return multiTransportChooseExitCardAnalytics$TransportTypeV2;
            }
        }
        w511.i("Collection contains no element matching the predicate.");
        return null;
    }

    public static final String i(cxq0 cxq0Var, jdo jdoVar, int i, String str) {
        if (str.length() != 0 && i > 0) {
            StringBuilder sb = new StringBuilder(i);
            c6w it = y6i0.n(0, i).iterator();
            while (it.c) {
                sb.append(str.charAt(it.nextInt() % str.length()));
            }
            return sb.toString();
        }
        if (str.length() != 0) {
            return "";
        }
        ((l6o) ((yvi0) cxq0Var.x).a).f(new Throwable(oyr.p("Warning occurred while evaluating '", jdoVar.a, "':"), new Throwable("String for padding is empty.")));
        return "";
    }
}
