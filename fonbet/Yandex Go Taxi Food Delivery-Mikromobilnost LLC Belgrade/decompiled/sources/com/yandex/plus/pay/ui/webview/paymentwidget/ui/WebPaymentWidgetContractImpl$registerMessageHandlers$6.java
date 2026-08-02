package com.yandex.plus.pay.ui.webview.paymentwidget.ui;

import com.yandex.plus.log.api.LogPriority;
import defpackage.ni41;
import defpackage.pgz;
import defpackage.tls;
import defpackage.unr0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class WebPaymentWidgetContractImpl$registerMessageHandlers$6 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str = ((ni41) obj).a;
        a aVar = (a) this.receiver;
        pgz pgzVar = aVar.i;
        LogPriority logPriority = LogPriority.ERROR;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "WebPaymentWidgetContractImpl", unr0.l('!', "Unexpected error on web side: code=", str));
        }
        aVar.j.l("Unexpected error on web side: code=" + str + '!');
        return zy11.a;
    }
}
