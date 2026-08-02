package com.yandex.go.taxi.order.search.overlay.long_search_v2.mvp;

import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.NearestDrivers;
import com.yandex.go.taxi.order.search.overlay.long_search_v2.mvp.c;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.Map;
import defpackage.a3y0;
import defpackage.ad5;
import defpackage.cv00;
import defpackage.cvu0;
import defpackage.cwa1;
import defpackage.eco;
import defpackage.gpc;
import defpackage.hst;
import defpackage.i3y;
import defpackage.jse;
import defpackage.jst;
import defpackage.jtq0;
import defpackage.knz;
import defpackage.m58;
import defpackage.mqu;
import defpackage.nnz;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.o3z;
import defpackage.o61;
import defpackage.pb30;
import defpackage.pzt0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tmz;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vng;
import defpackage.wrr;
import defpackage.wz8;
import defpackage.yz8;
import defpackage.z1e0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.map_common.map.o;

/* loaded from: classes14.dex */
public final class c extends ad5 {
    public final tmz A;
    public final wz8 B;
    public final eco C;
    public final ru.yandex.taxi.order.map.controller.a D;
    public final a3y0 E;
    public final i3y F;
    public final jse G;
    public pzt0 H;
    public pzt0 I;
    public pzt0 J;
    public pzt0 K;
    public pzt0 L;
    public pzt0 M;
    public pzt0 N;
    public pzt0 O;
    public final ArrayList P;
    public z1e0 Q;
    public pzt0 R;
    public final o2y0 x;
    public final cv00 y;
    public final wrr z;

