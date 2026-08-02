package com.yandex.plus.webview.internal.contract.impl.loading;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.webview.internal.contract.impl.loading.BaseReadyFlowReadyStrategyDelegate$handleReadyFlow$1", f = "BaseReadyFlowReadyStrategyDelegate.kt", l = {71}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class BaseReadyFlowReadyStrategyDelegate$handleReadyFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseReadyFlowReadyStrategyDelegate$handleReadyFlow$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseReadyFlowReadyStrategyDelegate$handleReadyFlow$1(this.this$0, this.$url, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseReadyFlowReadyStrategyDelegate$handleReadyFlow$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            long j = aVar.a;
            BaseReadyFlowReadyStrategyDelegate$handleReadyFlow$1$isReady$1 baseReadyFlowReadyStrategyDelegate$handleReadyFlow$1$isReady$1 = new BaseReadyFlowReadyStrategyDelegate$handleReadyFlow$1$isReady$1(aVar, null);
            this.label = 1;
            obj = kotlinx.coroutines.a.w(j, baseReadyFlowReadyStrategyDelegate$handleReadyFlow$1$isReady$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.this$0.d(obj != null);
        this.this$0.h = null;
        return zy11.a;
    }
}
