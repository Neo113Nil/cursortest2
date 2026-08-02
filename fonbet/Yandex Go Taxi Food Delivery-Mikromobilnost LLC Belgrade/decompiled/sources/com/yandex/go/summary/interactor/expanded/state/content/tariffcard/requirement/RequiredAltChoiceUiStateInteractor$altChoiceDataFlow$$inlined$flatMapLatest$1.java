package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import defpackage.fnx0;
import defpackage.ha2;
import defpackage.jha1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.RequiredAltChoiceUiStateInteractor$altChoiceDataFlow$$inlined$flatMapLatest$1", f = "RequiredAltChoiceUiStateInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class RequiredAltChoiceUiStateInteractor$altChoiceDataFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ b0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequiredAltChoiceUiStateInteractor$altChoiceDataFlow$$inlined$flatMapLatest$1(b0 b0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = b0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RequiredAltChoiceUiStateInteractor$altChoiceDataFlow$$inlined$flatMapLatest$1 requiredAltChoiceUiStateInteractor$altChoiceDataFlow$$inlined$flatMapLatest$1 = new RequiredAltChoiceUiStateInteractor$altChoiceDataFlow$$inlined$flatMapLatest$1(this.this$0, (Continuation) obj3);
        requiredAltChoiceUiStateInteractor$altChoiceDataFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        requiredAltChoiceUiStateInteractor$altChoiceDataFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return requiredAltChoiceUiStateInteractor$altChoiceDataFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            fnx0 fnx0Var = (fnx0) obj2;
            String str = fnx0Var.c.b;
            b0 b0Var = this.this$0;
            ha2 n = kotlinx.coroutines.flow.e.n(b0Var.b.a(jha1.e(b0Var.g)), kotlinx.coroutines.flow.e.t(new com.yandex.go.taxi.tariffs.data.b(this.this$0.c.a, str)), kotlinx.coroutines.flow.e.t(new com.yandex.go.delivery.sdd_slots_selector.data.b(this.this$0.d.a, str)), new RequiredAltChoiceUiStateInteractor$altChoiceDataFlow$1$1(this.this$0, fnx0Var, null));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(n, vprVar, this) == coroutineSingletons) {
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
