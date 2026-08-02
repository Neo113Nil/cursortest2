package com.yandex.plus.home.feature.webviews.internal.webview;

import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPaymentStat$ButtonType;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPaymentStat$PurchaseType;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPaymentStat$Source;
import com.yandex.plus.log.api.LogPriority;
import defpackage.dab1;
import defpackage.hjd0;
import defpackage.ijd0;
import defpackage.iw80;
import defpackage.pgz;
import defpackage.tje;
import defpackage.tls;
import defpackage.uio;
import defpackage.uy4;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class BaseCommonWebViewContract$registerMessageHandlers$3 extends FunctionReferenceImpl implements tls {
    public final void i(iw80 iw80Var) {
        a aVar = (a) this.receiver;
        uio uioVar = aVar.n;
        pgz pgzVar = aVar.u;
        String x = aVar.x();
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, x, "handleUserBoughtSubscription() outMessage=" + iw80Var);
        }
        hjd0 hjd0Var = aVar.r;
        if (hjd0Var != null) {
            ((ijd0) hjd0Var).a(dab1.N);
        }
        tje.N(aVar.d, null, null, new BaseCommonWebViewContract$handleUserBoughtSubscription$2(aVar, null), 3);
        int i = uy4.a[aVar.t.ordinal()];
        EmptyList emptyList = EmptyList.a;
        if (i == 1) {
            if (uioVar != null) {
                uioVar.d(PlusPaymentStat$Source.HOME, PlusPaymentStat$PurchaseType.WEB, PlusPaymentStat$ButtonType.WEB, iw80Var.b, emptyList);
            }
        } else if (i == 2 && uioVar != null) {
            uioVar.d(PlusPaymentStat$Source.STORY, PlusPaymentStat$PurchaseType.WEB, PlusPaymentStat$ButtonType.WEB, iw80Var.b, emptyList);
        }
    }

    @Override // defpackage.tls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((iw80) obj);
        return zy11.a;
    }
}
