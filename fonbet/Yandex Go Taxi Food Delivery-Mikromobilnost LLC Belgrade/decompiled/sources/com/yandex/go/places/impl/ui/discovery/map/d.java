package com.yandex.go.places.impl.ui.discovery.map;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.places.impl.domain.entities.FavoritesState;
import com.yandex.go.places.impl.domain.interactors.map.e;
import com.yandex.go.places.impl.domain.interactors.map.f;
import com.yandex.go.places.map.data.repositories.h;
import com.yandex.go.places.map.data.repositories.i;
import com.yandex.go.places.map.domain.entities.PinLayer;
import com.yandex.mapkit.ConflictResolutionMode;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.MapObjectCollection;
import com.yandex.mapkit.map.MapWindow;
import defpackage.ah00;
import defpackage.an91;
import defpackage.aq80;
import defpackage.b2c0;
import defpackage.d30;
import defpackage.e2c0;
import defpackage.fdc0;
import defpackage.gh00;
import defpackage.go80;
import defpackage.hdc0;
import defpackage.ike;
import defpackage.in00;
import defpackage.jl40;
import defpackage.k8c;
import defpackage.kdc0;
import defpackage.l050;
import defpackage.l2c0;
import defpackage.ldc0;
import defpackage.lg80;
import defpackage.n1c0;
import defpackage.ney;
import defpackage.nw70;
import defpackage.ny61;
import defpackage.o7c0;
import defpackage.odc0;
import defpackage.ohh;
import defpackage.pdc0;
import defpackage.pwy0;
import defpackage.pzt0;
import defpackage.q6c0;
import defpackage.qc5;
import defpackage.qdc0;
import defpackage.qfc0;
import defpackage.qvv;
import defpackage.s1c0;
import defpackage.s6c0;
import defpackage.t1c0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.tzb0;
import defpackage.w1c0;
import defpackage.w511;
import defpackage.x43;
import defpackage.y1c0;
import defpackage.yac0;
import defpackage.yz4;
import defpackage.zy11;
import java.util.Collections;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.yandexmaps.multiplatform.pin.war.ClusteringZoomStep;

/* loaded from: classes13.dex */
public final class d extends qc5 {
    public final String A;
    public final lg80 B;
    public final Context C;
    public final odc0 D;
    public final h E;
    public final i F;
    public final f G;
    public final com.yandex.go.places.map.ui.pinwar.a H;
    public final o7c0 I;
    public final go80 J;
    public final yac0 K;
    public final s6c0 L;
    public final e M;
    public final com.yandex.go.places.impl.domain.interactors.common.a N;
    public final yz4 O;
    public final com.yandex.go.places.impl.domain.interactors.discovery.map.a P;
    public final ah00 Q;
    public final pwy0 R;
    public final ohh S;
    public final qvv T;
    public final d30 U;
    public final com.yandex.go.places.map.ui.configs.cluster.a V;
    public final l2c0 W;
    public final qdc0 Z;
    public final qfc0 a0;
    public final e2c0 b0;
    public String c0;
    public in00 d0;
    public pzt0 e0;
    public pzt0 f0;
    public pzt0 g0;
    public boolean h0;
    public boolean i0;
    public FavoritesState j0;

