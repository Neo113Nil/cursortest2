package com.yandex.go.payments.porttech.data;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.web.deeplink.WebViewFromDeeplinkExperiment;
import ru.yandex.taxi.web.nativeapi.JsNativeApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lru/yandex/taxi/web/UiWebViewConfig;", "<anonymous>", "(Ltse;)Lru/yandex/taxi/web/UiWebViewConfig;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.porttech.data.PorttechWebViewConfigProvider$getConfig$2", f = "PorttechWebViewConfigProvider.kt", l = {26}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PorttechWebViewConfigProvider$getConfig$2 extends SuspendLambda implements wls {
    final /* synthetic */ JsNativeApi $jsNativeApi;
    final /* synthetic */ WebViewFromDeeplinkExperiment.a $urlWithId;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PorttechWebViewConfigProvider$getConfig$2(JsNativeApi jsNativeApi, a aVar, WebViewFromDeeplinkExperiment.a aVar2, Continuation continuation) {
        super(2, continuation);
        this.$jsNativeApi = jsNativeApi;
        this.this$0 = aVar;
        this.$urlWithId = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PorttechWebViewConfigProvider$getConfig$2(this.$jsNativeApi, this.this$0, this.$urlWithId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PorttechWebViewConfigProvider$getConfig$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoreWebViewConfig.a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            CoreWebViewConfig.a aVar2 = new CoreWebViewConfig.a();
            aVar2.e = false;
            aVar2.f = true;
            aVar2.h = true;
            aVar2.k = this.$jsNativeApi;
            ru.yandex.taxi.web.deeplink.a aVar3 = this.this$0.b;
            WebViewFromDeeplinkExperiment.a aVar4 = this.$urlWithId;
            this.L$0 = aVar2;
            this.label = 1;
            if (aVar3.a(this, aVar2, aVar4) == coroutineSingletons) {
                return coroutineSingletons;
            }
            aVar = aVar2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = (CoreWebViewConfig.a) this.L$0;
            b.b(obj);
        }
        UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
        uiWebViewConfig.setShouldShowCloseButton(false);
        uiWebViewConfig.setArrowHidden(true);
        uiWebViewConfig.setShouldShowToolbar(false);
        uiWebViewConfig.setShouldUseCached(false);
        uiWebViewConfig.setBackStackAware(true);
        uiWebViewConfig.setHasTitleFromWeb(false);
        uiWebViewConfig.setModalViewMode(UiWebViewConfig.Fullscreen.INSTANCE);
        uiWebViewConfig.setAnimateOnAppearing(false);
        return uiWebViewConfig;
    }
}
