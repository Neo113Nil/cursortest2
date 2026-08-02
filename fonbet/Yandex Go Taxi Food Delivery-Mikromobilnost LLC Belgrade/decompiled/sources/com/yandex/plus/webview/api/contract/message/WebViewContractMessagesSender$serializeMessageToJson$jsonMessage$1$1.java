package com.yandex.plus.webview.api.contract.message;

import defpackage.a441;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sbx;
import defpackage.tse;
import defpackage.v521;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.webview.api.contract.message.WebViewContractMessagesSender$serializeMessageToJson$jsonMessage$1$1", f = "WebViewContractMessagesSender.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class WebViewContractMessagesSender$serializeMessageToJson$jsonMessage$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ Object $message;
    final /* synthetic */ a $this_runSuspendCatching;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewContractMessagesSender$serializeMessageToJson$jsonMessage$1$1(a aVar, Object obj, Continuation continuation) {
        super(2, continuation);
        this.$this_runSuspendCatching = aVar;
        this.$message = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebViewContractMessagesSender$serializeMessageToJson$jsonMessage$1$1(this.$this_runSuspendCatching, this.$message, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebViewContractMessagesSender$serializeMessageToJson$jsonMessage$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a441 a441Var = this.$this_runSuspendCatching.a;
        return ((sbx) a441Var.b).c(this.$message, (v521) a441Var.c);
    }
}
