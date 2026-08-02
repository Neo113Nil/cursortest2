package com.ybsdk.feature.rebind.payment.internal.screens;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.rebind.payment.api.RebindPaymentMethodScreenParams;
import com.ybsdk.feature.rebind.payment.internal.data.RebindPaymentMethodStatusEntity;
import defpackage.cfi0;
import defpackage.dfi0;
import defpackage.ds31;
import defpackage.efi0;
import defpackage.gfi0;
import defpackage.hkg0;
import defpackage.lfi0;
import defpackage.pz40;
import defpackage.rt1;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.uc5;
import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final com.ybsdk.feature.rebind.payment.internal.domain.a B;
    public final efi0 C;
    public final tfl0 D;
    public final AppAnalyticsReporter E;
    public final RebindPaymentMethodScreenParams F;

    public a(com.ybsdk.feature.rebind.payment.internal.domain.a aVar, efi0 efi0Var, tfl0 tfl0Var, AppAnalyticsReporter appAnalyticsReporter, lfi0 lfi0Var, RebindPaymentMethodScreenParams rebindPaymentMethodScreenParams) {
        super(new hkg0(16), lfi0Var);
        this.B = aVar;
        this.C = efi0Var;
        this.D = tfl0Var;
        this.E = appAnalyticsReporter;
        this.F = rebindPaymentMethodScreenParams;
        appAnalyticsReporter.a0.a.a("rebind_payment.method_start", null);
        tje.N(ds31.a(this), null, null, new RebindPaymentMethodViewModel$loadData$1(this, null), 3);
    }

    @Override // defpackage.yr31
    public final void V() {
        if (((gfi0) X()).a == RebindPaymentMethodStatusEntity.FINISHED || ((gfi0) X()).a == RebindPaymentMethodStatusEntity.FAILED) {
            return;
        }
        this.C.a(cfi0.a);
    }

    public final void b0() {
        this.D.e();
    }

    public final void c0(Throwable th) {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, new gfi0(RebindPaymentMethodStatusEntity.FAILED, null)));
        this.C.a(new dfi0(th));
        this.D.e();
    }

    public final void d0(Throwable th) {
        rt1 rt1Var = this.E.a0;
        String message = th.getMessage();
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        if (message != null) {
            linkedHashMap.put("error", message);
        }
        rt1Var.a.a("rebind_payment.3ds_error", linkedHashMap);
    }
}
