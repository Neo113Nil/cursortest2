package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.modal.utils.a;
import com.yandex.messaging.domain.statuses.StatusAvailability;
import com.ybsdk.core.transfer.utils.domain.dto.PartnerDto;
import com.ybsdk.core.transfer.utils.domain.entities.PartnerEntity;
import java.util.ArrayList;
import java.util.Iterator;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes11.dex */
public abstract class m791 {
    public static final void a(hob hobVar, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(305261203);
        dmw0 dmw0Var = btsVar.a;
        int i2 = 16;
        int i3 = i | (btsVar.k(hobVar) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            byk0 c = cyk0.c(16.0f);
            c530 c530Var = c530.a;
            f530 b = tra1.b(m4m0.b(ymb1.l(ljs0.b(ljs0.q(c530Var, 104.0f), 0.0f, 158.0f, 1), c), ((ry2) btsVar.m(uy2.a)).d, c), hobVar.e ? 1.0f : 0.5f);
            boolean z = hobVar.e;
            boolean z2 = (i3 & 112) == 32;
            int i4 = i3 & 14;
            boolean z3 = z2 | (i4 == 4);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z3 || Q == o430Var) {
                Q = new n8a(i2, tlsVar, hobVar);
                btsVar.o0(Q);
            }
            f530 d = q791.d(b, z, null, null, (sls) Q, 14);
            boolean z4 = i4 == 4;
            Object Q2 = btsVar.Q();
            if (z4 || Q2 == o430Var) {
                Q2 = new od9(27, hobVar);
                btsVar.o0(Q2);
            }
            f530 b2 = fnq0.b(d, false, (tls) Q2);
            z910 d2 = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d3 = b.d(btsVar, b2);
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
            qje.W(btsVar, wlsVar, d2);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar2 = d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d3);
            wfa1.a(hobVar.d, an91.k(cj6.a.a(c530Var, x4c.w), 6.0f), null, null, hobVar.e, btsVar, 0, 12);
            k3r k3rVar = ljs0.c;
            so5 so5Var = x4c.G;
            g43 g43Var = lr20.c;
            sic a = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d4 = b.d(btsVar, k3rVar);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d4);
            f(new ypu(x4c.H), mja1.a(hobVar.f, null, 6), btsVar, 0);
            f530 o3 = an91.o(ljs0.c(c530Var, 1.0f), 8.0f, 0.0f, 8.0f, 8.0f, 2);
            sic a2 = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o4 = btsVar.o();
            f530 d5 = b.d(btsVar, o3);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o4);
            vfc.v(hashCode3, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d5);
            jeb1.f(hobVar.b, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).h.a, btsVar, 0, 0, 16382);
            btsVar = btsVar;
            String str = hobVar.c;
            if (str == null) {
                btsVar.e0(1598143241);
                btsVar.t(false);
            } else {
                btsVar.e0(1598143242);
                jeb1.f(str, null, AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).i.a, btsVar, 384, 0, 16378);
                btsVar = btsVar;
                btsVar.t(false);
            }
            tse0.t(btsVar, true, true, true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i9a(hobVar, tlsVar, i, 13);
        }
    }

    public static final void b(apb apbVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1423334620);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(apbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new fv9(16, tlsVar);
                btsVar.o0(Q);
            }
            gya1.d(false, (sls) Q, btsVar, 0, 1);
            boolean z2 = ((i2 & 14) == 4) | (i3 == 32);
            Object Q2 = btsVar.Q();
            int i4 = 17;
            if (z2 || Q2 == o430Var) {
                Q2 = new n8a(i4, tlsVar, apbVar);
                btsVar.o0(Q2);
            }
            rz20 a = a.a(false, (sls) Q2, btsVar, 0, 5);
            boolean z3 = i3 == 32;
            Object Q3 = btsVar.Q();
            if (z3 || Q3 == o430Var) {
                Q3 = new fv9(17, tlsVar);
                btsVar.o0(Q3);
            }
            cx20.a(null, a, tnb1.e(null, (sls) Q3, btsVar, 5), null, null, false, false, wwg.S(-1868177926, true, new wg0(13, tlsVar), btsVar), wwg.S(-2132868302, true, new sp5(19, apbVar, tlsVar), btsVar), btsVar, 113246208, Constants.VPN_TRAFFIC);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mj5(apbVar, tlsVar, i, 25);
        }
    }

    public static final void c(lpb lpbVar, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2092115585);
        int i2 = (btsVar.k(lpbVar) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = n.f(lpbVar.a, btsVar);
            }
            oz40 oz40Var = (oz40) Q;
            f530 d = ooc.d(an91.o(ljs0.c(c530.a, 1.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7), null, 3);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            bpb bpbVar = lpbVar.b;
            if (bpbVar == null) {
                btsVar.e0(1294600254);
                btsVar.t(false);
            } else {
                btsVar.e0(1294600255);
                boolean booleanValue = ((Boolean) oz40Var.getValue()).booleanValue();
                Object Q2 = btsVar.Q();
                if (Q2 == o430Var) {
                    Q2 = new w01(5, oz40Var);
                    btsVar.o0(Q2);
                }
                e(booleanValue, bpbVar, (sls) Q2, btsVar, 384);
                btsVar.t(false);
            }
            if (((Boolean) oz40Var.getValue()).booleanValue()) {
                btsVar.e0(1294737802);
                g(lpbVar.c, tlsVar, btsVar, (i2 & 112) | 384);
                btsVar.t(false);
            } else {
                btsVar.e0(1294863693);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i9a(lpbVar, tlsVar, i, 15);
        }
    }

    public static final void d(final boolean z, final boolean z2, fid fidVar, final int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1014359407);
        int i2 = i | 54;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            oeb1.c(btsVar, i9a1.d(c530Var).k(i9a1.c(c530Var)));
            z = true;
            z2 = true;
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls(z, z2, i) { // from class: d7h
                public final /* synthetic */ boolean a;
                public final /* synthetic */ boolean b;

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(1);
                    m791.d(this.a, this.b, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    public static final void e(boolean z, bpb bpbVar, sls slsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1227395492);
        int i2 = 2;
        int i3 = i | (btsVar.a(z) ? 4 : 2) | (btsVar.k(bpbVar) ? 32 : 16);
        int i4 = 1;
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            String e = ohb1.e(btsVar, z ? kyh0.collapse_accessibility_description : kyh0.expand_accessibility_description);
            f530 d = q791.d(c530.a, false, null, new awk0(0), slsVar, 11);
            boolean k = btsVar.k(e);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = new b5a(e, 28);
                btsVar.o0(Q);
            }
            f530 b = fnq0.b(d, false, (tls) Q);
            r5d.a.getClass();
            ydb1.a(b, r5d.b, wwg.S(-297971797, true, new ota(i2, bpbVar), btsVar), null, wwg.S(-1467189711, true, new kj6(z, i4), btsVar), null, null, false, btsVar, 25008, 232);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mr1(z, bpbVar, slsVar, i, 5);
        }
    }

    public static final void f(ypu ypuVar, ovi0 ovi0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1799379672);
        int i2 = (btsVar.k(ypuVar) ? 4 : 2) | i | (btsVar.k(ovi0Var) ? 32 : 16);
        final int i3 = 0;
        final int i4 = 1;
        int i5 = 14;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            final byk0 c = cyk0.c(5.0f);
            final f530 a = on70.a(ljs0.c(ypuVar, 1.0f), 1.0f);
            v0b1.a(ovi0Var, a, null, wwg.S(979840807, true, new wls() { // from class: kob
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i3;
                    zy11 zy11Var = zy11.a;
                    f530 f530Var = a;
                    switch (i6) {
                        case 0:
                            fid fidVar2 = (fid) obj;
                            int intValue = ((Integer) obj2).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                                btsVar2.Y();
                                break;
                            } else {
                                com.yandex.go.design.compose.loading.b.a(an91.k(f530Var, 6.0f), c, false, null, null, null, false, btsVar2, 0, 252);
                                break;
                            }
                        default:
                            fid fidVar3 = (fid) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(1 & intValue2, (intValue2 & 3) != 2)) {
                                btsVar3.Y();
                                break;
                            } else {
                                pi6.a(m4m0.b(ymb1.l(an91.k(f530Var, 6.0f), c), ((ry2) btsVar3.m(uy2.a)).h, qke.q), btsVar3, 0);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), wwg.S(1152254888, true, new wls() { // from class: kob
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i4;
                    zy11 zy11Var = zy11.a;
                    f530 f530Var = a;
                    switch (i6) {
                        case 0:
                            fid fidVar2 = (fid) obj;
                            int intValue = ((Integer) obj2).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                                btsVar2.Y();
                                break;
                            } else {
                                com.yandex.go.design.compose.loading.b.a(an91.k(f530Var, 6.0f), c, false, null, null, null, false, btsVar2, 0, 252);
                                break;
                            }
                        default:
                            fid fidVar3 = (fid) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(1 & intValue2, (intValue2 & 3) != 2)) {
                                btsVar3.Y();
                                break;
                            } else {
                                pi6.a(m4m0.b(ymb1.l(an91.k(f530Var, 6.0f), c), ((ry2) btsVar3.m(uy2.a)).h, qke.q), btsVar3, 0);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), null, null, mhe.c, 0.0f, 0, btsVar, ((i2 >> 3) & 14) | 12610560, 868);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i9a(ypuVar, ovi0Var, i, i5);
        }
    }

    public static final void g(ArrayList arrayList, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1134948189);
        int i2 = (btsVar.k(arrayList) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            int w0 = (int) ((fwi) btsVar.m(j.h)).w0(8.0f);
            f530 m = an91.m(pw91.l(c530.a, pw91.o(btsVar), 14), 8.0f, 0.0f, 2);
            boolean c = btsVar.c(w0);
            Object Q = btsVar.Q();
            if (c || Q == did.a) {
                Q = new qob(w0);
                btsVar.o0(Q);
            }
            z910 z910Var = (z910) Q;
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
            qje.W(btsVar, d.f, z910Var);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            btsVar.e0(1322091803);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a((hob) it.next(), tlsVar, btsVar, i2 & 112);
            }
            btsVar.t(false);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lob(arrayList, tlsVar, i, i3);
        }
    }

    public static final int h(StatusAvailability statusAvailability) {
        int i = tt21.a[statusAvailability.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            if (i == 4) {
                return 1;
            }
            w511.b();
        }
        return 0;
    }

    public static final PartnerEntity i(PartnerDto partnerDto) {
        return new PartnerEntity(partnerDto.getYbId(), partnerDto.getTitle(), partnerDto.getDescription(), qxy0.c(partnerDto.getThemedImage(), partnerDto.getImageUrl()));
    }
}
