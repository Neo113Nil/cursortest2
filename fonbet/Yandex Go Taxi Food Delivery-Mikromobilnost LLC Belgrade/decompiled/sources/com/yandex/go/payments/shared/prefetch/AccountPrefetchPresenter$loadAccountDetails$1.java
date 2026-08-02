package com.yandex.go.payments.shared.prefetch;

import com.yandex.go.payments.shared.data.model.Account;
import com.yandex.go.payments.shared.v;
import com.yandex.go.payments.shared.y;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wl;
import defpackage.wls;
import defpackage.wor0;
import defpackage.xl;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.prefetch.AccountPrefetchPresenter$loadAccountDetails$1", f = "AccountPrefetchPresenter.kt", l = {32}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AccountPrefetchPresenter$loadAccountDetails$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ xl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountPrefetchPresenter$loadAccountDetails$1(xl xlVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = xlVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AccountPrefetchPresenter$loadAccountDetails$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AccountPrefetchPresenter$loadAccountDetails$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xl xlVar;
        xl xlVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                xl xlVar3 = this.this$0;
                try {
                    v vVar = xlVar3.y;
                    String str = xlVar3.x.c;
                    this.L$0 = xlVar3;
                    this.L$1 = xlVar3;
                    this.label = 1;
                    Object g = vVar.g(str, this);
                    if (g == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    xlVar = xlVar3;
                    obj = g;
                    xlVar2 = xlVar;
                } catch (Throwable th) {
                    th = th;
                    xlVar = xlVar3;
                    jst.e.k(th, "Failed to load a shared account");
                    wor0 wor0Var = xlVar.x.b;
                    ((y) wor0Var.a).n(xlVar.z.a(th), true);
                    ((y) xlVar.x.b.a).c();
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xlVar = (xl) this.L$1;
                xlVar2 = (xl) this.L$0;
                try {
                    b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    jst.e.k(th, "Failed to load a shared account");
                    wor0 wor0Var2 = xlVar.x.b;
                    ((y) wor0Var2.a).n(xlVar.z.a(th), true);
                    ((y) xlVar.x.b.a).c();
                    return zy11.a;
                }
            }
            wl wlVar = xlVar2.x;
            wlVar.a.a = (Account) obj;
            ((y) wlVar.b.a).d();
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
