package com.yandex.go.payments.shared;

import com.yandex.go.payments.shared.data.model.Account;
import com.yandex.go.payments.shared.data.model.SetCommonLimitRequest;
import defpackage.cmt;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/payments/shared/data/model/Account;", "<anonymous>", "(Ltse;)Lcom/yandex/go/payments/shared/data/model/Account;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.SharedPaymentRepository$setCommonLimit$2", f = "SharedPaymentRepository.kt", l = {279, 280}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SharedPaymentRepository$setCommonLimit$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $accountId;
    final /* synthetic */ String $accountRevision;
    final /* synthetic */ SetCommonLimitRequest $request;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ x this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPaymentRepository$setCommonLimit$2(x xVar, String str, String str2, SetCommonLimitRequest setCommonLimitRequest, Continuation continuation) {
        super(2, continuation);
        this.this$0 = xVar;
        this.$accountId = str;
        this.$accountRevision = str2;
        this.$request = setCommonLimitRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SharedPaymentRepository$setCommonLimit$2(this.this$0, this.$accountId, this.$accountRevision, this.$request, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SharedPaymentRepository$setCommonLimit$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        x xVar;
        x xVar2;
        String str;
        Throwable th;
        x xVar3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                xVar = this.this$0;
                String str2 = this.$accountId;
                try {
                    cmt<zy11> i2 = xVar.b().i(str2, this.$accountRevision, this.$request);
                    this.L$0 = xVar;
                    this.L$1 = str2;
                    this.L$2 = xVar;
                    this.label = 1;
                    if (ru.yandex.taxi.network.api.a.a(i2, null, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    xVar2 = xVar;
                    str = str2;
                } catch (Throwable th2) {
                    x xVar4 = xVar;
                    th = th2;
                    xVar3 = xVar4;
                    throw xVar3.e.b(th);
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xVar3 = (x) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        return (Account) obj;
                    } catch (Throwable th3) {
                        th = th3;
                        throw xVar3.e.b(th);
                    }
                }
                x xVar5 = (x) this.L$2;
                str = (String) this.L$1;
                xVar2 = (x) this.L$0;
                try {
                    kotlin.b.b(obj);
                    xVar = xVar5;
                } catch (Throwable th4) {
                    th = th4;
                    xVar3 = xVar5;
                    throw xVar3.e.b(th);
                }
            }
            this.L$0 = xVar;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            Object a = x.a(xVar2, str, this);
            if (a != coroutineSingletons) {
                x xVar6 = xVar;
                obj = a;
                xVar3 = xVar6;
                return (Account) obj;
            }
            return coroutineSingletons;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
