package com.yandex.plus.home.feature.webviews.internal.webview;

import com.yandex.plus.log.api.LogPriority;
import defpackage.cs80;
import defpackage.pgz;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class BaseCommonWebViewContract$registerMessageHandlers$19 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        cs80 cs80Var = (cs80) obj;
        a aVar = (a) this.receiver;
        pgz pgzVar = aVar.u;
        String x = aVar.x();
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, x, "handleCallbackEvent() outMessage=" + cs80Var);
        }
        aVar.p.e(cs80Var.b);
        return zy11.a;
    }
}
