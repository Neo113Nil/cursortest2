package com.yandex.go.platform.js_api;

import defpackage.auu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qqt;
import defpackage.sbx;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 9, 0})
@mvg(c = "com.yandex.go.platform.js_api.JsNativeApi$36$consumer$1$1", f = "JsNativeApi.kt", l = {HProv.PP_CONTAINER_EXTENSION}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class JsNativeApi$36$consumer$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ qqt $binding;
    final /* synthetic */ String[] $params;
    final /* synthetic */ String $promiseId;
    int label;
    final /* synthetic */ JsNativeApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsNativeApi$36$consumer$1$1(qqt qqtVar, String[] strArr, JsNativeApi jsNativeApi, String str, Continuation continuation) {
        super(2, continuation);
        this.$binding = qqtVar;
        this.$params = strArr;
        this.this$0 = jsNativeApi;
        this.$promiseId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JsNativeApi$36$consumer$1$1(this.$binding, this.$params, this.this$0, this.$promiseId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((JsNativeApi$36$consumer$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            wls wlsVar = this.$binding.b;
            String[] strArr = this.$params;
            this.label = 1;
            obj = wlsVar.invoke(strArr, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        JsNativeApi jsNativeApi = this.this$0;
        this.$binding.getClass();
        String str = this.$promiseId;
        sbx.d.getClass();
        jsNativeApi.e("goplatform.app.disableGPModeInTaxiApp", str, (String) obj, auu0.a, false);
        return zy11.a;
    }
}
