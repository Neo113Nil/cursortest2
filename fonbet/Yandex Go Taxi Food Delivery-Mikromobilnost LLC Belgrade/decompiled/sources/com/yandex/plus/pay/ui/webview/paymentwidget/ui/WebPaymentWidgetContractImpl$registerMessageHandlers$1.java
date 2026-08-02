package com.yandex.plus.pay.ui.webview.paymentwidget.ui;

import com.yandex.plus.log.api.LogPriority;
import defpackage.pgz;
import defpackage.ri41;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class WebPaymentWidgetContractImpl$registerMessageHandlers$1 extends FunctionReferenceImpl implements tls {
    public final void i(ri41 ri41Var) {
        a aVar = (a) this.receiver;
        pgz pgzVar = aVar.i;
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "WebPaymentWidgetContractImpl", "Handle started message: " + ri41Var);
        }
        kotlinx.coroutines.a.h(aVar.p);
        com.yandex.plus.home.common.utils.a.g(aVar.q, aVar.h, new WebPaymentWidgetContractImpl$handleStartedMessage$2(aVar, null));
    }

    @Override // defpackage.tls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((ri41) obj);
        return zy11.a;
    }
}
