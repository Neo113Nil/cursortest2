package com.yandex.go.platform.js_api;

import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.webkit.WebView;
import defpackage.auu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sbx;
import defpackage.tse;
import defpackage.ul91;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 9, 0})
@mvg(c = "com.yandex.go.platform.js_api.JsNativeApi$forceUpdate$1", f = "JsNativeApi.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class JsNativeApi$forceUpdate$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $promiseId;
    int label;
    final /* synthetic */ JsNativeApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsNativeApi$forceUpdate$1(JsNativeApi jsNativeApi, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jsNativeApi;
        this.$promiseId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JsNativeApi$forceUpdate$1(this.this$0, this.$promiseId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        JsNativeApi$forceUpdate$1 jsNativeApi$forceUpdate$1 = (JsNativeApi$forceUpdate$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        jsNativeApi$forceUpdate$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        WebView webView = this.this$0.l;
        WebStorage.getInstance().deleteAllData();
        CookieManager k = ul91.k();
        if (k != null) {
            k.removeAllCookies(null);
            k.flush();
        }
        webView.clearCache(true);
        webView.clearHistory();
        webView.clearFormData();
        webView.reload();
        JsNativeApi jsNativeApi = this.this$0;
        String str = this.$promiseId;
        sbx.d.getClass();
        jsNativeApi.e("goplatform.app.forceUpdate", str, null, auu0.a, false);
        return zy11.a;
    }
}
