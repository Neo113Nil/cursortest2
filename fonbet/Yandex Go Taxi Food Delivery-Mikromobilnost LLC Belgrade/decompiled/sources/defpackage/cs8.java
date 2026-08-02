package defpackage;

import android.app.Activity;
import android.view.WindowManager;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.core.app.w0;
import androidx.core.graphics.drawable.IconCompat;
import androidx.room.RoomDatabase;
import com.yandex.go.chargers.offer.ChargersOfferStationOpenReason;
import com.yandex.go.chargers.offer.domain.c;
import com.yandex.go.chargers.offer.ui.compose.ui.e;
import com.yandex.go.chargers.surge.info.ChargersSurgeInfoRouter$content$lambda$0$$inlined$start$1;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.mapkit.directions.Directions;
import com.ybsdk.feature.change.payment.method.internal.ui.ChangePaymentMethodFragment;
import defpackage.bts;
import defpackage.cea;
import defpackage.did;
import defpackage.ewa;
import defpackage.fid;
import defpackage.jaa;
import defpackage.kxa;
import defpackage.mxa;
import defpackage.oz40;
import defpackage.paa;
import defpackage.rzo;
import defpackage.t;
import defpackage.t7a;
import defpackage.tje;
import defpackage.u7a;
import defpackage.u8a;
import defpackage.wls;
import defpackage.wwg;
import defpackage.xfd;
import defpackage.zpn;
import defpackage.zva;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ru.yandex.logistics.care.ui.a;
import ru.yandex.logistics.care.ui.l;
import ru.yandex.taxi.HapticController$Effect;

