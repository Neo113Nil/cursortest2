package com.yandex.go.scooters.ignition.data;

import defpackage.mdh;
import defpackage.qwo0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class j {
    public final tt2 a;
    public final qwo0 b;

    public j(tt2 tt2Var, qwo0 qwo0Var) {
        this.a = tt2Var;
        this.b = qwo0Var;
    }

    public final Object a(Continuation continuation) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new ScootersIgnitionTechnicalAnalyticsUuidRepository$getIgnitionUserSessionUuid$2(this, null), continuation);
    }

    public final Object b(Continuation continuation) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new ScootersIgnitionTechnicalAnalyticsUuidRepository$start$2(this, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public final Object c(Continuation continuation) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new ScootersIgnitionTechnicalAnalyticsUuidRepository$stop$2(this, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
