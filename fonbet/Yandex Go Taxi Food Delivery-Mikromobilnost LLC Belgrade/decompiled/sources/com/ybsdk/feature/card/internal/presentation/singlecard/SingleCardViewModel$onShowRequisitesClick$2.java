package com.ybsdk.feature.card.internal.presentation.singlecard;

import defpackage.aq51;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.rgs0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Laq51;", "it", "Lzy11;", "<anonymous>", "(Laq51;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.presentation.singlecard.SingleCardViewModel$onShowRequisitesClick$2", f = "SingleCardViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SingleCardViewModel$onShowRequisitesClick$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleCardViewModel$onShowRequisitesClick$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SingleCardViewModel$onShowRequisitesClick$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SingleCardViewModel$onShowRequisitesClick$2 singleCardViewModel$onShowRequisitesClick$2 = (SingleCardViewModel$onShowRequisitesClick$2) create((aq51) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        singleCardViewModel$onShowRequisitesClick$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        pz40 Y = this.this$0.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, rgs0.a((rgs0) value, null, false, null, true, null, null, false, 991)));
        this.this$0.g0();
        return zy11.a;
    }
}
