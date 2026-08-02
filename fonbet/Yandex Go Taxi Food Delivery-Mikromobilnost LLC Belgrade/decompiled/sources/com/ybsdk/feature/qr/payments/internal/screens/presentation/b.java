package com.ybsdk.feature.qr.payments.internal.screens.presentation;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrPaymentAmountEditedVersion;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrPaymentClosedVersion;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrPaymentInitiatedVersion;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrPaymentRedirectVersion;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrPaymentShownVersion;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrSubscriptionStartedVersion;
import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import com.ybsdk.feature.qr.payments.api.QrPaymentsArguments;
import com.ybsdk.feature.qr.payments.api.data.BoostStrategy;
import com.ybsdk.feature.qr.payments.api.data.ProductType;
import com.ybsdk.feature.qr.payments.internal.screens.result.data.entities.ResultStatus;
import defpackage.aye0;
import defpackage.b3z;
import defpackage.b8g0;
import defpackage.b9g0;
import defpackage.c6g;
import defpackage.c6g0;
import defpackage.c8g0;
import defpackage.c9g0;
import defpackage.cd0;
import defpackage.d9g0;
import defpackage.dag0;
import defpackage.ds31;
import defpackage.duz0;
import defpackage.e9g0;
import defpackage.g9g0;
import defpackage.gci0;
import defpackage.gdf0;
import defpackage.h791;
import defpackage.h9g0;
import defpackage.i9g0;
import defpackage.j3h;
import defpackage.j9g0;
import defpackage.jag0;
import defpackage.jl40;
import defpackage.k5c;
import defpackage.l031;
import defpackage.l9g0;
import defpackage.lbg0;
import defpackage.lrp0;
import defpackage.mag0;
import defpackage.mv3;
import defpackage.n031;
import defpackage.n3w;
import defpackage.n4u0;
import defpackage.n9g0;
import defpackage.o031;
import defpackage.o8g0;
import defpackage.p5g;
import defpackage.p7g0;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.q031;
import defpackage.q2u0;
import defpackage.q8g0;
import defpackage.qag0;
import defpackage.qca1;
import defpackage.qtc0;
import defpackage.r031;
import defpackage.rag0;
import defpackage.rt1;
import defpackage.s7g0;
import defpackage.sue0;
import defpackage.t8g0;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.tm60;
import defpackage.tzj0;
import defpackage.u7g0;
import defpackage.uc5;
import defpackage.ugd0;
import defpackage.v031;
import defpackage.v0h;
import defpackage.v7g0;
import defpackage.vzj0;
import defpackage.w511;
import defpackage.wsr0;
import defpackage.x4c;
import defpackage.xlf0;
import defpackage.xsr0;
import defpackage.xv10;
import defpackage.xvz0;
import defpackage.yj1;
import defpackage.yxf0;
import defpackage.z2z;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class b extends uc5 {
    public final QrPaymentsArguments B;
    public final tfl0 C;
    public final j3h D;
    public final mag0 E;
    public final qag0 F;
    public final q8g0 G;
    public final com.ybsdk.feature.qr.payments.internal.domain.v2.b H;
    public final yxf0 I;
    public final com.ybsdk.feature.qr.payments.internal.screens.presentation.helpers.a J;
    public final com.ybsdk.feature.qr.payments.internal.screens.presentation.helpers.b K;

    public b(o8g0 o8g0Var, lbg0 lbg0Var, QrPaymentsArguments qrPaymentsArguments, tfl0 tfl0Var, j3h j3hVar, mag0 mag0Var, qag0 qag0Var, q8g0 q8g0Var, t8g0 t8g0Var, rag0 rag0Var, v7g0 v7g0Var, jag0 jag0Var) {
        super(new xlf0(24), o8g0Var);
        this.B = qrPaymentsArguments;
        this.C = tfl0Var;
        this.D = j3hVar;
        this.E = mag0Var;
        this.F = qag0Var;
        this.G = q8g0Var;
        c6g0 c6g0Var = new c6g0(qrPaymentsArguments.getQrLink(), ((h9g0) X()).b, qrPaymentsArguments.getQrSource(), qrPaymentsArguments.getOrigin());
        this.H = lbg0Var.a(c6g0Var, this);
        this.I = new yxf0((AppAnalyticsReporter) t8g0Var.a.a.get(), qrPaymentsArguments.getOrigin());
        k5c a = ds31.a(this);
        pz40 Y = Y();
        k5c a2 = ds31.a(this);
        xsr0.a.getClass();
        q2u0 q2u0Var = wsr0.b;
        int i = 27;
        gdf0 gdf0Var = new gdf0(i);
        gci0 R = e.R(new cd0(i, Y, gdf0Var), a2, q2u0Var, gdf0Var.invoke(((r0) Y).getValue()));
        sue0 sue0Var = new sue0(10, this);
        yxf0 yxf0Var = v7g0Var.a;
        this.J = new com.ybsdk.feature.qr.payments.internal.screens.presentation.helpers.a((lbg0) ((n3w) yxf0Var.a).a, a, this, c6g0Var, R, sue0Var, (t8g0) ((n3w) yxf0Var.b).a);
        k5c a3 = ds31.a(this);
        pz40 Y2 = Y();
        k5c a4 = ds31.a(this);
        gdf0 gdf0Var2 = new gdf0(28);
        gci0 R2 = e.R(new cd0(i, Y2, gdf0Var2), a4, q2u0Var, gdf0Var2.invoke(((r0) Y2).getValue()));
        a aVar = new a(this);
        xv10 xv10Var = jag0Var.a;
        this.K = new com.ybsdk.feature.qr.payments.internal.screens.presentation.helpers.b((lbg0) ((n3w) xv10Var.a).a, (sue0) ((p5g) xv10Var.b).get(), (aye0) ((c6g) xv10Var.c).get(), a3, this, c6g0Var, R2, aVar, (t8g0) ((n3w) xv10Var.w).a, (b8g0) ((c6g) xv10Var.x).get());
        int i2 = 0;
        i9g0 i9g0Var = new i9g0(this, i2);
        b3z b3zVar = ((c8g0) q8g0Var).a;
        DeeplinkHandleResult$DeeplinkType deeplinkHandleResult$DeeplinkType = DeeplinkHandleResult$DeeplinkType.SCREEN_OPEN;
        b3zVar.a(new mv3(deeplinkHandleResult$DeeplinkType, i9g0Var, 22));
        b3zVar.a(new mv3(deeplinkHandleResult$DeeplinkType, new j9g0(this, i2), 21));
        int i3 = 1;
        b3zVar.a(new mv3(deeplinkHandleResult$DeeplinkType, new j9g0(this, i3), 20));
        b3zVar.a(new mv3(deeplinkHandleResult$DeeplinkType, new j9g0(this, 2), 24));
        b3zVar.a(new mv3(deeplinkHandleResult$DeeplinkType, new i9g0(this, i3), 23));
        c.a(((p7g0) rag0Var).a, ds31.a(this), new qtc0(17, this));
    }

    public final void b0(String str) {
        com.ybsdk.feature.qr.payments.internal.screens.presentation.helpers.a aVar = this.J;
        aVar.getClass();
        Locale locale = tm60.a;
        BigDecimal g = tm60.g(str);
        if (g == null) {
            x4c.g("amount input formatting error", null, str, Collections.singletonList(lrp0.x), 2);
        } else {
            d9g0 d9g0Var = (d9g0) aVar.b.a.getValue();
            if (d9g0Var != null && !g.equals(d9g0Var.g)) {
                aVar.c.o(new ugd0(16, d9g0Var, g));
            }
        }
        rt1 rt1Var = ((AppAnalyticsReporter) this.I.a).Y;
        QrPaymentEvents$QrPaymentAmountEditedVersion qrPaymentEvents$QrPaymentAmountEditedVersion = QrPaymentEvents$QrPaymentAmountEditedVersion.CREDLIM;
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        linkedHashMap.put("version", qrPaymentEvents$QrPaymentAmountEditedVersion.getOriginalValue());
        linkedHashMap.put("new_value", str);
        rt1Var.a.a("qr.payment.amount_edited", linkedHashMap);
    }

    public final void c0() {
        if (qca1.b((h9g0) X()) != null) {
            com.ybsdk.feature.qr.payments.internal.screens.presentation.helpers.a aVar = this.J;
            d9g0 d9g0Var = (d9g0) aVar.b.a.getValue();
            if (d9g0Var != null && d9g0Var.l) {
                pzt0 pzt0Var = aVar.f;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                aVar.c.o(new s7g0(d9g0Var, 0));
            }
        }
    }

    public final void d0() {
        String str;
        ActionButtonEntity actionButtonEntity;
        g9g0 g9g0Var = ((h9g0) X()).a;
        if (g9g0Var instanceof d9g0) {
            com.ybsdk.feature.qr.payments.internal.screens.presentation.helpers.a aVar = this.J;
            n4u0 n4u0Var = aVar.b.a;
            d9g0 d9g0Var = (d9g0) n4u0Var.getValue();
            if (d9g0Var == null) {
                return;
            }
            int i = u7g0.a[d9g0Var.k.ordinal()];
            int i2 = 1;
            if (i != 1) {
                if (i != 2) {
                    w511.b();
                    return;
                }
                int compareTo = BigDecimal.ZERO.compareTo(d9g0Var.g);
                sue0 sue0Var = aVar.c;
                if (compareTo == 0) {
                    ((b) sue0Var.b).Z(n9g0.a);
                    return;
                } else {
                    sue0Var.o(new s7g0(d9g0Var, i2));
                    aVar.a(null, false);
                    return;
                }
            }
            d9g0 d9g0Var2 = (d9g0) n4u0Var.getValue();
            if (d9g0Var2 == null) {
                return;
            }
            v031 v031Var = d9g0Var2.n;
            if ((v031Var instanceof q031) || (v031Var instanceof l031)) {
                aVar.c();
                return;
            } else if ((v031Var instanceof n031) || (v031Var instanceof o031) || (v031Var instanceof r031)) {
                aVar.a(null, true);
                return;
            } else {
                w511.b();
                return;
            }
        }
        boolean z = g9g0Var instanceof e9g0;
        j3h j3hVar = this.D;
        tfl0 tfl0Var = this.C;
        if (!z) {
            if (!(g9g0Var instanceof b9g0)) {
                if (g9g0Var instanceof c9g0) {
                    return;
                }
                w511.b();
                return;
            } else {
                String a = ((b9g0) g9g0Var).a();
                if (a == null || h791.e(j3hVar, a, false, null, 14) == null) {
                    tfl0Var.e();
                    return;
                }
                return;
            }
        }
        tzj0 tzj0Var = ((e9g0) g9g0Var).k;
        vzj0 vzj0Var = tzj0Var.c;
        if (tzj0Var.a == ResultStatus.PROCESSING) {
            return;
        }
        String action = (vzj0Var == null || (actionButtonEntity = vzj0Var.d) == null) ? null : actionButtonEntity.getAction();
        if (action != null && (h791.e(j3hVar, action, false, null, 14) instanceof v0h)) {
            tfl0Var.e();
            return;
        }
        if (vzj0Var != null && (str = vzj0Var.b) != null) {
            Z(new l9g0(str));
            rt1 rt1Var = ((AppAnalyticsReporter) this.I.a).Y;
            QrPaymentEvents$QrPaymentRedirectVersion qrPaymentEvents$QrPaymentRedirectVersion = QrPaymentEvents$QrPaymentRedirectVersion.CREDLIM;
            LinkedHashMap linkedHashMap = new LinkedHashMap(2);
            linkedHashMap.put("version", qrPaymentEvents$QrPaymentRedirectVersion.getOriginalValue());
            rt1Var.a.a("qr.payment.redirect", linkedHashMap);
        }
        tfl0Var.e();
    }

    public final void e0() {
        com.ybsdk.feature.qr.payments.internal.screens.presentation.helpers.b bVar = this.K;
        e9g0 e9g0Var = (e9g0) bVar.e.a.getValue();
        if (e9g0Var == null) {
            return;
        }
        pzt0 pzt0Var = bVar.k;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        bVar.k = null;
        bVar.f.b(new dag0(e9g0Var, 0));
    }

    public final void f0() {
        yxf0 yxf0Var = this.I;
        rt1 rt1Var = ((AppAnalyticsReporter) yxf0Var.a).Y;
        QrPaymentEvents$QrPaymentClosedVersion qrPaymentEvents$QrPaymentClosedVersion = QrPaymentEvents$QrPaymentClosedVersion.CREDLIM;
        String str = (String) yxf0Var.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put("version", qrPaymentEvents$QrPaymentClosedVersion.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("origin", str);
        }
        rt1Var.a.a("qr.payment.closed", linkedHashMap);
    }

    public final boolean g0(String str) {
        z2z c = ((c8g0) this.G).a.c(str);
        return c.b || (c.a instanceof v0h);
    }

    public final void h0(String str, boolean z) {
        rt1.E(((AppAnalyticsReporter) this.I.a).Y, QrPaymentEvents$QrSubscriptionStartedVersion.CREDLIM);
        this.K.d(str, z);
    }

    public final void i0() {
        xvz0 xvz0Var;
        duz0 duz0Var;
        d9g0 b = qca1.b((h9g0) X());
        if (b == null) {
            return;
        }
        v031 v031Var = b.n;
        if (v031Var instanceof l031) {
            xvz0Var = ((l031) v031Var).b;
        } else if (v031Var instanceof q031) {
            xvz0Var = ((q031) v031Var).a;
        } else if (!(v031Var instanceof n031) && !jl40.l(v031Var, o031.a) && !(v031Var instanceof r031)) {
            w511.b();
            return;
        } else {
            x4c.g("try to click on tooltip with invalid validation state", null, v031Var, Collections.singletonList(lrp0.x), 2);
            xvz0Var = null;
        }
        if (xvz0Var == null || (duz0Var = xvz0Var.b) == null) {
            return;
        }
        h791.e(this.D, duz0Var.a, false, null, 14);
    }

    public final void j0() {
        if (qca1.c((h9g0) X()) != null) {
            return;
        }
        d9g0 b = qca1.b((h9g0) X());
        tje.N(ds31.a(this), null, null, new QrPaymentsMainViewModel$getPaymentInfo$1(this, (h9g0) X(), null), 3);
        this.J.a(b != null ? b.h : null, false);
        yxf0 yxf0Var = this.I;
        rt1 rt1Var = ((AppAnalyticsReporter) yxf0Var.a).Y;
        QrPaymentEvents$QrPaymentShownVersion qrPaymentEvents$QrPaymentShownVersion = QrPaymentEvents$QrPaymentShownVersion.CREDLIM;
        String str = (String) yxf0Var.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put("version", qrPaymentEvents$QrPaymentShownVersion.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("origin", str);
        }
        rt1Var.a.a("qr.payment.shown", linkedHashMap);
    }

    public final void k0(String str) {
        yj1 b = ((h9g0) X()).a.b();
        Boolean bool = null;
        this.K.a(str, b != null ? b.b : null);
        e9g0 c = qca1.c((h9g0) X());
        String str2 = c != null ? c.j : null;
        yj1 b2 = ((h9g0) X()).a.b();
        ProductType productType = b2 != null ? b2.b : null;
        e9g0 c2 = qca1.c((h9g0) X());
        BoostStrategy boostStrategy = c2 != null ? c2.o : null;
        yxf0 yxf0Var = this.I;
        rt1 rt1Var = ((AppAnalyticsReporter) yxf0Var.a).Y;
        QrPaymentEvents$QrPaymentInitiatedVersion qrPaymentEvents$QrPaymentInitiatedVersion = QrPaymentEvents$QrPaymentInitiatedVersion.CREDLIM;
        String x = yxf0.x(productType, boostStrategy);
        String str3 = (String) yxf0Var.b;
        if (boostStrategy != null) {
            bool = Boolean.valueOf(boostStrategy == BoostStrategy.BOOST);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(5);
        linkedHashMap.put("version", qrPaymentEvents$QrPaymentInitiatedVersion.getOriginalValue());
        if (x != null) {
            linkedHashMap.put("agreement", x);
        }
        if (str2 != null) {
            linkedHashMap.put("transfer_id", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("origin", str3);
        }
        if (bool != null) {
            linkedHashMap.put("used_ultra", bool);
        }
        rt1Var.a.a("qr.payment.initiated", linkedHashMap);
    }
}