    public d(Lifecycle lifecycle, String str, lg80 lg80Var, Context context, odc0 odc0Var, h hVar, i iVar, f fVar, com.yandex.go.places.map.ui.pinwar.a aVar, o7c0 o7c0Var, go80 go80Var, yac0 yac0Var, s6c0 s6c0Var, e eVar, com.yandex.go.places.impl.domain.interactors.common.a aVar2, yz4 yz4Var, com.yandex.go.places.impl.domain.interactors.discovery.map.a aVar3, ah00 ah00Var, pwy0 pwy0Var, ohh ohhVar, qvv qvvVar, d30 d30Var, com.yandex.go.places.map.ui.configs.cluster.a aVar4, l2c0 l2c0Var, qdc0 qdc0Var, qfc0 qfc0Var) {
        super(l050.class, new ney(lifecycle));
        this.A = str;
        this.B = lg80Var;
        this.C = context;
        this.D = odc0Var;
        this.E = hVar;
        this.F = iVar;
        this.G = fVar;
        this.H = aVar;
        this.I = o7c0Var;
        this.J = go80Var;
        this.K = yac0Var;
        this.L = s6c0Var;
        this.M = eVar;
        this.N = aVar2;
        this.O = yz4Var;
        this.P = aVar3;
        this.Q = ah00Var;
        this.R = pwy0Var;
        this.S = ohhVar;
        this.T = qvvVar;
        this.U = d30Var;
        this.V = aVar4;
        this.W = l2c0Var;
        this.Z = qdc0Var;
        this.a0 = qfc0Var;
        this.b0 = new e2c0();
        this.h0 = true;
        this.j0 = FavoritesState.NOT_SELECTED;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Mg(d dVar, ContinuationImpl continuationImpl) {
        PlacesDiscoveryMapSocialPinsPresenter$removeMapObjects$1 placesDiscoveryMapSocialPinsPresenter$removeMapObjects$1;
        int i;
        ru.yandex.yandexmaps.multiplatform.pin.war.c cVar;
        dVar.getClass();
        if (continuationImpl instanceof PlacesDiscoveryMapSocialPinsPresenter$removeMapObjects$1) {
            placesDiscoveryMapSocialPinsPresenter$removeMapObjects$1 = (PlacesDiscoveryMapSocialPinsPresenter$removeMapObjects$1) continuationImpl;
            int i2 = placesDiscoveryMapSocialPinsPresenter$removeMapObjects$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesDiscoveryMapSocialPinsPresenter$removeMapObjects$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesDiscoveryMapSocialPinsPresenter$removeMapObjects$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesDiscoveryMapSocialPinsPresenter$removeMapObjects$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    i iVar = dVar.F;
                    placesDiscoveryMapSocialPinsPresenter$removeMapObjects$1.label = 1;
                    if (iVar.z(placesDiscoveryMapSocialPinsPresenter$removeMapObjects$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                e2c0 e2c0Var = dVar.b0;
                cVar = e2c0Var.a;
                if (cVar != null) {
                    cVar.o();
                }
                tzb0 tzb0Var = e2c0Var.b;
                tzb0Var.a.clear();
                tzb0Var.b.clear();
                dVar.c0 = null;
                dVar.d0 = null;
                return zy11.a;
            }
        }
        placesDiscoveryMapSocialPinsPresenter$removeMapObjects$1 = new PlacesDiscoveryMapSocialPinsPresenter$removeMapObjects$1(dVar, continuationImpl);
        Object obj2 = placesDiscoveryMapSocialPinsPresenter$removeMapObjects$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesDiscoveryMapSocialPinsPresenter$removeMapObjects$1.label;
        if (i != 0) {
        }
        e2c0 e2c0Var2 = dVar.b0;
        cVar = e2c0Var2.a;
        if (cVar != null) {
        }
        tzb0 tzb0Var2 = e2c0Var2.b;
        tzb0Var2.a.clear();
        tzb0Var2.b.clear();
        dVar.c0 = null;
        dVar.d0 = null;
        return zy11.a;
    }

    @Override // defpackage.qc5, defpackage.ad5, defpackage.zc5
    public final void Bg(l050 l050Var) {
        MapWindow mapWindow;
        ru.yandex.yandexmaps.multiplatform.pin.war.c a;
        ClusteringZoomStep clusteringZoomStep;
        d dVar = this;
        super.Bg(l050Var);
        PinLayer pinLayer = PinLayer.SOCIAL;
        d30 d30Var = dVar.U;
        x43 x43Var = d30Var.a;
        x43Var.addLast(pinLayer);
        d30Var.b.l(x43Var.h());
        dVar.H.b();
        e2c0 e2c0Var = dVar.b0;
        ru.yandex.yandexmaps.multiplatform.pin.war.c cVar = e2c0Var.a;
        if (cVar != null) {
            cVar.o();
        }
        e2c0Var.a = null;
        tzb0 tzb0Var = e2c0Var.b;
        tzb0Var.a.clear();
        tzb0Var.b.clear();
        dVar.c0 = null;
        dVar.d0 = null;
        if (e2c0Var.a == null) {
            TaxiMapView h = ((gh00) dVar.Q).h();
            if (h == null || (mapWindow = h.getMapWindow()) == null) {
                return;
            }
            float f = dVar.C.getResources().getDisplayMetrics().density;
            o7c0 o7c0Var = dVar.I;
            float o = o7c0Var.o();
            odc0 odc0Var = dVar.D;
            fdc0 fdc0Var = new fdc0(f, o, odc0Var);
            an91 an91Var = odc0Var.h;
            boolean z = an91Var instanceof ldc0;
            qdc0 qdc0Var = dVar.Z;
            if (z) {
                Map map = mapWindow.getMap();
                ldc0 ldc0Var = (ldc0) an91Var;
                qdc0Var.getClass();
                t1c0 t1c0Var = new t1c0(ldc0Var.a);
                float f2 = ldc0Var.b;
                int i = pdc0.b[ldc0Var.d.ordinal()];
                if (i == 1) {
                    clusteringZoomStep = ClusteringZoomStep.FULL;
                } else if (i == 2) {
                    clusteringZoomStep = ClusteringZoomStep.HALF;
                } else if (i == 3) {
                    clusteringZoomStep = ClusteringZoomStep.QUARTER;
                } else {
                    if (i != 4) {
                        w511.b();
                        return;
                    }
                    clusteringZoomStep = ClusteringZoomStep.EIGHTH;
                }
                w1c0 w1c0Var = new w1c0(t1c0Var, f2, clusteringZoomStep);
                n1c0 a2 = qdc0.a(ldc0Var.e);
                Float f3 = ldc0Var.f;
                s1c0 b = qdc0.b(ldc0Var.c);
                MapObjectCollection addCollection = map.getMapObjects().addCollection();
                dVar.S.getClass();
                k8c k8cVar = new k8c(map);
                y1c0 y1c0Var = new y1c0(mapWindow);
                aq80 aq80Var = new aq80(addCollection);
                new b2c0();
                a = b2c0.a(k8cVar, y1c0Var, f, new q6c0(0, new nw70(21, o7c0Var), o7c0Var, dVar.V), dVar.W, w1c0Var, fdc0Var, aq80Var, null, a2, f3, b);
                ru.yandex.yandexmaps.multiplatform.pin.war.internal.painter.a aVar = a.x;
                aVar.i.add(new PlacesDiscoveryMapSocialPinsPresenter$attachPins$1$1(1, dVar, d.class, "pinTapListener", "pinTapListener(Lru/yandex/yandexmaps/multiplatform/pin/war/PinId;)Z", 0));
                dVar = this;
                aVar.h.add(new PlacesDiscoveryMapSocialPinsPresenter$attachPins$1$2(1, dVar, d.class, "clusterTapListener", "clusterTapListener(Lru/yandex/yandexmaps/multiplatform/pin/war/ClusterPinId;)Z", 0));
            } else {
                if (!an91Var.equals(kdc0.a)) {
                    w511.b();
                    return;
                }
                Map map2 = mapWindow.getMap();
                hdc0 hdc0Var = odc0Var.i;
                qdc0Var.getClass();
                a = ohh.a(dVar.S, map2, mapWindow, dVar.I, dVar.W, fdc0Var, f, null, qdc0.a(hdc0Var), qdc0.b(odc0Var.j), 192);
                a.x.i.add(new PlacesDiscoveryMapSocialPinsPresenter$attachPins$2$1(1, dVar, d.class, "pinTapListener", "pinTapListener(Lru/yandex/yandexmaps/multiplatform/pin/war/PinId;)Z", 0));
            }
            e2c0Var.a = a;
        }
        e2c0.d((ike) dVar.Jg(), dVar.F.i, new PlacesDiscoveryMapSocialPinsPresenter$attachPins$3(1, dVar, d.class, "renderPins", "renderPins(Lcom/yandex/go/places/map/domain/entities/SocialPinsUpdateInfo;)V", 0));
        tje.N(dVar.Jg(), null, null, new PlacesDiscoveryMapSocialPinsPresenter$attachPins$4(dVar, null), 3);
    }

    @Override // defpackage.qc5, defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        pzt0 pzt0Var = this.g0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.g0 = null;
        pzt0 pzt0Var2 = this.f0;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.f0 = null;
        pzt0 pzt0Var3 = this.e0;
        if (pzt0Var3 != null) {
            pzt0Var3.a(null);
        }
        this.e0 = null;
        this.F.b();
        e2c0 e2c0Var = this.b0;
        ru.yandex.yandexmaps.multiplatform.pin.war.c cVar = e2c0Var.a;
        if (cVar != null) {
            cVar.o();
        }
        tzb0 tzb0Var = e2c0Var.b;
        tzb0Var.a.clear();
        tzb0Var.b.clear();
        this.c0 = null;
        this.d0 = null;
        ru.yandex.yandexmaps.multiplatform.pin.war.c cVar2 = e2c0Var.a;
        if (cVar2 != null) {
            cVar2.o();
        }
        e2c0Var.a = null;
        tzb0 tzb0Var2 = e2c0Var.b;
        tzb0Var2.a.clear();
        tzb0Var2.b.clear();
        this.c0 = null;
        this.d0 = null;
        com.yandex.go.places.map.ui.pinwar.a aVar = this.H;
        aVar.c.b();
        ConflictResolutionMode conflictResolutionMode = aVar.d;
        if (conflictResolutionMode != null) {
            aVar.c(conflictResolutionMode);
        }
        aVar.d = null;
        PinLayer pinLayer = PinLayer.SOCIAL;
        d30 d30Var = this.U;
        x43 x43Var = d30Var.a;
        x43Var.remove(pinLayer);
        d30Var.b.l(x43Var.h());
    }

    public final void Ng(String str) {
        in00 in00Var = this.d0;
        if (in00Var == null || jl40.l(in00Var.getId(), str)) {
            return;
        }
        e2c0 e2c0Var = this.b0;
        ru.yandex.yandexmaps.multiplatform.pin.war.c cVar = e2c0Var.a;
        if (cVar != null) {
            cVar.n(Collections.singletonList(e2c0Var.b.a(in00Var)));
        }
        this.d0 = null;
    }

    @Override // defpackage.qc5
    public final void onStart() {
        pzt0 pzt0Var = this.g0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.g0 = tje.N(Jg(), null, null, new PlacesDiscoveryMapSocialPinsPresenter$subscribeToOverlayStateUpdates$$inlined$safeCollectIn$1(new b(this.O.e()), null, this), 3);
        tse Jg = Jg();
        tpr a = this.R.a();
        this.b0.a((ike) Jg, a);
    }
}
