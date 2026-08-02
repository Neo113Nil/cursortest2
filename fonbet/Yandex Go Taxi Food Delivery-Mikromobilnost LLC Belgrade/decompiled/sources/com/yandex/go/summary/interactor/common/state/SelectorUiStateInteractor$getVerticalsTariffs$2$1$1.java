package com.yandex.go.summary.interactor.common.state;

import defpackage.bvf0;
import defpackage.elx0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vnx0;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.common.state.SelectorUiStateInteractor$getVerticalsTariffs$2$1$1", f = "SelectorUiStateInteractor.kt", l = {156}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SelectorUiStateInteractor$getVerticalsTariffs$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ elx0 $verticalPresentationModel;
    final /* synthetic */ ConcurrentHashMap<String, vnx0> $verticalsTariffs;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectorUiStateInteractor$getVerticalsTariffs$2$1$1(c cVar, elx0 elx0Var, ConcurrentHashMap concurrentHashMap, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$verticalPresentationModel = elx0Var;
        this.$verticalsTariffs = concurrentHashMap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SelectorUiStateInteractor$getVerticalsTariffs$2$1$1(this.this$0, this.$verticalPresentationModel, this.$verticalsTariffs, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectorUiStateInteractor$getVerticalsTariffs$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            List list = this.$verticalPresentationModel.e;
            this.label = 1;
            cVar.getClass();
            obj = bvf0.n(new SelectorUiStateInteractor$getTariffSelectorUiState$2(list, cVar, null), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.$verticalsTariffs.put(this.$verticalPresentationModel.a, (vnx0) obj);
        return zy11.a;
    }
}
