package com.ybsdk.feature.qr.payments.internal.screens.subscription.presentation;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrSubscriptionLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrSubscriptionLoadedVersion;
import com.ybsdk.core.navigation.cicerone.Screen;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.qr.payments.api.QrPaymentsSecondFactorScreenProvider$Request;
import com.ybsdk.feature.qr.payments.api.QrPaymentsSubscriptionScreenParams;
import com.ybsdk.feature.qr.payments.api.data.AgreementEntity;
import com.ybsdk.feature.qr.payments.internal.network.QrPaymentsApi;
import com.ybsdk.feature.qr.payments.internal.screens.subscription.data.entities.SubscriptionStatus;
import defpackage.abg0;
import defpackage.c6g;
import defpackage.cma0;
import defpackage.ds31;
import defpackage.dzh0;
import defpackage.e8g0;
import defpackage.ebg0;
import defpackage.f42;
import defpackage.g8e;
import defpackage.gao;
import defpackage.gbg0;
import defpackage.hbg0;
import defpackage.ibg0;
import defpackage.jbg0;
import defpackage.kxb0;
import defpackage.n0t0;
import defpackage.n3w;
import defpackage.nbv;
import defpackage.ny61;
import defpackage.nyg0;
import defpackage.o8g0;
import defpackage.p5g;
import defpackage.pz40;
import defpackage.qag0;
import defpackage.rt1;
import defpackage.sag0;
import defpackage.ssa1;
import defpackage.tag0;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.uc5;
import defpackage.unr0;
import defpackage.vag0;
import defpackage.vyf0;
import defpackage.w511;
import defpackage.x9g0;
import defpackage.xag0;
import defpackage.y9g0;
import defpackage.yag0;
import defpackage.yxf0;
import defpackage.zag0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final QrPaymentsSubscriptionScreenParams B;
    public final qag0 C;
    public final tfl0 D;
    public final com.ybsdk.feature.qr.payments.internal.screens.subscription.data.a E;
    public final yxf0 F;

    public a(ebg0 ebg0Var, vag0 vag0Var, QrPaymentsSubscriptionScreenParams qrPaymentsSubscriptionScreenParams, qag0 qag0Var, tfl0 tfl0Var, tag0 tag0Var) {
        super(new vyf0(3, qrPaymentsSubscriptionScreenParams), ebg0Var);
        this.B = qrPaymentsSubscriptionScreenParams;
        this.C = qag0Var;
        this.D = tfl0Var;
        String qrcScanId = qrPaymentsSubscriptionScreenParams.getQrcScanId();
        yxf0 yxf0Var = vag0Var.a;
        this.E = new com.ybsdk.feature.qr.payments.internal.screens.subscription.data.a((QrPaymentsApi) ((kxb0) yxf0Var.a).get(), (com.ybsdk.di.modules.features.qr.a) ((c6g) yxf0Var.b).get(), qrcScanId, this);
        qrPaymentsSubscriptionScreenParams.getOrigin();
        o8g0 o8g0Var = tag0Var.a;
        AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) ((p5g) o8g0Var.a).get();
        y9g0 y9g0Var = (y9g0) ((n3w) o8g0Var.b).a;
        yxf0 yxf0Var2 = new yxf0();
        yxf0Var2.a = appAnalyticsReporter;
        yxf0Var2.b = new f42((AppAnalyticsReporter) y9g0Var.a.a.get(), 9);
        this.F = yxf0Var2;
        List<AgreementEntity> agreements = qrPaymentsSubscriptionScreenParams.getSubscriptionInfo().getAgreements();
        rt1 rt1Var = appAnalyticsReporter.Y;
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = agreements.iterator();
        while (it.hasNext()) {
            jSONArray.put(ssa1.b(((AgreementEntity) it.next()).getAgreementId()));
        }
        rt1Var.a.a("qr.subscriptions.accounts.shown", g8e.w(1, "accounts_list", jSONArray.toString()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        if (r10.h0(r11, r6) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0063, code lost:
    
        if (r11 == r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b0(a aVar, String str, ContinuationImpl continuationImpl) {
        QrPaymentsSubscriptionViewModel$getSubscriptionStatusesV2$1 qrPaymentsSubscriptionViewModel$getSubscriptionStatusesV2$1;
        int i;
        Object a;
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        r0 r0Var4;
        Object value4;
        r0 r0Var5;
        Object value5;
        gbg0 gbg0Var;
        aVar.getClass();
        if (continuationImpl instanceof QrPaymentsSubscriptionViewModel$getSubscriptionStatusesV2$1) {
            qrPaymentsSubscriptionViewModel$getSubscriptionStatusesV2$1 = (QrPaymentsSubscriptionViewModel$getSubscriptionStatusesV2$1) continuationImpl;
            int i2 = qrPaymentsSubscriptionViewModel$getSubscriptionStatusesV2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qrPaymentsSubscriptionViewModel$getSubscriptionStatusesV2$1.label = i2 - Integer.MIN_VALUE;
                QrPaymentsSubscriptionViewModel$getSubscriptionStatusesV2$1 qrPaymentsSubscriptionViewModel$getSubscriptionStatusesV2$12 = qrPaymentsSubscriptionViewModel$getSubscriptionStatusesV2$1;
                Object obj = qrPaymentsSubscriptionViewModel$getSubscriptionStatusesV2$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qrPaymentsSubscriptionViewModel$getSubscriptionStatusesV2$12.label;
                if (i != 0) {
                    b.b(obj);
                    com.ybsdk.feature.qr.payments.internal.screens.subscription.data.a aVar2 = aVar.E;
                    String qrcLink = aVar.B.getQrcLink();
                    String str2 = ((cma0) aVar.X()).c;
                    String str3 = ((cma0) aVar.X()).e;
                    qrPaymentsSubscriptionViewModel$getSubscriptionStatusesV2$12.label = 1;
                    a = aVar2.a(qrcLink, str2, str, str3, qrPaymentsSubscriptionViewModel$getSubscriptionStatusesV2$12);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                            return zy11.a;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (Result.a(a) != null) {
                    jbg0 jbg0Var = (jbg0) a;
                    if (jbg0Var instanceof gbg0) {
                        pz40 Y = aVar.Y();
                        do {
                            r0Var5 = (r0) Y;
                            value5 = r0Var5.getValue();
                            gbg0Var = (gbg0) jbg0Var;
                        } while (!r0Var5.k(value5, cma0.a((cma0) value5, null, null, gbg0Var.b, 31)));
                        String str4 = gbg0Var.a;
                        qrPaymentsSubscriptionViewModel$getSubscriptionStatusesV2$12.label = 2;
                    } else if (jbg0Var instanceof hbg0) {
                        ((f42) aVar.F.b).b.Y.D(QrPaymentEvents$QrSubscriptionLoadedVersion.OLD, QrPaymentEvents$QrSubscriptionLoadedResult.DENIED, null);
                        pz40 Y2 = aVar.Y();
                        do {
                            r0Var3 = (r0) Y2;
                            value3 = r0Var3.getValue();
                        } while (!r0Var3.k(value3, cma0.a((cma0) value3, SubscriptionStatus.FAILED, null, null, 62)));
                        aVar.Z(new zag0(gao.e(null, null, null, 7)));
                        pz40 Y3 = aVar.Y();
                        do {
                            r0Var4 = (r0) Y3;
                            value4 = r0Var4.getValue();
                        } while (!r0Var4.k(value4, cma0.a((cma0) value4, null, null, null, 31)));
                    } else {
                        if (!(jbg0Var instanceof ibg0)) {
                            w511.b();
                            return null;
                        }
                        sag0 sag0Var = (sag0) ((ibg0) jbg0Var).a;
                        int i3 = abg0.a[sag0Var.a.ordinal()];
                        if (i3 == 1) {
                            pz40 Y4 = aVar.Y();
                            do {
                                r0Var2 = (r0) Y4;
                                value2 = r0Var2.getValue();
                            } while (!r0Var2.k(value2, cma0.a((cma0) value2, null, null, null, 31)));
                        } else if (i3 != 2 && i3 != 3 && i3 != 4) {
                            w511.b();
                            return null;
                        }
                        aVar.c0(sag0Var);
                    }
                } else {
                    pz40 Y5 = aVar.Y();
                    do {
                        r0Var = (r0) Y5;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, cma0.a((cma0) value, null, null, null, 31)));
                    aVar.c0(new sag0(SubscriptionStatus.FAILED, null));
                }
                return zy11.a;
            }
        }
        qrPaymentsSubscriptionViewModel$getSubscriptionStatusesV2$1 = new QrPaymentsSubscriptionViewModel$getSubscriptionStatusesV2$1(aVar, continuationImpl);
        QrPaymentsSubscriptionViewModel$getSubscriptionStatusesV2$1 qrPaymentsSubscriptionViewModel$getSubscriptionStatusesV2$122 = qrPaymentsSubscriptionViewModel$getSubscriptionStatusesV2$1;
        Object obj3 = qrPaymentsSubscriptionViewModel$getSubscriptionStatusesV2$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qrPaymentsSubscriptionViewModel$getSubscriptionStatusesV2$122.label;
        if (i != 0) {
        }
        if (Result.a(a) != null) {
        }
        return zy11.a;
    }

    public final void c0(sag0 sag0Var) {
        r0 r0Var;
        Object value;
        SubscriptionStatus subscriptionStatus;
        SubscriptionStatus subscriptionStatus2;
        QrPaymentEvents$QrSubscriptionLoadedResult qrPaymentEvents$QrSubscriptionLoadedResult;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
            subscriptionStatus = sag0Var.a;
            subscriptionStatus2 = sag0Var.a;
        } while (!r0Var.k(value, cma0.a((cma0) value, subscriptionStatus, null, null, 62)));
        String str = sag0Var.b;
        String str2 = subscriptionStatus2 == SubscriptionStatus.FAILED ? str : null;
        yxf0 yxf0Var = this.F;
        rt1 rt1Var = ((f42) yxf0Var.b).b.Y;
        QrPaymentEvents$QrSubscriptionLoadedVersion qrPaymentEvents$QrSubscriptionLoadedVersion = QrPaymentEvents$QrSubscriptionLoadedVersion.OLD;
        int i = x9g0.a[subscriptionStatus2.ordinal()];
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
            rt1Var.D(qrPaymentEvents$QrSubscriptionLoadedVersion, qrPaymentEvents$QrSubscriptionLoadedResult, str2);
        }
        int i2 = abg0.a[subscriptionStatus2.ordinal()];
        if (i2 == 1) {
            Text.Constant g = d.g(str);
            if (g == null) {
                Z(new zag0(gao.e(null, null, null, 7)));
                return;
            } else {
                Z(new zag0(new n0t0(g)));
                return;
            }
        }
        if (i2 == 2 || i2 == 3) {
            return;
        }
        if (i2 != 4) {
            w511.b();
            return;
        }
        if (((cma0) X()).d != null) {
            ((AppAnalyticsReporter) yxf0Var.a).Y.a.a("qr.subscription.redirect", null);
        }
        String str3 = ((cma0) X()).d;
        QrPaymentsSubscriptionScreenParams qrPaymentsSubscriptionScreenParams = this.B;
        Z(str3 != null ? new yag0(str3, qrPaymentsSubscriptionScreenParams.isSbpAccountBinding()) : xag0.a);
        if (qrPaymentsSubscriptionScreenParams.isSbpAccountBinding()) {
            return;
        }
        Z(new zag0(new n0t0(str != null ? g8e.i(Text.Companion, str) : unr0.h(Text.Companion, dzh0.ybsdk_qr_payment_subscription_enabled))));
    }

    public final void d0() {
        ((AppAnalyticsReporter) this.F.a).Y.a.a("qr.subscription_shutter.closed", null);
    }

    public final void e0() {
        this.D.e();
    }

    public final void f0(String str) {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, cma0.a((cma0) value, SubscriptionStatus.PROCESSING, null, null, 62)));
        tje.N(ds31.a(this), null, null, new QrPaymentsSubscriptionViewModel$onPrimaryButtonClicked$2(this, str, null), 3);
    }

    public final void g0() {
        ((AppAnalyticsReporter) this.F.a).Y.a.a("qr.subscription_shutter.shown", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h0(String str, ContinuationImpl continuationImpl) {
        QrPaymentsSubscriptionViewModel$subscriptionAuthorizationRequired$1 qrPaymentsSubscriptionViewModel$subscriptionAuthorizationRequired$1;
        int i;
        r0 r0Var;
        Object value;
        if (continuationImpl instanceof QrPaymentsSubscriptionViewModel$subscriptionAuthorizationRequired$1) {
            qrPaymentsSubscriptionViewModel$subscriptionAuthorizationRequired$1 = (QrPaymentsSubscriptionViewModel$subscriptionAuthorizationRequired$1) continuationImpl;
            int i2 = qrPaymentsSubscriptionViewModel$subscriptionAuthorizationRequired$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qrPaymentsSubscriptionViewModel$subscriptionAuthorizationRequired$1.label = i2 - Integer.MIN_VALUE;
                Object obj = qrPaymentsSubscriptionViewModel$subscriptionAuthorizationRequired$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qrPaymentsSubscriptionViewModel$subscriptionAuthorizationRequired$1.label;
                if (i != 0) {
                    b.b(obj);
                    pz40 Y = Y();
                    do {
                        r0Var = (r0) Y;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, cma0.a((cma0) value, SubscriptionStatus.DEFAULT, null, null, 62)));
                    ((f42) this.F.b).b.Y.D(QrPaymentEvents$QrSubscriptionLoadedVersion.OLD, QrPaymentEvents$QrSubscriptionLoadedResult.TWO_FA, null);
                    nbv nbvVar = new nbv(nyg0.ybsdk_ic_select_payment_item_sbp, null);
                    QrPaymentsSecondFactorScreenProvider$Request qrPaymentsSecondFactorScreenProvider$Request = QrPaymentsSecondFactorScreenProvider$Request.SUBSCRIPTION;
                    qrPaymentsSubscriptionViewModel$subscriptionAuthorizationRequired$1.label = 1;
                    obj = ((e8g0) this.C).b(nbvVar, null, str, qrPaymentsSecondFactorScreenProvider$Request);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                this.D.h((Screen) obj);
                return zy11.a;
            }
        }
        qrPaymentsSubscriptionViewModel$subscriptionAuthorizationRequired$1 = new QrPaymentsSubscriptionViewModel$subscriptionAuthorizationRequired$1(this, continuationImpl);
        Object obj3 = qrPaymentsSubscriptionViewModel$subscriptionAuthorizationRequired$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qrPaymentsSubscriptionViewModel$subscriptionAuthorizationRequired$1.label;
        if (i != 0) {
        }
        this.D.h((Screen) obj3);
        return zy11.a;
    }
}
