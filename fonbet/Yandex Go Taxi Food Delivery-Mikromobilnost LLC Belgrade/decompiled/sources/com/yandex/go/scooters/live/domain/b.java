package com.yandex.go.scooters.live.domain;

import android.os.SystemClock;
import com.yandex.go.scooters.domain.model.ScootersNotificationType;
import com.yandex.go.scooters.live.data.model.ScootersLiveActivityExperiment;
import defpackage.m2o0;
import defpackage.ny61;
import defpackage.o2o0;
import defpackage.rwn0;
import defpackage.sqm0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uh6;
import defpackage.uyj;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.scooters.data.g;

/* loaded from: classes8.dex */
public final class b {
    public final tt2 a;
    public final com.yandex.go.analytics.b b;
    public final m2o0 c;
    public final rwn0 d;
    public final g e;

    public b(tt2 tt2Var, com.yandex.go.analytics.b bVar, m2o0 m2o0Var, rwn0 rwn0Var, g gVar) {
        this.a = tt2Var;
        this.b = bVar;
        this.c = m2o0Var;
        this.d = rwn0Var;
        this.e = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ScootersLiveIsActiveInteractor$isLiveActive$1 scootersLiveIsActiveInteractor$isLiveActive$1;
        int i;
        b bVar;
        if (continuationImpl instanceof ScootersLiveIsActiveInteractor$isLiveActive$1) {
            scootersLiveIsActiveInteractor$isLiveActive$1 = (ScootersLiveIsActiveInteractor$isLiveActive$1) continuationImpl;
            int i2 = scootersLiveIsActiveInteractor$isLiveActive$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersLiveIsActiveInteractor$isLiveActive$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersLiveIsActiveInteractor$isLiveActive$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersLiveIsActiveInteractor$isLiveActive$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersLiveIsActiveInteractor$isLiveActive$1.L$0 = this;
                    scootersLiveIsActiveInteractor$isLiveActive$1.label = 1;
                    obj = this.d.a.b(scootersLiveIsActiveInteractor$isLiveActive$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bVar = this;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bVar = (b) scootersLiveIsActiveInteractor$isLiveActive$1.L$0;
                    kotlin.b.b(obj);
                }
                return Boolean.valueOf(bVar.b((ScootersLiveActivityExperiment) obj, this.e.a(), false));
            }
        }
        scootersLiveIsActiveInteractor$isLiveActive$1 = new ScootersLiveIsActiveInteractor$isLiveActive$1(this, continuationImpl);
        Object obj2 = scootersLiveIsActiveInteractor$isLiveActive$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersLiveIsActiveInteractor$isLiveActive$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(bVar.b((ScootersLiveActivityExperiment) obj2, this.e.a(), false));
    }

    public final boolean b(ScootersLiveActivityExperiment scootersLiveActivityExperiment, sqm0 sqm0Var, boolean z) {
        boolean z2 = scootersLiveActivityExperiment.b;
        boolean e = ((o2o0) this.c).e(ScootersNotificationType.SYSTEM);
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("current_time_ms", Long.valueOf(SystemClock.elapsedRealtime()));
        mapBuilder.put("experiment_is_enabled", Boolean.valueOf(z2));
        mapBuilder.put("orders_state", Integer.valueOf(uh6.A(sqm0Var)));
        mapBuilder.put("channel_enabled", Boolean.valueOf(e));
        mapBuilder.put("invoked_from_flow", Boolean.valueOf(z));
        this.b.b("Scooters.Live.LiveIsActive", mapBuilder.j());
        return z2 && uh6.A(sqm0Var) == 1 && e;
    }

    public final tpr c() {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("current_time_ms", Long.valueOf(SystemClock.elapsedRealtime()));
        this.b.b("Scooters.Live.IsLiveActiveFlow", mapBuilder.j());
        ScootersLiveActivityExperiment.Companion.getClass();
        tpr t = e.t(new m0(com.yandex.go.scooters.utils.a.a(this.d, ScootersLiveActivityExperiment.c), this.e.b(false), new ScootersLiveIsActiveInteractor$isLiveActiveFlow$1(3, this, b.class, "isLiveActive", "isLiveActive(Lcom/yandex/go/scooters/live/data/model/ScootersLiveActivityExperiment;Lru/yandex/taxi/scooters/domain/model/ScootersActiveOrdersState;Z)Z", 4)));
        this.a.getClass();
        return e.F(t, uyj.a);
    }
}
