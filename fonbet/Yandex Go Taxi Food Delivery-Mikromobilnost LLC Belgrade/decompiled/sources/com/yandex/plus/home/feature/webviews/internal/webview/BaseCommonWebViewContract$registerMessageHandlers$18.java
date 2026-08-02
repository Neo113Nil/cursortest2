package com.yandex.plus.home.feature.webviews.internal.webview;

import com.yandex.plus.home.feature.webviews.internal.treasury.c;
import com.yandex.plus.log.api.LogPriority;
import defpackage.pgz;
import defpackage.tje;
import defpackage.tls;
import defpackage.zv80;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class BaseCommonWebViewContract$registerMessageHandlers$18 extends FunctionReferenceImpl implements tls {
    public final void i(zv80 zv80Var) {
        a aVar = (a) this.receiver;
        pgz pgzVar = aVar.u;
        String x = aVar.x();
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, x, "handleTreasuryStateRequest() outMessage=" + zv80Var);
        }
        c cVar = (c) aVar.x.getValue();
        if (cVar != null) {
            tje.N(aVar.d, null, null, new BaseCommonWebViewContract$handleTreasuryStateRequest$2$1(cVar, zv80Var, aVar, null), 3);
            return;
        }
        String x2 = aVar.x();
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, x2, "onMessageUnhandled() outMessage=" + zv80Var + ", cause=TREASURY_ABSENT");
        }
        aVar.m.b(zv80Var.toString(), "TREASURY_ABSENT");
    }

    @Override // defpackage.tls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((zv80) obj);
        return zy11.a;
    }
}
