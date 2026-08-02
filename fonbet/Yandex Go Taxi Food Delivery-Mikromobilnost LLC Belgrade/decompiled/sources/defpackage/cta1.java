package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes11.dex */
public abstract class cta1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    public static final void a(final zxu zxuVar, final tls tlsVar, tls tlsVar2, f530 f530Var, fid fidVar, int i) {
        final tls tlsVar3;
        bts btsVar;
        boolean z;
        o430 o430Var;
        int i2;
        i1v i1vVar;
        ?? r0;
        bts btsVar2;
        bts btsVar3 = (bts) fidVar;
        btsVar3.g0(425255072);
        dmw0 dmw0Var = btsVar3.a;
        int i3 = i | (btsVar3.k(zxuVar) ? 4 : 2) | (btsVar3.e(tlsVar) ? 32 : 16) | (btsVar3.e(tlsVar2) ? 256 : 128) | (btsVar3.k(f530Var) ? 2048 : 1024);
        final int i4 = 0;
        if (btsVar3.V(i3 & 1, (i3 & 1171) != 1170)) {
            f530 e = ljs0.e(hbb1.b(f530Var, dbb1.c(btsVar3), cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12), false, 12), 48.0f);
            wp2 wp2Var = zxuVar.e;
            i1v i1vVar2 = zxuVar.i;
            f530 c = bzk0.c(e, wp2Var, cyk0.a);
            int i5 = i3 & 14;
            boolean z2 = ((i3 & 112) == 32) | (i5 == 4);
            Object Q = btsVar3.Q();
            o430 o430Var2 = did.a;
            if (z2 || Q == o430Var2) {
                Q = new sls() { // from class: vzr
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i6 = i4;
                        zy11 zy11Var = zy11.a;
                        zxu zxuVar2 = zxuVar;
                        tls tlsVar4 = tlsVar;
                        switch (i6) {
                            case 0:
                                tlsVar4.invoke(zxuVar2);
                                break;
                            default:
                                tlsVar4.invoke(zxuVar2.i);
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar3.o0(Q);
            }
            f530 b = q791.b(c, null, null, false, null, new awk0(0), (sls) Q, 12);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar3.T);
            r1b0 o = btsVar3.o();
            f530 d2 = b.d(btsVar3, b);
            ohd.G1.getClass();
            sls slsVar = d.b;
            ywy ywyVar = null;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar3.i0();
            if (btsVar3.S) {
                btsVar3.n(slsVar);
            } else {
                btsVar3.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar3, wlsVar, d);
            wls wlsVar2 = d.e;
            qje.W(btsVar3, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar3, wlsVar3, valueOf);
            tls tlsVar4 = d.h;
            qje.M(btsVar3, tlsVar4);
            wls wlsVar4 = d.d;
            qje.W(btsVar3, wlsVar4, d2);
            uo5 uo5Var = x4c.y;
            cj6 cj6Var = cj6.a;
            c530 c530Var = c530.a;
            f530 a = cj6Var.a(c530Var, uo5Var);
            lhl0 a2 = khl0.a(lr20.a, x4c.E, btsVar3, 48);
            int hashCode2 = Long.hashCode(btsVar3.T);
            r1b0 o2 = btsVar3.o();
            f530 d3 = b.d(btsVar3, a);
            btsVar3.i0();
            int i6 = i5;
            if (btsVar3.S) {
                btsVar3.n(slsVar);
            } else {
                btsVar3.r0();
            }
            qje.W(btsVar3, wlsVar, a2);
            qje.W(btsVar3, wlsVar2, o2);
            vfc.v(hashCode2, btsVar3, wlsVar3, btsVar3, tlsVar4);
            qje.W(btsVar3, wlsVar4, d3);
            nvi0 nvi0Var = zxuVar.d;
            if (nvi0Var == null) {
                btsVar3.e0(-1218513969);
                z = false;
            } else {
                z = false;
                btsVar3.e0(-1218513968);
                ywyVar = (ywy) ffb1.f(nvi0Var, btsVar3, 0).getValue();
            }
            btsVar3.t(z);
            vwy vwyVar = vwy.a;
            ywy ywyVar2 = ywyVar == null ? vwyVar : ywyVar;
            if (ywyVar2.equals(vwyVar)) {
                btsVar3.e0(237791758);
                btsVar3.t(z);
                r0 = z;
                o430Var = o430Var2;
                i1vVar = i1vVar2;
                i2 = i3;
                btsVar2 = btsVar3;
            } else if (ywyVar2.equals(wwy.a)) {
                btsVar3.e0(237793151);
                o430Var = o430Var2;
                boolean z3 = z;
                i2 = i3;
                com.yandex.go.design.compose.loading.b.a(ljs0.a(an91.o(c530Var, 10.0f, 0.0f, 0.0f, 0.0f, 14), 24.0f, 24.0f), null, false, null, null, null, false, btsVar3, 6, 254);
                btsVar3.t(z3);
                i1vVar = i1vVar2;
                r0 = z3;
                btsVar2 = btsVar3;
            } else {
                boolean z4 = z;
                o430Var = o430Var2;
                i2 = i3;
                if (!(ywyVar2 instanceof xwy)) {
                    throw unr0.y(237790400, btsVar3, z4);
                }
                btsVar3.e0(-1218161436);
                i1vVar = i1vVar2;
                i6 = i6;
                boolean z5 = z4;
                j4b1.c(((xwy) ywyVar2).a, an91.o(c530Var, 10.0f, 0.0f, 0.0f, 0.0f, 14), null, null, null, null, 0.0f, 0, btsVar3, 48, 252);
                bts btsVar4 = btsVar3;
                btsVar4.t(z5);
                r0 = z5;
                btsVar2 = btsVar4;
            }
            f530 o3 = an91.o(c530Var, ywyVar2 instanceof vwy ? 14.0f : 6.0f, 13.0f, 0.0f, 13.0f, 4);
            Object Q2 = btsVar2.Q();
            o430 o430Var3 = o430Var;
            if (Q2 == o430Var3) {
                Q2 = new teb(20);
                btsVar2.o0(Q2);
            }
            bts btsVar5 = btsVar2;
            jeb1.f(zxuVar.b, fnq0.a(o3, (tls) Q2), zxuVar.c, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar2).h.a, btsVar5, 0, 0, 16376);
            bts btsVar6 = btsVar5;
            if (i1vVar != null) {
                btsVar6.e0(-1217642806);
                ovi0 ovi0Var = i1vVar.b;
                boolean z6 = (i6 == 4 ? true : r0) | ((i2 & 896) == 256 ? true : r0);
                Object Q3 = btsVar6.Q();
                if (z6 || Q3 == o430Var3) {
                    tlsVar3 = tlsVar2;
                    final int i7 = 1;
                    Q3 = new sls() { // from class: vzr
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i62 = i7;
                            zy11 zy11Var = zy11.a;
                            zxu zxuVar2 = zxuVar;
                            tls tlsVar42 = tlsVar3;
                            switch (i62) {
                                case 0:
                                    tlsVar42.invoke(zxuVar2);
                                    break;
                                default:
                                    tlsVar42.invoke(zxuVar2.i);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    btsVar6.o0(Q3);
                } else {
                    tlsVar3 = tlsVar2;
                }
                c(ovi0Var, (sls) Q3, btsVar6, r0);
                btsVar6.t(r0);
            } else {
                tlsVar3 = tlsVar2;
                btsVar6.e0(-1217468183);
                oeb1.c(btsVar6, ljs0.q(c530Var, 14.0f));
                btsVar6.t(r0);
            }
            btsVar6.t(true);
            btsVar6.t(true);
            btsVar = btsVar6;
        } else {
            tlsVar3 = tlsVar2;
            btsVar3.Y();
            btsVar = btsVar3;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wzr((Object) zxuVar, (Object) tlsVar, (Object) tlsVar3, (Object) f530Var, i, 0);
        }
    }

