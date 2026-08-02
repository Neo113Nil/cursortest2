package com.yandex.go.payments.shared;

import com.yandex.go.payments.shared.data.model.Account;
import com.yandex.go.payments.shared.data.model.SharedPayment;
import com.yandex.messaging.domain.poll.PollMessageDraft;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/payments/shared/data/model/Account;", "<anonymous>", "(Ltse;)Lcom/yandex/go/payments/shared/data/model/Account;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.SharedPaymentRepository$updatePaymentType$2", f = "SharedPaymentRepository.kt", l = {PollMessageDraft.MAX_ANSWER_LENGTH, 141}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SharedPaymentRepository$updatePaymentType$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $accountId;
    final /* synthetic */ String $accountRevision;
    final /* synthetic */ SharedPayment $sharedPayment;
    int label;
    final /* synthetic */ x this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPaymentRepository$updatePaymentType$2(x xVar, String str, String str2, SharedPayment sharedPayment, Continuation continuation) {
        super(2, continuation);
        this.this$0 = xVar;
        this.$accountId = str;
        this.$accountRevision = str2;
        this.$sharedPayment = sharedPayment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SharedPaymentRepository$updatePaymentType$2(this.this$0, this.$accountId, this.$accountRevision, this.$sharedPayment, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SharedPaymentRepository$updatePaymentType$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r7 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (ru.yandex.taxi.network.api.a.a(r7, null, r6) == r0) goto L15;
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
            cmt<zy11> e = this.this$0.b().e(this.$accountId, this.$accountRevision, this.$sharedPayment);
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                Account account = (Account) obj;
                ((com.yandex.go.payments.paymentlist.data.c) this.this$0.d).p();
                return account;
            }
            kotlin.b.b(obj);
        }
        x xVar = this.this$0;
        String str = this.$accountId;
        this.label = 2;
        obj = x.a(xVar, str, this);
    }
}
