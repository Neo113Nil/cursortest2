package com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl;

import defpackage.l8x;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.EnsureUserHasSourceAddressInteractor$ensureUserHasAddressAndZone$1", f = "EnsureUserHasSourceAddressInteractor.kt", l = {47}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class EnsureUserHasSourceAddressInteractor$ensureUserHasAddressAndZone$1 extends SuspendLambda implements wls {
    final /* synthetic */ l8x $initiateLocationRequestJob;
    final /* synthetic */ l8x $listenToAddressJob;
    final /* synthetic */ sls $onZoneReady;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ld0l0;", "<unused var>", "Lcom/yandex/go/zone/model/Zone;", "Lzy11;", "<anonymous>", "(Ld0l0;Lcom/yandex/go/zone/model/Zone;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.EnsureUserHasSourceAddressInteractor$ensureUserHasAddressAndZone$1$1", f = "EnsureUserHasSourceAddressInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.EnsureUserHasSourceAddressInteractor$ensureUserHasAddressAndZone$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements zls {
        int label;

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(3, (Continuation) obj3);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return zy11.a;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnsureUserHasSourceAddressInteractor$ensureUserHasAddressAndZone$1(a aVar, l8x l8xVar, l8x l8xVar2, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$initiateLocationRequestJob = l8xVar;
        this.$listenToAddressJob = l8xVar2;
        this.$onZoneReady = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EnsureUserHasSourceAddressInteractor$ensureUserHasAddressAndZone$1(this.this$0, this.$initiateLocationRequestJob, this.$listenToAddressJob, this.$onZoneReady, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EnsureUserHasSourceAddressInteractor$ensureUserHasAddressAndZone$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            m0 m0Var = new m0(new mth(this.this$0.c.k(), 6), new mth(this.this$0.b.a, 6), new AnonymousClass1(3, null));
            this.label = 1;
            if (kotlinx.coroutines.flow.e.y(m0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.$initiateLocationRequestJob.a(null);
        this.$listenToAddressJob.a(null);
        this.$onZoneReady.invoke();
        return zy11.a;
    }
}
