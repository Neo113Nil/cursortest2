package com.yandex.go.payments.porttech.navigation;

import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.web.deeplink.WebViewFromDeeplinkExperiment;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/yandex/taxi/web/deeplink/WebViewFromDeeplinkExperiment;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.payments.porttech.navigation.PorttechParseDeeplinkForWebViewInteractor$getPortUrlByDeeplink$2$webViewUrlExperiment$1", f = "PorttechParseDeeplinkForWebViewInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class PorttechParseDeeplinkForWebViewInteractor$getPortUrlByDeeplink$2$webViewUrlExperiment$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PorttechParseDeeplinkForWebViewInteractor$getPortUrlByDeeplink$2$webViewUrlExperiment$1 porttechParseDeeplinkForWebViewInteractor$getPortUrlByDeeplink$2$webViewUrlExperiment$1 = new PorttechParseDeeplinkForWebViewInteractor$getPortUrlByDeeplink$2$webViewUrlExperiment$1(2, continuation);
        porttechParseDeeplinkForWebViewInteractor$getPortUrlByDeeplink$2$webViewUrlExperiment$1.L$0 = obj;
        return porttechParseDeeplinkForWebViewInteractor$getPortUrlByDeeplink$2$webViewUrlExperiment$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PorttechParseDeeplinkForWebViewInteractor$getPortUrlByDeeplink$2$webViewUrlExperiment$1) create((WebViewFromDeeplinkExperiment) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        WebViewFromDeeplinkExperiment webViewFromDeeplinkExperiment = (WebViewFromDeeplinkExperiment) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        WebViewFromDeeplinkExperiment.Companion.getClass();
        return Boolean.valueOf(!jl40.l(webViewFromDeeplinkExperiment, WebViewFromDeeplinkExperiment.d));
    }
}
