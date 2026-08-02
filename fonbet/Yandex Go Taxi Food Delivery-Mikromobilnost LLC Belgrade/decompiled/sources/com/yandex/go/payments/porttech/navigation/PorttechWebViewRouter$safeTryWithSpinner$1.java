package com.yandex.go.payments.porttech.navigation;

import com.yandex.go.payments.addmethod.data.model.AddPaymentInfo$AddPaymentInfoStatus;
import defpackage.ai0;
import defpackage.avj0;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.sy60;
import defpackage.tls;
import defpackage.tse;
import defpackage.wi0;
import defpackage.wls;
import defpackage.zi0;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.porttech.navigation.PorttechWebViewRouter$safeTryWithSpinner$1", f = "PorttechWebViewRouter.kt", l = {167, 179, 183, 186}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PorttechWebViewRouter$safeTryWithSpinner$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $action;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PorttechWebViewRouter$safeTryWithSpinner$1(d dVar, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$action = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PorttechWebViewRouter$safeTryWithSpinner$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PorttechWebViewRouter$safeTryWithSpinner$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d6, code lost:
    
        if (r5 != r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00f1  */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.yandex.go.payments.porttech.navigation.d, int, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        d dVar;
        d dVar2;
        zi0 zi0Var;
        d dVar3;
        tls tlsVar;
        d dVar4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        zy11 zy11Var = zy11.a;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            String h = ((avj0) r1.E).h(kyh0.add_payment_method_preparing_failed_text);
            wi0 wi0Var = r1.I;
            ai0 ai0Var = new ai0(h, AddPaymentInfo$AddPaymentInfoStatus.ERROR);
            this.L$0 = r1;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 3;
            wi0Var.a(ai0Var, this);
            dVar = r1;
        }
        if (r1 == 0) {
            kotlin.b.b(obj);
            dVar3 = this.this$0;
            tls tlsVar2 = this.$action;
            String h2 = ((avj0) dVar3.E).h(kyh0.add_payment_method_preparing_loading_text);
            wi0 wi0Var2 = dVar3.I;
            ai0 ai0Var2 = new ai0(h2, AddPaymentInfo$AddPaymentInfoStatus.LOADING);
            this.L$0 = dVar3;
            this.L$1 = tlsVar2;
            this.L$2 = dVar3;
            this.L$3 = null;
            this.label = 1;
            wi0Var2.a(ai0Var2, this);
            if (zy11Var != coroutineSingletons) {
                tlsVar = tlsVar2;
                dVar4 = dVar3;
            }
        } else {
            if (r1 != 1) {
                if (r1 == 2) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                if (r1 != 3) {
                    if (r1 != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dVar2 = (d) this.L$0;
                    kotlin.b.b(obj);
                    zi0Var = dVar2.P;
                    if (zi0Var != null) {
                        zi0Var.i();
                    }
                    dVar2.P = null;
                    dVar2.r(new qu(9));
                    return zy11Var;
                }
                d dVar5 = (d) this.L$0;
                kotlin.b.b(obj);
                dVar = dVar5;
                this.L$0 = dVar;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 4;
                if (kotlinx.coroutines.a.i(1000L, this) != coroutineSingletons) {
                    dVar2 = dVar;
                    zi0Var = dVar2.P;
                    if (zi0Var != null) {
                    }
                    dVar2.P = null;
                    dVar2.r(new qu(9));
                    return zy11Var;
                }
            }
            dVar3 = (d) this.L$2;
            tlsVar = (tls) this.L$1;
            dVar4 = (d) this.L$0;
            kotlin.b.b(obj);
        }
        zi0 zi0Var2 = (zi0) dVar4.G.get();
        dVar4.P = zi0Var2;
        dVar4.z(zi0Var2, sy60.Q2);
        this.L$0 = dVar3;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 2;
        return tlsVar.invoke(this) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
