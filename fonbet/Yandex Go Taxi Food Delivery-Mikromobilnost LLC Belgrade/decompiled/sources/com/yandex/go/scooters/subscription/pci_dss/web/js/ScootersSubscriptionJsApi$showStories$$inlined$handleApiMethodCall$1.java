package com.yandex.go.scooters.subscription.pci_dss.web.js;

import defpackage.evu0;
import defpackage.j73;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
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
import ru.yandex.taxi.web.nativeapi.JsNativeApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V", "ru/yandex/taxi/web/nativeapi/JsNativeApi$handleApiMethodCall$2"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.subscription.pci_dss.web.js.ScootersSubscriptionJsApi$showStories$$inlined$handleApiMethodCall$1", f = "ScootersSubscriptionJsApi.kt", l = {176}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class ScootersSubscriptionJsApi$showStories$$inlined$handleApiMethodCall$1 extends SuspendLambda implements wls {
    final /* synthetic */ String[] $params$inlined;
    final /* synthetic */ String $promiseId;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ ScootersSubscriptionJsApi this$0;
    final /* synthetic */ JsNativeApi this$0$inline_fun;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSubscriptionJsApi$showStories$$inlined$handleApiMethodCall$1(JsNativeApi jsNativeApi, String str, Continuation continuation, ScootersSubscriptionJsApi scootersSubscriptionJsApi, String[] strArr) {
        super(2, continuation);
        this.this$0$inline_fun = jsNativeApi;
        this.$promiseId = str;
        this.this$0 = scootersSubscriptionJsApi;
        this.$params$inlined = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersSubscriptionJsApi$showStories$$inlined$handleApiMethodCall$1(this.this$0$inline_fun, this.$promiseId, continuation, this.this$0, this.$params$inlined);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersSubscriptionJsApi$showStories$$inlined$handleApiMethodCall$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        JsNativeApi jsNativeApi;
        String str;
        wls wlsVar;
        String str2;
        JsNativeApi jsNativeApi2;
        String message;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                jsNativeApi = this.this$0$inline_fun;
                String str3 = this.$promiseId;
                try {
                    wlsVar = this.this$0.onShowStories;
                    Object C = j73.C(this.$params$inlined);
                    this.L$0 = jsNativeApi;
                    this.L$1 = str3;
                    this.L$2 = jsNativeApi;
                    this.L$3 = str3;
                    this.L$4 = null;
                    this.label = 1;
                    if (com.yandex.go.scooters.utils.b.a(wlsVar, C, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str = str3;
                    str2 = str;
                    jsNativeApi2 = jsNativeApi;
                } catch (Throwable th) {
                    th = th;
                    str = str3;
                    jst.e.j(th);
                    message = th.getMessage();
                    if (message != null) {
                    }
                    message = "Show stories exception";
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
                } catch (Throwable th2) {
                    th = th2;
                    jst.e.j(th);
                    message = th.getMessage();
                    if (message != null || evu0.J(message)) {
                        message = "Show stories exception";
                    }
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
