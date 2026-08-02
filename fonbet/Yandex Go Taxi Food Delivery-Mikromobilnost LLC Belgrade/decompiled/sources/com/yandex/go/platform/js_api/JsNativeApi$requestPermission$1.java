package com.yandex.go.platform.js_api;

import com.yandex.go.platform.js_api.models.JsPermission;
import com.yandex.go.platform.js_api.models.JsPermissionState;
import defpackage.auu0;
import defpackage.jl40;
import defpackage.mb20;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sbx;
import defpackage.tse;
import defpackage.w511;
import defpackage.wax;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 9, 0})
@mvg(c = "com.yandex.go.platform.js_api.JsNativeApi$requestPermission$1", f = "JsNativeApi.kt", l = {278}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class JsNativeApi$requestPermission$1 extends SuspendLambda implements wls {
    final /* synthetic */ String[] $params;
    final /* synthetic */ String $promiseId;
    int label;
    final /* synthetic */ JsNativeApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsNativeApi$requestPermission$1(JsNativeApi jsNativeApi, String str, Continuation continuation, String[] strArr) {
        super(2, continuation);
        this.this$0 = jsNativeApi;
        this.$params = strArr;
        this.$promiseId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JsNativeApi$requestPermission$1(this.this$0, this.$promiseId, continuation, this.$params);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((JsNativeApi$requestPermission$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        JsPermission jsPermission;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g gVar = this.this$0.d;
            int i2 = 0;
            String str = this.$params[0];
            this.label = 1;
            gVar.getClass();
            JsPermission.Companion.getClass();
            JsPermission[] values = JsPermission.values();
            int length = values.length;
            while (true) {
                if (i2 >= length) {
                    jsPermission = null;
                    break;
                }
                jsPermission = values[i2];
                if (jl40.l(jsPermission.getJsName(), str)) {
                    break;
                }
                i2++;
            }
            if (jsPermission == null) {
                ((mb20) gVar.c).a("JsPermissionsHandler", "Wrong permission name: ".concat(str), null);
                obj = JsPermissionState.DENIED;
            } else {
                int i3 = wax.a[jsPermission.ordinal()];
                if (i3 == 1) {
                    obj = gVar.c(this);
                } else if (i3 == 2) {
                    obj = gVar.b(this);
                } else {
                    if (i3 != 3) {
                        w511.b();
                        return null;
                    }
                    obj = gVar.a(this);
                }
            }
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
        String str2 = this.$promiseId;
        String stateName = ((JsPermissionState) obj).getStateName();
        sbx.d.getClass();
        jsNativeApi.e("goplatform.private.systemPermissions.request", str2, stateName, auu0.a, false);
        return zy11.a;
    }
}
