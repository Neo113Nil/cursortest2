package com.yandex.go.business.impl.web;

import defpackage.jn51;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xab1;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V", "com/yandex/go/business/impl/web/YangoBusinessJsNativeApi$handleActionWithResult$1"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.business.impl.web.YangoBusinessJsNativeApi$handleSendAnalyticsEvent$1$invokeSuspend$$inlined$handleActionWithResult$1", f = "YangoBusinessJsNativeApi.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class YangoBusinessJsNativeApi$handleSendAnalyticsEvent$1$invokeSuspend$$inlined$handleActionWithResult$1 extends SuspendLambda implements wls {
    final /* synthetic */ String[] $params$inlined;
    final /* synthetic */ String $promiseId;
    int label;
    final /* synthetic */ YangoBusinessJsNativeApi this$0;
    final /* synthetic */ YangoBusinessJsNativeApi this$0$inline_fun;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YangoBusinessJsNativeApi$handleSendAnalyticsEvent$1$invokeSuspend$$inlined$handleActionWithResult$1(YangoBusinessJsNativeApi yangoBusinessJsNativeApi, String str, Continuation continuation, YangoBusinessJsNativeApi yangoBusinessJsNativeApi2, String[] strArr) {
        super(2, continuation);
        this.this$0$inline_fun = yangoBusinessJsNativeApi;
        this.$promiseId = str;
        this.this$0 = yangoBusinessJsNativeApi2;
        this.$params$inlined = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new YangoBusinessJsNativeApi$handleSendAnalyticsEvent$1$invokeSuspend$$inlined$handleActionWithResult$1(this.this$0$inline_fun, this.$promiseId, continuation, this.this$0, this.$params$inlined);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        YangoBusinessJsNativeApi$handleSendAnalyticsEvent$1$invokeSuspend$$inlined$handleActionWithResult$1 yangoBusinessJsNativeApi$handleSendAnalyticsEvent$1$invokeSuspend$$inlined$handleActionWithResult$1 = (YangoBusinessJsNativeApi$handleSendAnalyticsEvent$1$invokeSuspend$$inlined$handleActionWithResult$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        yangoBusinessJsNativeApi$handleSendAnalyticsEvent$1$invokeSuspend$$inlined$handleActionWithResult$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        jn51 jn51Var;
        zy11 zy11Var = zy11.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        try {
            jn51Var = this.this$0.analytics;
            jn51Var.a(this.$params$inlined);
            failure = zy11Var;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        YangoBusinessJsNativeApi yangoBusinessJsNativeApi = this.this$0$inline_fun;
        String str = this.$promiseId;
        if (!(failure instanceof Result.Failure)) {
            yangoBusinessJsNativeApi.callbackResult(str);
        }
        YangoBusinessJsNativeApi yangoBusinessJsNativeApi2 = this.this$0$inline_fun;
        String str2 = this.$promiseId;
        Throwable a = Result.a(failure);
        if (a != null) {
            String message = a.getMessage();
            if (message == null) {
                message = "";
            }
            yangoBusinessJsNativeApi2.postScriptEvaluation(xab1.c(str2, message));
        }
        return zy11Var;
    }
}
