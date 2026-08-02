package com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.splash.data;

import defpackage.ar10;
import defpackage.g180;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t2u0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.splash.data.SplashDataPreloaderImpl$preloadData$2", f = "SplashDataPreloaderImpl.kt", l = {38, 49}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class SplashDataPreloaderImpl$preloadData$2 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashDataPreloaderImpl$preloadData$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SplashDataPreloaderImpl$preloadData$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SplashDataPreloaderImpl$preloadData$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0036, code lost:
    
        if (r6 == r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            com.yandex.fintechsdk.data.payment.impl.internal.order.a aVar2 = aVar.e;
            String paymentUrl = aVar.f.getPaymentUrl();
            this.label = 1;
            a = aVar2.a(paymentUrl, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.L$0;
                b.b(obj);
                ((com.yandex.fintechsdk.core.analytics.impl.internal.a) this.this$0.a).a(t2u0.c);
                if (!(obj2 instanceof Result.Failure)) {
                    obj2 = zy11.a;
                }
                return new Result(obj2);
            }
            b.b(obj);
            a = ((Result) obj).getValue();
        }
        a aVar3 = this.this$0;
        if (!(a instanceof Result.Failure)) {
            ar10 ar10Var = aVar3.d;
            String str = ((g180) a).c;
            r0 r0Var = ar10Var.a.a;
            r0Var.getClass();
            r0Var.m(null, str);
        }
        a aVar4 = this.this$0;
        this.L$0 = a;
        this.label = 2;
        if (aVar4.b(this) != coroutineSingletons) {
            obj2 = a;
            ((com.yandex.fintechsdk.core.analytics.impl.internal.a) this.this$0.a).a(t2u0.c);
            if (!(obj2 instanceof Result.Failure)) {
            }
            return new Result(obj2);
        }
        return coroutineSingletons;
    }
}
