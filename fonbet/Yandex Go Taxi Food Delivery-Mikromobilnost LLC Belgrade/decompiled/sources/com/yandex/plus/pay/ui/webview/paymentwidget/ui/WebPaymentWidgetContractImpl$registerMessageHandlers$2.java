package com.yandex.plus.pay.ui.webview.paymentwidget.ui;

import com.yandex.plus.log.api.LogPriority;
import defpackage.oi41;
import defpackage.pgz;
import defpackage.pz40;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class WebPaymentWidgetContractImpl$registerMessageHandlers$2 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        oi41 oi41Var = (oi41) obj;
        a aVar = (a) this.receiver;
        pgz pgzVar = aVar.i;
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "WebPaymentWidgetContractImpl", "Handle loaded message: " + oi41Var);
        }
        kotlinx.coroutines.a.h(aVar.p);
        pz40 b = aVar.e.b();
        Boolean bool = Boolean.TRUE;
        r0 r0Var = (r0) b;
        r0Var.getClass();
        r0Var.m(null, bool);
        return zy11.a;
    }
}
