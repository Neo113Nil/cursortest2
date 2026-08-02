package com.yandex.go.pickuppoints.impl;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wh80;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.pickuppoints.impl.PickupPointsZoomLevelUpdateInteractor$onAttach$1", f = "PickupPointsZoomLevelUpdateInteractor.kt", l = {39}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PickupPointsZoomLevelUpdateInteractor$onAttach$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ o this$0;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/yandex/go/pickuppoints/impl/ClarifyPointsScreenStrategyConfigurationExperiment;", "", "experiment", PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX}, k = 3, mv = {2, 4, 0}, xi = 48)
    @mvg(c = "com.yandex.go.pickuppoints.impl.PickupPointsZoomLevelUpdateInteractor$onAttach$1$2", f = "PickupPointsZoomLevelUpdateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.pickuppoints.impl.PickupPointsZoomLevelUpdateInteractor$onAttach$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements zls {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(3, (Continuation) obj3);
            anonymousClass2.L$0 = (ClarifyPointsScreenStrategyConfigurationExperiment) obj;
            anonymousClass2.L$1 = (String) obj2;
            return anonymousClass2.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ClarifyPointsScreenStrategyConfigurationExperiment clarifyPointsScreenStrategyConfigurationExperiment = (ClarifyPointsScreenStrategyConfigurationExperiment) this.L$0;
            String str = (String) this.L$1;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return new Pair(clarifyPointsScreenStrategyConfigurationExperiment, str);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickupPointsZoomLevelUpdateInteractor$onAttach$1(o oVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PickupPointsZoomLevelUpdateInteractor$onAttach$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PickupPointsZoomLevelUpdateInteractor$onAttach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            m0 m0Var = new m0(this.this$0.d.a(), kotlinx.coroutines.flow.e.t(new n(((com.yandex.go.taxi.tariffs.internal.repository.k) this.this$0.b).j.b())), new AnonymousClass2(3, null));
            wh80 wh80Var = new wh80(17, this.this$0);
            this.label = 1;
            if (m0Var.collect(wh80Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
