package com.yandex.go.chargers.dvizh_subscription.web.js;

import defpackage.b64;
import defpackage.evu0;
import defpackage.k52;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
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
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.web.nativeapi.JsNativeApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V", "ru/yandex/taxi/web/nativeapi/JsNativeApi$handleApiMethodCall$2"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.dvizh_subscription.web.js.ChargersDvizhSubscriptionJsApi$sendAnalyticsEvent$$inlined$handleApiMethodCall$1", f = "ChargersDvizhSubscriptionJsApi.kt", l = {176}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class ChargersDvizhSubscriptionJsApi$sendAnalyticsEvent$$inlined$handleApiMethodCall$1 extends SuspendLambda implements wls {
    final /* synthetic */ String[] $params$inlined;
    final /* synthetic */ String $promiseId;
    final /* synthetic */ String $promiseId$inlined;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ ChargersDvizhSubscriptionJsApi this$0;
    final /* synthetic */ JsNativeApi this$0$inline_fun;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersDvizhSubscriptionJsApi$sendAnalyticsEvent$$inlined$handleApiMethodCall$1(JsNativeApi jsNativeApi, String str, Continuation continuation, ChargersDvizhSubscriptionJsApi chargersDvizhSubscriptionJsApi, String[] strArr, String str2) {
        super(2, continuation);
        this.this$0$inline_fun = jsNativeApi;
        this.$promiseId = str;
        this.this$0 = chargersDvizhSubscriptionJsApi;
        this.$params$inlined = strArr;
        this.$promiseId$inlined = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersDvizhSubscriptionJsApi$sendAnalyticsEvent$$inlined$handleApiMethodCall$1(this.this$0$inline_fun, this.$promiseId, continuation, this.this$0, this.$params$inlined, this.$promiseId$inlined);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersDvizhSubscriptionJsApi$sendAnalyticsEvent$$inlined$handleApiMethodCall$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        JsNativeApi jsNativeApi;
        String str;
        Throwable th;
        Object deserializeParam;
        JsNativeApi jsNativeApi2;
        String str2;
        String message;
        tls tlsVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                jsNativeApi = this.this$0$inline_fun;
                String str3 = this.$promiseId;
                try {
                    ChargersDvizhSubscriptionJsApi chargersDvizhSubscriptionJsApi = this.this$0;
                    String[] strArr = this.$params$inlined;
                    KSerializer serializer = k52.Companion.serializer();
                    this.L$0 = jsNativeApi;
                    this.L$1 = str3;
                    this.L$2 = jsNativeApi;
                    this.L$3 = str3;
                    this.L$4 = null;
                    this.label = 1;
                    deserializeParam = chargersDvizhSubscriptionJsApi.deserializeParam(strArr, serializer, this);
                    if (deserializeParam == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str = str3;
                    jsNativeApi2 = jsNativeApi;
                    obj = deserializeParam;
                    str2 = str;
                } catch (Throwable th2) {
                    str = str3;
                    th = th2;
                    message = th.getMessage();
                    if (message != null) {
                    }
                    message = b64.j(this.$promiseId$inlined, " Exception found");
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
                    message = th.getMessage();
                    if (message != null || evu0.J(message)) {
                        message = b64.j(this.$promiseId$inlined, " Exception found");
                    }
                    jsNativeApi.postScriptEvaluation(xab1.c(str, message));
                    return zy11.a;
                }
            }
            k52 k52Var = (k52) obj;
            if (k52Var != null) {
                tlsVar = this.this$0.onSendAnalyticsEvent;
                tlsVar.invoke(k52Var);
            }
            yax.D2.getClass();
            jsNativeApi2.callbackResult(str2);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
