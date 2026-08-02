package com.yandex.go.address.search.common.presenter;

import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.search.common.presenter.SuggestedDestinationsPresenter$startZeroSuggest$1", f = "SuggestedDestinationsPresenter.kt", l = {162}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SuggestedDestinationsPresenter$startZeroSuggest$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $flow;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestedDestinationsPresenter$startZeroSuggest$1(tpr tprVar, b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$flow = tprVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuggestedDestinationsPresenter$startZeroSuggest$1(this.$flow, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuggestedDestinationsPresenter$startZeroSuggest$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.address.search.perf.c cVar = this.this$0.r0;
            this.label = 1;
            obj = cVar.a(this);
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
        boolean booleanValue = ((Boolean) obj).booleanValue();
        tpr tprVar = this.$flow;
        if (booleanValue) {
            sjh sjhVar = uyj.a;
            tprVar = kotlinx.coroutines.flow.e.F(tprVar, mdh.b);
        }
        b bVar = this.this$0;
        bVar.s0 = tje.N(bVar.Jg(), null, null, new SuggestedDestinationsPresenter$startZeroSuggest$1$invokeSuspend$$inlined$safeCollectIn$1(tprVar, this.this$0, null), 3);
        return zy11.a;
    }
}
