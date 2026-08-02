package com.yandex.plus.home.feature.webviews.internal.home.contract;

import com.yandex.plus.home.feature.webviews.internal.container.b;
import com.yandex.plus.home.feature.webviews.internal.d;
import com.yandex.plus.home.feature.webviews.internalapi.WebViewType;
import com.yandex.plus.webview.api.contract.message.WebViewMessagesHandler;
import defpackage.cjw0;
import defpackage.dc20;
import defpackage.eu80;
import defpackage.ijd0;
import defpackage.imd0;
import defpackage.jse;
import defpackage.nv80;
import defpackage.nw70;
import defpackage.ow80;
import defpackage.p4z;
import defpackage.pgz;
import defpackage.pu80;
import defpackage.sls;
import defpackage.st80;
import defpackage.su80;
import defpackage.uio;
import defpackage.v920;
import defpackage.vio;
import defpackage.wio;
import defpackage.y4d0;
import defpackage.y821;
import defpackage.ys80;
import defpackage.yt80;
import defpackage.yu80;
import defpackage.zqc;

/* loaded from: classes2.dex */
public final class a extends com.yandex.plus.home.feature.webviews.internal.webview.a {
    public final vio A;
    public final pgz B;
    public final String C;
    public final y4d0 y;
    public final b z;

    public a(y4d0 y4d0Var, b bVar, v920 v920Var, zqc zqcVar, cjw0 cjw0Var, WebViewMessagesHandler webViewMessagesHandler, com.yandex.plus.webview.api.contract.message.a aVar, dc20 dc20Var, p4z p4zVar, com.yandex.plus.home.feature.webviews.internal.settings.domain.b bVar2, imd0 imd0Var, wio wioVar, vio vioVar, uio uioVar, y821 y821Var, sls slsVar, ijd0 ijd0Var, d dVar, WebViewType webViewType, pgz pgzVar, jse jseVar, jse jseVar2) {
        super(webViewMessagesHandler, aVar, cjw0Var, new nw70(4, v920Var), bVar, dc20Var, p4zVar, bVar2, imd0Var, wioVar, vioVar, uioVar, y821Var, zqcVar, slsVar, ijd0Var, dVar, webViewType, pgzVar, jseVar, jseVar2);
        this.y = y4d0Var;
        this.z = bVar;
        this.A = vioVar;
        this.B = pgzVar;
        this.C = "HomeWebViewContract";
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.a
    public final void w(WebViewMessagesHandler webViewMessagesHandler) {
        webViewMessagesHandler.b(yu80.class, new HomeWebViewContract$addAdditionalMessageHandlers$1(1, this, a.class, "handleReadyForMessaging", "handleReadyForMessaging(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$ReadyForMessaging;)V", 0));
        webViewMessagesHandler.b(ow80.class, new HomeWebViewContract$addAdditionalMessageHandlers$2(1, this, a.class, "handleUserTappedSubscription", "handleUserTappedSubscription(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$UserTappedSubscription;)V", 0));
        webViewMessagesHandler.b(nv80.class, new HomeWebViewContract$addAdditionalMessageHandlers$3(1, this, a.class, "handleShowPurchaseButton", "handleShowPurchaseButton(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$ShowPurchaseButton;)V", 0));
        webViewMessagesHandler.b(ys80.class, new HomeWebViewContract$addAdditionalMessageHandlers$4(1, this, a.class, "handleGetProductsRequest", "handleGetProductsRequest(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$GetProductsRequest;)V", 0));
        webViewMessagesHandler.b(su80.class, new HomeWebViewContract$addAdditionalMessageHandlers$5(1, this, a.class, "handlePurchaseProductRequest", "handlePurchaseProductRequest(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$PurchaseProductRequest;)V", 0));
        webViewMessagesHandler.b(pu80.class, new HomeWebViewContract$addAdditionalMessageHandlers$6(1, this, a.class, "handlePurchaseButtonShown", "handlePurchaseButtonShown(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$PurchaseButtonShown;)V", 0));
        webViewMessagesHandler.b(st80.class, new HomeWebViewContract$addAdditionalMessageHandlers$7(1, this, a.class, "handleOpenNativeSharing", "handleOpenNativeSharing(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$OpenNativeSharing;)V", 0));
        webViewMessagesHandler.b(yt80.class, new HomeWebViewContract$addAdditionalMessageHandlers$8(1, this, a.class, "handleOpenStoriesMessage", "handleOpenStoriesMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$OpenStories;)V", 0));
        webViewMessagesHandler.b(eu80.class, new HomeWebViewContract$addAdditionalMessageHandlers$9(1, this, a.class, "handleOpenStoriesListMessage", "handleOpenStoriesListMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$OpenStoriesList;)V", 0));
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.a
    public final String x() {
        return this.C;
    }
}
