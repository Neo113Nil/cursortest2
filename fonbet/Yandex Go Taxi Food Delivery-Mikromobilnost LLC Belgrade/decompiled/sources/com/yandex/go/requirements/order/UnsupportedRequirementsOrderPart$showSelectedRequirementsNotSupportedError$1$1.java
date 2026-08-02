package com.yandex.go.requirements.order;

import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tqv0;
import defpackage.tse;
import defpackage.vqv0;
import defpackage.wls;
import defpackage.z421;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.requirements.order.UnsupportedRequirementsOrderPart$showSelectedRequirementsNotSupportedError$1$1", f = "UnsupportedRequirementsOrderPart.kt", l = {33}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class UnsupportedRequirementsOrderPart$showSelectedRequirementsNotSupportedError$1$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ z421 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnsupportedRequirementsOrderPart$showSelectedRequirementsNotSupportedError$1$1(z421 z421Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = z421Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UnsupportedRequirementsOrderPart$showSelectedRequirementsNotSupportedError$1$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UnsupportedRequirementsOrderPart$showSelectedRequirementsNotSupportedError$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vqv0 vqv0Var = this.this$0.d;
            tqv0 tqv0Var = new tqv0(SummaryExpandReason.AUTO_UNSUPPORTED_REQUIREMENT_ON_ORDER);
            this.label = 1;
            if (vqv0Var.a.emit(tqv0Var, this) == coroutineSingletons) {
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
