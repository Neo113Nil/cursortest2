package com.yandex.go.platform.js_api;

import defpackage.auu0;
import defpackage.io9;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pbx;
import defpackage.sbx;
import defpackage.tse;
import defpackage.wls;
import defpackage.xiu0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 9, 0})
@mvg(c = "com.yandex.go.platform.js_api.JsNativeApi$readFromStorage$1", f = "JsNativeApi.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class JsNativeApi$readFromStorage$1 extends SuspendLambda implements wls {
    final /* synthetic */ String[] $params;
    final /* synthetic */ String $promiseId;
    int label;
    final /* synthetic */ JsNativeApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsNativeApi$readFromStorage$1(JsNativeApi jsNativeApi, String str, Continuation continuation, String[] strArr) {
        super(2, continuation);
        this.this$0 = jsNativeApi;
        this.$params = strArr;
        this.$promiseId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JsNativeApi$readFromStorage$1(this.this$0, this.$promiseId, continuation, this.$params);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        JsNativeApi$readFromStorage$1 jsNativeApi$readFromStorage$1 = (JsNativeApi$readFromStorage$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        jsNativeApi$readFromStorage$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        String str = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        pbx pbxVar = this.this$0.g;
        String[] strArr = this.$params;
        if (strArr.length == 0) {
            pbxVar.getClass();
        } else {
            io9 io9Var = pbxVar.a;
            str = ((xiu0) io9Var.a).a.getString(strArr[0], null);
        }
        String str2 = str;
        JsNativeApi jsNativeApi = this.this$0;
        String str3 = this.$promiseId;
        sbx.d.getClass();
        jsNativeApi.e("goplatform.private.storage.read", str3, str2, auu0.a, false);
        return zy11.a;
    }
}
