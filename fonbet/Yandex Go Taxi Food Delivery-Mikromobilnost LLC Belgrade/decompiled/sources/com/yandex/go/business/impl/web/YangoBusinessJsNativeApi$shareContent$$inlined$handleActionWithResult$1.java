package com.yandex.go.business.impl.web;

import com.yandex.go.business.impl.web.handler.b;
import com.yandex.go.business.impl.web.model.JsFilesContent;
import com.yandex.go.business.impl.web.model.JsTextContent;
import defpackage.j73;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xab1;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V", "com/yandex/go/business/impl/web/YangoBusinessJsNativeApi$handleActionWithResult$1"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.business.impl.web.YangoBusinessJsNativeApi$shareContent$$inlined$handleActionWithResult$1", f = "YangoBusinessJsNativeApi.kt", l = {200}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class YangoBusinessJsNativeApi$shareContent$$inlined$handleActionWithResult$1 extends SuspendLambda implements wls {
    final /* synthetic */ String[] $params$inlined;
    final /* synthetic */ String $promiseId;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ YangoBusinessJsNativeApi this$0;
    final /* synthetic */ YangoBusinessJsNativeApi this$0$inline_fun;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YangoBusinessJsNativeApi$shareContent$$inlined$handleActionWithResult$1(YangoBusinessJsNativeApi yangoBusinessJsNativeApi, String str, Continuation continuation, YangoBusinessJsNativeApi yangoBusinessJsNativeApi2, String[] strArr) {
        super(2, continuation);
        this.this$0$inline_fun = yangoBusinessJsNativeApi;
        this.$promiseId = str;
        this.this$0 = yangoBusinessJsNativeApi2;
        this.$params$inlined = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new YangoBusinessJsNativeApi$shareContent$$inlined$handleActionWithResult$1(this.this$0$inline_fun, this.$promiseId, continuation, this.this$0, this.$params$inlined);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((YangoBusinessJsNativeApi$shareContent$$inlined$handleActionWithResult$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m184parseFirstParamgIAlus;
        JsFilesContent jsFilesContent;
        b bVar;
        Object m185safeParsegIAlus;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            m184parseFirstParamgIAlus = this.this$0.m184parseFirstParamgIAlus(this.$params$inlined, JsTextContent.Companion.serializer());
            Throwable a = Result.a(m184parseFirstParamgIAlus);
            if (a == null) {
                JsTextContent jsTextContent = (JsTextContent) m184parseFirstParamgIAlus;
                String str = (String) j73.G(1, this.$params$inlined);
                if (str != null) {
                    m185safeParsegIAlus = this.this$0.m185safeParsegIAlus(str, JsFilesContent.Companion.serializer());
                    if (m185safeParsegIAlus instanceof Result.Failure) {
                        m185safeParsegIAlus = null;
                    }
                    jsFilesContent = (JsFilesContent) m185safeParsegIAlus;
                } else {
                    jsFilesContent = null;
                }
                bVar = this.this$0.sharingHandler;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 1;
                obj = bVar.a(jsTextContent, jsFilesContent, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                obj = new Result.Failure(a);
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        YangoBusinessJsNativeApi yangoBusinessJsNativeApi = this.this$0$inline_fun;
        String str2 = this.$promiseId;
        if (!(obj instanceof Result.Failure)) {
            yangoBusinessJsNativeApi.callbackResult(str2);
        }
        YangoBusinessJsNativeApi yangoBusinessJsNativeApi2 = this.this$0$inline_fun;
        String str3 = this.$promiseId;
        Throwable a2 = Result.a(obj);
        if (a2 != null) {
            String message = a2.getMessage();
            if (message == null) {
                message = "";
            }
            yangoBusinessJsNativeApi2.postScriptEvaluation(xab1.c(str3, message));
        }
        return zy11.a;
    }
}
