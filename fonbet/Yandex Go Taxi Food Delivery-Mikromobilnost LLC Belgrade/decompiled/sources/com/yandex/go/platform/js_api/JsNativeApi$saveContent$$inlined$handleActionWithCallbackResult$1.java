package com.yandex.go.platform.js_api;

import com.yandex.go.platform.js_api.models.JsFile;
import defpackage.auu0;
import defpackage.g0c;
import defpackage.lfx;
import defpackage.mvg;
import defpackage.myi;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.sbx;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 9, 0})
@mvg(c = "com.yandex.go.platform.js_api.JsNativeApi$saveContent$$inlined$handleActionWithCallbackResult$1", f = "JsNativeApi.kt", l = {879}, m = "invokeSuspend")
/* loaded from: classes13.dex */
public final class JsNativeApi$saveContent$$inlined$handleActionWithCallbackResult$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $functionName;
    final /* synthetic */ String $param;
    final /* synthetic */ String $promiseId;
    final /* synthetic */ h $receiver$inlined;
    final /* synthetic */ myi $serializer;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ JsNativeApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsNativeApi$saveContent$$inlined$handleActionWithCallbackResult$1(JsNativeApi jsNativeApi, myi myiVar, String str, String str2, String str3, Continuation continuation, h hVar) {
        super(2, continuation);
        this.this$0 = jsNativeApi;
        this.$serializer = myiVar;
        this.$param = str;
        this.$functionName = str2;
        this.$promiseId = str3;
        this.$receiver$inlined = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JsNativeApi$saveContent$$inlined$handleActionWithCallbackResult$1(this.this$0, this.$serializer, this.$param, this.$functionName, this.$promiseId, continuation, this.$receiver$inlined);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((JsNativeApi$saveContent$$inlined$handleActionWithCallbackResult$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        Object a;
        String str;
        String str2;
        JsNativeApi jsNativeApi;
        JsNativeApi jsNativeApi2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            JsNativeApi jsNativeApi3 = this.this$0;
            myi myiVar = this.$serializer;
            String str3 = this.$param;
            lfx[] lfxVarArr = {qoi0.a(IllegalArgumentException.class)};
            try {
                failure = sbx.d.b(myiVar, str3);
            } catch (Exception e) {
                if (!((g0c) lfxVarArr[0]).e(e)) {
                    throw e;
                }
                failure = new Result.Failure(e);
            }
            String str4 = this.$functionName;
            String str5 = this.$promiseId;
            JsNativeApi jsNativeApi4 = this.this$0;
            Throwable a2 = Result.a(failure);
            if (a2 != null) {
                String message = a2.getMessage();
                if (message == null) {
                    message = "";
                }
                jsNativeApi3.f(str4, str5, message);
            }
            if (!(failure instanceof Result.Failure)) {
                h hVar = this.$receiver$inlined;
                this.L$0 = jsNativeApi4;
                this.L$1 = str4;
                this.L$2 = str5;
                this.L$3 = failure;
                this.L$4 = jsNativeApi4;
                this.label = 1;
                a = hVar.a((JsFile) failure, this);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str = str4;
                str2 = str5;
                jsNativeApi = jsNativeApi4;
                jsNativeApi2 = jsNativeApi;
            }
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jsNativeApi = (JsNativeApi) this.L$4;
        String str6 = (String) this.L$2;
        String str7 = (String) this.L$1;
        JsNativeApi jsNativeApi5 = (JsNativeApi) this.L$0;
        kotlin.b.b(obj);
        a = ((Result) obj).getValue();
        jsNativeApi2 = jsNativeApi5;
        str2 = str6;
        str = str7;
        Throwable a3 = Result.a(a);
        if (a3 != null) {
            String message2 = a3.getMessage();
            jsNativeApi.f(str, str2, message2 != null ? message2 : "");
        }
        if (!(a instanceof Result.Failure)) {
            sbx.d.getClass();
            jsNativeApi2.e(str, str2, null, auu0.a, false);
        }
        return zy11.a;
    }
}
