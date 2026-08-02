package com.yandex.go.payments.shared;

import com.yandex.go.payments.shared.data.model.Account;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import com.yandex.go.sharedpayments.api.model.SharedAccountScreen;
import defpackage.at20;
import defpackage.ea70;
import defpackage.fa70;
import defpackage.ga70;
import defpackage.ha70;
import defpackage.il;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tmr0;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.SharedPaymentsController$openAccount$2", f = "SharedPaymentsController.kt", l = {HProv.PP_CONTAINER_STATUS}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SharedPaymentsController$openAccount$2 extends SuspendLambda implements tls {
    final /* synthetic */ tmr0 $accountType;
    final /* synthetic */ SharedPaymentsOpenReason $openReason;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ y this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPaymentsController$openAccount$2(y yVar, tmr0 tmr0Var, SharedPaymentsOpenReason sharedPaymentsOpenReason, Continuation continuation) {
        super(1, continuation);
        this.this$0 = yVar;
        this.$accountType = tmr0Var;
        this.$openReason = sharedPaymentsOpenReason;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SharedPaymentsController$openAccount$2(this.this$0, this.$accountType, this.$openReason, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((SharedPaymentsController$openAccount$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tmr0 tmr0Var;
        SharedPaymentsOpenReason sharedPaymentsOpenReason;
        y yVar;
        y yVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                y yVar3 = this.this$0;
                tmr0Var = this.$accountType;
                sharedPaymentsOpenReason = this.$openReason;
                try {
                    f fVar = yVar3.n;
                    String str = tmr0Var.a;
                    this.L$0 = yVar3;
                    this.L$1 = tmr0Var;
                    this.L$2 = sharedPaymentsOpenReason;
                    this.L$3 = yVar3;
                    this.label = 1;
                    Object a = fVar.a(str, this);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = a;
                    yVar2 = yVar3;
                } catch (Throwable th) {
                    th = th;
                    yVar = yVar3;
                    yVar.n(yVar.o.a(th), true);
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yVar = (y) this.L$3;
                sharedPaymentsOpenReason = (SharedPaymentsOpenReason) this.L$2;
                tmr0Var = (tmr0) this.L$1;
                yVar2 = (y) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    yVar.n(yVar.o.a(th), true);
                    return zy11.a;
                }
            }
            ha70 ha70Var = (ha70) obj;
            if (ha70Var instanceof ea70) {
                Account account = ((ea70) ha70Var).b;
                yVar2.getClass();
                yVar2.i(new at20(new il(account, account.a, account.b(), account.c()), SharedAccountScreen.DETAILS), sharedPaymentsOpenReason);
            } else if (ha70Var instanceof fa70) {
                yVar2.n(yVar2.o.a(((fa70) ha70Var).b), true);
            } else {
                if (!jl40.l(ha70Var, ga70.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                yVar2.g();
                yVar2.k(tmr0Var, sharedPaymentsOpenReason);
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
