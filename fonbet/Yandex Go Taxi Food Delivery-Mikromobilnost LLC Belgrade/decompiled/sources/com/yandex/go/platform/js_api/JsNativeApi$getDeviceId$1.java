package com.yandex.go.platform.js_api;

import defpackage.auu0;
import defpackage.kb20;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sbx;
import defpackage.tse;
import defpackage.wls;
import defpackage.zch;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 9, 0})
@mvg(c = "com.yandex.go.platform.js_api.JsNativeApi$getDeviceId$1", f = "JsNativeApi.kt", l = {462}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class JsNativeApi$getDeviceId$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $promiseId;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ JsNativeApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsNativeApi$getDeviceId$1(JsNativeApi jsNativeApi, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jsNativeApi;
        this.$promiseId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JsNativeApi$getDeviceId$1(this.this$0, this.$promiseId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((JsNativeApi$getDeviceId$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        JsNativeApi jsNativeApi;
        String str;
        String str2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            JsNativeApi jsNativeApi2 = this.this$0;
            String str3 = this.$promiseId;
            zch zchVar = jsNativeApi2.m;
            this.L$0 = jsNativeApi2;
            this.L$1 = "goplatform.private.user.getDeviceId";
            this.L$2 = str3;
            this.label = 1;
            String a = ((kb20) zchVar.a).a();
            if (a == null) {
                a = "";
            }
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj2 = a;
            jsNativeApi = jsNativeApi2;
            str = str3;
            str2 = "goplatform.private.user.getDeviceId";
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str4 = (String) this.L$2;
            String str5 = (String) this.L$1;
            JsNativeApi jsNativeApi3 = (JsNativeApi) this.L$0;
            kotlin.b.b(obj);
            jsNativeApi = jsNativeApi3;
            obj2 = obj;
            str = str4;
            str2 = str5;
        }
        sbx.d.getClass();
        jsNativeApi.e(str2, str, obj2, auu0.a, false);
        return zy11.a;
    }
}
