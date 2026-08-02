package com.yandex.go.platform.di;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.o;
import com.yandex.go.platform.web_view_client.GoWebChromeClient;
import defpackage.b60;
import defpackage.bkf0;
import defpackage.blv;
import defpackage.c1h;
import defpackage.ccp0;
import defpackage.d5c;
import defpackage.fk;
import defpackage.frw;
import defpackage.h7o;
import defpackage.i32;
import defpackage.i3y;
import defpackage.ike;
import defpackage.ivc0;
import defpackage.kb;
import defpackage.l50;
import defpackage.lb20;
import defpackage.m2v;
import defpackage.n300;
import defpackage.nxn;
import defpackage.ny61;
import defpackage.ryh;
import defpackage.s421;
import defpackage.scc;
import defpackage.sls;
import defpackage.sma0;
import defpackage.ss2;
import defpackage.t3g;
import defpackage.uio0;
import defpackage.ujf0;
import defpackage.vfc0;
import defpackage.w040;
import defpackage.zch;
import defpackage.zh41;
import java.util.List;

/* loaded from: classes13.dex */
public final class d {
    public final Context a;
    public final ViewGroup b;
    public final ujf0 c;
    public final h7o d;
    public final InternalActivityComponent e;
    public final List f;
    public final zh41 g;
    public final zh41 h;
    public final b i;
    public final ss2 j;
    public final uio0 k;
    public final com.yandex.go.platform.web_view_client.a l;
    public final WebView m;
    public final i3y n;
    public final com.yandex.go.platform.utils.a o;
    public final i3y p;
    public final i3y q;
    public final i3y r;
    public final com.yandex.go.platform.deeplink.a s;

