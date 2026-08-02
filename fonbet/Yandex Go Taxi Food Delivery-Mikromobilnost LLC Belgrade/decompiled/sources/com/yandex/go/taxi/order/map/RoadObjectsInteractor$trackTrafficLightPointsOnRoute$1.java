package com.yandex.go.taxi.order.map;

import com.yandex.go.taxi.order.models.api.response.typed_experiments.RoadObjectSettingsExperiment;
import defpackage.h8l0;
import defpackage.jtk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.map.RoadObjectsInteractor$trackTrafficLightPointsOnRoute$1", f = "RoadObjectsInteractor.kt", l = {174}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RoadObjectsInteractor$trackTrafficLightPointsOnRoute$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ n this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.taxi.order.map.RoadObjectsInteractor$trackTrafficLightPointsOnRoute$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements zls {
        public static final AnonymousClass1 a = new AnonymousClass1(3, 4, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V");

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return new Pair((RoadObjectSettingsExperiment) obj, (h8l0) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoadObjectsInteractor$trackTrafficLightPointsOnRoute$1(n nVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RoadObjectsInteractor$trackTrafficLightPointsOnRoute$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RoadObjectsInteractor$trackTrafficLightPointsOnRoute$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            n nVar = this.this$0;
            m0 m0Var = new m0(nVar.b.c, nVar.d.k, AnonymousClass1.a);
            jtk0 jtk0Var = new jtk0(nVar, i2);
            this.label = 1;
            if (m0Var.collect(jtk0Var, this) == coroutineSingletons) {
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
