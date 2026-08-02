package com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.acquisition.controllers;

import com.yandex.plus.acquisition.adapter.api.PlusAcquisitionSdkPurchaseResult;
import com.yandex.plus.home.pay.PayError;
import com.yandex.plus.home.state.UpdateTargetEvent;
import defpackage.a441;
import defpackage.dab1;
import defpackage.fjd0;
import defpackage.hjd0;
import defpackage.hn;
import defpackage.ijd0;
import defpackage.imd0;
import defpackage.j73;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t821;
import defpackage.tls;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.wog;
import defpackage.y821;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.acquisition.controllers.AcquisitionSdkButtonSectionContainerViewControllerImpl$proxyController$2$1$1", f = "AcquisitionSdkButtonSectionContainerViewControllerImpl.kt", l = {43, 47}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AcquisitionSdkButtonSectionContainerViewControllerImpl$proxyController$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $getPurchaseResult;
    final /* synthetic */ imd0 $plusStateInteractor;
    final /* synthetic */ hjd0 $purchaseResultEmitter;
    final /* synthetic */ y821 $updateTargetController;
    int label;
    final /* synthetic */ hn this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcquisitionSdkButtonSectionContainerViewControllerImpl$proxyController$2$1$1(tls tlsVar, hn hnVar, hjd0 hjd0Var, imd0 imd0Var, y821 y821Var, Continuation continuation) {
        super(2, continuation);
        this.$getPurchaseResult = tlsVar;
        this.this$0 = hnVar;
        this.$purchaseResultEmitter = hjd0Var;
        this.$plusStateInteractor = imd0Var;
        this.$updateTargetController = y821Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AcquisitionSdkButtonSectionContainerViewControllerImpl$proxyController$2$1$1(this.$getPurchaseResult, this.this$0, this.$purchaseResultEmitter, this.$plusStateInteractor, this.$updateTargetController, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AcquisitionSdkButtonSectionContainerViewControllerImpl$proxyController$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (((com.yandex.plus.home.plusstate.a) r6).a(r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0026, code lost:
    
        if (r6 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tls tlsVar = this.$getPurchaseResult;
            this.label = 1;
            obj = tlsVar.invoke(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                a441 a441Var = (a441) this.$updateTargetController;
                a441Var.getClass();
                ((t821) ((wog) a441Var.c).r.getValue()).a.g(j73.f0(new UpdateTargetEvent[]{UpdateTargetEvent.PLUS_AMOUNT, UpdateTargetEvent.PAY_BUTTON}));
                return zy11.a;
            }
            b.b(obj);
        }
        PlusAcquisitionSdkPurchaseResult plusAcquisitionSdkPurchaseResult = (PlusAcquisitionSdkPurchaseResult) obj;
        if (!jl40.l(plusAcquisitionSdkPurchaseResult, PlusAcquisitionSdkPurchaseResult.Success.INSTANCE)) {
            if (plusAcquisitionSdkPurchaseResult instanceof PlusAcquisitionSdkPurchaseResult.Error) {
                ((ijd0) this.$purchaseResultEmitter).a(new fjd0(PayError.OTHER));
            } else {
                if (!jl40.l(plusAcquisitionSdkPurchaseResult, PlusAcquisitionSdkPurchaseResult.Cancel.INSTANCE)) {
                    w511.b();
                    return null;
                }
                ((ijd0) this.$purchaseResultEmitter).a(new fjd0(PayError.CANCELLED));
            }
            return zy11.a;
        }
        this.this$0.a();
        ((ijd0) this.$purchaseResultEmitter).a(dab1.N);
        imd0 imd0Var = this.$plusStateInteractor;
        this.label = 2;
    }
}
