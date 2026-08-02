package com.yandex.go.zone.repository;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/yandex/go/zone/repository/ZoneAnticrisisAmExperiment;", "experiment", "Lzy11;", "<unused var>", "", "", "<anonymous>", "(Lcom/yandex/go/zone/repository/ZoneAnticrisisAmExperiment;V)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.zone.repository.ZoneAnticrisisInteractorImpl$lastZoneCountryCodes$2", f = "ZoneAnticrisisInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class ZoneAnticrisisInteractorImpl$lastZoneCountryCodes$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoneAnticrisisInteractorImpl$lastZoneCountryCodes$2(d dVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = dVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ZoneAnticrisisInteractorImpl$lastZoneCountryCodes$2 zoneAnticrisisInteractorImpl$lastZoneCountryCodes$2 = new ZoneAnticrisisInteractorImpl$lastZoneCountryCodes$2(this.this$0, (Continuation) obj3);
        zoneAnticrisisInteractorImpl$lastZoneCountryCodes$2.L$0 = (ZoneAnticrisisAmExperiment) obj;
        return zoneAnticrisisInteractorImpl$lastZoneCountryCodes$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ZoneAnticrisisAmExperiment zoneAnticrisisAmExperiment = (ZoneAnticrisisAmExperiment) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (zoneAnticrisisAmExperiment.b) {
            return this.this$0.a.g(zoneAnticrisisAmExperiment.c, "zone_country_codes");
        }
        return null;
    }
}
