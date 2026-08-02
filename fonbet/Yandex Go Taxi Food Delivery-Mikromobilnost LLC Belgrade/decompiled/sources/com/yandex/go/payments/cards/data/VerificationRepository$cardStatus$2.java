package com.yandex.go.payments.cards.data;

import defpackage.j831;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lj831;", "param", "", "retryNumber", "Lp731;", "<anonymous>", "(Lj831;I)Lp731;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.cards.data.VerificationRepository$cardStatus$2", f = "VerificationRepository.kt", l = {58}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class VerificationRepository$cardStatus$2 extends SuspendLambda implements zls {
    final /* synthetic */ boolean $required3dsPolling;
    /* synthetic */ int I$0;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationRepository$cardStatus$2(l lVar, boolean z, Continuation continuation) {
        super(3, continuation);
        this.this$0 = lVar;
        this.$required3dsPolling = z;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        VerificationRepository$cardStatus$2 verificationRepository$cardStatus$2 = new VerificationRepository$cardStatus$2(this.this$0, this.$required3dsPolling, (Continuation) obj3);
        verificationRepository$cardStatus$2.L$0 = (j831) obj;
        verificationRepository$cardStatus$2.I$0 = intValue;
        return verificationRepository$cardStatus$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        j831 j831Var = (j831) this.L$0;
        int i = this.I$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        l lVar = this.this$0;
        boolean z = this.$required3dsPolling;
        this.L$0 = null;
        this.I$0 = i;
        this.label = 1;
        Object a = l.a(lVar, j831Var, i, z, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