    public static final void b(final bpl0 bpl0Var, final tls tlsVar, final tls tlsVar2, final f530 f530Var, fid fidVar, final int i) {
        bpl0 bpl0Var2;
        tls tlsVar3;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1626512390);
        int i2 = i | (btsVar.k(bpl0Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16) | (btsVar.e(tlsVar2) ? 256 : 128) | (btsVar.k(f530Var) ? 2048 : 1024);
        if (!btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            bpl0Var2 = bpl0Var;
            tlsVar3 = tlsVar;
            btsVar.Y();
        } else {
            if (bpl0Var == null) {
                v = btsVar.v();
                if (v != null) {
                    final int i3 = 0;
                    wlsVar = new wls(bpl0Var, tlsVar, tlsVar2, f530Var, i, i3) { // from class: tzr
                        public final /* synthetic */ int a;
                        public final /* synthetic */ bpl0 b;
                        public final /* synthetic */ tls c;
                        public final /* synthetic */ tls w;
                        public final /* synthetic */ f530 x;

                        {
                            this.a = i3;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = this.a;
                            zy11 zy11Var = zy11.a;
                            switch (i4) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int O = vng.O(1);
                                    cta1.b(this.b, this.c, this.w, this.x, (fid) obj, O);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int O2 = vng.O(1);
                                    cta1.b(this.b, this.c, this.w, this.x, (fid) obj, O2);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            bpl0Var2 = bpl0Var;
            tlsVar3 = tlsVar;
            f530 c = ljs0.c(an91.m(hbb1.b(f530Var, dbb1.c(btsVar), cyk0.e(16.0f, 16.0f, 0.0f, 0.0f, 12), false, 12), 0.0f, 8.0f, 1), 1.0f);
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new uzr(r12, bpl0Var2);
                btsVar.o0(Q);
            }
            f530 b = fnq0.b(c, false, (tls) Q);
            l690 b2 = an91.b(8.0f, 0.0f, 2);
            i43 i43Var = new i43(4.0f, true, new quz(11));
            int i5 = (i4 == 4 ? 1 : 0) | ((i2 & 112) == 32 ? 1 : 0) | ((i2 & 896) == 256 ? 1 : 0);
            Object Q2 = btsVar.Q();
            if (i5 != 0 || Q2 == o430Var) {
                Q2 = new ynn(bpl0Var2, tlsVar3, tlsVar2, 3);
                btsVar.o0(Q2);
            }
            adb1.b(b, null, b2, i43Var, null, null, false, null, (tls) Q2, btsVar, 24960, 490);
        }
        v = btsVar.v();
        if (v != null) {
            final int i6 = 1;
            final bpl0 bpl0Var3 = bpl0Var2;
            final tls tlsVar4 = tlsVar3;
            wlsVar = new wls(bpl0Var3, tlsVar4, tlsVar2, f530Var, i, i6) { // from class: tzr
                public final /* synthetic */ int a;
                public final /* synthetic */ bpl0 b;
                public final /* synthetic */ tls c;
                public final /* synthetic */ tls w;
                public final /* synthetic */ f530 x;

                {
                    this.a = i6;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = this.a;
                    zy11 zy11Var = zy11.a;
                    switch (i42) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int O = vng.O(1);
                            cta1.b(this.b, this.c, this.w, this.x, (fid) obj, O);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int O2 = vng.O(1);
                            cta1.b(this.b, this.c, this.w, this.x, (fid) obj, O2);
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }

    public static final void c(ovi0 ovi0Var, sls slsVar, fid fidVar, int i) {
        sls slsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1921692446);
        int i2 = (btsVar.k(ovi0Var) ? 4 : 2) | i | (btsVar.e(slsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            slsVar2 = slsVar;
            f530 d = u3a1.d(q791.d(ymb1.l(ljs0.m(an91.m(c530.a, 4.0f, 0.0f, 2), 28.0f), cyk0.a), false, null, null, slsVar, 15), "app_hub_filter_reset");
            z910 d2 = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d3 = b.d(btsVar, d);
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
            qje.W(btsVar, d.f, d2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d3);
            v0b1.a(ovi0Var, null, null, null, null, null, null, null, 0.0f, 0, btsVar, i2 & 14, 1022);
            btsVar.t(true);
        } else {
            slsVar2 = slsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new a6n(ovi0Var, slsVar2, i, 15);
        }
    }

    public static final String d(DriveState driveState) {
        switch (driveState == null ? -1 : n42.a[driveState.ordinal()]) {
            case 1:
            case 2:
                return "Scheduled";
            case 3:
                return "Search";
            case 4:
                return "Driving";
            case 5:
                return "CheckIn";
            case 6:
                return "Waiting";
            case 7:
                return "Transporting";
            case 8:
                return CA20Status.STATUS_REQUEST_DESCRIPTION_C;
            case 9:
                return "Cancelled";
            case 10:
                return "Failed ";
            case 11:
                return CA20Status.STATUS_CERTIFICATE_DESCRIPTION_E;
            default:
                return "";
        }
    }

    public static final boolean e(su30 su30Var) {
        List<hz30> list = su30Var.a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (hz30 hz30Var : list) {
                if (hz30Var instanceof r440) {
                    MtTransportType mtTransportType = ((r440) hz30Var).f().b;
                    mtTransportType.getClass();
                    if (mtTransportType == MtTransportType.AEROEXPRESS || mtTransportType == MtTransportType.AEROEXPRESS_BUS) {
                        return true;
                    }
                }
            }
        }
        List<hz30> list2 = su30Var.a;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (hz30 hz30Var2 : list2) {
            if (hz30Var2 instanceof jm30) {
                jm30 jm30Var = (jm30) hz30Var2;
                if (jm30Var.b) {
                    return true;
                }
                MtTransportType mtTransportType2 = jm30Var.f().d.b;
                mtTransportType2.getClass();
                if (mtTransportType2 == MtTransportType.AEROEXPRESS_BUS) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean f(s4r0 s4r0Var, Collection collection) {
        collection.getClass();
        if (collection instanceof gd91) {
            collection = ((gd91) collection).zza();
        }
        boolean z = false;
        if (!(collection instanceof Set) || collection.size() <= s4r0Var.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z |= s4r0Var.remove(it.next());
            }
            return z;
        }
        Iterator<E> it2 = s4r0Var.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                z = true;
            }
        }
        return z;
    }
}
