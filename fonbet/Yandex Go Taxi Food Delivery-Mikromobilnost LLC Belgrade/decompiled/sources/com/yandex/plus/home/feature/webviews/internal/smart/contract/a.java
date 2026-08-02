package com.yandex.plus.home.feature.webviews.internal.smart.contract;

import com.yandex.plus.home.feature.webviews.internal.container.b;
import com.yandex.plus.home.feature.webviews.internal.d;
import com.yandex.plus.home.feature.webviews.internalapi.WebViewType;
import com.yandex.plus.webview.api.contract.message.WebViewMessagesHandler;
import defpackage.cjw0;
import defpackage.dc20;
import defpackage.eu80;
import defpackage.imd0;
import defpackage.jse;
import defpackage.nw70;
import defpackage.p4z;
import defpackage.pgz;
import defpackage.sls;
import defpackage.st80;
import defpackage.v920;
import defpackage.vio;
import defpackage.wio;
import defpackage.y821;
import defpackage.yt80;
import defpackage.yu80;
import defpackage.zqc;

/* loaded from: classes2.dex */
public final class a extends com.yandex.plus.home.feature.webviews.internal.webview.a {
    public final vio A;
    public final String B;
    public final b y;
    public final pgz z;

    public a(WebViewMessagesHandler webViewMessagesHandler, com.yandex.plus.webview.api.contract.message.a aVar, b bVar, v920 v920Var, pgz pgzVar, cjw0 cjw0Var, dc20 dc20Var, p4z p4zVar, com.yandex.plus.home.feature.webviews.internal.settings.domain.b bVar2, imd0 imd0Var, wio wioVar, vio vioVar, y821 y821Var, zqc zqcVar, sls slsVar, d dVar, WebViewType webViewType, jse jseVar, jse jseVar2) {
        super(webViewMessagesHandler, aVar, cjw0Var, new nw70(4, v920Var), bVar, dc20Var, p4zVar, bVar2, imd0Var, wioVar, vioVar, null, y821Var, zqcVar, slsVar, null, dVar, webViewType, pgzVar, jseVar, jseVar2);
        this.y = bVar;
        this.z = pgzVar;
        this.A = vioVar;
        this.B = "SmartWebViewContract";
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.a
    public final void w(WebViewMessagesHandler webViewMessagesHandler) {
        webViewMessagesHandler.b(yu80.class, new SmartWebViewContract$addAdditionalMessageHandlers$1(1, this, a.class, "handleReadyForMessaging", "handleReadyForMessaging(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$ReadyForMessaging;)V", 0));
        webViewMessagesHandler.b(st80.class, new SmartWebViewContract$addAdditionalMessageHandlers$2(1, this, a.class, "handleOpenNativeSharing", "handleOpenNativeSharing(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$OpenNativeSharing;)V", 0));
        webViewMessagesHandler.b(yt80.class, new SmartWebViewContract$addAdditionalMessageHandlers$3(1, this, a.class, "handleOpenStoriesMessage", "handleOpenStoriesMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$OpenStories;)V", 0));
        webViewMessagesHandler.b(eu80.class, new SmartWebViewContract$addAdditionalMessageHandlers$4(1, this, a.class, "handleOpenStoriesListMessage", "handleOpenStoriesListMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$OpenStoriesList;)V", 0));
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.a
    public final String x() {
        return this.B;
    }
}
