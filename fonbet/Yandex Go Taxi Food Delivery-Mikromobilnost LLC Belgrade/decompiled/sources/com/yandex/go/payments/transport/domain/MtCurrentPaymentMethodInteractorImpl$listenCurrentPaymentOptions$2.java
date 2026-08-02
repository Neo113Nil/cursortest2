package com.yandex.go.payments.transport.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lhfa0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.transport.domain.MtCurrentPaymentMethodInteractorImpl$listenCurrentPaymentOptions$2", f = "MtCurrentPaymentMethodInteractorImpl.kt", l = {56}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class MtCurrentPaymentMethodInteractorImpl$listenCurrentPaymentOptions$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $forceUpdateOnOpen;
    final /* synthetic */ zzs $geo;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtCurrentPaymentMethodInteractorImpl$listenCurrentPaymentOptions$2(a aVar, zzs zzsVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$geo = zzsVar;
        this.$forceUpdateOnOpen = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtCurrentPaymentMethodInteractorImpl$listenCurrentPaymentOptions$2(this.this$0, this.$geo, this.$forceUpdateOnOpen, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtCurrentPaymentMethodInteractorImpl$listenCurrentPaymentOptions$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            zzs zzsVar = this.$geo;
            Boolean valueOf = Boolean.valueOf(this.$forceUpdateOnOpen);
            this.label = 1;
            aVar.getClass();
            if ((!valueOf.equals(Boolean.TRUE) ? aVar.b(zzsVar, this) : aVar.a(zzsVar, true, this)) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
