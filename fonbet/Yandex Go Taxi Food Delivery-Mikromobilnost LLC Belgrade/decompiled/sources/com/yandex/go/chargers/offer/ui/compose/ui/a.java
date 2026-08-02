package com.yandex.go.chargers.offer.ui.compose.ui;

import androidx.compose.animation.g;
import androidx.compose.animation.k;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.aib1;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b0;
import defpackage.bj0;
import defpackage.bts;
import defpackage.bzk0;
import defpackage.c530;
import defpackage.c8a;
import defpackage.cj6;
import defpackage.cma1;
import defpackage.cyk0;
import defpackage.did;
import defpackage.dmw0;
import defpackage.dr5;
import defpackage.dv9;
import defpackage.erb1;
import defpackage.et0;
import defpackage.f530;
import defpackage.fid;
import defpackage.gkb1;
import defpackage.h791;
import defpackage.hob1;
import defpackage.iib1;
import defpackage.j7a;
import defpackage.jl40;
import defpackage.ldc;
import defpackage.lg6;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.lx40;
import defpackage.ly3;
import defpackage.maa;
import defpackage.naa;
import defpackage.nc3;
import defpackage.nwa;
import defpackage.o7a;
import defpackage.oaa;
import defpackage.ohd;
import defpackage.os;
import defpackage.paa;
import defpackage.pi6;
import defpackage.pw91;
import defpackage.qab1;
import defpackage.qic;
import defpackage.qje;
import defpackage.qke;
import defpackage.r1b0;
import defpackage.r5y;
import defpackage.rb0;
import defpackage.ry2;
import defpackage.sic;
import defpackage.sj5;
import defpackage.sls;
import defpackage.sog0;
import defpackage.swa;
import defpackage.tcc;
import defpackage.tls;
import defpackage.tse0;
import defpackage.u8a;
import defpackage.up2;
import defpackage.uy2;
import defpackage.vfc;
import defpackage.w7a;
import defpackage.wg6;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.xqg0;
import defpackage.yjb1;
import defpackage.ymb1;
import defpackage.z0a0;
import defpackage.z910;
import defpackage.zpn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public abstract class a {
    public static final void a(paa paaVar, z0a0 z0a0Var, u8a u8aVar, String str, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1034262388);
        int i2 = i | (btsVar.k(paaVar) ? 4 : 2) | (btsVar.k(z0a0Var) ? 32 : 16) | (btsVar.k(u8aVar) ? 256 : 128) | (btsVar.k(str) ? 2048 : 1024) | (btsVar.e(tlsVar) ? 16384 : 8192);
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            wg6 a = com.yandex.go.design.compose.modal.bottomsheet.b.a(false, 0.0f, null, false, null, null, null, null, btsVar, 438, 48, 6136);
            lg6 c = qab1.c(a, new up2(ldc.l), null, btsVar, 432, 0);
            lx40 f = erb1.f(a, true, 0, btsVar, 48, 6);
            boolean z = ((i2 & 14) == 4) | ((i2 & HProv.ALG_CLASS_ALL) == 16384);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new ChargersOfferScreenKt$ChargersOfferScreen$1$1(paaVar, tlsVar, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, paaVar);
            com.yandex.go.design.compose.modal.bottomsheet.c.a(null, a, c, false, false, null, null, wwg.S(1083086950, true, new sj5(!u8aVar.a ? 48.0f : u8aVar.b ? 220.0f : 150.0f, tlsVar, 1), btsVar), null, null, wwg.S(-1910080280, true, new o7a(paaVar, z0a0Var, str, tlsVar), btsVar), wwg.S(611294228, true, new dr5(paaVar, tlsVar, a, f), btsVar), btsVar, 12585984, 54, 881);
            btsVar = btsVar;
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b0(paaVar, z0a0Var, u8aVar, str, tlsVar, i, 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v7 */
    public static final void b(oaa oaaVar, tls tlsVar, tls tlsVar2, tls tlsVar3, tls tlsVar4, tls tlsVar5, f530 f530Var, fid fidVar, int i) {
        tls tlsVar6;
        tls tlsVar7;
        tls tlsVar8;
        List list;
        Object obj;
        nwa nwaVar;
        c8a c8aVar;
        ?? r5;
        w7a w7aVar;
        swa swaVar;
        boolean z;
        Object obj2;
        tls tlsVar9 = tlsVar3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(280732017);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.e(oaaVar) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16) | (btsVar.e(tlsVar2) ? 256 : 128) | (btsVar.e(tlsVar9) ? 2048 : 1024) | (btsVar.e(tlsVar4) ? 16384 : 8192) | (btsVar.e(tlsVar5) ? 131072 : 65536) | (btsVar.k(f530Var) ? 1048576 : 524288);
        if (btsVar.V(i2 & 1, (599187 & i2) != 599186)) {
            c8a c8aVar2 = oaaVar.d;
            boolean z2 = oaaVar.h;
            ArrayList<naa> arrayList = oaaVar.i;
            swa swaVar2 = c8aVar2.i;
            List list2 = c8aVar2.j;
            if (list2 != null) {
                List list3 = list2;
                if (list3.isEmpty()) {
                    list3 = null;
                }
                list = list3;
            } else {
                list = null;
            }
            w7a w7aVar2 = c8aVar2.d;
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            for (naa naaVar : arrayList) {
                dmw0 dmw0Var2 = dmw0Var;
                arrayList2.add(new nwa(false, naaVar.b, naaVar.a));
                z2 = z2;
                dmw0Var = dmw0Var2;
                swaVar2 = swaVar2;
                arrayList = arrayList;
            }
            dmw0 dmw0Var3 = dmw0Var;
            boolean z3 = z2;
            swa swaVar3 = swaVar2;
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((naa) obj).c) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            naa naaVar2 = (naa) obj;
            if (naaVar2 != null) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (jl40.l(((nwa) obj2).a, naaVar2.a)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                nwaVar = (nwa) obj2;
            } else {
                nwaVar = null;
            }
            f530 c = bzk0.c(ymb1.l(f530Var, cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12)), AppColor$Palette.Background, qke.q);
            z910 d = pi6.d(x4c.b, false);
            nwa nwaVar2 = nwaVar;
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
            if (dmw0Var3 == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = androidx.compose.ui.node.d.f;
            qje.W(btsVar, wlsVar, d);
            wls wlsVar2 = androidx.compose.ui.node.d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = androidx.compose.ui.node.d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar10 = androidx.compose.ui.node.d.h;
            qje.M(btsVar, tlsVar10);
            wls wlsVar4 = androidx.compose.ui.node.d.d;
            qje.W(btsVar, wlsVar4, d2);
            c530 c530Var = c530.a;
            f530 u = pw91.u(ljs0.c(c530Var, 1.0f), pw91.o(btsVar), 14);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = androidx.compose.ui.b.d(btsVar, u);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar10);
            qje.W(btsVar, wlsVar4, d3);
            iib1.a(c8aVar2.e, c8aVar2.b, c8aVar2.c, btsVar, 0);
            if (arrayList2.isEmpty() || nwaVar2 == null || !z3) {
                c8aVar = c8aVar2;
                r5 = 0;
                w7aVar = w7aVar2;
                swaVar = swaVar3;
                z = true;
                btsVar.e0(-1506613771);
                btsVar.t(false);
            } else {
                tse0.s(btsVar, -1506850177, c530Var, 8.0f, btsVar);
                f530 m = an91.m(c530Var, 14.0f, 0.0f, 2);
                boolean z4 = (458752 & i2) == 131072;
                Object Q = btsVar.Q();
                if (z4 || Q == did.a) {
                    Q = new dv9(11, tlsVar5);
                    btsVar.o0(Q);
                }
                tls tlsVar11 = (tls) Q;
                c8aVar = c8aVar2;
                w7aVar = w7aVar2;
                r5 = 0;
                swaVar = swaVar3;
                z = true;
                h791.b(m, arrayList2, nwaVar2, tlsVar11, null, btsVar, 6);
                btsVar.t(false);
            }
            if (swaVar != null) {
                tse0.s(btsVar, -1506570340, c530Var, 8.0f, btsVar);
                if (z3) {
                    btsVar.e0(-1506507565);
                    tlsVar6 = tlsVar;
                    tlsVar7 = tlsVar2;
                    yjb1.a(swaVar, tlsVar6, tlsVar7, btsVar, (i2 & 112) | 8 | (i2 & 896));
                    btsVar.t(r5);
                } else {
                    tlsVar6 = tlsVar;
                    tlsVar7 = tlsVar2;
                    btsVar.e0(-1506277483);
                    gkb1.a(swaVar, tlsVar6, tlsVar7, btsVar, (i2 & 112) | 8 | (i2 & 896));
                    btsVar.t(r5);
                }
                btsVar.t(r5);
            } else {
                tlsVar6 = tlsVar;
                tlsVar7 = tlsVar2;
                btsVar.e0(-1506054283);
                btsVar.t(r5);
            }
            if (w7aVar != null) {
                tse0.s(btsVar, -1506022911, c530Var, 8.0f, btsVar);
                tlsVar8 = tlsVar4;
                j7a.a(w7aVar, tlsVar8, btsVar, ((i2 >> 9) & 112) | 8);
                btsVar.t(r5);
            } else {
                tlsVar8 = tlsVar4;
                btsVar.e0(-1505880683);
                btsVar.t(r5);
            }
            if (list != null) {
                tse0.s(btsVar, -1505848257, c530Var, 8.0f, btsVar);
                tlsVar9 = tlsVar3;
                aib1.a(c8aVar.j, tlsVar9, btsVar, (i2 >> 6) & 112);
                btsVar.t(r5);
            } else {
                tlsVar9 = tlsVar3;
                btsVar.e0(-1505673355);
                btsVar.t(r5);
            }
            ly3.B(c530Var, 24.0f, btsVar, z);
            if (oaaVar.g) {
                btsVar.e0(-1666446200);
                d(cj6.a.b(c530Var), btsVar, r5);
                btsVar.t(r5);
            } else {
                btsVar.e0(-1666381813);
                btsVar.t(r5);
            }
            btsVar.t(z);
        } else {
            tlsVar6 = tlsVar;
            tlsVar7 = tlsVar2;
            tlsVar8 = tlsVar4;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new et0(oaaVar, tlsVar6, tlsVar7, tlsVar9, tlsVar8, tlsVar5, f530Var, i, 4);
        }
    }

    public static final void c(f530 f530Var, paa paaVar, nc3 nc3Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1391060858);
        int i2 = i | (btsVar2.k(f530Var) ? 4 : 2) | (btsVar2.k(paaVar) ? 32 : 16) | (btsVar2.k(nc3Var) ? 256 : 128) | (btsVar2.e(tlsVar) ? 2048 : 1024);
        if (btsVar2.V(i2 & 1, (i2 & 1171) != 1170)) {
            btsVar = btsVar2;
            g.e(paaVar instanceof maa, null, k.e(null, 3), k.f(null, 3), null, wwg.S(807120734, true, new bj0(28, f530Var), btsVar2), btsVar, 200064, 18);
            g.e(paaVar instanceof oaa, null, k.e(null, 3), k.f(null, 3), null, wwg.S(-98921899, true, new r5y(paaVar, f530Var, nc3Var, tlsVar, 3), btsVar), btsVar, 200064, 18);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new rb0((Object) f530Var, (Object) paaVar, (Object) nc3Var, tlsVar, i, 15);
        }
    }

    public static final void d(f530 f530Var, fid fidVar, int i) {
        f530 f530Var2;
        long a;
        long a2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1563167616);
        int i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        int i3 = 12;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            boolean z = ((ry2) btsVar.m(uy2.a)).b;
            if (z) {
                btsVar.e0(2004095135);
                a = hob1.a(btsVar, xqg0.transparent_50_white);
                btsVar.t(false);
            } else {
                btsVar.e0(2004167272);
                a = hob1.a(btsVar, sog0.shimmer_edge_dark);
                btsVar.t(false);
            }
            int i4 = up2.c;
            if (z) {
                btsVar.e0(2004285010);
                a2 = hob1.a(btsVar, xqg0.white);
                btsVar.t(false);
            } else {
                btsVar.e0(2004338919);
                a2 = hob1.a(btsVar, sog0.shimmering_center_dark);
                btsVar.t(false);
            }
            f530Var2 = f530Var;
            com.yandex.go.design.compose.loading.b.a(f530Var2, cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12), false, null, new up2(a), new up2(a2), false, btsVar, i2 & 14, 156);
        } else {
            f530Var2 = f530Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new os(f530Var2, i, i3);
        }
    }
}