    public c(o2y0 o2y0Var, jtq0 jtq0Var, cv00 cv00Var, wrr wrrVar, tmz tmzVar, wz8 wz8Var, eco ecoVar, ru.yandex.taxi.order.map.controller.a aVar, yz8 yz8Var, tt2 tt2Var) {
        super(nnz.class);
        this.x = o2y0Var;
        this.y = cv00Var;
        this.z = wrrVar;
        this.A = tmzVar;
        this.B = wz8Var;
        this.C = ecoVar;
        this.D = aVar;
        this.E = new a3y0(TaxiOrderLogGroup.LONG_SEARCH_V2.getTag(), "LongSearchV2CarOverlayPresenter");
        this.F = kotlin.a.a(new mqu(24, yz8Var, jtq0Var));
        tt2Var.getClass();
        this.G = uyj.a.P(1);
        this.P = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(final c cVar, Map map, ContinuationImpl continuationImpl) {
        LongSearchV2CarOverlayPresenter$handleStatesUpdate$1 longSearchV2CarOverlayPresenter$handleStatesUpdate$1;
        int i;
        wz8 wz8Var = cVar.B;
        ArrayList arrayList = cVar.P;
        if (continuationImpl instanceof LongSearchV2CarOverlayPresenter$handleStatesUpdate$1) {
            longSearchV2CarOverlayPresenter$handleStatesUpdate$1 = (LongSearchV2CarOverlayPresenter$handleStatesUpdate$1) continuationImpl;
            int i2 = longSearchV2CarOverlayPresenter$handleStatesUpdate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                longSearchV2CarOverlayPresenter$handleStatesUpdate$1.label = i2 - Integer.MIN_VALUE;
                Object obj = longSearchV2CarOverlayPresenter$handleStatesUpdate$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = longSearchV2CarOverlayPresenter$handleStatesUpdate$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (map.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList(arrayList);
                        z1e0 z1e0Var = cVar.Q;
                        if (z1e0Var != null) {
                            arrayList2.remove(z1e0Var.a);
                        }
                        ((nnz) cVar.Dg()).P4(arrayList2);
                        arrayList.clear();
                        return zy11Var;
                    }
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    ?? arrayList3 = new ArrayList();
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        pb30 pb30Var = (pb30) entry.getValue();
                        Point point = pb30Var.x;
                        if (arrayList == null || !arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (cvu0.t(str, ((m58) it.next()).a, true)) {
                                    break;
                                }
                            }
                        }
                        if (pb30Var.b && pb30Var.c && point != null) {
                            arrayList3.add(new m58(str, pb30Var, point));
                        }
                    }
                    ref$ObjectRef.element = arrayList3;
                    final ArrayList arrayList4 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        m58 m58Var = (m58) it2.next();
                        if (map.containsKey(m58Var.a)) {
                            pb30 pb30Var2 = m58Var.b;
                            if (pb30Var2.b && pb30Var2.c) {
                            }
                        }
                        arrayList4.add(m58Var);
                    }
                    List list = (List) ref$ObjectRef.element;
                    wz8Var.getClass();
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        wz8Var.b(((m58) it3.next()).b.a, false);
                    }
                    final ?? a = wz8Var.a((Collection) ref$ObjectRef.element);
                    ref$ObjectRef.element = a;
                    longSearchV2CarOverlayPresenter$handleStatesUpdate$1.L$0 = null;
                    longSearchV2CarOverlayPresenter$handleStatesUpdate$1.L$1 = ref$ObjectRef;
                    longSearchV2CarOverlayPresenter$handleStatesUpdate$1.L$2 = null;
                    longSearchV2CarOverlayPresenter$handleStatesUpdate$1.label = 1;
                    arrayList.removeAll(arrayList4);
                    arrayList.addAll(a);
                    ArrayList arrayList5 = new ArrayList(tcc.n(arrayList, 10));
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        arrayList5.add(((m58) it4.next()).c);
                    }
                    List i3 = cVar.x.b().V().i();
                    ArrayList arrayList6 = new ArrayList(tcc.n(i3, 10));
                    Iterator it5 = i3.iterator();
                    while (it5.hasNext()) {
                        arrayList6.add(cwa1.d((zzs) it5.next()));
                    }
                    if (!arrayList5.isEmpty()) {
                        new ArrayList(arrayList5).addAll(arrayList6);
                    }
                    if (((nnz) cVar.Dg()).u9(arrayList5, cVar.Lg(), new Map.CameraCallback() { // from class: xmz
                        @Override // com.yandex.mapkit.map.Map.CameraCallback
                        public final void onMoveFinished(boolean z) {
                            c cVar2 = c.this;
                            if (!z) {
                                ((nnz) cVar2.Dg()).Ef();
                            }
                            ((nnz) cVar2.Dg()).P4(arrayList4);
                            ((nnz) cVar2.Dg()).E0(a);
                        }
                    }, longSearchV2CarOverlayPresenter$handleStatesUpdate$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                cVar.E.getClass();
                a3y0.h((String[]) Arrays.copyOf(new String[0], 0));
                hst hstVar = jst.e;
                return zy11Var;
            }
        }
        longSearchV2CarOverlayPresenter$handleStatesUpdate$1 = new LongSearchV2CarOverlayPresenter$handleStatesUpdate$1(cVar, continuationImpl);
        Object obj2 = longSearchV2CarOverlayPresenter$handleStatesUpdate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = longSearchV2CarOverlayPresenter$handleStatesUpdate$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        cVar.E.getClass();
        a3y0.h((String[]) Arrays.copyOf(new String[0], 0));
        hst hstVar2 = jst.e;
        return zy11Var2;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        ru.yandex.taxi.order.map.controller.a aVar = this.D;
        aVar.c();
        aVar.a();
        this.P.clear();
        this.Q = null;
        ((o) this.y).d();
    }

    @Override // defpackage.zc5
    public final void Fg() {
        pzt0 pzt0Var = this.N;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = this.I;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        pzt0 pzt0Var3 = this.H;
        if (pzt0Var3 != null) {
            pzt0Var3.a(null);
        }
        pzt0 pzt0Var4 = this.J;
        if (pzt0Var4 != null) {
            pzt0Var4.a(null);
        }
        pzt0 pzt0Var5 = this.K;
        if (pzt0Var5 != null) {
            pzt0Var5.a(null);
        }
        pzt0 pzt0Var6 = this.L;
        if (pzt0Var6 != null) {
            pzt0Var6.a(null);
        }
        pzt0 pzt0Var7 = this.M;
        if (pzt0Var7 != null) {
            pzt0Var7.a(null);
        }
        pzt0 pzt0Var8 = this.O;
        if (pzt0Var8 != null) {
            pzt0Var8.a(null);
        }
    }

    @Override // defpackage.zc5
    public final void Gg() {
        wrr wrrVar = this.z;
        pzt0 pzt0Var = this.I;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.I = tje.N(Jg(), null, null, new LongSearchV2CarOverlayPresenter$subscribeForPollingModelUpdates$$inlined$safeCollectIn$1((n0) ((gpc) wrrVar.c).x, null, this), 3);
        pzt0 pzt0Var2 = this.L;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.L = tje.N(Jg(), null, null, new LongSearchV2CarOverlayPresenter$subscribeForEtaUpdates$$inlined$safeCollectIn$1((n0) wrrVar.z, null, this), 3);
        pzt0 pzt0Var3 = this.M;
        if (pzt0Var3 != null) {
            pzt0Var3.a(null);
        }
        this.M = tje.N(Jg(), null, null, new LongSearchV2CarOverlayPresenter$subscribeForHintUpdates$$inlined$safeCollectIn$1(vng.l((n0) wrrVar.y, LongSearchV2CarOverlayPresenter$subscribeForHintUpdates$1.b, vng.c), null, this), 3);
        pzt0 pzt0Var4 = this.H;
        if (pzt0Var4 != null) {
            pzt0Var4.a(null);
        }
        this.H = tje.N(Jg(), null, null, new LongSearchV2CarOverlayPresenter$subscribeForLongSearchInfoUpdates$$inlined$safeCollectIn$1(((knz) wrrVar.b).b, null, this), 3);
        pzt0 pzt0Var5 = this.K;
        if (pzt0Var5 != null) {
            pzt0Var5.a(null);
        }
        this.K = tje.N(Jg(), null, null, new LongSearchV2CarOverlayPresenter$subscribeForZoomRadiusUpdates$$inlined$safeCollectIn$1((n0) wrrVar.x, null, this), 3);
        pzt0 pzt0Var6 = this.N;
        if (pzt0Var6 != null) {
            pzt0Var6.a(null);
        }
        this.N = tje.N(Jg(), null, null, new LongSearchV2CarOverlayPresenter$subscribeForPollingTerminationUpdates$$inlined$safeCollectIn$1((n0) wrrVar.A, null, this), 3);
        ru.yandex.taxi.order.map.controller.a aVar = this.D;
        pzt0 pzt0Var7 = this.O;
        if (pzt0Var7 != null) {
            pzt0Var7.a(null);
        }
        this.O = tje.N(Jg(), null, null, new LongSearchV2CarOverlayPresenter$subscribeForNearestDriversUpdates$1(this, null), 3);
        TaxiOrder b = this.x.b();
        NearestDrivers nearestDrivers = b.b.i0;
        if (nearestDrivers == null) {
            NearestDrivers.Companion.getClass();
            nearestDrivers = NearestDrivers.c;
        }
        aVar.b.b(nearestDrivers, b.b.O.b);
        aVar.e(b.v(), b.b.O.b);
        pzt0 pzt0Var8 = this.J;
        if (pzt0Var8 != null) {
            pzt0Var8.a(null);
        }
        this.J = tje.N(Jg(), null, null, new LongSearchV2CarOverlayPresenter$subscribeForUiUpdates$1(this, null), 3);
        o61 o61Var = this.A.b;
        o61Var.getClass();
        o61Var.a.a("LongSearch.HasSeen", new HashMap(), 1, new HashMap());
    }

    public final zzs Lg() {
        zzs v = this.x.b().v();
        if (v != null) {
            return v;
        }
        a3y0.d(this.E, "getOrderSourcePoint", null, new o3z(10), 2);
        return zzs.f;
    }

    public final void Mg() {
        this.E.getClass();
        a3y0.h((String[]) Arrays.copyOf(new String[0], 0));
        hst hstVar = jst.e;
        z1e0 z1e0Var = this.Q;
        if (z1e0Var != null) {
            ((o) this.y).d();
            m58 m58Var = z1e0Var.a;
            this.P.remove(m58Var);
            a3y0.h((String[]) Arrays.copyOf(new String[0], 0));
            ((nnz) Dg()).p(new mqu(25, this, m58Var));
        }
        this.Q = null;
    }
}
