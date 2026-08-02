package com.yandex.go.taxi.order.map.passenger_detection;

import com.yandex.go.taxi.order.experiments.TaxiTravelerPassengerGpsExperiment;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.a3y0;
import defpackage.bvf0;
import defpackage.cjw0;
import defpackage.qn11;
import defpackage.sk90;
import defpackage.sxe;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class a {
    public final cjw0 a;
    public final sxe b;
    public final tt2 c;
    public final a3y0 d = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "PassengerDetectionRepository");
    public final r0 e = bvf0.c(Boolean.FALSE);
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public a(cjw0 cjw0Var, sxe sxeVar, tt2 tt2Var) {
        this.a = cjw0Var;
        this.b = sxeVar;
        this.c = tt2Var;
    }

    public final TaxiTravelerPassengerGpsExperiment a() {
        OrderStatusInfo V = this.b.a.b().V();
        TaxiTravelerPassengerGpsExperiment.Companion.getClass();
        V.getClass();
        qn11 b = V.b(TaxiTravelerPassengerGpsExperiment.class);
        if (b == null) {
            b = TaxiTravelerPassengerGpsExperiment.g;
        }
        return (TaxiTravelerPassengerGpsExperiment) b;
    }

    public final Object b(ArrayList arrayList, Continuation continuation) {
        this.c.getClass();
        Object k0 = tje.k0(uyj.a, new PassengerDetectionRepository$processDriverPath$2(this, arrayList, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public final Object c(sk90 sk90Var, Continuation continuation) {
        this.c.getClass();
        Object k0 = tje.k0(uyj.a, new PassengerDetectionRepository$processUserLocation$2(this, sk90Var, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
