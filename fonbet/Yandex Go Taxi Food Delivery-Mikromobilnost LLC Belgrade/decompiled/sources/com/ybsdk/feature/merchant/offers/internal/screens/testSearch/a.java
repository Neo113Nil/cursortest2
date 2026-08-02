package com.ybsdk.feature.merchant.offers.internal.screens.testSearch;

import android.net.Uri;
import defpackage.ds31;
import defpackage.h791;
import defpackage.j3h;
import defpackage.pq10;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.rq10;
import defpackage.tje;
import defpackage.uc5;
import defpackage.v0h;
import defpackage.w410;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final j3h B;
    public final com.ybsdk.feature.merchant.offers.internal.domain.interactor.a C;
    public pzt0 D;

    public a(j3h j3hVar, com.ybsdk.feature.merchant.offers.internal.domain.interactor.a aVar, rq10 rq10Var) {
        super(new w410(22), rq10Var);
        this.B = j3hVar;
        this.C = aVar;
    }

    public final void b0() {
        r0 r0Var;
        Object value;
        pzt0 pzt0Var = this.D;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        String str = ((pq10) X()).a;
        if (str != null && str.length() != 0) {
            this.D = tje.N(ds31.a(this), null, null, new MerchantOffersTestSearchViewModel$loadSearchResults$2(this, str, null), 3);
            return;
        }
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, pq10.a((pq10) value, null)));
    }

    public final void c0() {
        b0();
    }

    public final boolean d0(Uri uri) {
        return h791.e(this.B, uri.toString(), false, null, 14) instanceof v0h;
    }
}
