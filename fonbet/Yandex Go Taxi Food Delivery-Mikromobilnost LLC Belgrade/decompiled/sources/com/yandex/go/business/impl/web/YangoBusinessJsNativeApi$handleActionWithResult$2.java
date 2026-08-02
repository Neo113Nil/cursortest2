package com.yandex.go.business.impl.web;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
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
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.business.impl.web.YangoBusinessJsNativeApi$handleActionWithResult$2", f = "YangoBusinessJsNativeApi.kt", l = {159}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class YangoBusinessJsNativeApi$handleActionWithResult$2 extends SuspendLambda implements wls {
    final /* synthetic */ tls $callback;
    final /* synthetic */ String $promiseId;
    final /* synthetic */ KSerializer $serializer;
    int label;
    final /* synthetic */ YangoBusinessJsNativeApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YangoBusinessJsNativeApi$handleActionWithResult$2(tls tlsVar, YangoBusinessJsNativeApi yangoBusinessJsNativeApi, String str, KSerializer kSerializer, Continuation continuation) {
        super(2, continuation);
        this.$callback = tlsVar;
        this.this$0 = yangoBusinessJsNativeApi;
        this.$promiseId = str;
        this.$serializer = kSerializer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new YangoBusinessJsNativeApi$handleActionWithResult$2(this.$callback, this.this$0, this.$promiseId, this.$serializer, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((YangoBusinessJsNativeApi$handleActionWithResult$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tls tlsVar = this.$callback;
            this.label = 1;
            obj = tlsVar.invoke(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        Object value = ((Result) obj).getValue();
        YangoBusinessJsNativeApi yangoBusinessJsNativeApi = this.this$0;
        String str = this.$promiseId;
        KSerializer kSerializer = this.$serializer;
        if (!(value instanceof Result.Failure)) {
            yangoBusinessJsNativeApi.callbackResult(str, kSerializer, value);
        }
        YangoBusinessJsNativeApi yangoBusinessJsNativeApi2 = this.this$0;
        String str2 = this.$promiseId;
        Throwable a = Result.a(value);
        if (a != null) {
            String message = a.getMessage();
            if (message == null) {
                message = "";
            }
            yangoBusinessJsNativeApi2.postScriptEvaluation(xab1.c(str2, message));
        }
        return zy11.a;
    }
}
