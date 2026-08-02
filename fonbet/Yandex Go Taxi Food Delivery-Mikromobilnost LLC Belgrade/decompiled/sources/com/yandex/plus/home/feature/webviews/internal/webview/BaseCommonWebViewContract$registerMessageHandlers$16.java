package com.yandex.plus.home.feature.webviews.internal.webview;

import com.yandex.plus.log.api.LogPriority;
import defpackage.bv80;
import defpackage.pgz;
import defpackage.tje;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class BaseCommonWebViewContract$registerMessageHandlers$16 extends FunctionReferenceImpl implements tls {
    public final void i(bv80 bv80Var) {
        a aVar = (a) this.receiver;
        pgz pgzVar = aVar.u;
        String x = aVar.x();
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, x, "handleSendBroadcastEvent() outMessage=" + bv80Var);
        }
        tje.N(aVar.d, null, null, new BaseCommonWebViewContract$handleSendBroadcastEvent$2(aVar, bv80Var, null), 3);
    }

    @Override // defpackage.tls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((bv80) obj);
        return zy11.a;
    }
}
