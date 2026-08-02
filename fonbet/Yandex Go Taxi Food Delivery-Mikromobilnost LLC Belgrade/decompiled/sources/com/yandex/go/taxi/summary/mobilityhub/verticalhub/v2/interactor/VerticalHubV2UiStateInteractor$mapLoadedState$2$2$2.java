package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.interactor;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.model.ModalState;
import defpackage.gxu;
import defpackage.iyu;
import defpackage.le31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.w511;
import defpackage.wls;
import defpackage.y9o;
import defpackage.z0v;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/model/ModalState;", "modalState", "Lle31;", "<anonymous>", "(Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/model/ModalState;)Lle31;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.interactor.VerticalHubV2UiStateInteractor$mapLoadedState$2$2$2", f = "VerticalHubV2UiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class VerticalHubV2UiStateInteractor$mapLoadedState$2$2$2 extends SuspendLambda implements wls {
    final /* synthetic */ iyu $footer;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalHubV2UiStateInteractor$mapLoadedState$2$2$2(q qVar, iyu iyuVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qVar;
        this.$footer = iyuVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        VerticalHubV2UiStateInteractor$mapLoadedState$2$2$2 verticalHubV2UiStateInteractor$mapLoadedState$2$2$2 = new VerticalHubV2UiStateInteractor$mapLoadedState$2$2$2(this.this$0, this.$footer, continuation);
        verticalHubV2UiStateInteractor$mapLoadedState$2$2$2.L$0 = obj;
        return verticalHubV2UiStateInteractor$mapLoadedState$2$2$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VerticalHubV2UiStateInteractor$mapLoadedState$2$2$2) create((ModalState) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        q qVar = this.this$0;
        iyu iyuVar = this.$footer;
        com.yandex.go.taxi.summary.mobilityhub.mapper.e eVar = qVar.e;
        int i = a.d[modalState.ordinal()];
        if (i == 1 || i == 2) {
            pair = new Pair(eVar.e(), iyuVar != null ? new iyu(iyuVar.a, null) : null);
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            pair = new Pair(eVar.e(), null);
        }
        return new le31(EmptyList.a, (iyu) pair.getSecond(), (y9o) pair.getFirst(), null, z0v.a, false, gxu.a, null);
    }
}
