package com.yandex.go.payments.shared;

import defpackage.cmt;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/payments/shared/data/model/Account;", "<anonymous>", "(Ltse;)Lcom/yandex/go/payments/shared/data/model/Account;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.SharedPaymentRepository$deleteMember$2", f = "SharedPaymentRepository.kt", l = {HProv.ALG_SID_KECCAK_256, 90}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SharedPaymentRepository$deleteMember$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $accountId;
    final /* synthetic */ String $memberId;
    int label;
    final /* synthetic */ x this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPaymentRepository$deleteMember$2(x xVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = xVar;
        this.$memberId = str;
        this.$accountId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SharedPaymentRepository$deleteMember$2(this.this$0, this.$memberId, this.$accountId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SharedPaymentRepository$deleteMember$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (ru.yandex.taxi.network.api.a.a(r5, null, r4) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            cmt<zy11> o = this.this$0.b().o(this.$memberId);
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        x xVar = this.this$0;
        String str = this.$accountId;
        this.label = 2;
        Object a = x.a(xVar, str, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
