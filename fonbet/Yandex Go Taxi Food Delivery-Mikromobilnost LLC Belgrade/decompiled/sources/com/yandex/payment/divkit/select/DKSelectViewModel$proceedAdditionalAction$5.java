package com.yandex.payment.divkit.select;

import defpackage.ct20;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s89;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.select.DKSelectViewModel$proceedAdditionalAction$5", f = "DKSelectViewModel.kt", l = {872}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class DKSelectViewModel$proceedAdditionalAction$5 extends SuspendLambda implements wls {
    final /* synthetic */ ct20 $challengeInfo;
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DKSelectViewModel$proceedAdditionalAction$5(h hVar, ct20 ct20Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$challengeInfo = ct20Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DKSelectViewModel$proceedAdditionalAction$5(this.this$0, this.$challengeInfo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DKSelectViewModel$proceedAdditionalAction$5) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            h hVar = this.this$0;
            if (hVar.H != null) {
                ct20 ct20Var = this.$challengeInfo;
                kotlinx.coroutines.channels.a aVar = hVar.R;
                s89 s89Var = (s89) ct20Var;
                IncomingChallengeEvent$OpenCvv$Challenge incomingChallengeEvent$OpenCvv$Challenge = new IncomingChallengeEvent$OpenCvv$Challenge(s89Var.b, s89Var.c, s89Var.d);
                this.L$0 = null;
                this.I$0 = 0;
                this.label = 1;
                if (aVar.o(incomingChallengeEvent$OpenCvv$Challenge, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
