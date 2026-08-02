package defpackage;

import android.content.Context;
import android.text.Editable;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.payments.shared.members.list.MembersListView;
import com.yandex.go.payments.shared.members.list.b;
import com.yandex.go.payments.transport.navigation.a;
import com.yandex.go.taxi.main.f;
import com.yandex.go.zone.model.Zone;
import com.yandex.go.zone.repository.o;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.transport.masstransit.LineAtStop;
import com.yandex.messaging.activity.calls.MessengerCallFeedbackActivity;
import com.yandex.messaging.internal.view.timeline.translations.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.logistics.sdk.cargo_form.impl.universal_modal_view.ui.d;
import ru.yandex.taxi.common_models.ui.TextStyle;
import ru.yandex.taxi.masstransit.domain.f0;
import ru.yandex.taxi.masstransit.experiment.TransportOnSummaryExperiment;
import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$VehicleType;
import ru.yandex.taxi.masstransit.geopayment.checkout.k;
import ru.yandex.taxi.masstransit.geopayment.checkout.l;
import ru.yandex.taxi.masstransit.geopayment.checkout.t;
import ru.yandex.taxi.masstransit.geopayment.purchase.MtPurchaseMapper;
import ru.yandex.taxi.masstransit.overlay.e;
import ru.yandex.taxi.masstransit.stop.interactor.g;
import ru.yandex.taxi.masstransit.stop.interactor.h;
import ru.yandex.taxi.masstransit.threads.ThreadsCardMode;
import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData;

