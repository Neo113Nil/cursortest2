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
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 9, 0})
@mvg(c = "com.yandex.go.platform.js_api.JsNativeApi$autoLogin$1", f = "JsNativeApi.kt", l = {325}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class JsNativeApi$autoLogin$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $promiseId;
    int label;
    final /* synthetic */ JsNativeApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsNativeApi$autoLogin$1(JsNativeApi jsNativeApi, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jsNativeApi;
        this.$promiseId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JsNativeApi$autoLogin$1(this.this$0, this.$promiseId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((JsNativeApi$autoLogin$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        JsAuthError jsAuthError;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            fk fkVar = this.this$0.e;
            this.label = 1;
            ((com.yandex.taxi.go_platform.delegates.a) fkVar).getClass();
            Result.Failure failure = new Result.Failure(new Throwable());
            if (failure == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj2 = failure;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            obj2 = ((Result) obj).getValue();
        }
        if (!(obj2 instanceof Result.Failure)) {
            lwc0 lwc0Var = (lwc0) obj2;
            obj2 = lwc0Var != null ? lwc0Var.a() : null;
        }
        CookieManager k = ul91.k();
        if (k != null) {
            k.getCookie("https://yandex.com/");
        }
        JsNativeApi jsNativeApi = this.this$0;
        String str = this.$promiseId;
        if (!(obj2 instanceof Result.Failure)) {
            sbx.d.getClass();
            jsNativeApi.e("goplatform.private.portalAuth.login", str, (JsUserInfo) obj2, JsUserInfo.Companion.serializer(), false);
        }
        JsNativeApi jsNativeApi2 = this.this$0;
        Throwable a = Result.a(obj2);
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
            ((mb20) jsNativeApi2.r).a("JsNativeApi", "Got error from autologin", jsAuthError);
        }
        return zy11.a;
    }
}
