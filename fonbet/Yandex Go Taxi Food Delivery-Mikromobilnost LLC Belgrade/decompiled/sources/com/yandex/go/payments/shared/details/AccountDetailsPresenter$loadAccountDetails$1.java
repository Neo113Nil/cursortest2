package com.yandex.go.payments.shared.details;

import com.yandex.go.payments.shared.data.model.Account;
import com.yandex.go.payments.shared.v;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vor0;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.details.AccountDetailsPresenter$loadAccountDetails$1", f = "AccountDetailsPresenter.kt", l = {66}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AccountDetailsPresenter$loadAccountDetails$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountDetailsPresenter$loadAccountDetails$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AccountDetailsPresenter$loadAccountDetails$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AccountDetailsPresenter$loadAccountDetails$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        c cVar;
        c cVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                c cVar3 = this.this$0;
                try {
                    v vVar = cVar3.z;
                    String str = cVar3.x.c;
                    this.L$0 = cVar3;
                    this.L$1 = cVar3;
                    this.label = 1;
                    Object g = vVar.g(str, this);
                    if (g == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    cVar = cVar3;
                    obj = g;
                    cVar2 = cVar;
                } catch (Throwable th) {
                    th = th;
                    cVar = cVar3;
                    jst.e.k(th, "Failed to load a shared account");
                    vor0 vor0Var = cVar.x.b;
                    vor0Var.a.n(cVar.A.a(th), false);
                    cVar.x.b.a.d();
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cVar = (c) this.L$1;
                cVar2 = (c) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    jst.e.k(th, "Failed to load a shared account");
                    vor0 vor0Var2 = cVar.x.b;
                    vor0Var2.a.n(cVar.A.a(th), false);
                    cVar.x.b.a.d();
                    return zy11.a;
                }
            }
            cVar2.Lg((Account) obj);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
