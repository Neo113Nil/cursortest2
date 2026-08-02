package com.yandex.go.payments.shared;

import com.yandex.go.payments.shared.data.model.Account;
import com.yandex.go.payments.shared.data.model.CreateAccountRequest;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.cda0;
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
@mvg(c = "com.yandex.go.payments.shared.SharedPaymentRepository$createAccount$2", f = "SharedPaymentRepository.kt", l = {50, SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SharedPaymentRepository$createAccount$2 extends SuspendLambda implements wls {
    final /* synthetic */ CreateAccountRequest $request;
    final /* synthetic */ String $revision;
    Object L$0;
    int label;
    final /* synthetic */ x this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPaymentRepository$createAccount$2(x xVar, String str, CreateAccountRequest createAccountRequest, Continuation continuation) {
        super(2, continuation);
        this.this$0 = xVar;
        this.$revision = str;
        this.$request = createAccountRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SharedPaymentRepository$createAccount$2(this.this$0, this.$revision, this.$request, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SharedPaymentRepository$createAccount$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        if (r6 == r0) goto L16;
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
            cmt<Account> j = this.this$0.b().j(this.$revision, this.$request);
            this.label = 1;
            obj = ru.yandex.taxi.network.api.a.a(j, null, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Account account = (Account) this.L$0;
                kotlin.b.b(obj);
                return account;
            }
            kotlin.b.b(obj);
        }
        Account account2 = (Account) obj;
        cda0 cda0Var = this.this$0.d;
        this.L$0 = account2;
        this.label = 2;
        return ((com.yandex.go.payments.paymentlist.data.c) cda0Var).q(this) == coroutineSingletons ? coroutineSingletons : account2;
    }
}
