package com.ybsdk.feature.futurepayments.internal.screens;

import com.ybsdk.core.analytics.generated.delegates.FuturePaymentsEvents$FuturePaymentsLoadedResult;
import defpackage.kqs;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.r8j0;
import defpackage.rt1;
import defpackage.s8j0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.futurepayments.internal.screens.FuturePaymentsViewModel$updateData$1", f = "FuturePaymentsViewModel.kt", l = {48}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FuturePaymentsViewModel$updateData$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturePaymentsViewModel$updateData$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FuturePaymentsViewModel$updateData$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FuturePaymentsViewModel$updateData$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            com.ybsdk.feature.futurepayments.internal.data.a aVar = this.this$0.B;
            this.label = 1;
            b = aVar.b(this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            b = ((Result) obj).getValue();
        }
        a aVar2 = this.this$0;
        Throwable a = Result.a(b);
        if (a == null) {
            kqs kqsVar = (kqs) b;
            pz40 Y = aVar2.Y();
            do {
                r0Var2 = (r0) Y;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, new r8j0(kqsVar, null, 14)));
            rt1.p(aVar2.D.A, FuturePaymentsEvents$FuturePaymentsLoadedResult.OK, null, kqsVar.c, 2);
        } else {
            pz40 Y2 = aVar2.Y();
            do {
                r0Var = (r0) Y2;
                value = r0Var.getValue();
            } while (!r0Var.k(value, new s8j0(a)));
            rt1.p(aVar2.D.A, FuturePaymentsEvents$FuturePaymentsLoadedResult.ERROR, a.getMessage(), null, 4);
        }
        return zy11.a;
    }
}