/* loaded from: classes13.dex */
public final /* synthetic */ class cs8 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cs8(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 onViewCreated$lambda$0;
        long j;
        int i = this.a;
        int i2 = 6;
        int i3 = 3;
        int i4 = 2;
        int i5 = 9;
        final int i6 = 0;
        String str = null;
        final int i7 = 1;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                Activity activity = (Activity) obj3;
                rs8 rs8Var = (rs8) obj2;
                if (activity != null) {
                    if (rs8Var instanceof ms8) {
                        ozd ozdVar = ((ms8) rs8Var).a.c;
                        mzd mzdVar = ozdVar instanceof mzd ? (mzd) ozdVar : null;
                        if (mzdVar != null && mzdVar.c) {
                            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
                            attributes.screenBrightness = 1.0f;
                            activity.getWindow().setAttributes(attributes);
                        }
                    }
                    kf91.c(activity);
                }
                return new fs8(activity, i6);
            case 1:
                jt8 jt8Var = (jt8) obj3;
                return new l(jt8Var.h, jt8Var.b, new a((fza0) obj2), jt8Var.f, jt8Var.e, jt8Var.g);
            case 2:
                return new te4(i7, (vt8) obj3, (wm41) obj2);
            case 3:
                tls tlsVar = (tls) obj2;
                u6y u6yVar = (u6y) obj;
                bpl0 bpl0Var = ((hz8) obj3).a;
                List list = bpl0Var.a;
                wls wlsVar = bpl0Var.b;
                ((m6y) u6yVar).f(list.size(), wlsVar != null ? new qq5(1, wlsVar, list) : null, new qc0(list, 5), new androidx.compose.runtime.internal.a(-930734472, new zx8(list, tlsVar, i6), true));
                return zy11Var;
            case 4:
                nz8 nz8Var = (nz8) obj3;
                tls tlsVar2 = (tls) obj2;
                ux8 ux8Var = (ux8) obj;
                qke.E(nz8Var.a.getContext(), HapticController$Effect.TICK, false, 8);
                uhj0 uhj0Var = nz8Var.T;
                int i8 = -1;
                if (uhj0Var != null) {
                    Iterator it = uhj0Var.c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i6 = -1;
                        } else if (!jl40.l(((ux8) it.next()).getId(), ux8Var.getId())) {
                            i6++;
                        }
                    }
                    Integer valueOf = i6 != -1 ? Integer.valueOf(i6) : null;
                    if (valueOf != null) {
                        i8 = valueOf.intValue();
                    }
                }
                tlsVar2.invoke(new ey8(ux8Var, i8));
                return zy11Var;
            case 5:
                ((j24) obj3).invoke(((Directions) obj).createCarparksLayer(((rz8) obj2).d.getValue().getMapWindow()));
                return zy11Var;
            case 6:
                return q791.d((f530) obj, false, null, null, new u08(11, (tls) obj3, (y09) obj2), 15);
            case 7:
                String str2 = (String) obj2;
                l020 l020Var = (l020) obj;
                jdb jdbVar = l020Var.B;
                long j2 = ((o1b0) obj3).a;
                kcb z = jdbVar.b.z();
                RoomDatabase roomDatabase = z.a;
                if (((Boolean) androidx.room.util.a.b(roomDatabase, true, false, new hcb(j2, i7))).booleanValue()) {
                    androidx.room.util.a.b(z.a, false, true, new icb(z, new lcb(j2, str2), i6));
                } else {
                    androidx.room.util.a.b(roomDatabase, false, true, new icb(z, new lcb(j2, str2), i7));
                }
                ((HashMap) l020Var.z.f.getValue()).put(Long.valueOf(j2), str2);
                return zy11Var;
            case 8:
                onViewCreated$lambda$0 = ChangePaymentMethodFragment.onViewCreated$lambda$0((ChangePaymentMethodFragment) obj3, (bnp0) obj2, ((Boolean) obj).booleanValue());
                return onViewCreated$lambda$0;
            case 9:
                uv6 uv6Var = (uv6) obj3;
                yfd yfdVar = (yfd) obj2;
                ud9 ud9Var = (ud9) obj;
                if (jl40.l(ud9Var, sd9.a)) {
                    ((ycq0) uv6Var.I).b(((qd9) ((agd) yfdVar).a).e);
                    uv6Var.r(new qu(i5));
                } else {
                    if (!jl40.l(ud9Var, td9.a)) {
                        w511.b();
                        return null;
                    }
                    uv6Var.r(new qu(i5));
                }
                return zy11Var;
            case 10:
                IconCompat iconCompat = (IconCompat) obj3;
                com.yandex.messaging.internal.authorized.chat.notifications.builder.a aVar = (com.yandex.messaging.internal.authorized.chat.notifications.builder.a) obj2;
                w0 w0Var = new w0();
                String str3 = ((ii60) obj).f;
                if (str3 != null) {
                    aVar.b.getClass();
                    str = str3;
                }
                w0Var.a = str;
                w0Var.b = iconCompat;
                return w0Var.a();
            case 11:
                final ft9 ft9Var = (ft9) obj3;
                u6y u6yVar2 = (u6y) obj;
                u6y.b(u6yVar2, null, new androidx.compose.runtime.internal.a(583853937, new zls() { // from class: ts9
                    @Override // defpackage.zls
                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        int i9 = i6;
                        zy11 zy11Var2 = zy11.a;
                        c530 c530Var = c530.a;
                        ft9 ft9Var2 = ft9Var;
                        switch (i9) {
                            case 0:
                                fid fidVar = (fid) obj5;
                                int intValue = ((Integer) obj6).intValue();
                                bts btsVar = (bts) fidVar;
                                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                                    qgy.b(ft9Var2.a, null, an91.n(ljs0.c(c530Var, 1.0f), 16.0f, 16.0f, 16.0f, 12.0f), AppColor$Palette.Text, 0L, 0L, new sjy0(5), 0L, 0, 0, 0, xya1.d(btsVar).e.c, null, btsVar, 3456, 0, 12146);
                                } else {
                                    btsVar.Y();
                                }
                                return zy11Var2;
                            default:
                                fid fidVar2 = (fid) obj5;
                                int intValue2 = ((Integer) obj6).intValue();
                                bts btsVar2 = (bts) fidVar2;
                                if (btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    so5 so5Var = x4c.H;
                                    f530 o = an91.o(ljs0.c(c530Var, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13);
                                    sic a = qic.a(lr20.c, so5Var, btsVar2, 48);
                                    int hashCode = Long.hashCode(btsVar2.T);
                                    r1b0 o2 = btsVar2.o();
                                    f530 d = b.d(btsVar2, o);
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
                                    qje.W(btsVar2, d.f, a);
                                    qje.W(btsVar2, d.e, o2);
                                    qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
                                    qje.M(btsVar2, d.h);
                                    qje.W(btsVar2, d.d, d);
                                    if (ft9Var2.d) {
                                        btsVar2.e0(1098560828);
                                        jeb1.f(ohb1.e(btsVar2, kyh0.chargers_discounts_stations_paging_error), an91.o(ljs0.c(c530Var, 1.0f), 16.0f, 0.0f, 16.0f, 12.0f, 2), AppColor$Palette.TextMinor, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.e(btsVar2).h.a, btsVar2, 432, 0, 16248);
                                        btsVar2 = btsVar2;
                                        btsVar2.t(false);
                                    } else {
                                        btsVar2.e0(1098945600);
                                        btsVar2.t(false);
                                    }
                                    efb1.b(24.0f, 0.0f, AppColor$Palette.TextMinor, btsVar2, 438, 0);
                                    btsVar2.t(true);
                                } else {
                                    btsVar2.Y();
                                }
                                return zy11Var2;
                        }
                    }
                }, true), 3);
                List list2 = ft9Var.b;
                m6y m6yVar = (m6y) u6yVar2;
                m6yVar.f(list2.size(), null, new qc0(list2, i2), new androidx.compose.runtime.internal.a(2039820996, new yc0(list2, (tls) obj2, i4, ft9Var), true));
                if (ft9Var.c) {
                    u6y.b(m6yVar, null, new androidx.compose.runtime.internal.a(-363642996, new zls() { // from class: ts9
                        @Override // defpackage.zls
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            int i9 = i7;
                            zy11 zy11Var2 = zy11.a;
                            c530 c530Var = c530.a;
                            ft9 ft9Var2 = ft9Var;
                            switch (i9) {
                                case 0:
                                    fid fidVar = (fid) obj5;
                                    int intValue = ((Integer) obj6).intValue();
                                    bts btsVar = (bts) fidVar;
                                    if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                                        qgy.b(ft9Var2.a, null, an91.n(ljs0.c(c530Var, 1.0f), 16.0f, 16.0f, 16.0f, 12.0f), AppColor$Palette.Text, 0L, 0L, new sjy0(5), 0L, 0, 0, 0, xya1.d(btsVar).e.c, null, btsVar, 3456, 0, 12146);
                                    } else {
                                        btsVar.Y();
                                    }
                                    return zy11Var2;
                                default:
                                    fid fidVar2 = (fid) obj5;
                                    int intValue2 = ((Integer) obj6).intValue();
                                    bts btsVar2 = (bts) fidVar2;
                                    if (btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        so5 so5Var = x4c.H;
                                        f530 o = an91.o(ljs0.c(c530Var, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13);
                                        sic a = qic.a(lr20.c, so5Var, btsVar2, 48);
                                        int hashCode = Long.hashCode(btsVar2.T);
                                        r1b0 o2 = btsVar2.o();
                                        f530 d = b.d(btsVar2, o);
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
                                        qje.W(btsVar2, d.f, a);
                                        qje.W(btsVar2, d.e, o2);
                                        qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
                                        qje.M(btsVar2, d.h);
                                        qje.W(btsVar2, d.d, d);
                                        if (ft9Var2.d) {
                                            btsVar2.e0(1098560828);
                                            jeb1.f(ohb1.e(btsVar2, kyh0.chargers_discounts_stations_paging_error), an91.o(ljs0.c(c530Var, 1.0f), 16.0f, 0.0f, 16.0f, 12.0f, 2), AppColor$Palette.TextMinor, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.e(btsVar2).h.a, btsVar2, 432, 0, 16248);
                                            btsVar2 = btsVar2;
                                            btsVar2.t(false);
                                        } else {
                                            btsVar2.e0(1098945600);
                                            btsVar2.t(false);
                                        }
                                        efb1.b(24.0f, 0.0f, AppColor$Palette.TextMinor, btsVar2, 438, 0);
                                        btsVar2.t(true);
                                    } else {
                                        btsVar2.Y();
                                    }
                                    return zy11Var2;
                            }
                        }
                    }, true), 3);
                }
                return zy11Var;
            case 12:
                ((rpa) ((c06) obj3).a).Ig((ir9) obj);
                vt9 vt9Var = ((tt9) obj2).a;
                yoj yojVar = (yoj) vt9Var.x;
                if (yojVar != null) {
                    vt9Var.r(new od9(i2, yojVar));
                }
                return zy11Var;
            case 13:
                final u7a u7aVar = (u7a) obj3;
                final tla tlaVar = (tla) obj2;
                yfd yfdVar2 = (yfd) obj;
                qaa qaaVar = u7aVar.V;
                c29 c29Var = u7aVar.Z;
                String str4 = ((s7a) ((agd) yfdVar2).a).c;
                bc bcVar = qaaVar.a;
                final e eVar = new e((vn9) ((xvf0) bcVar.a).get(), (tt2) ((xvf0) bcVar.b).get(), (em9) ((uxf) bcVar.c).get(), (com.yandex.go.chargers.offer.domain.b) ((zs0) bcVar.w).get(), (g6a) ((xvf0) bcVar.x).get(), str4, c29Var);
                u7aVar.a0 = eVar;
                agd agdVar = (agd) yfdVar2;
                s7a s7aVar = (s7a) agdVar.a;
                agdVar.c = eVar.a(s7aVar.a, s7aVar.b);
                kaa kaaVar = u7aVar.W;
                tsa tsaVar = s7aVar.a;
                c29 c29Var2 = u7aVar.Z;
                boj0 boj0Var = kaaVar.a;
                final com.yandex.go.chargers.offer.ui.compose.ui.b bVar = new com.yandex.go.chargers.offer.ui.compose.ui.b((em9) ((uxf) boj0Var.b).get(), (c) ((kj7) boj0Var.c).get(), (com.yandex.go.chargers.offer.domain.b) ((xvf0) boj0Var.w).get(), (o9a) ((xvf0) boj0Var.x).get(), (k9a) ((xvf0) boj0Var.y).get(), (i8a) ((xvf0) boj0Var.z).get(), tsaVar, c29Var2);
                agdVar.e = new tls() { // from class: com.yandex.go.chargers.offer.ui.compose.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj4) {
                        tje.N(u7a.this.o(), null, null, new ChargersOfferComposeRouter$content$1$1$1(bVar, (jaa) obj4, null), 3);
                        return zy11.a;
                    }
                };
                agdVar.f = new le4(new sls() { // from class: com.yandex.go.chargers.offer.ui.compose.b
                    @Override // defpackage.sls
                    public final Object invoke() {
                        tje.N(u7a.this.o(), null, null, new ChargersOfferComposeRouter$content$1$2$1(bVar, null), 3);
                        return zy11.a;
                    }
                });
                agdVar.g = new androidx.compose.runtime.internal.a(-801694379, new bms() { // from class: com.yandex.go.chargers.offer.ui.compose.c
                    @Override // defpackage.bms
                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int i9;
                        xfd xfdVar = (xfd) obj4;
                        paa paaVar = (paa) obj5;
                        fid fidVar = (fid) obj6;
                        int intValue = ((Integer) obj7).intValue();
                        if ((intValue & 6) == 0) {
                            i9 = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
                        } else {
                            i9 = intValue;
                        }
                        if ((intValue & 48) == 0) {
                            i9 |= (intValue & 64) == 0 ? ((bts) fidVar).k(paaVar) : fidVar.e(paaVar) ? 32 : 16;
                        }
                        bts btsVar = (bts) fidVar;
                        boolean V = btsVar.V(i9 & 1, (i9 & 147) != 146);
                        zy11 zy11Var2 = zy11.a;
                        if (!V) {
                            btsVar.Y();
                            return zy11Var2;
                        }
                        com.yandex.go.chargers.offer.ui.compose.ui.e eVar2 = com.yandex.go.chargers.offer.ui.compose.ui.e.this;
                        oz40 a = androidx.lifecycle.compose.a.a(eVar2.f, new u8a(false, false), btsVar);
                        boolean e = btsVar.e(eVar2);
                        u7a u7aVar2 = u7aVar;
                        boolean e2 = e | btsVar.e(u7aVar2);
                        Object Q = btsVar.Q();
                        if (e2 || Q == did.a) {
                            Q = new ChargersOfferComposeRouter$content$1$3$1$1(eVar2, u7aVar2, null);
                            btsVar.o0(Q);
                        }
                        zpn.e(btsVar, (wls) Q, zy11Var2);
                        rzo.b(null, "default", wwg.S(-1843402779, true, new t7a(paaVar, tlaVar, a, u7aVar2, xfdVar, 0), btsVar), btsVar, 3456, 3);
                        return zy11Var2;
                    }
                }, true);
                return zy11Var;
            case 14:
                ((a9a) obj).m0((tsa) obj3, (ChargersOfferStationOpenReason) obj2);
                return zy11Var;
            case 15:
                oaa oaaVar = (oaa) obj2;
                ((tls) obj3).invoke(new v9a((km9) obj, oaaVar != null ? oaaVar.a : null));
                return zy11Var;
            case 16:
                final t tVar = (t) obj3;
                final dea deaVar = (dea) obj2;
                yfd yfdVar3 = (yfd) obj;
                final aea aeaVar = new aea(tVar);
                g92 g92Var = new g92(i4, ((agd) yfdVar3).a);
                agd agdVar2 = (agd) yfdVar3;
                agdVar2.c = g92Var;
                agdVar2.e = new tls() { // from class: com.yandex.go.chargers.station.presentation.partner.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj4) {
                        tje.N(t.this.o(), null, null, new ChargersPartnerDetailsRouter$content$1$1$1(deaVar, (cea) obj4, aeaVar, null), 3);
                        return zy11.a;
                    }
                };
                v4d.a.getClass();
                agdVar2.g = v4d.b;
                return zy11Var;
            case 17:
                yfd yfdVar4 = (yfd) obj;
                ((agd) yfdVar4).e = new cs8(18, (nea) obj2, new c29(12, (n12) obj3));
                x4d.a.getClass();
                ((agd) yfdVar4).g = x4d.b;
                return zy11Var;
            case 18:
                n12 n12Var = (n12) ((c29) obj2).b;
                mea meaVar = (mea) obj;
                ((nea) obj3).getClass();
                if (meaVar instanceof iea) {
                    n12Var.r(new qu(i5));
                } else if (meaVar instanceof lea) {
                    ((mg21) ((lg21) ((yvf0) n12Var.H).get())).c(((lea) meaVar).a);
                } else if (meaVar instanceof kea) {
                    n12Var.A((m950) ((yvf0) n12Var.J).get(), new ly9(((kea) meaVar).a), new qs9(n12Var, i4));
                } else if (!(meaVar instanceof jea)) {
                    w511.b();
                    return null;
                }
                return zy11Var;
            case 19:
                uv6 uv6Var2 = (uv6) ((yfa) obj2).a;
                ega egaVar = (ega) obj;
                ((fga) ((uv6) obj3).I).getClass();
                if (egaVar instanceof dga) {
                    ila ilaVar = ((dga) egaVar).a;
                    if (ilaVar instanceof uka) {
                        uv6Var2.r(new rfa(i7));
                    } else if (ilaVar instanceof vka) {
                        uv6Var2.r(new qu(i5));
                    }
                } else {
                    if (!jl40.l(egaVar, cga.a)) {
                        w511.b();
                        return null;
                    }
                    uv6Var2.r(new qu(i5));
                }
                return zy11Var;
            case 20:
                com.yandex.go.chargers.passes.a aVar2 = (com.yandex.go.chargers.passes.a) ((io9) obj2).a;
                tia tiaVar = (tia) obj;
                ((com.yandex.go.chargers.passes.a) obj3).J.getClass();
                if (jl40.l(tiaVar, ria.a)) {
                    aVar2.r(new rfa(i3));
                } else if (jl40.l(tiaVar, qia.a)) {
                    aVar2.r(new qu(i5));
                } else {
                    if (!(tiaVar instanceof sia)) {
                        w511.b();
                        return null;
                    }
                    aVar2.A((m950) aVar2.H.get(), new ly9(((sia) tiaVar).a), new qs9(aVar2, 4));
                }
                return zy11Var;
            case 21:
                hfa0 hfa0Var = (hfa0) obj2;
                ((com.yandex.go.chargers.payments.navigation.a) obj3).F.g(hfa0Var);
                ((yla) obj).s(hfa0Var.b());
                return zy11Var;
            case 22:
                final zva zvaVar = (zva) obj3;
                final fwa fwaVar = (fwa) obj2;
                yfd yfdVar5 = (yfd) obj;
                final yva yvaVar = new yva(zvaVar);
                ((agd) yfdVar5).c = com.yandex.go.coroutines.b.d(new com.yandex.go.chargers.surge.info.c(zvaVar.G.a(), zvaVar, yfdVar5), new ChargersSurgeInfoRouter$content$lambda$0$$inlined$start$1(null, zvaVar, yfdVar5));
                agd agdVar3 = (agd) yfdVar5;
                agdVar3.e = new tls() { // from class: com.yandex.go.chargers.surge.info.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj4) {
                        tje.N(zva.this.o(), null, null, new ChargersSurgeInfoRouter$content$1$3$1(fwaVar, (ewa) obj4, yvaVar, null), 3);
                        return zy11.a;
                    }
                };
                l5d.a.getClass();
                agdVar3.g = l5d.b;
                return zy11Var;
            case 23:
                final kxa kxaVar = (kxa) obj3;
                final nxa nxaVar = (nxa) obj2;
                yfd yfdVar6 = (yfd) obj;
                final jxa jxaVar = new jxa(kxaVar);
                CharSequence charSequence = ((vwa) ((agd) yfdVar6).a).a;
                agd agdVar4 = (agd) yfdVar6;
                agdVar4.c = new g92(i4, new qxa(charSequence, ((vwa) agdVar4.a).b));
                agdVar4.e = new tls() { // from class: com.yandex.go.chargers.tariff_item_info.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj4) {
                        tje.N(kxa.this.o(), null, null, new ChargersTariffItemInfoRouterImpl$content$1$1$1(nxaVar, (mxa) obj4, jxaVar, null), 3);
                        return zy11.a;
                    }
                };
                n5d.a.getClass();
                agdVar4.g = n5d.b;
                return zy11Var;
            case 24:
                return Long.valueOf(((k2b) obj3).b.e((oll0) obj, (l2b) obj2));
            case 25:
                return Long.valueOf(((v2b) obj3).b.e((oll0) obj, (w2b) obj2));
            case 26:
                return Long.valueOf(((n5b) obj3).b.e((oll0) obj, (o5b) obj2));
            case 27:
                ((q5b) obj3).b.c((oll0) obj, (ArrayList) obj2);
                return zy11Var;
            case 28:
                ((l6b) obj3).b.d((oll0) obj, (m6b) obj2);
                return zy11Var;
            default:
                ArrayList arrayList = (ArrayList) obj2;
                oll0 oll0Var = (oll0) obj;
                fc1 fc1Var = ((x6b) obj3).b;
                fc1Var.getClass();
                ull0 T0 = oll0Var.T0("INSERT OR IGNORE INTO `chat_organization_cross_ref` (`chat_internal_id`,`organization_id`) VALUES (?,?)");
                try {
                    int size = arrayList.size();
                    long[] jArr = new long[size];
                    while (i6 < size) {
                        Object L = kotlin.collections.a.L(arrayList, i6);
                        if (L != null) {
                            fc1Var.a(T0, L);
                            T0.q();
                            T0.reset();
                            j = jx81.t(oll0Var);
                        } else {
                            j = -1;
                        }
                        jArr[i6] = j;
                        i6++;
                    }
                    gwk0.m(T0, null);
                    return jArr;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        gwk0.m(T0, th);
                        throw th2;
                    }
                }
        }
    }
}
