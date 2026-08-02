package com.yandex.go.payments.cards.data;

import defpackage.l931;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ll931;", "param", "", "<unused var>", "Lcom/yandex/go/payments/cards/data/model/VerificationsResponse;", "<anonymous>", "(Ll931;I)Lcom/yandex/go/payments/cards/data/model/VerificationsResponse;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.cards.data.VerificationV4Repository$initVerification$2", f = "VerificationV4Repository.kt", l = {58}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class VerificationV4Repository$initVerification$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationV4Repository$initVerification$2(o oVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = oVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).intValue();
        VerificationV4Repository$initVerification$2 verificationV4Repository$initVerification$2 = new VerificationV4Repository$initVerification$2(this.this$0, (Continuation) obj3);
        verificationV4Repository$initVerification$2.L$0 = (l931) obj;
        return verificationV4Repository$initVerification$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        l931 l931Var = (l931) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        o oVar = this.this$0;
        this.L$0 = null;
        this.label = 1;
        Object b = o.b(oVar, l931Var, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
