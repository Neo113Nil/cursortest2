package com.yandex.fintechsdk.core.architecture.api.mvi;

import defpackage.gci0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qju0;
import defpackage.t24;
import defpackage.tls;
import defpackage.tse;
import defpackage.wc5;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.core.architecture.api.mvi.StoreExtensionsKt$observe$1$1$1$1$1", f = "StoreExtensions.kt", l = {46}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class StoreExtensionsKt$observe$1$1$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $state;
    final /* synthetic */ qju0 $this_observe;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreExtensionsKt$observe$1$1$1$1$1(qju0 qju0Var, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$this_observe = qju0Var;
        this.$state = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StoreExtensionsKt$observe$1$1$1$1$1(this.$this_observe, this.$state, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StoreExtensionsKt$observe$1$1$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            gci0 gci0Var = ((wc5) this.$this_observe).b.f;
            t24 t24Var = new t24(15, this.$state);
            this.label = 1;
            if (gci0Var.a.collect(t24Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        ny61.A();
        return null;
    }
}
