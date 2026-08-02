package com.yandex.plus.home.feature.webviews.internal.stories.contract;

import com.yandex.plus.home.feature.webviews.internal.container.b;
import com.yandex.plus.home.feature.webviews.internal.d;
import com.yandex.plus.home.feature.webviews.internalapi.WebViewType;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.OutMessage$OpenUrl$UrlType;
import com.yandex.plus.webview.api.contract.message.WebViewMessagesHandler;
import defpackage.dc20;
import defpackage.el41;
import defpackage.et80;
import defpackage.hv80;
import defpackage.ijd0;
import defpackage.imd0;
import defpackage.jse;
import defpackage.ju80;
import defpackage.kv80;
import defpackage.ls80;
import defpackage.nv80;
import defpackage.nw70;
import defpackage.ow80;
import defpackage.p4z;
import defpackage.pgz;
import defpackage.pu80;
import defpackage.sls;
import defpackage.su80;
import defpackage.uio;
import defpackage.v920;
import defpackage.vio;
import defpackage.wio;
import defpackage.y821;
import defpackage.ys80;
import defpackage.yu80;
import defpackage.zqc;

/* loaded from: classes2.dex */
public final class a extends com.yandex.plus.home.feature.webviews.internal.webview.a {
    public final pgz A;
    public final String B;
    public final zqc y;
    public final el41 z;

    public a(zqc zqcVar, el41 el41Var, pgz pgzVar, v920 v920Var, b bVar, WebViewMessagesHandler webViewMessagesHandler, com.yandex.plus.webview.api.contract.message.a aVar, dc20 dc20Var, p4z p4zVar, com.yandex.plus.home.feature.webviews.internal.settings.domain.b bVar2, imd0 imd0Var, wio wioVar, vio vioVar, uio uioVar, y821 y821Var, sls slsVar, ijd0 ijd0Var, d dVar, WebViewType webViewType, jse jseVar, jse jseVar2) {
        super(webViewMessagesHandler, aVar, null, new nw70(4, v920Var), bVar, dc20Var, p4zVar, bVar2, imd0Var, wioVar, vioVar, uioVar, y821Var, zqcVar, slsVar, ijd0Var, dVar, webViewType, pgzVar, jseVar, jseVar2);
        this.y = zqcVar;
        this.z = el41Var;
        this.A = pgzVar;
        this.B = "StoriesWebViewContract";
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.a
    public final void w(WebViewMessagesHandler webViewMessagesHandler) {
        webViewMessagesHandler.b(ls80.class, new StoriesWebViewContract$addAdditionalMessageHandlers$1(1, this, a.class, "handleCloseStories", "handleCloseStories(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$CloseStories;)V", 0));
        webViewMessagesHandler.b(yu80.class, new StoriesWebViewContract$addAdditionalMessageHandlers$2(1, this, a.class, "handleReadyForMessaging", "handleReadyForMessaging(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$ReadyForMessaging;)V", 0));
        webViewMessagesHandler.b(et80.class, new StoriesWebViewContract$addAdditionalMessageHandlers$3(1, this, a.class, "handleMiniStoryIsReadyEvent", "handleMiniStoryIsReadyEvent(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$MiniStoryIsReadyEvent;)V", 0));
        webViewMessagesHandler.b(hv80.class, new StoriesWebViewContract$addAdditionalMessageHandlers$4(1, this, a.class, "handleShowNextStoryEvent", "handleShowNextStoryEvent(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$ShowNextStoryEvent;)V", 0));
        webViewMessagesHandler.b(kv80.class, new StoriesWebViewContract$addAdditionalMessageHandlers$5(1, this, a.class, "handleShowPrevStoryEvent", "handleShowPrevStoryEvent(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$ShowPrevStoryEvent;)V", 0));
        webViewMessagesHandler.b(ow80.class, new StoriesWebViewContract$addAdditionalMessageHandlers$6(1, this, a.class, "handleUserTappedSubscription", "handleUserTappedSubscription(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$UserTappedSubscription;)V", 0));
        webViewMessagesHandler.b(nv80.class, new StoriesWebViewContract$addAdditionalMessageHandlers$7(1, this, a.class, "handleShowPurchaseButton", "handleShowPurchaseButton(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$ShowPurchaseButton;)V", 0));
        webViewMessagesHandler.b(ys80.class, new StoriesWebViewContract$addAdditionalMessageHandlers$8(1, this, a.class, "handleGetProductsRequest", "handleGetProductsRequest(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$GetProductsRequest;)V", 0));
        webViewMessagesHandler.b(su80.class, new StoriesWebViewContract$addAdditionalMessageHandlers$9(1, this, a.class, "handlePurchaseProductRequest", "handlePurchaseProductRequest(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$PurchaseProductRequest;)V", 0));
        webViewMessagesHandler.b(pu80.class, new StoriesWebViewContract$addAdditionalMessageHandlers$10(1, this, a.class, "handlePurchaseButtonShown", "handlePurchaseButtonShown(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$PurchaseButtonShown;)V", 0));
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.a
    public final String x() {
        return this.B;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.a
    public final void y(ju80 ju80Var) {
        super.y(ju80Var);
        if (ju80Var.c == OutMessage$OpenUrl$UrlType.DEEPLINK) {
            this.y.i();
        }
    }
}
