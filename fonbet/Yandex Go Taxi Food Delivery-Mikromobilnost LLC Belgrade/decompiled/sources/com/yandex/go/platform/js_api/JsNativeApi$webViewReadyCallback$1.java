package com.yandex.go.platform.js_api;

import defpackage.auu0;
import defpackage.ivc0;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sbx;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 9, 0})
@mvg(c = "com.yandex.go.platform.js_api.JsNativeApi$webViewReadyCallback$1", f = "JsNativeApi.kt", l = {412}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class JsNativeApi$webViewReadyCallback$1 extends SuspendLambda implements wls {
    final /* synthetic */ String[] $params;
    final /* synthetic */ String $promiseId;
    int label;
    final /* synthetic */ JsNativeApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsNativeApi$webViewReadyCallback$1(JsNativeApi jsNativeApi, String str, Continuation continuation, String[] strArr) {
        super(2, continuation);
        this.this$0 = jsNativeApi;
        this.$promiseId = str;
        this.$params = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JsNativeApi$webViewReadyCallback$1(this.this$0, this.$promiseId, continuation, this.$params);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        JsNativeApi$webViewReadyCallback$1 jsNativeApi$webViewReadyCallback$1 = (JsNativeApi$webViewReadyCallback$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        jsNativeApi$webViewReadyCallback$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0.k;
            cVar.a.onPageFinished(null);
            cVar.b.g(Boolean.TRUE);
            JsNativeApi jsNativeApi = this.this$0;
            String str = this.$promiseId;
            sbx.d.getClass();
            jsNativeApi.e("goplatform.app.onWebViewReady", str, null, auu0.a, false);
            ivc0 ivc0Var = this.this$0.t;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            Object value = ((Result) obj).getValue();
            if (value instanceof Result.Failure) {
                value = null;
            }
            if (value == null) {
                JsNativeApi jsNativeApi2 = this.this$0;
                String str2 = this.$promiseId;
                tse tseVar = jsNativeApi2.b;
                sjh sjhVar = uyj.a;
                tje.N(tseVar, mdh.b, null, new JsNativeApi$autoLogin$1(jsNativeApi2, str2, null), 2);
            }
        }
        return zy11.a;
    }
}
