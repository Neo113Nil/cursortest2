package com.yandex.go.platform.js_api;

import com.yandex.go.platform.js_api.models.JsUserInfo;
import defpackage.fk;
import defpackage.lwc0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sbx;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 9, 0})
@mvg(c = "com.yandex.go.platform.js_api.JsNativeApi$getUserInfo$1", f = "JsNativeApi.kt", l = {566}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class JsNativeApi$getUserInfo$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $promiseId;
    int label;
    final /* synthetic */ JsNativeApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsNativeApi$getUserInfo$1(JsNativeApi jsNativeApi, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jsNativeApi;
        this.$promiseId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JsNativeApi$getUserInfo$1(this.this$0, this.$promiseId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((JsNativeApi$getUserInfo$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            fk fkVar = this.this$0.e;
            this.label = 1;
            b = ((com.yandex.taxi.go_platform.delegates.a) fkVar).b();
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            b = ((Result) obj).getValue();
        }
        if (!(b instanceof Result.Failure)) {
            lwc0 lwc0Var = (lwc0) b;
            b = lwc0Var != null ? lwc0Var.a() : null;
        }
        JsNativeApi jsNativeApi = this.this$0;
        String str = this.$promiseId;
        if (!(b instanceof Result.Failure)) {
            sbx.d.getClass();
            jsNativeApi.e("goplatform.private.portalAuth.getUserInfo", str, (JsUserInfo) b, JsUserInfo.Companion.serializer(), false);
        }
        JsNativeApi jsNativeApi2 = this.this$0;
        String str2 = this.$promiseId;
        Throwable a = Result.a(b);
        if (a != null) {
            String message = a.getMessage();
            if (message == null) {
                message = "Unrecognized error";
            }
            jsNativeApi2.f("goplatform.private.portalAuth.getUserInfo", str2, message);
        }
        return zy11.a;
    }
}
