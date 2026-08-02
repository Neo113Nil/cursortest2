package com.ybsdk.feature.futurepayments.internal.screens;

import android.net.Uri;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import defpackage.ds31;
import defpackage.h791;
import defpackage.h9g;
import defpackage.nqs;
import defpackage.pz40;
import defpackage.t8j0;
import defpackage.tje;
import defpackage.tw51;
import defpackage.uc5;
import defpackage.v0h;
import defpackage.v5r;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final com.ybsdk.feature.futurepayments.internal.data.a B;
    public final tw51 C;
    public final AppAnalyticsReporter D;

    public a(com.ybsdk.feature.futurepayments.internal.data.a aVar, tw51 tw51Var, AppAnalyticsReporter appAnalyticsReporter, nqs nqsVar) {
        super(new v5r(28), nqsVar);
        this.B = aVar;
        this.C = tw51Var;
        this.D = appAnalyticsReporter;
        appAnalyticsReporter.A.a.a("future_payments.initiated", null);
    }

    public final boolean b0(Uri uri) {
        return h791.d(((h9g) this.C).h(), uri, 14) instanceof v0h;
    }

    public final void c0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, new t8j0()));
        tje.N(ds31.a(this), null, null, new FuturePaymentsViewModel$updateData$1(this, null), 3);
    }

    public final void d0() {
        tje.N(ds31.a(this), null, null, new FuturePaymentsViewModel$updateData$1(this, null), 3);
    }
}
