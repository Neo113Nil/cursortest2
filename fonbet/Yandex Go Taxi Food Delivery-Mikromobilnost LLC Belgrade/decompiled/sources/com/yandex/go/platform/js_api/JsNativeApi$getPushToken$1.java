package com.yandex.go.platform.js_api;

import com.yandex.go.platform.js_api.models.JsPushToken;
import defpackage.b5g0;
import defpackage.d5g0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sbx;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 9, 0})
@mvg(c = "com.yandex.go.platform.js_api.JsNativeApi$getPushToken$1", f = "JsNativeApi.kt", l = {576, 577}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class JsNativeApi$getPushToken$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $promiseId;
    int label;
    final /* synthetic */ JsNativeApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsNativeApi$getPushToken$1(JsNativeApi jsNativeApi, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jsNativeApi;
        this.$promiseId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JsNativeApi$getPushToken$1(this.this$0, this.$promiseId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((JsNativeApi$getPushToken$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
    
        if (r13 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0038, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0029, code lost:
    
        if (r2 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
    
        if ((r13 instanceof defpackage.a5g0) != false) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        String str2 = null;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.taxi.go_platform.delegates.c cVar = this.this$0.q;
            this.label = 1;
            cVar.getClass();
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                d5g0 d5g0Var = (d5g0) obj;
                if (d5g0Var != null) {
                    str = d5g0Var.a;
                }
                str = null;
                if (d5g0Var != null) {
                    String str3 = d5g0Var.a;
                    if (d5g0Var instanceof b5g0) {
                        str2 = str3;
                    }
                }
                JsPushToken jsPushToken = new JsPushToken(str, str2);
                JsNativeApi jsNativeApi = this.this$0;
                String str4 = this.$promiseId;
                sbx.d.getClass();
                jsNativeApi.e("goplatform.private.push.getPushToken", str4, jsPushToken, JsPushToken.Companion.serializer(), true);
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        com.yandex.taxi.go_platform.delegates.c cVar2 = this.this$0.q;
        this.label = 2;
        obj = cVar2.a(this);
    }
}
