package com.yandex.go.taxi.summary.interactor;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lzy11;", "<anonymous>", "(Ljava/lang/Object;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.interactor.SummarySourceDestinationModelInteractor$updateSourceDestinationFlow$7", f = "SummarySourceDestinationModelInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SummarySourceDestinationModelInteractor$updateSourceDestinationFlow$7 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummarySourceDestinationModelInteractor$updateSourceDestinationFlow$7(p pVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SummarySourceDestinationModelInteractor$updateSourceDestinationFlow$7(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SummarySourceDestinationModelInteractor$updateSourceDestinationFlow$7 summarySourceDestinationModelInteractor$updateSourceDestinationFlow$7 = (SummarySourceDestinationModelInteractor$updateSourceDestinationFlow$7) create(obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        summarySourceDestinationModelInteractor$updateSourceDestinationFlow$7.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        p pVar = this.this$0;
        r0 r0Var = pVar.o;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, pVar.n.a()));
        return zy11.a;
    }
}
