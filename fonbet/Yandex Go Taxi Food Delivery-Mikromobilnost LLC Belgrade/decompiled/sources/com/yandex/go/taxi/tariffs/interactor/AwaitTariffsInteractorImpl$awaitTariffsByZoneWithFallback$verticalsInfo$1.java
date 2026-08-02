package com.yandex.go.taxi.tariffs.interactor;

import com.yandex.go.zone.model.Zone;
import defpackage.dk31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ldk31;", "<anonymous>", "(Ltse;)Ldk31;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.tariffs.interactor.AwaitTariffsInteractorImpl$awaitTariffsByZoneWithFallback$verticalsInfo$1", f = "AwaitTariffsInteractorImpl.kt", l = {25}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class AwaitTariffsInteractorImpl$awaitTariffsByZoneWithFallback$verticalsInfo$1 extends SuspendLambda implements wls {
    final /* synthetic */ Zone $zone;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldk31;", "verticalsInfo", "", "<anonymous>", "(Ldk31;)Z"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.tariffs.interactor.AwaitTariffsInteractorImpl$awaitTariffsByZoneWithFallback$verticalsInfo$1$1", f = "AwaitTariffsInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.tariffs.interactor.AwaitTariffsInteractorImpl$awaitTariffsByZoneWithFallback$verticalsInfo$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ Zone $zone;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Zone zone, Continuation continuation) {
            super(2, continuation);
            this.$zone = zone;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$zone, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((dk31) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            dk31 dk31Var = (dk31) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return Boolean.valueOf(dk31Var.c.i(this.$zone));
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwaitTariffsInteractorImpl$awaitTariffsByZoneWithFallback$verticalsInfo$1(b bVar, Zone zone, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$zone = zone;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AwaitTariffsInteractorImpl$awaitTariffsByZoneWithFallback$verticalsInfo$1(this.this$0, this.$zone, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AwaitTariffsInteractorImpl$awaitTariffsByZoneWithFallback$verticalsInfo$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        r0 r0Var = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.this$0.a).j.d;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$zone, null);
        this.label = 1;
        Object x = kotlinx.coroutines.flow.e.x(r0Var, anonymousClass1, this);
        return x == coroutineSingletons ? coroutineSingletons : x;
    }
}
