package com.ybsdk.feature.rebind.payment.internal.domain;

import defpackage.iyd0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tq11;
import defpackage.wls;
import defpackage.x6f0;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltq11;", "attemptNumber", "Lkotlin/Result;", "Liyd0;", "Ln8u0;", "<anonymous>", "(Ltq11;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.rebind.payment.internal.domain.RebindPaymentMethodInteractor$getRebindPaymentMethod$1$1$1$2", f = "RebindPaymentMethodInteractor.kt", l = {37, 39}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RebindPaymentMethodInteractor$getRebindPaymentMethod$1$1$1$2 extends SuspendLambda implements wls {
    final /* synthetic */ y6f0 $$this$channelFlow;
    final /* synthetic */ String $paymentId;
    /* synthetic */ int I$0;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RebindPaymentMethodInteractor$getRebindPaymentMethod$1$1$1$2(a aVar, String str, y6f0 y6f0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$paymentId = str;
        this.$$this$channelFlow = y6f0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RebindPaymentMethodInteractor$getRebindPaymentMethod$1$1$1$2 rebindPaymentMethodInteractor$getRebindPaymentMethod$1$1$1$2 = new RebindPaymentMethodInteractor$getRebindPaymentMethod$1$1$1$2(this.this$0, this.$paymentId, this.$$this$channelFlow, continuation);
        rebindPaymentMethodInteractor$getRebindPaymentMethod$1$1$1$2.I$0 = ((tq11) obj).a;
        return rebindPaymentMethodInteractor$getRebindPaymentMethod$1$1$1$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = ((tq11) obj).a;
        RebindPaymentMethodInteractor$getRebindPaymentMethod$1$1$1$2 rebindPaymentMethodInteractor$getRebindPaymentMethod$1$1$1$2 = new RebindPaymentMethodInteractor$getRebindPaymentMethod$1$1$1$2(this.this$0, this.$paymentId, this.$$this$channelFlow, (Continuation) obj2);
        rebindPaymentMethodInteractor$getRebindPaymentMethod$1$1$1$2.I$0 = i;
        return rebindPaymentMethodInteractor$getRebindPaymentMethod$1$1$1$2.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
    
        if (r6 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            int i2 = this.I$0;
            com.ybsdk.feature.rebind.payment.internal.data.a aVar = this.this$0.a;
            String str = this.$paymentId;
            this.label = 1;
            b = aVar.b(i2, str, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.L$0;
                b.b(obj);
                b = obj2;
                return new Result(b);
            }
            b.b(obj);
            b = ((Result) obj).getValue();
        }
        y6f0 y6f0Var = this.$$this$channelFlow;
        if (!(b instanceof Result.Failure)) {
            Object obj3 = ((iyd0) b).a;
            this.L$0 = b;
            this.label = 2;
            if (((x6f0) y6f0Var).y.o(obj3, this) != coroutineSingletons) {
                obj2 = b;
                b = obj2;
            }
            return coroutineSingletons;
        }
        return new Result(b);
    }
}
