package com.yandex.fintechsdk.features.webview.payment.internal.presentation;

import android.content.Context;
import android.net.Uri;
import com.yandex.fintechsdk.core.network.api.model.Header;
import com.yandex.pay.payment.PaymentData;
import defpackage.b23;
import defpackage.bs41;
import defpackage.bxv;
import defpackage.emg0;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.gbr;
import defpackage.hm60;
import defpackage.kju0;
import defpackage.li3;
import defpackage.m6v;
import defpackage.mua1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p370;
import defpackage.rzq0;
import defpackage.v7w;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv7w;", "Lis41;", "Les41;", "Lzy11;", "<anonymous>", "(Lv7w;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.features.webview.payment.internal.presentation.WebViewPaymentViewModel$onCreateView$1", f = "WebViewPaymentViewModel.kt", l = {HProv.ALG_SID_SHA3_384, HProv.PP_RESERVED1}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class WebViewPaymentViewModel$onCreateView$1 extends SuspendLambda implements wls {
    final /* synthetic */ Context $context;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewPaymentViewModel$onCreateView$1(b bVar, Context context, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WebViewPaymentViewModel$onCreateView$1 webViewPaymentViewModel$onCreateView$1 = new WebViewPaymentViewModel$onCreateView$1(this.this$0, this.$context, continuation);
        webViewPaymentViewModel$onCreateView$1.L$0 = obj;
        return webViewPaymentViewModel$onCreateView$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebViewPaymentViewModel$onCreateView$1) create((v7w) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0040, code lost:
    
        if (r14 == r0) goto L45;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v7w v7wVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            v7wVar = (v7w) this.L$0;
            ((com.yandex.fintechsdk.core.analytics.impl.internal.a) this.this$0.c).a(bxv.c);
            com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.webviewpayment.data.a aVar = this.this$0.I;
            this.L$0 = v7wVar;
            this.label = 1;
            obj = aVar.a(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v7wVar = (v7w) this.L$0;
            kotlin.b.b(obj);
        }
        String str = (String) obj;
        if (str == null || evu0.J(str)) {
            ((com.yandex.fintechsdk.core.analytics.impl.internal.a) this.this$0.c).b(hm60.c);
            mua1.f(this.this$0.G.b, "error", new gbr(403, Integer.valueOf(emg0.finsdk_fade_in), Integer.valueOf(emg0.finsdk_fade_out), "webview-payment"), 2);
            return zy11Var;
        }
        b bVar = this.this$0;
        com.yandex.fintechsdk.core.architecture.api.mvi.b.a(bVar, new WebViewPaymentViewModel$observeFacadeStates$1(bVar, bVar.J, null));
        p370 p370Var = this.this$0.A;
        p370Var.getClass();
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("clientId", "com.yandex.fintechsdk.redirect.client.id");
        buildUpon.appendQueryParameter("msid", ((rzq0) p370Var.c).a);
        buildUpon.appendQueryParameter("mobileHost", (String) p370Var.w);
        com.yandex.pay.payment.Metadata metadata = ((PaymentData) p370Var.b).getMetadata();
        if (metadata != null) {
            buildUpon.appendQueryParameter(kju0.j, metadata.getValue());
        }
        String uri = buildUpon.build().toString();
        String X = b.X(this.this$0, this.$context, uri);
        String str2 = X == null ? uri : X;
        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) this.this$0.c).a(new li3(18, "starting_webview_form", g8e.z("url", str2)));
        m6v m6vVar = (m6v) this.this$0.F.b;
        String str3 = m6vVar.a.a;
        String str4 = m6vVar.b.b;
        MapBuilder mapBuilder = new MapBuilder();
        if (str4 != null) {
        }
        if (str3 != null) {
            mapBuilder.put(Header.PayGaid.getKey(), str3);
        }
        MapBuilder j = mapBuilder.j();
        b23 b23Var = (b23) ((com.yandex.fintechsdk.data.config.impl.internal.a) this.this$0.H.b).b.a.get();
        boolean z = b23Var != null && b23Var.a;
        b23 b23Var2 = (b23) ((com.yandex.fintechsdk.data.config.impl.internal.a) this.this$0.H.b).b.a.get();
        bs41 bs41Var = new bs41(j, z, b23Var2 != null && b23Var2.b, str2, this.this$0.J);
        this.L$0 = null;
        this.label = 2;
        return com.yandex.fintechsdk.core.architecture.api.mvi.b.d(v7wVar, bs41Var, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
