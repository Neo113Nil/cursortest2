package com.yandex.go.payments.porttech.navigation;

import android.net.Uri;
import com.adjust.sdk.Constants;
import defpackage.bce0;
import defpackage.cvu0;
import defpackage.gq41;
import defpackage.gw00;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.web.deeplink.WebViewFromDeeplinkExperiment;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lru/yandex/taxi/web/deeplink/WebViewFromDeeplinkExperiment$a;", "<anonymous>", "(Ltse;)Lru/yandex/taxi/web/deeplink/WebViewFromDeeplinkExperiment$a;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.porttech.navigation.PorttechParseDeeplinkForWebViewInteractor$getPortUrlByDeeplink$2", f = "PorttechParseDeeplinkForWebViewInteractor.kt", l = {31}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class PorttechParseDeeplinkForWebViewInteractor$getPortUrlByDeeplink$2 extends SuspendLambda implements wls {
    final /* synthetic */ Uri $deeplink;
    final /* synthetic */ zzs $geoPoint;
    Object L$0;
    int label;
    final /* synthetic */ bce0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PorttechParseDeeplinkForWebViewInteractor$getPortUrlByDeeplink$2(Uri uri, bce0 bce0Var, zzs zzsVar, Continuation continuation) {
        super(2, continuation);
        this.$deeplink = uri;
        this.this$0 = bce0Var;
        this.$geoPoint = zzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PorttechParseDeeplinkForWebViewInteractor$getPortUrlByDeeplink$2(this.$deeplink, this.this$0, this.$geoPoint, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PorttechParseDeeplinkForWebViewInteractor$getPortUrlByDeeplink$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String queryParameter = this.$deeplink.getQueryParameter("portId");
            bce0 bce0Var = this.this$0;
            if (queryParameter == null) {
                gq41 gq41Var = bce0Var.b;
                String uri = this.$deeplink.toString();
                gq41Var.getClass();
                gq41Var.a("OpenExternalWebViewUrl.IdMissingInDeeplink", gw00.e(new Pair(Constants.DEEPLINK, uri)));
                ny61.g("Id missing in deeplink");
                return null;
            }
            gq41 gq41Var2 = bce0Var.b;
            gq41Var2.getClass();
            gq41Var2.a("OpenExternalWebViewUrl.Started", gw00.e(new Pair("url_id", queryParameter)));
            tpr a = this.this$0.c.a.a();
            PorttechParseDeeplinkForWebViewInteractor$getPortUrlByDeeplink$2$webViewUrlExperiment$1 porttechParseDeeplinkForWebViewInteractor$getPortUrlByDeeplink$2$webViewUrlExperiment$1 = new PorttechParseDeeplinkForWebViewInteractor$getPortUrlByDeeplink$2$webViewUrlExperiment$1(2, null);
            this.L$0 = queryParameter;
            this.label = 1;
            Object x = e.x(a, porttechParseDeeplinkForWebViewInteractor$getPortUrlByDeeplink$2$webViewUrlExperiment$1, this);
            if (x == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = queryParameter;
            obj = x;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) this.L$0;
            kotlin.b.b(obj);
        }
        WebViewFromDeeplinkExperiment.a a2 = ((WebViewFromDeeplinkExperiment) obj).a(str);
        bce0 bce0Var2 = this.this$0;
        Uri uri2 = this.$deeplink;
        zzs zzsVar = this.$geoPoint;
        bce0Var2.getClass();
        WebViewFromDeeplinkExperiment.Companion.getClass();
        boolean l = jl40.l(a2, WebViewFromDeeplinkExperiment.e);
        gq41 gq41Var3 = bce0Var2.b;
        if (l) {
            gq41Var3.getClass();
            gq41Var3.a("OpenExternalWebViewUrl.IdNotFound", gw00.e(new Pair("url_id", str)));
            throw new IdNotFoundInExperimentException(str);
        }
        gq41Var3.getClass();
        gq41Var3.a("OpenExternalWebViewUrl.IdFounded", gw00.e(new Pair("url_id", str)));
        String str2 = a2.b;
        if (str2.length() == 0) {
            ny61.g("Url is empty");
            return null;
        }
        for (String str3 : uri2.getQueryParameterNames()) {
            String queryParameter2 = uri2.getQueryParameter(str3);
            if (queryParameter2 != null) {
                str2 = cvu0.v(str2, oyr.p("{", str3, "}"), queryParameter2, false);
            }
        }
        Uri.Builder buildUpon = Uri.parse(str2).buildUpon();
        buildUpon.appendQueryParameter("lat", String.valueOf(zzsVar.a));
        buildUpon.appendQueryParameter("lon", String.valueOf(zzsVar.b));
        return WebViewFromDeeplinkExperiment.a.a(a2, buildUpon.build().toString());
    }
}