    public d(Context context, ViewGroup viewGroup, ViewGroup viewGroup2, ujf0 ujf0Var, h7o h7oVar, InternalActivityComponent internalActivityComponent, List list) {
        this.a = context;
        this.b = viewGroup;
        this.c = ujf0Var;
        this.d = h7oVar;
        this.e = internalActivityComponent;
        this.f = list;
        i3y a = kotlin.a.a(PlatformViewComponent$goLoadingHandler$2.w);
        zh41 zh41Var = (zh41) a.getValue();
        this.g = zh41Var;
        zh41 zh41Var2 = (zh41) a.getValue();
        this.h = zh41Var2;
        b bVar = com.yandex.go.platform.sdk.a.a;
        if (bVar == null) {
            ny61.g("GoPlatform.init must be invoked before using Go Platform");
            throw null;
        }
        this.i = bVar;
        ss2 ss2Var = bVar.k;
        this.j = ss2Var;
        uio0 uio0Var = new uio0(viewGroup2, ss2Var, new s421(ss2Var, scc.g(new n300(context, 1), new n300(context, 0), new n300(context, 2)), zh41Var, bVar.p, 9), new GoWebChromeClient(ss2Var, internalActivityComponent.getLifecycleScope(), new com.yandex.go.platform.web_view_client.upload_image.b(context, internalActivityComponent.getActivityStarter(), internalActivityComponent.getActivityResultDispatcher()), new c(this), new vfc0(1, this)), context, bVar.d, new m2v(internalActivityComponent.getLifecycleScope(), internalActivityComponent.getAccountDelegate(), ss2Var, internalActivityComponent.getMetricaDelegate()), new ryh(24, internalActivityComponent.getAccountDelegate()), bVar.o, new sls() { // from class: com.yandex.go.platform.di.PlatformViewComponent$webViewConfigurator$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return d.this.s;
            }
        }, zh41Var2, bVar.f);
        this.k = uio0Var;
        this.l = (com.yandex.go.platform.web_view_client.a) uio0Var.e;
        this.m = (WebView) uio0Var.f;
        this.n = kotlin.a.a(new sls() { // from class: com.yandex.go.platform.di.PlatformViewComponent$progressViewPageLoadingListener$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                d dVar = d.this;
                return new bkf0(new w040(dVar.a, dVar.m, dVar.c, dVar.b, dVar.l, dVar.j, dVar.d, dVar.e.getCloseListener()));
            }
        });
        this.o = new com.yandex.go.platform.utils.a(context, context.getPackageName(), internalActivityComponent.getActivityStarter(), internalActivityComponent.getActivityResultDispatcher(), internalActivityComponent.getPermissionRequestListener(), internalActivityComponent.getPermissionResultDispatcher());
        this.p = kotlin.a.a(new sls() { // from class: com.yandex.go.platform.di.PlatformViewComponent$screenCaptureProtector$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return new ccp0(d.this.e.getActivity());
            }
        });
        this.q = kotlin.a.a(new sls() { // from class: com.yandex.go.platform.di.PlatformViewComponent$jsNativeComponent$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                kb kbVar = new kb(d.this.a, 7);
                ComponentActivity activity = d.this.e.getActivity();
                d dVar = d.this;
                Context context2 = dVar.a;
                WebView webView = dVar.m;
                b60 activityStarter = dVar.e.getActivityStarter();
                l50 activityResultDispatcher = d.this.e.getActivityResultDispatcher();
                o lifecycleScope = d.this.e.getLifecycleScope();
                fk accountDelegate = d.this.e.getAccountDelegate();
                d dVar2 = d.this;
                ss2 ss2Var2 = dVar2.j;
                sma0 paymentsDelegate = dVar2.e.getPaymentsDelegate();
                d dVar3 = d.this;
                b bVar2 = dVar3.i;
                com.yandex.taxi.go_platform.delegates.c cVar = bVar2.g;
                zch zchVar = bVar2.e;
                blv inAppReviewDelegate = dVar3.e.getInAppReviewDelegate();
                d dVar4 = d.this;
                PlatformViewComponent$jsNativeComponent$2$jsApiDependencies$1 platformViewComponent$jsNativeComponent$2$jsApiDependencies$1 = new PlatformViewComponent$jsNativeComponent$2$jsApiDependencies$1(0, dVar4, d.class, "viewStackProvider", "viewStackProvider()Lcom/yandex/go/platform/web_view_client/WebViewStack;", 0);
                b bVar3 = dVar4.i;
                lb20 lb20Var = bVar3.f;
                com.yandex.go.platform.sdk.models.a aVar = bVar3.h;
                i32 i32Var = bVar3.p;
                ivc0 ivc0Var = bVar3.i;
                d5c closeListener = dVar4.e.getCloseListener();
                d.this.e.getLottieSplashInteractor();
                d dVar5 = d.this;
                zh41 zh41Var3 = dVar5.g;
                ccp0 ccp0Var = (ccp0) dVar5.p.getValue();
                d dVar6 = d.this;
                return new a(d.this.o, new t3g(activity, context2, webView, activityStarter, activityResultDispatcher, lifecycleScope, lb20Var, i32Var, kbVar, accountDelegate, ss2Var2, zchVar, paymentsDelegate, cVar, inAppReviewDelegate, aVar, platformViewComponent$jsNativeComponent$2$jsApiDependencies$1, ivc0Var, closeListener, zh41Var3, ccp0Var, dVar6.f, (String) dVar6.i.c.w, dVar6.e.getNavigator()));
            }
        });
        this.r = kotlin.a.a(new sls() { // from class: com.yandex.go.platform.di.PlatformViewComponent$authListener$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                ivc0 ivc0Var = d.this.i.i;
                return nxn.a;
            }
        });
        ike ikeVar = bVar.b;
        o lifecycleScope = internalActivityComponent.getLifecycleScope();
        c1h c1hVar = (c1h) bVar.l.getValue();
        PlatformViewComponent$deeplinkHandler$1 platformViewComponent$deeplinkHandler$1 = new PlatformViewComponent$deeplinkHandler$1(0, this, d.class, "deeplinkValidatorProvider", "deeplinkValidatorProvider()Lcom/yandex/go/platform/deeplink/DeeplinkValidator;", 0);
        frw frwVar = (frw) bVar.m.getValue();
        PlatformViewComponent$deeplinkHandler$2 platformViewComponent$deeplinkHandler$2 = new PlatformViewComponent$deeplinkHandler$2(0, this, d.class, "jsLifecycleProvider", "jsLifecycleProvider()Lcom/yandex/go/platform/js_api/JsAppLifecycle;", 0);
        PlatformViewComponent$deeplinkHandler$3 platformViewComponent$deeplinkHandler$3 = new PlatformViewComponent$deeplinkHandler$3(0, this, d.class, "jsWebApiProvider", "jsWebApiProvider()Lcom/yandex/go/platform/web_api/JsWebApi;", 0);
        internalActivityComponent.getMessengerPushHandler();
        this.s = new com.yandex.go.platform.deeplink.a(ikeVar, lifecycleScope, c1hVar, platformViewComponent$deeplinkHandler$1, frwVar, platformViewComponent$deeplinkHandler$2, platformViewComponent$deeplinkHandler$3);
    }
}
