package com.yandex.go.taxi.order.map;

import defpackage.cfj0;
import defpackage.etk0;
import defpackage.ftk0;
import defpackage.itk0;
import defpackage.jqr;
import defpackage.ltk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.map.RoadObjectsOverlayPresenter$attachView$1", f = "RoadObjectsOverlayPresenter.kt", l = {36}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RoadObjectsOverlayPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ ltk0 $mvpView;
    int label;
    final /* synthetic */ r this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.taxi.order.map.RoadObjectsOverlayPresenter$attachView$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements zls {
        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            itk0 itk0Var = (itk0) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            ((r) this.receiver).getClass();
            return booleanValue ? itk0Var : ftk0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoadObjectsOverlayPresenter$attachView$1(r rVar, ltk0 ltk0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = rVar;
        this.$mvpView = ltk0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RoadObjectsOverlayPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RoadObjectsOverlayPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n nVar = this.this$0.x;
            r0 r0Var = nVar.g.c;
            etk0 etk0Var = nVar.b;
            tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.I(kotlinx.coroutines.flow.e.n(r0Var, etk0Var.b, etk0Var.d, new RoadObjectsInteractor$trafficLightsUiStateFlow$1(4, null)), new RoadObjectsInteractor$trafficLightsUiStateFlow$2(nVar, null)));
            r rVar = this.this$0;
            m0 m0Var = new m0(t, new jqr(kotlinx.coroutines.flow.e.t(new q(new m0(new k(rVar.x.b.b), rVar.A, RoadObjectsOverlayPresenter$visibilityFlow$1.a))), new RoadObjectsOverlayPresenter$visibilityFlow$3(rVar, null), 3), new AnonymousClass1(3, this.this$0, r.class, "getRoadObjectUiState", "getRoadObjectUiState(Lcom/yandex/go/taxi/order/map/model/RoadObjectUiState;Z)Lcom/yandex/go/taxi/order/map/model/RoadObjectUiState;", 4));
            cfj0 cfj0Var = new cfj0(7, this.$mvpView);
            this.label = 1;
            if (m0Var.collect(cfj0Var, this) == coroutineSingletons) {
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
