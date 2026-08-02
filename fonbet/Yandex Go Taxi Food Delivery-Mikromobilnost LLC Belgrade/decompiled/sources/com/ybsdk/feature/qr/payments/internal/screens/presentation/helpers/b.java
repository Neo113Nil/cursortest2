package com.ybsdk.feature.qr.payments.internal.screens.presentation.helpers;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrSubscriptionLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrSubscriptionLoadedVersion;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.qr.payments.api.data.BoostStrategy;
import com.ybsdk.feature.qr.payments.api.data.ProductType;
import com.ybsdk.feature.qr.payments.internal.screens.subscription.data.entities.SubscriptionStatus;
import defpackage.aye0;
import defpackage.b8g0;
import defpackage.c6g0;
import defpackage.dag0;
import defpackage.dzh0;
import defpackage.e9g0;
import defpackage.eag0;
import defpackage.gao;
import defpackage.gci0;
import defpackage.k5c;
import defpackage.lbg0;
import defpackage.lrp0;
import defpackage.m9g0;
import defpackage.n0t0;
import defpackage.pzt0;
import defpackage.r8g0;
import defpackage.rt1;
import defpackage.sue0;
import defpackage.t8g0;
import defpackage.tje;
import defpackage.ugd0;
import defpackage.w511;
import defpackage.x4c;
import defpackage.yxf0;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class b {
    public final sue0 a;
    public final aye0 b;
    public final k5c c;
    public final c6g0 d;
    public final gci0 e;
    public final com.ybsdk.feature.qr.payments.internal.screens.presentation.a f;
    public final b8g0 g;
    public final com.ybsdk.feature.qr.payments.internal.domain.v2.b h;
    public final yxf0 i;
    public pzt0 j;
    public pzt0 k;

    public b(lbg0 lbg0Var, sue0 sue0Var, aye0 aye0Var, k5c k5cVar, com.ybsdk.feature.qr.payments.internal.screens.presentation.b bVar, c6g0 c6g0Var, gci0 gci0Var, com.ybsdk.feature.qr.payments.internal.screens.presentation.a aVar, t8g0 t8g0Var, b8g0 b8g0Var) {
        this.a = sue0Var;
        this.b = aye0Var;
        this.c = k5cVar;
        this.d = c6g0Var;
        this.e = gci0Var;
        this.f = aVar;
        this.g = b8g0Var;
        this.h = lbg0Var.a(c6g0Var, bVar);
        this.i = new yxf0((AppAnalyticsReporter) t8g0Var.a.a.get(), c6g0Var.d);
    }

    public final void a(String str, ProductType productType) {
        e9g0 e9g0Var = (e9g0) this.e.a.getValue();
        if (e9g0Var == null) {
            return;
        }
        BoostStrategy boostStrategy = e9g0Var.o;
        String raw = e9g0Var.f.b == ProductType.WALLET ? boostStrategy != null ? boostStrategy.getRaw() : null : null;
        pzt0 pzt0Var = this.j;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.j = tje.N(this.c, null, null, new QrPaymentsResultHelper$getResult$1(this, e9g0Var, str, raw, productType, null), 3);
    }

    public final void b(SubscriptionStatus subscriptionStatus, String str, Throwable th) {
        QrPaymentEvents$QrSubscriptionLoadedResult qrPaymentEvents$QrSubscriptionLoadedResult;
        e9g0 e9g0Var = (e9g0) this.e.a.getValue();
        if (e9g0Var == null) {
            return;
        }
        rt1 rt1Var = ((AppAnalyticsReporter) this.i.a).Y;
        QrPaymentEvents$QrSubscriptionLoadedVersion qrPaymentEvents$QrSubscriptionLoadedVersion = QrPaymentEvents$QrSubscriptionLoadedVersion.CREDLIM;
        int i = r8g0.a[subscriptionStatus.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                qrPaymentEvents$QrSubscriptionLoadedResult = QrPaymentEvents$QrSubscriptionLoadedResult.ERROR;
            } else {
                if (i != 4) {
                    w511.b();
                    return;
                }
                qrPaymentEvents$QrSubscriptionLoadedResult = QrPaymentEvents$QrSubscriptionLoadedResult.OK;
            }
            rt1Var.D(qrPaymentEvents$QrSubscriptionLoadedVersion, qrPaymentEvents$QrSubscriptionLoadedResult, str);
        }
        c(subscriptionStatus, th);
        this.f.b(new ugd0(17, e9g0Var, subscriptionStatus));
    }

    public final void c(SubscriptionStatus subscriptionStatus, Throwable th) {
        n0t0 n0t0Var;
        int i = eag0.a[subscriptionStatus.ordinal()];
        if (i != 1) {
            n0t0Var = null;
            if (i == 2) {
                n0t0Var = gao.e(null, null, th, 3);
            }
        } else {
            n0t0Var = new n0t0(new Text.Resource(dzh0.ybsdk_qr_payment_subscription_enabled));
        }
        if (n0t0Var != null) {
            this.f.a.Z(new m9g0(n0t0Var));
        }
    }

    public final void d(String str, boolean z) {
        if (!z) {
            x4c.g("Try to click on already checked widget", null, null, Collections.singletonList(lrp0.x), 6);
            return;
        }
        e9g0 e9g0Var = (e9g0) this.e.a.getValue();
        if (e9g0Var == null) {
            return;
        }
        this.f.b(new dag0(e9g0Var, 1));
        pzt0 pzt0Var = this.k;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.k = tje.N(this.c, null, null, new QrPaymentsResultHelper$startSubscriptionWidgetStatuses$2(this, e9g0Var, str, null), 3);
    }
}
