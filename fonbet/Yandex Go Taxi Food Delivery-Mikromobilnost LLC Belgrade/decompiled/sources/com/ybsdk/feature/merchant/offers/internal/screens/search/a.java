package com.ybsdk.feature.merchant.offers.internal.screens.search;

import android.net.Uri;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.OffersListEvents$MerchantOffersSearchCancelClickScreen;
import com.ybsdk.core.analytics.generated.delegates.OffersListEvents$MerchantOffersSearchInitiatedLoadType;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import com.ybsdk.feature.merchant.offers.internal.domain.interactor.b;
import com.ybsdk.rconfig.configs.MerchantOffersSearchConfig;
import defpackage.b3z;
import defpackage.ds31;
import defpackage.em3;
import defpackage.gq10;
import defpackage.jl40;
import defpackage.lp10;
import defpackage.mq10;
import defpackage.mv3;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.r8j0;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.tv3;
import defpackage.u8j0;
import defpackage.uc5;
import defpackage.v0h;
import defpackage.w410;
import defpackage.xp10;
import defpackage.z2z;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final b3z B;
    public final b C;
    public final tv3 D;
    public final tfl0 E;
    public final AppAnalyticsReporter F;
    public pzt0 G;
    public pzt0 H;
    public pzt0 I;

    public a(b3z b3zVar, b bVar, tv3 tv3Var, tfl0 tfl0Var, AppAnalyticsReporter appAnalyticsReporter) {
        super(new w410(21), new mq10());
        this.B = b3zVar;
        this.C = bVar;
        this.D = tv3Var;
        this.E = tfl0Var;
        this.F = appAnalyticsReporter;
        appAnalyticsReporter.N.a.a("merchant_offers.search.open", null);
        e0();
        b3zVar.a(new mv3(DeeplinkHandleResult$DeeplinkType.SCREEN_OPEN, this, 16));
    }

    @Override // defpackage.yr31
    public final void V() {
        pzt0 pzt0Var = this.G;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.G = null;
        b0();
    }

    public final void b0() {
        pzt0 pzt0Var = this.H;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.H = null;
        pzt0 pzt0Var2 = this.I;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.I = null;
    }

    public final void c0(long j, String str) {
        b0();
        this.H = tje.N(ds31.a(this), null, null, new MerchantOffersSearchViewModel$loadOffersFirstPage$1(this, j, str, null), 3);
    }

    public final void d0() {
        List list;
        lp10 lp10Var;
        lp10 lp10Var2;
        u8j0 u8j0Var = (u8j0) kotlin.collections.a.b0(((gq10) X()).c);
        if (u8j0Var == null || (lp10Var2 = (lp10) u8j0Var.a()) == null) {
            u8j0 u8j0Var2 = ((gq10) X()).b;
            list = (u8j0Var2 == null || (lp10Var = (lp10) u8j0Var2.a()) == null) ? null : lp10Var.b;
        } else {
            list = lp10Var2.b;
        }
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        if (list == null) {
            return;
        }
        this.F.N.l(OffersListEvents$MerchantOffersSearchInitiatedLoadType.SEARCH_NEXT);
        b0();
        this.I = tje.N(ds31.a(this), null, null, new MerchantOffersSearchViewModel$loadOffersNextPage$1(this, list, null), 3);
    }

    public final void e0() {
        this.F.N.l(OffersListEvents$MerchantOffersSearchInitiatedLoadType.START);
        pzt0 pzt0Var = this.G;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.G = tje.N(ds31.a(this), null, null, new MerchantOffersSearchViewModel$loadSuggests$1(this, null), 3);
    }

    public final void f0() {
        em3 em3Var = this.F.N;
        String str = ((gq10) X()).d;
        OffersListEvents$MerchantOffersSearchCancelClickScreen offersListEvents$MerchantOffersSearchCancelClickScreen = (str == null || str.length() == 0) ? OffersListEvents$MerchantOffersSearchCancelClickScreen.OFFERS : OffersListEvents$MerchantOffersSearchCancelClickScreen.SEARCH;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put(MetaDataField.SCREEN_FIELD, offersListEvents$MerchantOffersSearchCancelClickScreen.getOriginalValue());
        em3Var.a.a("merchant_offers.search.cancel.click", linkedHashMap);
        pzt0 pzt0Var = this.G;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.G = null;
        b0();
        this.E.e();
    }

    public final void g0() {
        u8j0 u8j0Var = (u8j0) kotlin.collections.a.b0(((gq10) X()).c);
        if (u8j0Var == null || (u8j0Var instanceof r8j0)) {
            d0();
        }
    }

    public final void h0() {
        d0();
    }

    public final void i0(String str) {
        r0 r0Var;
        Object value;
        if (jl40.l(str, ((gq10) X()).d)) {
            return;
        }
        if (str == null || str.length() == 0) {
            b0();
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, gq10.a((gq10) value, null, null, EmptyList.a, null, 1)));
            return;
        }
        pz40 Y2 = Y();
        while (true) {
            r0 r0Var2 = (r0) Y2;
            Object value2 = r0Var2.getValue();
            String str2 = str;
            if (r0Var2.k(value2, gq10.a((gq10) value2, null, null, null, str2, 7))) {
                c0(((MerchantOffersSearchConfig) this.D.a.d(xp10.a).getData()).getDebounceDurationMs(), str2);
                return;
            }
            str = str2;
        }
    }

    public final void j0() {
        this.F.N.a.a("merchant_offers.search.search_bar.click", null);
    }

    public final boolean k0(Uri uri) {
        z2z c = this.B.c(uri.toString());
        return c.b || (c.a instanceof v0h);
    }
}
