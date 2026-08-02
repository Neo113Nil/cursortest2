package com.yandex.go.navigator.gas_stations.overview;

import android.content.Context;
import com.yandex.go.navigator.domain.t;
import com.yandex.go.navigator.gas_stations.repositories.GasStationsFocusRectReadyRequestRepository;
import com.yandex.go.navigator.repository.o;
import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.navigation.automotive.Guidance;
import com.yandex.mapkit.navigation.automotive.Navigation;
import defpackage.ah00;
import defpackage.bu0;
import defpackage.bwa1;
import defpackage.e840;
import defpackage.ewc;
import defpackage.fwc;
import defpackage.gcc0;
import defpackage.h3y;
import defpackage.hcc0;
import defpackage.ip11;
import defpackage.jvs;
import defpackage.kts;
import defpackage.m230;
import defpackage.mvs;
import defpackage.ny61;
import defpackage.ows;
import defpackage.prq;
import defpackage.pv0;
import defpackage.pwy0;
import defpackage.pzf;
import defpackage.rs0;
import defpackage.tus;
import defpackage.u45;
import defpackage.v1g;
import defpackage.w030;
import defpackage.w1g;
import defpackage.wb50;
import defpackage.wvs;
import defpackage.x1g;
import defpackage.xb50;
import defpackage.xvf0;
import defpackage.y950;
import defpackage.yce;
import defpackage.z950;
import defpackage.zuj0;
import defpackage.zzs;
import java.io.Serializable;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class j extends m230 {
    public final w030 E;
    public final jvs F;
    public final wvs G;
    public final prq H;
    public final h3y I;
    public final ru.yandex.taxi.deeplinks.e J;
    public final z950 K;
    public final t L;
    public final com.yandex.go.navigator.events.f M;
    public final com.yandex.go.navigator.map_interactions.parkings.c N;
    public final com.yandex.go.navigator.gas_stations.repositories.c O;
    public GasStationsOverviewView P;

    public j(w030 w030Var, jvs jvsVar, wvs wvsVar, prq prqVar, h3y h3yVar, ru.yandex.taxi.deeplinks.e eVar, z950 z950Var, t tVar, com.yandex.go.navigator.events.f fVar, com.yandex.go.navigator.map_interactions.parkings.c cVar, com.yandex.go.navigator.gas_stations.repositories.c cVar2) {
        super(null);
        this.E = w030Var;
        this.F = jvsVar;
        this.G = wvsVar;
        this.H = prqVar;
        this.I = h3yVar;
        this.J = eVar;
        this.K = z950Var;
        this.L = tVar;
        this.M = fVar;
        this.N = cVar;
        this.O = cVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable T(j jVar, GeoObject geoObject, ContinuationImpl continuationImpl) {
        GasStationsOverviewRouter$getAddress$1 gasStationsOverviewRouter$getAddress$1;
        int i;
        jVar.getClass();
        if (continuationImpl instanceof GasStationsOverviewRouter$getAddress$1) {
            gasStationsOverviewRouter$getAddress$1 = (GasStationsOverviewRouter$getAddress$1) continuationImpl;
            int i2 = gasStationsOverviewRouter$getAddress$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gasStationsOverviewRouter$getAddress$1.label = i2 - Integer.MIN_VALUE;
                Object obj = gasStationsOverviewRouter$getAddress$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gasStationsOverviewRouter$getAddress$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zzs b = bwa1.b(geoObject);
                    if (b == null) {
                        return null;
                    }
                    ru.yandex.taxi.deeplinks.e eVar = jVar.J;
                    gasStationsOverviewRouter$getAddress$1.L$0 = null;
                    gasStationsOverviewRouter$getAddress$1.L$1 = null;
                    gasStationsOverviewRouter$getAddress$1.label = 1;
                    obj = ru.yandex.taxi.deeplinks.e.b(eVar, b, gasStationsOverviewRouter$getAddress$1, 30);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((pv0) obj).a;
            }
        }
        gasStationsOverviewRouter$getAddress$1 = new GasStationsOverviewRouter$getAddress$1(jVar, continuationImpl);
        Object obj2 = gasStationsOverviewRouter$getAddress$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gasStationsOverviewRouter$getAddress$1.label;
        if (i != 0) {
        }
        return ((pv0) obj2).a;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        ((hcc0) ((gcc0) this.I.get())).a();
        U(true);
        this.P = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        U(false);
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        mvs mvsVar = new mvs(this);
        pzf pzfVar = this.F.a;
        h hVar = new h(mvsVar, (zuj0) ((xvf0) pzfVar.a).get(), (tus) ((xvf0) pzfVar.c).get(), (a) ((xvf0) pzfVar.d).get(), (com.yandex.go.navigator.gas_stations.repositories.c) ((xvf0) pzfVar.i).get(), (ows) ((xvf0) pzfVar.e).get(), (xb50) ((e840) pzfVar.f).get(), (com.yandex.go.navigator.a) ((rs0) pzfVar.g).get(), (pwy0) ((xvf0) pzfVar.h).get(), (o) ((x1g) pzfVar.j).get(), (ru.yandex.taxi.deeplinks.e) ((v1g) pzfVar.k).get(), (com.yandex.go.navigator.gas_stations.analytics.a) ((w1g) pzfVar.l).get(), (kts) ((xvf0) pzfVar.m).get(), (GasStationsFocusRectReadyRequestRepository) ((xvf0) pzfVar.b).get());
        bu0 bu0Var = this.G.a;
        GasStationsOverviewView gasStationsOverviewView = new GasStationsOverviewView(hVar, (ip11) ((w1g) bu0Var.a).get(), (Context) ((xvf0) bu0Var.b).get(), (ru.yandex.taxi.discovery.a) ((rs0) bu0Var.c).get(), (ah00) ((v1g) bu0Var.d).get(), (o) ((xvf0) bu0Var.e).get(), (ewc) ((fwc) bu0Var.f).get(), (com.yandex.go.navigator.domain.e) ((v1g) bu0Var.g).get(), (wb50) ((xvf0) bu0Var.h).get(), (com.yandex.go.navigator.analitycs.a) ((w1g) bu0Var.i).get());
        this.P = gasStationsOverviewView;
        return gasStationsOverviewView;
    }

    public final void U(boolean z) {
        Guidance guidance;
        r0 r0Var = this.K.a;
        r0Var.m(null, new y950(((y950) r0Var.getValue()).a, z, z, z));
        this.M.b(new yce(z, 5), true);
        Navigation navigation = this.L.w;
        if (navigation != null && (guidance = navigation.getGuidance()) != null) {
            guidance.setEnableAlternatives(z);
        }
        com.yandex.go.navigator.map_interactions.parkings.c cVar = this.N;
        if (z) {
            r0 r0Var2 = cVar.c;
            Boolean valueOf = Boolean.valueOf(cVar.b.g("car_parks_visibility", false));
            r0Var2.getClass();
            r0Var2.m(null, valueOf);
            return;
        }
        r0 r0Var3 = cVar.c;
        Boolean bool = Boolean.FALSE;
        r0Var3.getClass();
        r0Var3.m(null, bool);
    }
}
