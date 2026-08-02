package com.yandex.plus.pay.ui.webview.paymentwidget.ui;

import com.yandex.plus.log.api.LogPriority;
import defpackage.pgz;
import defpackage.qi41;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class WebPaymentWidgetContractImpl$registerMessageHandlers$8 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        qi41 qi41Var = (qi41) obj;
        a aVar = (a) this.receiver;
        pgz pgzVar = aVar.i;
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "WebPaymentWidgetContractImpl", "Handle open uri message: " + qi41Var);
        }
        aVar.j.g(qi41Var.a, qi41Var.b);
        return zy11.a;
    }
}
