package com.yandex.go.support.web;

import defpackage.di7;
import defpackage.scc;
import defpackage.wls;
import defpackage.xnt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class CommonSupportCallJsInterfaceFactory$applyPlugins$4 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) this.receiver;
        bVar.getClass();
        List g = scc.g("requestHideWebView", "updateUnreadCount", "sendAnalyticsEvent");
        return new di7(((xnt) bVar.b).e(new CommonSupportCallJsInterfaceFactory$ConfigResult(g), CommonSupportCallJsInterfaceFactory$ConfigResult.Companion.serializer()), null);
    }
}
