package com.yandex.plus.home.feature.webviews.internal.webview;

import com.yandex.plus.log.api.LogPriority;
import defpackage.dje;
import defpackage.pgz;
import defpackage.ss80;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class BaseCommonWebViewContract$registerMessageHandlers$21 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ss80 ss80Var = (ss80) obj;
        a aVar = (a) this.receiver;
        pgz pgzVar = aVar.u;
        String x = aVar.x();
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, x, "handleDisableSwipeClose() outMessage=" + ss80Var);
        }
        com.yandex.plus.home.feature.webviews.internal.container.a aVar2 = (com.yandex.plus.home.feature.webviews.internal.container.a) aVar.g;
        pgz pgzVar2 = aVar2.w;
        if (pgzVar2.e(logPriority)) {
            pgzVar2.a(logPriority, "WebViewsControllerImpl", "disableSwipeClose()");
        }
        dje l = aVar2.l();
        if (l != null) {
            l.disableSwipeClose();
        }
        return zy11.a;
    }
}
