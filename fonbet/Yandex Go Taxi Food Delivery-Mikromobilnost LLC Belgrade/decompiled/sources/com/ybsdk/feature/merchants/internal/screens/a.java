package com.ybsdk.feature.merchants.internal.screens;

import android.net.Uri;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import defpackage.ds31;
import defpackage.er10;
import defpackage.gr10;
import defpackage.h791;
import defpackage.h9g;
import defpackage.pz40;
import defpackage.t8j0;
import defpackage.tje;
import defpackage.tw51;
import defpackage.uc5;
import defpackage.v0h;
import defpackage.w410;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final com.ybsdk.feature.merchants.internal.data.a B;
    public final tw51 C;
    public final AppAnalyticsReporter D;

    public a(com.ybsdk.feature.merchants.internal.data.a aVar, tw51 tw51Var, AppAnalyticsReporter appAnalyticsReporter, gr10 gr10Var) {
        super(new w410(23), gr10Var);
        r0 r0Var;
        Object value;
        this.B = aVar;
        this.C = tw51Var;
        this.D = appAnalyticsReporter;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, new er10(new t8j0())));
        this.D.P.a.a("partners.initiated", null);
        tje.N(ds31.a(this), null, null, new MerchantsViewModel$loadData$2(this, null), 3);
    }

    public final boolean b0(Uri uri) {
        return h791.d(((h9g) this.C).h(), uri, 14) instanceof v0h;
    }
}
