package com.yandex.go.platform.js_api;

import com.yandex.go.platform.js_api.models.JsBindPhoneOptions;
import defpackage.auu0;
import defpackage.fk;
import defpackage.mvg;
import defpackage.nv5;
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
@mvg(c = "com.yandex.go.platform.js_api.JsNativeApi$bindPhone$1", f = "JsNativeApi.kt", l = {381}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class JsNativeApi$bindPhone$1 extends SuspendLambda implements wls {
    final /* synthetic */ String[] $params;
    final /* synthetic */ String $promiseId;
    int label;
    final /* synthetic */ JsNativeApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsNativeApi$bindPhone$1(JsNativeApi jsNativeApi, String str, Continuation continuation, String[] strArr) {
        super(2, continuation);
        this.$params = strArr;
        this.this$0 = jsNativeApi;
        this.$promiseId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JsNativeApi$bindPhone$1(this.this$0, this.$promiseId, continuation, this.$params);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((JsNativeApi$bindPhone$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            nv5 nv5Var = this.$params.length != 0 ? new nv5(((JsBindPhoneOptions) sbx.d.b(JsBindPhoneOptions.Companion.serializer(), this.$params[0])).a) : null;
            fk fkVar = this.this$0.e;
            this.label = 1;
            a = ((com.yandex.taxi.go_platform.delegates.a) fkVar).a(nv5Var, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        JsNativeApi jsNativeApi = this.this$0;
        String str = this.$promiseId;
        if (!(a instanceof Result.Failure)) {
            sbx.d.getClass();
            jsNativeApi.e("goplatform.private.portalAuth.bindPhone", str, null, auu0.a, false);
        }
        JsNativeApi jsNativeApi2 = this.this$0;
        String str2 = this.$promiseId;
        Throwable a2 = Result.a(a);
        if (a2 != null) {
            String message = a2.getMessage();
            if (message == null) {
                message = "Unexpected error during phone binding " + a2;
            }
            jsNativeApi2.f("goplatform.private.portalAuth.bindPhone", str2, message);
        }
        return zy11.a;
    }
}
