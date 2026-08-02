package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.interactor;

import com.yandex.go.taxi.summary.mobilityhub.mapper.d;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.model.ModalState;
import defpackage.gyu;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sc31;
import defpackage.tc31;
import defpackage.w511;
import defpackage.wls;
import defpackage.z9o;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/model/ModalState;", "modalState", "Lsc31;", "<anonymous>", "(Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/model/ModalState;)Lsc31;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.interactor.VerticalHubV1UiStateInteractor$mapLoadedState$2$1", f = "VerticalHubV1UiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class VerticalHubV1UiStateInteractor$mapLoadedState$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ gyu $footer;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalHubV1UiStateInteractor$mapLoadedState$2$1(c cVar, gyu gyuVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$footer = gyuVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        VerticalHubV1UiStateInteractor$mapLoadedState$2$1 verticalHubV1UiStateInteractor$mapLoadedState$2$1 = new VerticalHubV1UiStateInteractor$mapLoadedState$2$1(this.this$0, this.$footer, continuation);
        verticalHubV1UiStateInteractor$mapLoadedState$2$1.L$0 = obj;
        return verticalHubV1UiStateInteractor$mapLoadedState$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VerticalHubV1UiStateInteractor$mapLoadedState$2$1) create((ModalState) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair;
        ModalState modalState = (ModalState) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c cVar = this.this$0;
        gyu gyuVar = this.$footer;
        d dVar = cVar.h;
        int i = tc31.a[modalState.ordinal()];
        if (i == 1) {
            pair = new Pair(dVar.b(true), null);
        } else if (i == 2) {
            pair = new Pair(dVar.b(false), gyuVar);
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            pair = new Pair(dVar.b(false), null);
        }
        z9o z9oVar = (z9o) pair.getFirst();
        return new sc31(EmptyList.a, (gyu) pair.getSecond(), z9oVar);
    }
}