/* loaded from: classes13.dex */
public final class pi00 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public pi00(a aVar, tse tseVar) {
        this.a = 18;
        this.b = aVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        String str;
        r0 r0Var;
        Object value;
        b bVar;
        Object value2;
        Object value3;
        Map f;
        Map f2;
        Zone zone;
        String str2;
        String str3 = "";
        int i = 9;
        int i2 = 2;
        switch (this.a) {
            case 0:
                fs7 fs7Var = (fs7) obj;
                CameraPosition cameraPosition = fs7Var.a;
                Point target = cameraPosition.getTarget();
                float zoom = cameraPosition.getZoom();
                kzo kzoVar = ((com.yandex.mobile.drive.sdk.map.handlers.a) this.b).c;
                Pair pair = new Pair(IssuingDistributionPointExtension.POINT, fib1.j(target));
                Pair pair2 = new Pair("zoom", new Float(zoom));
                Pair pair3 = new Pair("azimuth", new Float(cameraPosition.getAzimuth()));
                Pair pair4 = new Pair("tilt", new Float(cameraPosition.getTilt()));
                Pair pair5 = new Pair(UgcLiveVideoData.UgcLiveStatus.FINISHED, Boolean.valueOf(fs7Var.c));
                int i3 = qi00.a[fs7Var.b.ordinal()];
                if (i3 == 1) {
                    str = "gestures";
                } else {
                    if (i3 != 2) {
                        w511.b();
                        return null;
                    }
                    str = ClidProvider.APPLICATION;
                }
                kzoVar.u("map/camera_move", kotlin.collections.b.h(pair, pair2, pair3, pair4, pair5, new Pair(CRLReasonCodeExtension.REASON, str)));
                return zy11.a;
            case 1:
                k910 k910Var = (k910) obj;
                com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.a aVar = (com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.a) this.b;
                pz40 Y = aVar.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, k910Var));
                aVar.F.A(((k910) aVar.X()).b);
                return zy11.a;
            case 2:
                bVar = ((MembersListView) this.b).presenter;
                bVar.x.g = ((Editable) obj).toString();
                bVar.L = "";
                bVar.Tg();
                return zy11.a;
            case 3:
                c cVar = (c) this.b;
                kgx[] kgxVarArr = c.R;
                cVar.i();
                return zy11.a;
            case 4:
                ((MessengerCallFeedbackActivity) this.b).onDefaultProfile((q020) obj);
                return zy11.a;
            case 5:
                ((ru.yandex.taxi.logistics.sdk.mission_details.b) this.b).A.l((ak20) obj);
                return zy11.a;
            case 6:
                Pair pair6 = (Pair) obj;
                d0l0 d0l0Var = (d0l0) pair6.getFirst();
                if (!((Boolean) pair6.getSecond()).booleanValue()) {
                    sv20 sv20Var = (sv20) this.b;
                    Address h = d0l0Var.h();
                    zzs B = h != null ? h.B() : null;
                    Address b = d0l0Var.b();
                    zzs B2 = b != null ? b.B() : null;
                    sv20Var.getClass();
                    List A = j73.A(new zzs[]{B, B2});
                    if (A.isEmpty()) {
                        A = null;
                    }
                    if (A != null) {
                        fi6 fi6Var = new fi6();
                        ArrayList arrayList = new ArrayList(tcc.n(A, 10));
                        Iterator it = A.iterator();
                        while (it.hasNext()) {
                            arrayList.add(cwa1.d((zzs) it.next()));
                        }
                        fi6Var.e(arrayList);
                        ((gh00) sv20Var.x).A(fi6Var.g(), null);
                    }
                }
                return zy11.a;
            case 7:
                j130 j130Var = (j130) obj;
                zy11 zy11Var = zy11.a;
                if (j130Var != null) {
                    return zy11Var;
                }
                Object c = ((d) this.b).w.a.c(continuation);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (c != coroutineSingletons) {
                    c = zy11Var;
                }
                return c == coroutineSingletons ? c : zy11Var;
            case 8:
                f fVar = (f) this.b;
                if (fVar.L.a()) {
                    fVar.S(new a5y0("widgets response", null, null, 30));
                }
                return zy11.a;
            case 9:
                qnb qnbVar = (qnb) obj;
                r0 r0Var2 = ((k) this.b).n;
                do {
                    value2 = r0Var2.getValue();
                } while (!r0Var2.k(value2, qnbVar));
                return zy11.a;
            case 10:
                on30 on30Var = (on30) obj;
                r0 r0Var3 = ((l) this.b).d;
                do {
                    value3 = r0Var3.getValue();
                } while (!r0Var3.k(value3, on30Var));
                return zy11.a;
            case 11:
                r6f r6fVar = (r6f) obj;
                zy11 zy11Var2 = zy11.a;
                t tVar = (t) this.b;
                if (r6fVar.e) {
                    je30 je30Var = (je30) tVar.B.b;
                    xga0 xga0Var = (xga0) je30Var.J.get();
                    je30Var.U = xga0Var;
                    je30Var.A(xga0Var, zy11Var2, sy60.Q2);
                } else if (r6fVar.f) {
                    je30 je30Var2 = (je30) tVar.B.b;
                    xga0 xga0Var2 = je30Var2.U;
                    if (xga0Var2 != null) {
                        xga0Var2.i();
                    }
                    je30Var2.U = null;
                    tVar.Pg();
                } else {
                    je30 je30Var3 = (je30) tVar.B.b;
                    xga0 xga0Var3 = je30Var3.U;
                    if (xga0Var3 != null) {
                        xga0Var3.i();
                    }
                    je30Var3.U = null;
                }
                return zy11Var2;
            case 12:
                Triple triple = (Triple) obj;
                ((ru.yandex.taxi.masstransit.ui.route.modal.collapsed.d) this.b).Lg((List) triple.getFirst(), (e040) triple.getSecond(), (su30) triple.getThird());
                return zy11.a;
            case 13:
                r0 r0Var4 = ((ru.yandex.taxi.masstransit.detailedroute.overlay.d) this.b).L;
                Boolean bool = Boolean.FALSE;
                r0Var4.getClass();
                r0Var4.m(null, bool);
                return zy11.a;
            case 14:
                if (((Boolean) obj).booleanValue()) {
                    ((Ref$BooleanRef) this.b).element = true;
                }
                return zy11.a;
            case 15:
                ((ko30) this.b).aa((km30) obj);
                return zy11.a;
            case 16:
                ((lo30) this.b).x.a(true);
                return zy11.a;
            case 17:
                fp30 fp30Var = (fp30) this.b;
                k140 k140Var = (k140) obj;
                if (k140Var instanceof i140) {
                    i140 i140Var = (i140) k140Var;
                    kv1 kv1Var = fp30Var.F;
                    if (kv1Var != null) {
                        i3g i3gVar = (i3g) kv1Var.g;
                        y140 y140Var = new y140(i140Var.a);
                        c0g c0gVar = (c0g) i3gVar.a;
                        Context p1 = c0gVar.p1();
                        zzf zzfVar = c0gVar.z;
                        q5z.h(p1);
                        w030 B5 = c0gVar.B5();
                        q5z.h(B5);
                        z040 z040Var = (z040) ((n3w) kv1Var.h).a;
                        x040 x040Var = (x040) ((n3w) kv1Var.l).a;
                        ah00 B3 = c0gVar.B();
                        q5z.h(B3);
                        rqo l1 = c0gVar.l1();
                        q5z.h(l1);
                        pho T1 = c0gVar.T1();
                        q5z.h(T1);
                        b140 b140Var = new b140(new co40(T1));
                        tt2 k = c0gVar.k();
                        q5z.h(k);
                        x210 x210Var = (x210) zzfVar.vo.get();
                        q5z.h(x210Var);
                        ru.yandex.taxi.masstransit.datasource.schedule.b bVar2 = new ru.yandex.taxi.masstransit.datasource.schedule.b(k, x210Var);
                        yy30 yy30Var = new yy30(zzfVar.j1());
                        dz00 y5 = c0gVar.y5();
                        jtq0 u = zzfVar.u();
                        tt2 k2 = c0gVar.k();
                        q5z.h(k2);
                        com.yandex.go.zone.interactors.b n = zzfVar.n();
                        i240 i240Var = (i240) ((xvf0) kv1Var.a).get();
                        c440 c440Var = (c440) ((xvf0) kv1Var.b).get();
                        h a = kv1Var.a();
                        ah00 B4 = ((c0g) i3gVar.a).B();
                        q5z.h(B4);
                        dc4 dc4Var = new dc4(B4);
                        Context p12 = c0gVar.p1();
                        q5z.h(p12);
                        zuj0 c2 = c0gVar.c();
                        q5z.h(c2);
                        zuj0 c3 = c0gVar.c();
                        q5z.h(c3);
                        jtq0 u2 = zzfVar.u();
                        zuj0 c4 = c0gVar.c();
                        q5z.h(c4);
                        cjw0 cjw0Var = new cjw0(c3, u2, new kj40(c4, zzfVar.u()));
                        pdc F1 = c0gVar.F1();
                        q5z.h(F1);
                        h440 h440Var = new h440(p12, c2, cjw0Var, F1);
                        o I6 = c0gVar.I6();
                        q5z.h(I6);
                        jt30 jt30Var = new jt30(I6, new gt30());
                        MtPurchaseMapper mtPurchaseMapper = new MtPurchaseMapper();
                        on2 l3 = c0gVar.l3();
                        q5z.h(l3);
                        tt2 k3 = c0gVar.k();
                        q5z.h(k3);
                        tt2 k4 = c0gVar.k();
                        q5z.h(k4);
                        dne0 dne0Var = (dne0) zzfVar.d.get();
                        q5z.h(dne0Var);
                        xr30 xr30Var = new xr30(l3, k3, new ru.yandex.taxi.masstransit.geopayment.tickets.storage.a(k4, dne0Var));
                        ru.yandex.taxi.am.k kVar = (ru.yandex.taxi.am.k) zzfVar.L0.get();
                        q5z.h(kVar);
                        tu30 tu30Var = (tu30) zzfVar.Yl.get();
                        q5z.h(tu30Var);
                        wr30 wr30Var = new wr30(xr30Var, kVar, tu30Var);
                        pwy0 w6 = c0gVar.w6();
                        q5z.h(w6);
                        g gVar = new g(l1, b140Var, bVar2, yy30Var, y5, u, k2, n, i240Var, c440Var, a, dc4Var, h440Var, jt30Var, mtPurchaseMapper, wr30Var, w6);
                        h0z h0zVar = (h0z) kv1Var.m;
                        h3y a2 = i5m.a(i3gVar.i);
                        jl00 jl00Var = i3gVar.l;
                        h3y a3 = i5m.a(i3gVar.w0);
                        h3y a4 = i5m.a(i3gVar.x0);
                        h a5 = kv1Var.a();
                        qx5 qx5Var = (qx5) kv1Var.p;
                        m010 m010Var = (m010) c0gVar.tv.get();
                        q5z.h(m010Var);
                        s440 s440Var = (s440) c0gVar.tC.get();
                        q5z.h(s440Var);
                        y50 q1 = c0gVar.q1();
                        q5z.h(q1);
                        fp30Var.A(new ru.yandex.taxi.masstransit.stop.router.b(p1, B5, z040Var, x040Var, B3, gVar, h0zVar, a2, jl00Var, a3, a4, a5, qx5Var, m010Var, s440Var, q1), y140Var, new ep30(fp30Var, i140Var, kv1Var));
                    }
                } else if (k140Var instanceof j140) {
                    j140 j140Var = (j140) k140Var;
                    kv1 kv1Var2 = fp30Var.F;
                    if (kv1Var2 != null) {
                        i3g i3gVar2 = (i3g) kv1Var2.g;
                        c0g c0gVar2 = (c0g) i3gVar2.a;
                        Context p13 = c0gVar2.p1();
                        q5z.h(p13);
                        w030 B52 = c0gVar2.B5();
                        q5z.h(B52);
                        qx5 qx5Var2 = (qx5) kv1Var2.t;
                        f340 f340Var = (f340) ((xvf0) kv1Var2.e).get();
                        m340 m340Var = (m340) ((n3w) kv1Var2.u).a;
                        ah00 B6 = c0gVar2.B();
                        q5z.h(B6);
                        oe61 oe61Var = new oe61(B6);
                        ah00 B7 = ((c0g) i3gVar2.a).B();
                        q5z.h(B7);
                        dc4 dc4Var2 = new dc4(B7);
                        ah00 B8 = c0gVar2.B();
                        q5z.h(B8);
                        m010 m010Var2 = (m010) c0gVar2.tv.get();
                        q5z.h(m010Var2);
                        y50 q12 = c0gVar2.q1();
                        q5z.h(q12);
                        fp30Var.A(new ru.yandex.taxi.masstransit.stoproute.router.b(p13, B52, qx5Var2, f340Var, m340Var, oe61Var, dc4Var2, B8, m010Var2, q12), new j340(j140Var.b, ((dp30) fp30Var.n()).a), new ru.yandex.taxi.masstransit.router.g(fp30Var, j140Var));
                    }
                } else {
                    if (!(k140Var instanceof h140)) {
                        w511.b();
                        return null;
                    }
                    h140 h140Var = (h140) k140Var;
                    kv1 kv1Var3 = fp30Var.F;
                    if (kv1Var3 != null) {
                        c0g c0gVar3 = (c0g) ((i3g) kv1Var3.g).a;
                        Context p14 = c0gVar3.p1();
                        q5z.h(p14);
                        pav e = c0gVar3.e();
                        q5z.h(e);
                        ru.yandex.taxi.utils.d dVar = new ru.yandex.taxi.utils.d(e);
                        w030 B53 = c0gVar3.B5();
                        q5z.h(B53);
                        zuj0 c5 = c0gVar3.c();
                        q5z.h(c5);
                        fp30Var.z(new da0(p14, dVar, B53, c5), new ru.yandex.taxi.masstransit.router.f(fp30Var, h140Var));
                    }
                }
                return zy11.a;
            case 18:
                a aVar2 = (a) this.b;
                hfa0 hfa0Var = (hfa0) obj;
                if (!jl40.l(hfa0Var, hfa0.c)) {
                    hfa0 hfa0Var2 = aVar2.G;
                    if (hfa0Var2 != null) {
                        shq0 shq0Var = hfa0Var2.b;
                        List list = hfa0Var2.a;
                        shq0 shq0Var2 = hfa0Var.b;
                        List list2 = hfa0Var.a;
                        if (!jl40.l(shq0Var, shq0Var2) || list.size() != list2.size() || !list.equals(list2)) {
                            aVar2.r(new qu(i));
                        }
                    } else {
                        aVar2.G = hfa0Var;
                    }
                }
                return zy11.a;
            case 19:
                ((hx30) this.b).render((lx30) obj);
                return zy11.a;
            case 20:
                Triple triple2 = (Triple) obj;
                ru.yandex.taxi.masstransit.experiment.f fVar2 = (ru.yandex.taxi.masstransit.experiment.f) triple2.getFirst();
                k110 k110Var = (k110) triple2.getSecond();
                su30 su30Var = (su30) triple2.getThird();
                TransportOnSummaryExperiment.LiveTagsSettings.LiveTagsFilterType liveTagsFilterType = fVar2.l.b.a;
                ay30 ay30Var = (ay30) this.b;
                ay30Var.G.getClass();
                List a6 = l5r.a(su30Var, liveTagsFilterType);
                boolean isEmpty = a6.isEmpty();
                e eVar = ay30Var.F;
                if (isEmpty) {
                    eVar.b();
                } else {
                    if (k110Var == null || (f = k110Var.b()) == null) {
                        f = kotlin.collections.b.f();
                    }
                    eVar.c(f, a6, false);
                }
                return zy11.a;
            case 21:
                e240 e240Var = (e240) this.b;
                z340 z340Var = (z340) obj;
                if (z340Var instanceof x340) {
                    x340 x340Var = (x340) z340Var;
                    List<LineAtStop> list3 = x340Var.a.b;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
                    for (LineAtStop lineAtStop : list3) {
                        lineAtStop.getLine().getName();
                        arrayList2.add(new a631(lineAtStop.getLine().getId(), null, null, 28));
                    }
                    m010 m010Var3 = e240Var.z;
                    k110 k110Var2 = x340Var.c;
                    if (k110Var2 == null || (f2 = k110Var2.b()) == null) {
                        f2 = kotlin.collections.b.f();
                    }
                    m010Var3.c.c(f2, arrayList2, false);
                } else {
                    if (!(z340Var instanceof v340) && !(z340Var instanceof w340) && !(z340Var instanceof y340)) {
                        w511.b();
                        return null;
                    }
                    e240Var.z.c.b();
                }
                return zy11.a;
            case 22:
                i440 i440Var = (i440) obj;
                ((b240) this.b).b4(i440Var != null ? i440Var.a : null);
                return zy11.a;
            case 23:
                ((f340) this.b).a.l((List) obj);
                return zy11.a;
            case 24:
                ((a340) this.b).b6((List) obj);
                return zy11.a;
            case 25:
                wiu0 wiu0Var = (wiu0) obj;
                s340 s340Var = (s340) this.b;
                if (wiu0Var == null) {
                    k1a k1aVar = (k1a) s340Var.x.a;
                    if (k1aVar.u()) {
                        k1aVar.r(new qu(i));
                    }
                } else {
                    boolean z = wiu0Var instanceof uiu0;
                    if (z && !s340Var.I) {
                        d411 d411Var = s340Var.F;
                        TransportPaymentAnalytics$VehicleType transportPaymentAnalytics$VehicleType = s340Var.A;
                        String str4 = s340Var.y;
                        String str5 = ((ohu0) s340Var.E.d.getValue()).h;
                        ZoneAddress n2 = s340Var.G.n();
                        if (n2 != null && (zone = n2.b) != null && (str2 = zone.a) != null) {
                            str3 = str2;
                        }
                        d411Var.getClass();
                        HashMap hashMap = new HashMap();
                        if (str5 != null) {
                            hashMap.put("request_id", str5);
                        }
                        hashMap.put("vehicle_type", transportPaymentAnalytics$VehicleType.getEventValue());
                        hashMap.put("vehicle_id", str4);
                        d411Var.a.a("TransportPayment.StopOptions.FirstLoaded", hashMap, 1, tse0.r("zone_name", hashMap, str3));
                        s340Var.I = true;
                    }
                    s340Var.getClass();
                    if (wiu0Var.equals(piu0.a)) {
                        ((q340) s340Var.Dg()).renderLoadingState();
                    } else if (z) {
                        uiu0 uiu0Var = (uiu0) wiu0Var;
                        ((q340) s340Var.Dg()).vd(uiu0Var.a, uiu0Var.b);
                    } else {
                        if (!wiu0Var.equals(kiu0.a)) {
                            w511.b();
                            return null;
                        }
                        ((q340) s340Var.Dg()).Q1(new q47(Collections.singletonList(new my6(((avj0) s340Var.H).h(kyh0.mt_refresh), new bdc(xng0.textOnControl), new bdc(xng0.controlMain), TextStyle.ACCENT, u340.a, null, null, false, false, 16292)), 1));
                    }
                }
                return zy11.a;
            case 26:
                ((g) this.b).i.a.l((z340) obj);
                return zy11.a;
            case 27:
                ((b640) this.b).c.l((z540) obj);
                return zy11.a;
            case 28:
                q1j0 q1j0Var = p1j0.a;
                ru.yandex.taxi.masstransit.router.l lVar = (ru.yandex.taxi.masstransit.router.l) this.b;
                fk40 fk40Var = ((sk40) obj).b;
                if (fk40Var.equals(ck40.a)) {
                    m640 m640Var = lVar.L;
                    if (m640Var != null) {
                        q1j0Var = new n1j0(m640Var);
                    }
                    yv30 yv30Var = lVar.D;
                    uj30 uj30Var = lVar.F;
                    wrr wrrVar = yv30Var.a;
                    lVar.B(new ru.yandex.taxi.masstransit.router.h((Context) ((xvf0) wrrVar.b).get(), uj30Var, (w030) ((n3w) wrrVar.c).a, (zj30) ((ret) wrrVar.w).get(), (ru.yandex.taxi.masstransit.userlocation.a) ((sku0) wrrVar.x).get(), (oe61) ((up41) wrrVar.y).get(), (b611) ((jqz0) wrrVar.z).get(), (f0) ((prq) wrrVar.A).get()), new xv30(lVar.M), new mo30(3, lVar), q1j0Var);
                } else if (fk40Var instanceof dk40) {
                    dk40 dk40Var = (dk40) fk40Var;
                    m640 m640Var2 = lVar.L;
                    if (m640Var2 != null) {
                        q1j0Var = new n1j0(m640Var2);
                    }
                    lVar.B((m950) lVar.H.get(), new w540(dk40Var.a, lVar.M, lVar.N), new cb0(14, lVar, dk40Var), q1j0Var);
                } else {
                    if (!(fk40Var instanceof ek40)) {
                        w511.b();
                        return null;
                    }
                    bzy0 bzy0Var = ((ek40) fk40Var).a;
                    m640 m640Var3 = lVar.L;
                    if (m640Var3 != null) {
                        q1j0Var = new n1j0(m640Var3);
                    }
                    lVar.B((m950) lVar.G.get(), new o640(bzy0Var, ThreadsCardMode.COLLAPSED, lVar.M, 8), new rg30(i2, lVar), q1j0Var);
                }
                return zy11.a;
            default:
                ((com.yandex.go.taxi.summary.intercity.e) this.b).a.a.a = false;
                return zy11.a;
        }
    }

    public /* synthetic */ pi00(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
