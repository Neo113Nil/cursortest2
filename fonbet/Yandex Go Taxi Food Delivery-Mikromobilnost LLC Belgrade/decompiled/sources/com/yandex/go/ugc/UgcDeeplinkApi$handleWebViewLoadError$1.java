package com.yandex.go.ugc;

import defpackage.as11;
import defpackage.fs11;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ugc.UgcDeeplinkApi$handleWebViewLoadError$1", f = "UgcDeeplinkApi.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class UgcDeeplinkApi$handleWebViewLoadError$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $promiseId;
    int label;
    final /* synthetic */ UgcDeeplinkApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcDeeplinkApi$handleWebViewLoadError$1(UgcDeeplinkApi ugcDeeplinkApi, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ugcDeeplinkApi;
        this.$promiseId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UgcDeeplinkApi$handleWebViewLoadError$1(this.this$0, this.$promiseId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        UgcDeeplinkApi$handleWebViewLoadError$1 ugcDeeplinkApi$handleWebViewLoadError$1 = (UgcDeeplinkApi$handleWebViewLoadError$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        ugcDeeplinkApi$handleWebViewLoadError$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        as11 as11Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        as11Var = this.this$0.callbacks;
        fs11 fs11Var = (fs11) as11Var;
        fs11Var.b.I.q(fs11Var.a.a);
        this.this$0.callbackResult(this.$promiseId);
        return zy11.a;
    }
}
