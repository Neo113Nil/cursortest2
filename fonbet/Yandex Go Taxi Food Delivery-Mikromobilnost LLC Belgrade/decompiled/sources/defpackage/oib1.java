package defpackage;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.modal.bottomsheet.c;
import defpackage.an91;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.j690;
import defpackage.jl40;
import defpackage.ohd;
import defpackage.oib1;
import defpackage.ooc;
import defpackage.pi6;
import defpackage.qea;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.rea;
import defpackage.sls;
import defpackage.tls;
import defpackage.unr0;
import defpackage.vea;
import defpackage.wea;
import defpackage.wls;
import defpackage.x4c;
import defpackage.z910;
import defpackage.zpn;
import defpackage.zy11;

/* loaded from: classes12.dex */
public abstract class oib1 {
    public static final void a(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1891336665);
        if (btsVar.V(i & 1, i != 0)) {
            c530 c530Var = c530.a;
            f530 n = an91.n(c530Var, 16.0f, 16.0f, 16.0f, 50.0f);
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
            com.yandex.go.design.compose.loading.b.a(ljs0.e(ljs0.c(c530Var, 1.0f), 40.0f), cyk0.c(100.0f), false, null, null, null, false, btsVar, 6, 252);
            oeb1.c(btsVar, ljs0.e(c530Var, 16.0f));
            com.yandex.go.design.compose.loading.b.a(ljs0.e(ljs0.c(c530Var, 1.0f), 100.0f), cyk0.c(24.0f), false, null, null, null, false, btsVar, 6, 252);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mq5(i, 26);
        }
    }

    public static final void b(final wea weaVar, final tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1303675221);
        int i2 = (btsVar.k(weaVar) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c.a(null, null, null, false, false, null, null, null, null, null, null, wwg.S(1698837323, true, new bms() { // from class: com.yandex.go.chargers.partner_subscription.a
                @Override // defpackage.bms
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    j690 j690Var = (j690) obj2;
                    fid fidVar2 = (fid) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 48) == 0) {
                        intValue |= ((bts) fidVar2).k(j690Var) ? 32 : 16;
                    }
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.V(intValue & 1, (intValue & 145) != 144)) {
                        f530 d = ooc.d(an91.j(c530.a, j690Var), null, 3);
                        z910 d2 = pi6.d(x4c.b, false);
                        int hashCode = Long.hashCode(btsVar2.T);
                        r1b0 o = btsVar2.o();
                        f530 d3 = b.d(btsVar2, d);
                        ohd.G1.getClass();
                        sls slsVar = d.b;
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
                        qje.W(btsVar2, d.f, d2);
                        qje.W(btsVar2, d.e, o);
                        qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
                        qje.M(btsVar2, d.h);
                        qje.W(btsVar2, d.d, d3);
                        rea reaVar = rea.a;
                        wea weaVar2 = wea.this;
                        if (jl40.l(weaVar2, reaVar)) {
                            btsVar2.e0(2005968205);
                            oib1.a(btsVar2, 0);
                            btsVar2.t(false);
                        } else {
                            boolean z = weaVar2 instanceof vea;
                            tls tlsVar2 = tlsVar;
                            if (z) {
                                btsVar2.e0(2005971484);
                                oib1.c((vea) weaVar2, tlsVar2, btsVar2, 0);
                                btsVar2.t(false);
                            } else {
                                if (!(weaVar2 instanceof qea)) {
                                    throw unr0.y(2005966216, btsVar2, false);
                                }
                                btsVar2.e0(2055690918);
                                boolean k = btsVar2.k(tlsVar2) | btsVar2.e(weaVar2);
                                Object Q = btsVar2.Q();
                                if (k || Q == did.a) {
                                    Q = new ChargersPartnerSubscriptionInfoScreenKt$ChargersPartnerSubscriptionInfoScreen$1$1$1$1(tlsVar2, weaVar2, null);
                                    btsVar2.o0(Q);
                                }
                                zpn.e(btsVar2, (wls) Q, weaVar2);
                                btsVar2.t(false);
                            }
                        }
                        btsVar2.t(true);
                    } else {
                        btsVar2.Y();
                    }
                    return zy11.a;
                }
            }, btsVar), btsVar, 0, 48, 2047);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i9a(weaVar, tlsVar, i, 2);
        }
    }

    public static final void c(vea veaVar, tls tlsVar, fid fidVar, int i) {
        tls tlsVar2;
        vea veaVar2;
        int i2;
        Object obj;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1225777144);
        dmw0 dmw0Var = btsVar.a;
        int i3 = i | (btsVar.k(veaVar) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 o = an91.o(ljs0.c(c530Var, 1.0f), 0.0f, 16.0f, 0.0f, 8.0f, 5);
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
            tls tlsVar3 = d.h;
            qje.M(btsVar, tlsVar3);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            float f = 1.0f;
            qgy.b(veaVar.a, null, an91.m(c530Var, 16.0f, 0.0f, 2), null, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar).d.d, null, btsVar, 384, 0, 12282);
            btsVar = btsVar;
            f530 c = bzk0.c(an91.o(ljs0.c(c530Var, 1.0f), 16.0f, 16.0f, 16.0f, 0.0f, 8), AppColor$Palette.BgMinor, cyk0.c(24.0f));
            sic a2 = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d2 = b.d(btsVar, c);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar3);
            qje.W(btsVar, wlsVar4, d2);
            btsVar.e0(1109170841);
            veaVar2 = veaVar;
            for (final tea teaVar : veaVar2.b) {
                final int i4 = 0;
                final int i5 = 1;
                bts btsVar2 = btsVar;
                ydb1.a(ljs0.c(c530Var, f), wwg.S(1769200777, true, new zls() { // from class: hea
                    @Override // defpackage.zls
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i6 = i4;
                        zy11 zy11Var = zy11.a;
                        tea teaVar2 = teaVar;
                        switch (i6) {
                            case 0:
                                ibp0 ibp0Var = (ibp0) obj2;
                                fid fidVar2 = (fid) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                                }
                                bts btsVar3 = (bts) fidVar2;
                                if (!btsVar3.V(intValue & 1, (intValue & 19) != 18)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    String str = teaVar2.a;
                                    if (str != null && str.length() != 0) {
                                        btsVar3.e0(-1578256792);
                                        tdb1.d(ibp0Var, mja1.a(teaVar2.a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar3, intValue & 14, 510);
                                        btsVar3.t(false);
                                        break;
                                    } else {
                                        btsVar3.e0(-1578140976);
                                        nnm.s(c530.a, Float.isNaN(Float.NaN) ? deb1.a(ibp0Var.c()) : Float.NaN, btsVar3, false);
                                        break;
                                    }
                                }
                                break;
                            default:
                                ebp0 ebp0Var = (ebp0) obj2;
                                fid fidVar3 = (fid) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                                }
                                bts btsVar4 = (bts) fidVar3;
                                if (!btsVar4.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    btsVar4.Y();
                                    break;
                                } else {
                                    m9b1.a(ebp0Var, teaVar2.b, c530.a, null, null, 0, 0, null, null, null, 0, 0, null, btsVar4, (intValue2 & 14) | 384, 0, 16380);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar), wwg.S(-1495128658, true, new zls() { // from class: hea
                    @Override // defpackage.zls
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i6 = i5;
                        zy11 zy11Var = zy11.a;
                        tea teaVar2 = teaVar;
                        switch (i6) {
                            case 0:
                                ibp0 ibp0Var = (ibp0) obj2;
                                fid fidVar2 = (fid) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                                }
                                bts btsVar3 = (bts) fidVar2;
                                if (!btsVar3.V(intValue & 1, (intValue & 19) != 18)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    String str = teaVar2.a;
                                    if (str != null && str.length() != 0) {
                                        btsVar3.e0(-1578256792);
                                        tdb1.d(ibp0Var, mja1.a(teaVar2.a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar3, intValue & 14, 510);
                                        btsVar3.t(false);
                                        break;
                                    } else {
                                        btsVar3.e0(-1578140976);
                                        nnm.s(c530.a, Float.isNaN(Float.NaN) ? deb1.a(ibp0Var.c()) : Float.NaN, btsVar3, false);
                                        break;
                                    }
                                }
                                break;
                            default:
                                ebp0 ebp0Var = (ebp0) obj2;
                                fid fidVar3 = (fid) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                                }
                                bts btsVar4 = (bts) fidVar3;
                                if (!btsVar4.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    btsVar4.Y();
                                    break;
                                } else {
                                    m9b1.a(ebp0Var, teaVar2.b, c530.a, null, null, 0, 0, null, null, null, 0, 0, null, btsVar4, (intValue2 & 14) | 384, 0, 16380);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar), null, null, null, null, false, btsVar2, 438, 248);
                btsVar = btsVar2;
                f = 1.0f;
            }
            boolean z = false;
            btsVar.t(false);
            btsVar.t(true);
            CharSequence charSequence = veaVar2.c;
            if (charSequence == null) {
                btsVar.e0(1925514661);
                btsVar.t(false);
                i2 = 2;
            } else {
                btsVar.e0(1925514662);
                bts btsVar3 = btsVar;
                i2 = 2;
                qgy.b(charSequence, null, an91.o(an91.m(c530Var, 16.0f, 0.0f, 2), 0.0f, 16.0f, 0.0f, 0.0f, 13), AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar).h.a, null, btsVar3, 3456, 0, 12274);
                btsVar = btsVar3;
                z = false;
                btsVar.t(false);
            }
            uea ueaVar = veaVar2.e;
            Object obj2 = did.a;
            if (ueaVar == null) {
                btsVar.e0(1925791398);
                btsVar.t(z);
                obj = obj2;
            } else {
                btsVar.e0(1925791399);
                f530 o4 = an91.o(an91.m(c530Var, 16.0f, 0.0f, i2), 0.0f, 12.0f, 0.0f, 0.0f, 13);
                boolean k = btsVar.k(ueaVar) | ((i3 & 112) == 32);
                Object Q = btsVar.Q();
                if (k || Q == obj2) {
                    Q = new n8a(4, tlsVar, ueaVar);
                    btsVar.o0(Q);
                }
                bts btsVar4 = btsVar;
                obj = obj2;
                qgy.b(ueaVar.a, null, q791.b(o4, null, null, false, null, new awk0(0), (sls) Q, 12), null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar4, 0, 0, 16378);
                btsVar = btsVar4;
                z = false;
                btsVar.t(false);
            }
            boolean b = btsVar.b(4.0f) | btsVar.a(z);
            Object Q2 = btsVar.Q();
            if (b || Q2 == obj) {
                Q2 = new jg0(9);
                btsVar.o0(Q2);
            }
            z910 z910Var = (z910) Q2;
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o5 = btsVar.o();
            f530 d3 = b.d(btsVar, c530Var);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, z910Var);
            qje.W(btsVar, d.e, o5);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode3));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d3);
            btsVar.e0(1004025432);
            for (sea seaVar : veaVar2.d) {
                f530 c2 = ljs0.c(an91.o(an91.m(c530Var, 8.0f, 0.0f, 2), 0.0f, 12.0f, 0.0f, 0.0f, 13), 1.0f);
                boolean k2 = btsVar.k(seaVar) | ((i3 & 112) == 32);
                Object Q3 = btsVar.Q();
                if (k2 || Q3 == obj) {
                    Q3 = new n8a(5, tlsVar, seaVar);
                    btsVar.o0(Q3);
                }
                ulb1.a(c2, false, null, (sls) Q3, wwg.S(392470058, true, new bj0(29, seaVar), btsVar), btsVar, 24582, 6);
            }
            tlsVar2 = tlsVar;
            tse0.t(btsVar, false, true, true);
        } else {
            tlsVar2 = tlsVar;
            veaVar2 = veaVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i9a(veaVar2, tlsVar2, i, 3);
        }
    }

    public static final void d(AppCompatTextView appCompatTextView) {
        Object tag = appCompatTextView.getTag(e9h0.ai_bot_suggest_original_text_tag);
        String str = tag instanceof String ? (String) tag : null;
        if (str != null) {
            appCompatTextView.setText(str);
            appCompatTextView.setContentDescription(str);
        }
    }

    public static int e(kn1 kn1Var, boolean z) {
        int i = kn1Var.b;
        int i2 = kn1Var.c;
        int i3 = z ? i2 : i;
        if (!z) {
            i = i2;
        }
        byte[][] bArr = (byte[][]) kn1Var.w;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            byte b = -1;
            int i6 = 0;
            for (int i7 = 0; i7 < i; i7++) {
                byte b2 = z ? bArr[i5][i7] : bArr[i7][i5];
                if (b2 == b) {
                    i6++;
                } else {
                    if (i6 >= 5) {
                        i4 += i6 - 2;
                    }
                    i6 = 1;
                    b = b2;
                }
            }
            if (i6 >= 5) {
                i4 = (i6 - 2) + i4;
            }
        }
        return i4;
    }
}
