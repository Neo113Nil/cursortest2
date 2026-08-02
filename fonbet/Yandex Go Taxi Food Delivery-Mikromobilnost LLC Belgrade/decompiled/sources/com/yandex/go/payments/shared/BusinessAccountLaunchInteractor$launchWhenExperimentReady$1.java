package com.yandex.go.payments.shared;

import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sw6;
import defpackage.tls;
import defpackage.tmr0;
import defpackage.xby;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.BusinessAccountLaunchInteractor$launchWhenExperimentReady$1", f = "BusinessAccountLaunchInteractor.kt", l = {24}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BusinessAccountLaunchInteractor$launchWhenExperimentReady$1 extends SuspendLambda implements tls {
    final /* synthetic */ tls $action;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ sw6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessAccountLaunchInteractor$launchWhenExperimentReady$1(sw6 sw6Var, tls tlsVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = sw6Var;
        this.$action = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new BusinessAccountLaunchInteractor$launchWhenExperimentReady$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((BusinessAccountLaunchInteractor$launchWhenExperimentReady$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        sw6 sw6Var;
        tls tlsVar;
        Throwable th;
        sw6 sw6Var2;
        Object w;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                sw6Var = this.this$0;
                tlsVar = this.$action;
                try {
                    BusinessAccountLaunchInteractor$launchWhenExperimentReady$1$1$sharedAccountTypeDescription$1 businessAccountLaunchInteractor$launchWhenExperimentReady$1$1$sharedAccountTypeDescription$1 = new BusinessAccountLaunchInteractor$launchWhenExperimentReady$1$1$sharedAccountTypeDescription$1(sw6Var, null);
                    this.L$0 = sw6Var;
                    this.L$1 = tlsVar;
                    this.L$2 = sw6Var;
                    this.label = 1;
                    w = kotlinx.coroutines.a.w(15000L, businessAccountLaunchInteractor$launchWhenExperimentReady$1$1$sharedAccountTypeDescription$1, this);
                    if (w == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sw6Var2 = sw6Var;
                    sw6Var2.b.getClass();
                    xby.l(jst.e, "B2B.TOKEN_ERROR:SHOW_BUSINESS_ACCOUNT", null, th, "launchBusinessTimeoutFlowError", 2);
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sw6Var2 = (sw6) this.L$2;
                tls tlsVar2 = (tls) this.L$1;
                sw6 sw6Var3 = (sw6) this.L$0;
                try {
                    kotlin.b.b(obj);
                    tlsVar = tlsVar2;
                    sw6Var = sw6Var3;
                    w = obj;
                } catch (Throwable th3) {
                    th = th3;
                    sw6Var2.b.getClass();
                    xby.l(jst.e, "B2B.TOKEN_ERROR:SHOW_BUSINESS_ACCOUNT", null, th, "launchBusinessTimeoutFlowError", 2);
                    return zy11.a;
                }
            }
            tmr0 tmr0Var = (tmr0) w;
            if (tmr0Var == null) {
                sw6Var.b.getClass();
                xby.l(jst.e, "B2B.TOKEN_ERROR:SHOW_BUSINESS_ACCOUNT", null, new IllegalArgumentException(), "launchBusinessTimeoutFlowError", 2);
                tlsVar.invoke(new tmr0(null, null, null, null, null, false, null, false, null, null, sw6Var.c.a(), 131071));
            } else {
                tlsVar.invoke(tmr0Var);
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
