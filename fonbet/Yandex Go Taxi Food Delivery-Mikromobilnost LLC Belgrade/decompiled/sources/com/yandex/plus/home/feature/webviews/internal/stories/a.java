package com.yandex.plus.home.feature.webviews.internal.stories;

import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPaymentStat$Source;
import defpackage.cfd0;
import defpackage.dfd0;
import defpackage.h0w;
import defpackage.nsu;
import defpackage.rzf0;
import defpackage.sls;
import defpackage.tse;
import defpackage.xk41;
import defpackage.z17;
import defpackage.z250;
import defpackage.zk41;
import defpackage.zy11;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ a(e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        int i2 = 3;
        e eVar = this.b;
        switch (i) {
            case 0:
                return new com.yandex.plus.home.feature.webviews.internal.bridge.b(eVar.G, new WebStoriesPresenter$updateTargetHandler$2$1(eVar, null));
            case 1:
                e eVar2 = this.b;
                z17 z17Var = eVar2.I;
                PlusPaymentStat$Source plusPaymentStat$Source = PlusPaymentStat$Source.STORY;
                WebStoriesPresenter$storiesButtonSectionDelegate$2$1 webStoriesPresenter$storiesButtonSectionDelegate$2$1 = new WebStoriesPresenter$storiesButtonSectionDelegate$2$1(1, eVar2, e.class, "sendContractsMessage", "sendContractsMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage;)V", 0);
                tse e = eVar2.e();
                String str = eVar2.x;
                Map map = eVar2.y;
                if (map == null) {
                    map = kotlin.collections.b.f();
                }
                Map map2 = map;
                zk41 zk41Var = new zk41(eVar2, 1);
                WebStoriesPresenter$storiesButtonSectionDelegate$2$3 webStoriesPresenter$storiesButtonSectionDelegate$2$3 = new WebStoriesPresenter$storiesButtonSectionDelegate$2$3(1, eVar2.b, xk41.class, "showNativePayError", "showNativePayError(Lcom/yandex/plus/home/pay/PayError;)V", 0);
                WebStoriesPresenter$storiesButtonSectionDelegate$2$4 webStoriesPresenter$storiesButtonSectionDelegate$2$4 = new WebStoriesPresenter$storiesButtonSectionDelegate$2$4(1, eVar2.b, xk41.class, "showNativePayButton", "showNativePayButton(Lcom/yandex/plus/home/feature/webviews/internal/purchase/pay/common/NativePayButtonConfig;)V", 0);
                WebStoriesPresenter$storiesButtonSectionDelegate$2$5 webStoriesPresenter$storiesButtonSectionDelegate$2$5 = new WebStoriesPresenter$storiesButtonSectionDelegate$2$5(0, eVar2.b, xk41.class, "showHostBuyView", "showHostBuyView()V", 0);
                new cfd0();
                dfd0 dfd0Var = new dfd0(str, "purchase_button", "story");
                rzf0 rzf0Var = new rzf0(z17Var.c, dfd0Var, plusPaymentStat$Source, z17Var.e, z17Var.i, z17Var.h, webStoriesPresenter$storiesButtonSectionDelegate$2$1, z17Var.f, z17Var.g);
                return new com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.f(z17Var.m, rzf0Var, new z250(z17Var.k, rzf0Var), new h0w(i2, z17Var.p, z17Var.o), new com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.a(e, rzf0Var, new com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.payment.a(z17Var.c, dfd0Var, map2, rzf0Var, z17Var.a, z17Var.m, zk41Var, webStoriesPresenter$storiesButtonSectionDelegate$2$3, z17Var.d, z17Var.n), z17Var.k, z17Var.j, webStoriesPresenter$storiesButtonSectionDelegate$2$4, null), new com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.host.a(e, rzf0Var, webStoriesPresenter$storiesButtonSectionDelegate$2$5), z17Var.b);
            case 2:
                e eVar3 = this.b;
                return new nsu(eVar3.g.c, eVar3.B, new WebStoriesPresenter$hostPayProvider$2$1(1, eVar3, e.class, "sendContractsMessage", "sendContractsMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage;)V", 0), new WebStoriesPresenter$hostPayProvider$2$2(0, eVar3.V, com.yandex.plus.home.feature.webviews.internal.a.class, "reload", "reload()V", 0), new a(eVar3, i2), eVar3.x, new WebStoriesPresenter$hostPayProvider$2$4(0, eVar3.k(), com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.f.class, "onPayButtonClicked", "onPayButtonClicked()V", 0), eVar3.w, PlusPaymentStat$Source.STORY, eVar3.z, false);
            default:
                eVar.D.invoke();
                return zy11.a;
        }
    }
}
