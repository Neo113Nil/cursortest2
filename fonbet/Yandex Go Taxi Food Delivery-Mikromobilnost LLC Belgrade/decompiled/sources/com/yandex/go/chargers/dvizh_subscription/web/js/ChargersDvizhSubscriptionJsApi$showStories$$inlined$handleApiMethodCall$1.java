package com.yandex.go.chargers.dvizh_subscription.web.js;

import defpackage.a80;
import defpackage.cl7;
import defpackage.dvw;
import defpackage.evu0;
import defpackage.j18;
import defpackage.j73;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uj;
import defpackage.vj;
import defpackage.wj;
import defpackage.wls;
import defpackage.xab1;
import defpackage.yax;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.web.nativeapi.JsNativeApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V", "ru/yandex/taxi/web/nativeapi/JsNativeApi$handleApiMethodCall$2"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.dvizh_subscription.web.js.ChargersDvizhSubscriptionJsApi$showStories$$inlined$handleApiMethodCall$1", f = "ChargersDvizhSubscriptionJsApi.kt", l = {178}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class ChargersDvizhSubscriptionJsApi$showStories$$inlined$handleApiMethodCall$1 extends SuspendLambda implements wls {
    final /* synthetic */ String[] $params$inlined;
    final /* synthetic */ String $promiseId;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ ChargersDvizhSubscriptionJsApi this$0;
    final /* synthetic */ JsNativeApi this$0$inline_fun;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersDvizhSubscriptionJsApi$showStories$$inlined$handleApiMethodCall$1(JsNativeApi jsNativeApi, String str, Continuation continuation, ChargersDvizhSubscriptionJsApi chargersDvizhSubscriptionJsApi, String[] strArr) {
        super(2, continuation);
        this.this$0$inline_fun = jsNativeApi;
        this.$promiseId = str;
        this.this$0 = chargersDvizhSubscriptionJsApi;
        this.$params$inlined = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersDvizhSubscriptionJsApi$showStories$$inlined$handleApiMethodCall$1(this.this$0$inline_fun, this.$promiseId, continuation, this.this$0, this.$params$inlined);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersDvizhSubscriptionJsApi$showStories$$inlined$handleApiMethodCall$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Type inference failed for: r13v5, types: [T, uj] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Throwable th;
        JsNativeApi jsNativeApi;
        wls wlsVar;
        JsNativeApi jsNativeApi2;
        String str2;
        String message;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                JsNativeApi jsNativeApi3 = this.this$0$inline_fun;
                str = this.$promiseId;
                try {
                    this.L$0 = jsNativeApi3;
                    this.L$1 = str;
                    this.L$2 = jsNativeApi3;
                    this.L$3 = str;
                    this.L$4 = null;
                    this.L$5 = this;
                    this.label = 1;
                    j18 j18Var = new j18(1, dvw.b(this));
                    j18Var.u();
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    vj vjVar = new vj(7, ref$ObjectRef);
                    cl7 cl7Var = new cl7(j18Var, vjVar);
                    ChargersDvizhSubscriptionJsApi$showStories$lambda$0$$inlined$suspendCallbackApi$2 chargersDvizhSubscriptionJsApi$showStories$lambda$0$$inlined$suspendCallbackApi$2 = new ChargersDvizhSubscriptionJsApi$showStories$lambda$0$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0);
                    wlsVar = this.this$0.onShowStories;
                    wlsVar.invoke(j73.C(this.$params$inlined), new a80(7, chargersDvizhSubscriptionJsApi$showStories$lambda$0$$inlined$suspendCallbackApi$2));
                    ref$ObjectRef.element = uj.A;
                    if (cl7Var.c()) {
                        vjVar.invoke();
                    } else {
                        j18Var.w(new wj(cl7Var, 7));
                    }
                    if (j18Var.s() == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    jsNativeApi2 = jsNativeApi3;
                    jsNativeApi = jsNativeApi2;
                    str2 = str;
                } catch (Throwable th2) {
                    th = th2;
                    jsNativeApi = jsNativeApi3;
                    jst.e.j(th);
                    message = th.getMessage();
                    if (message != null || evu0.J(message)) {
                        message = "Show stories exception";
                    }
                    jsNativeApi.postScriptEvaluation(xab1.c(str, message));
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) this.L$3;
                jsNativeApi = (JsNativeApi) this.L$2;
                str2 = (String) this.L$1;
                jsNativeApi2 = (JsNativeApi) this.L$0;
                try {
                    b.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    jst.e.j(th);
                    message = th.getMessage();
                    if (message != null) {
                    }
                    message = "Show stories exception";
                    jsNativeApi.postScriptEvaluation(xab1.c(str, message));
                    return zy11.a;
                }
            }
            yax.D2.getClass();
            jsNativeApi2.callbackResult(str2);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
