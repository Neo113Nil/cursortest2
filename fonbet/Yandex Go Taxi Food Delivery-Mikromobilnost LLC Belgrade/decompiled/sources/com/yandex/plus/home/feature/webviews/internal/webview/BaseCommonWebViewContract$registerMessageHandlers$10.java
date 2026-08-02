package com.yandex.plus.home.feature.webviews.internal.webview;

import com.yandex.plus.log.api.LogPriority;
import defpackage.dc20;
import defpackage.ev80;
import defpackage.pgz;
import defpackage.rgo;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class BaseCommonWebViewContract$registerMessageHandlers$10 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ev80 ev80Var = (ev80) obj;
        a aVar = (a) this.receiver;
        pgz pgzVar = aVar.u;
        String x = aVar.x();
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, x, "handleMetricsEvent() outMessage=" + ev80Var);
        }
        dc20 dc20Var = aVar.h;
        String str = ev80Var.b;
        String str2 = ev80Var.c;
        rgo rgoVar = (rgo) dc20Var.b.getValue();
        if (rgoVar != null) {
            rgoVar.reportEvent(str, str2);
        }
        return zy11.a;
    }
}
