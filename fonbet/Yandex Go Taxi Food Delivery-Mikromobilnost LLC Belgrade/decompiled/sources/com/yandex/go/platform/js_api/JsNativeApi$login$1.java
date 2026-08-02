package com.yandex.go.platform.js_api;

import android.webkit.CookieManager;
import com.yandex.go.platform.js_api.models.ErrorCode;
import com.yandex.go.platform.js_api.models.JsAuthError;
import com.yandex.go.platform.js_api.models.JsUserInfo;
import defpackage.fk;
import defpackage.lwc0;
import defpackage.mb20;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sbx;
import defpackage.tse;
import defpackage.ul91;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 9, 0})
@mvg(c = "com.yandex.go.platform.js_api.JsNativeApi$login$1", f = "JsNativeApi.kt", l = {302}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class JsNativeApi$login$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $promiseId;
    int label;
    final /* synthetic */ JsNativeApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsNativeApi$login$1(JsNativeApi jsNativeApi, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jsNativeApi;
        this.$promiseId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JsNativeApi$login$1(this.this$0, this.$promiseId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((JsNativeApi$login$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        JsAuthError jsAuthError;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            fk fkVar = this.this$0.e;
            this.label = 1;
            c = ((com.yandex.taxi.go_platform.delegates.a) fkVar).c(this);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            c = ((Result) obj).getValue();
        }
        if (!(c instanceof Result.Failure)) {
            lwc0 lwc0Var = (lwc0) c;
            c = lwc0Var != null ? lwc0Var.a() : null;
        }
        CookieManager k = ul91.k();
        if (k != null) {
            k.getCookie("https://yandex.com/");
        }
        JsNativeApi jsNativeApi = this.this$0;
        String str = this.$promiseId;
        if (!(c instanceof Result.Failure)) {
            sbx.d.getClass();
            jsNativeApi.e("goplatform.private.portalAuth.login", str, (JsUserInfo) c, JsUserInfo.Companion.serializer(), false);
        }
        JsNativeApi jsNativeApi2 = this.this$0;
        String str2 = this.$promiseId;
        Throwable a = Result.a(c);
        if (a != null) {
            if (a instanceof JsAuthError) {
                jsAuthError = (JsAuthError) a;
            } else {
                ErrorCode errorCode = ErrorCode.Failed;
                String message = a.getMessage();
                if (message == null) {
                    message = "";
                }
                jsAuthError = new JsAuthError(errorCode, message);
            }
            ((mb20) jsNativeApi2.r).a("JsNativeApi", "Got error from login() call", jsAuthError);
            String a2 = i.a(str2, sbx.d.c(jsAuthError, JsAuthError.Companion.serializer()), false);
            Pair pair = new Pair("name", "goplatform.private.portalAuth.login");
            String message2 = jsAuthError.getMessage();
            jsNativeApi2.n.a("Transport.ScriptFunctionResult", kotlin.collections.b.i(pair, new Pair("error_msg", message2 != null ? message2 : "")));
            jsNativeApi2.g(a2);
        }
        return zy11.a;
    }
}
