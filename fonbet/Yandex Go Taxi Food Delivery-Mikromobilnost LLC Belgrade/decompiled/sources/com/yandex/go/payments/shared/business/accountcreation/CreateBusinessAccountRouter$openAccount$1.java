package com.yandex.go.payments.shared.business.accountcreation;

import android.net.Uri;
import com.yandex.go.payments.shared.data.model.Account;
import com.yandex.go.payments.shared.f;
import com.yandex.go.payments.shared.y;
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
import defpackage.tnr0;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.taxi.gopayments.dto.SharedAccountType;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.business.accountcreation.CreateBusinessAccountRouter$openAccount$1", f = "CreateBusinessAccountRouter.kt", l = {MSException.ERROR_INVALID_PARAMETER, HProv.PP_REBOOT}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class CreateBusinessAccountRouter$openAccount$1 extends SuspendLambda implements tls {
    final /* synthetic */ tmr0 $accountType;
    final /* synthetic */ Uri $deeplinkUrl;
    final /* synthetic */ Runnable $onRestoreFocusAction;
    final /* synthetic */ SharedPaymentsOpenReason $openReason;
    final /* synthetic */ tnr0 $sharedPaymentAccountRouter;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateBusinessAccountRouter$openAccount$1(d dVar, tnr0 tnr0Var, SharedPaymentsOpenReason sharedPaymentsOpenReason, Runnable runnable, tmr0 tmr0Var, Uri uri, Continuation continuation) {
        super(1, continuation);
        this.this$0 = dVar;
        this.$sharedPaymentAccountRouter = tnr0Var;
        this.$openReason = sharedPaymentsOpenReason;
        this.$onRestoreFocusAction = runnable;
        this.$accountType = tmr0Var;
        this.$deeplinkUrl = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CreateBusinessAccountRouter$openAccount$1(this.this$0, this.$sharedPaymentAccountRouter, this.$openReason, this.$onRestoreFocusAction, this.$accountType, this.$deeplinkUrl, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((CreateBusinessAccountRouter$openAccount$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f3, code lost:
    
        if (com.yandex.go.payments.shared.business.accountcreation.d.b(r10, r6, r7, r8, r9, r13) == r0) goto L36;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        d dVar;
        Runnable runnable;
        tmr0 tmr0Var;
        Throwable th;
        d dVar2;
        Object a;
        Uri uri;
        tnr0 tnr0Var;
        d dVar3;
        SharedPaymentsOpenReason sharedPaymentsOpenReason;
        Runnable runnable2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    runnable = (Runnable) this.L$1;
                    dVar2 = (d) this.L$0;
                    try {
                        kotlin.b.b(obj);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    return zy11.a;
                }
                runnable = (Runnable) this.L$7;
                d dVar4 = (d) this.L$6;
                Uri uri2 = (Uri) this.L$5;
                tmr0Var = (tmr0) this.L$4;
                Runnable runnable3 = (Runnable) this.L$3;
                SharedPaymentsOpenReason sharedPaymentsOpenReason2 = (SharedPaymentsOpenReason) this.L$2;
                tnr0 tnr0Var2 = (tnr0) this.L$1;
                dVar3 = (d) this.L$0;
                try {
                    kotlin.b.b(obj);
                    a = obj;
                    dVar = dVar4;
                    uri = uri2;
                    tnr0Var = tnr0Var2;
                    runnable2 = runnable3;
                    sharedPaymentsOpenReason = sharedPaymentsOpenReason2;
                } catch (Throwable th3) {
                    th = th3;
                    dVar2 = dVar4;
                }
                d.a(dVar2, th, runnable);
                return zy11.a;
            }
            kotlin.b.b(obj);
            dVar = this.this$0;
            tnr0 tnr0Var3 = this.$sharedPaymentAccountRouter;
            SharedPaymentsOpenReason sharedPaymentsOpenReason3 = this.$openReason;
            runnable = this.$onRestoreFocusAction;
            tmr0Var = this.$accountType;
            Uri uri3 = this.$deeplinkUrl;
            try {
                f fVar = dVar.h;
                String typeId = SharedAccountType.BUSINESS.getTypeId();
                this.L$0 = dVar;
                this.L$1 = tnr0Var3;
                this.L$2 = sharedPaymentsOpenReason3;
                this.L$3 = runnable;
                this.L$4 = tmr0Var;
                this.L$5 = uri3;
                this.L$6 = dVar;
                this.L$7 = runnable;
                this.label = 1;
                a = fVar.a(typeId, this);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
                uri = uri3;
                tnr0Var = tnr0Var3;
                dVar3 = dVar;
                sharedPaymentsOpenReason = sharedPaymentsOpenReason3;
                runnable2 = runnable;
            } catch (Throwable th4) {
                th = th4;
                dVar2 = dVar;
            }
            ha70 ha70Var = (ha70) a;
            if (ha70Var instanceof ea70) {
                Account account = ((ea70) ha70Var).b;
                y yVar = (y) tnr0Var;
                yVar.getClass();
                yVar.i(new at20(new il(account, account.a, account.b(), account.c()), SharedAccountScreen.DETAILS), sharedPaymentsOpenReason);
            } else if (ha70Var instanceof fa70) {
                d.a(dVar3, ((fa70) ha70Var).b, runnable2);
            } else {
                if (!jl40.l(ha70Var, ga70.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((y) tnr0Var).g();
                this.L$0 = dVar;
                this.L$1 = runnable;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.label = 2;
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
