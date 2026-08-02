package com.yandex.plus.home.feature.webviews.internal.webview;

import com.yandex.plus.log.api.LogPriority;
import defpackage.pgz;
import defpackage.tls;
import defpackage.wv80;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class BaseCommonWebViewContract$registerMessageHandlers$7 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        wv80 wv80Var = (wv80) obj;
        a aVar = (a) this.receiver;
        pgz pgzVar = aVar.u;
        String x = aVar.x();
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, x, "handleSuccessScreenShown() outMessage=" + wv80Var);
        }
        aVar.p.a(wv80Var.b);
        return zy11.a;
    }
}
