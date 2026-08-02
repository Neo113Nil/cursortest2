package com.yandex.go.places.organization.card.impl.ui.card.flex.v2;

import com.yandex.go.places.api.navigation.OrganizationCardSliderPinDisplayStrategy;
import com.yandex.go.places.models.data.entities.network.bottom_panel.OrganizationCardAnalyticsParams;
import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$PlacesMapScreenName;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v2.g;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.ah00;
import defpackage.b64;
import defpackage.d470;
import defpackage.dac0;
import defpackage.de6;
import defpackage.g8e;
import defpackage.go80;
import defpackage.hsj;
import defpackage.i3h;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k0b0;
import defpackage.m9c0;
import defpackage.ne80;
import defpackage.nh80;
import defpackage.oe80;
import defpackage.oh80;
import defpackage.oxu0;
import defpackage.pzt0;
import defpackage.q3v;
import defpackage.qi80;
import defpackage.ri80;
import defpackage.si80;
import defpackage.sls;
import defpackage.ti80;
import defpackage.tje;
import defpackage.tse;
import defpackage.u131;
import defpackage.ub60;
import defpackage.uc4;
import defpackage.w511;
import defpackage.wbc0;
import defpackage.x4e;
import defpackage.y7c0;
import defpackage.yac0;
import defpackage.yh80;
import defpackage.yzh;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.LazyThreadSafetyMode;

/* loaded from: classes13.dex */
public final class g extends com.yandex.go.places.base.ui.modals.map.c implements oe80 {
    public final y7c0 D;
    public final boolean E;
    public final i3h F;
    public final oh80 G;
    public final com.yandex.go.places.analytics.organization.card.a H;
    public final m9c0 I;
    public final dac0 J;
    public final com.yandex.go.places.organization.card.impl.domain.interactors.flex.b K;
    public final yh80 L;
    public final de6 M;
    public final d470 N;
    public final yzh O;
    public final com.yandex.go.places.organization.card.impl.ui.card.flex.actions.web_custom_tabs.a P;
    public final go80 Q;
    public final oxu0 R;
    public final tse S;
    public final wbc0 T;
    public final yac0 U;
    public final ub60 V;
    public String W;
    public List Z;
    public ne80 a0;
    public boolean b0;
    public pzt0 c0;
    public boolean d0;
    public Boolean e0;
    public OrganizationCardAnalyticsParams f0;
    public final LinkedHashMap g0;
    public ti80 h0;
    public uc4 i0;
    public final boolean j0;
    public final i3y k0;
    public final i3y l0;

    public g(y7c0 y7c0Var, boolean z, OrganizationCardSliderPinDisplayStrategy organizationCardSliderPinDisplayStrategy, i3h i3hVar, oh80 oh80Var, com.yandex.go.places.analytics.organization.card.a aVar, m9c0 m9c0Var, dac0 dac0Var, com.yandex.go.places.organization.card.impl.domain.interactors.flex.b bVar, yh80 yh80Var, de6 de6Var, d470 d470Var, yzh yzhVar, com.yandex.go.places.organization.card.impl.ui.card.flex.actions.web_custom_tabs.a aVar2, go80 go80Var, oxu0 oxu0Var, tse tseVar, wbc0 wbc0Var, yac0 yac0Var, boolean z2, ub60 ub60Var, ne80 ne80Var, q3v q3vVar, k0b0 k0b0Var, ah00 ah00Var) {
        super(nh80.class, q3vVar, k0b0Var, ah00Var, z2);
        this.D = y7c0Var;
        this.E = z;
        this.F = i3hVar;
        this.G = oh80Var;
        this.H = aVar;
        this.I = m9c0Var;
        this.J = dac0Var;
        this.K = bVar;
        this.L = yh80Var;
        this.M = de6Var;
        this.N = d470Var;
        this.O = yzhVar;
        this.P = aVar2;
        this.Q = go80Var;
        this.R = oxu0Var;
        this.S = tseVar;
        this.T = wbc0Var;
        this.U = yac0Var;
        this.V = ub60Var;
        this.Z = Collections.singletonList(ne80Var);
        this.a0 = ne80Var;
        final int i = 0;
        this.f0 = new OrganizationCardAnalyticsParams(0);
        this.g0 = new LinkedHashMap();
        final int i2 = 1;
        this.j0 = organizationCardSliderPinDisplayStrategy == OrganizationCardSliderPinDisplayStrategy.SELECTED_PIN_ONLY && yac0Var.b(PlacesMapConfig$PlacesMapScreenName.PLACES_ORGANIZATION_CARD);
        sls slsVar = new sls(this) { // from class: sh80
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i;
                g gVar = this.b;
                switch (i3) {
                    case 0:
                        y7c0 y7c0Var2 = gVar.D;
                        return new o8c0(y7c0Var2.getPath(), y7c0Var2.a());
                    default:
                        return gVar.U.a(PlacesMapConfig$PlacesMapScreenName.PLACES_ORGANIZATION_CARD);
                }
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.k0 = kotlin.a.b(lazyThreadSafetyMode, slsVar);
        this.l0 = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: sh80
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                g gVar = this.b;
                switch (i3) {
                    case 0:
                        y7c0 y7c0Var2 = gVar.D;
                        return new o8c0(y7c0Var2.getPath(), y7c0Var2.a());
                    default:
                        return gVar.U.a(PlacesMapConfig$PlacesMapScreenName.PLACES_ORGANIZATION_CARD);
                }
            }
        });
    }

    public static String Mg(ti80 ti80Var) {
        if (ti80Var instanceof qi80) {
            return ((qi80) ti80Var).a;
        }
        if (ti80Var instanceof si80) {
            return ((si80) ti80Var).b;
        }
        if (ti80Var instanceof ri80) {
            return "";
        }
        w511.b();
        return null;
    }

    public static String Og(ti80 ti80Var) {
        if (ti80Var instanceof qi80) {
            return g8e.o("oid:", ((qi80) ti80Var).a);
        }
        if (ti80Var instanceof ri80) {
            return g8e.o("uri:", ((ri80) ti80Var).a);
        }
        if (ti80Var instanceof si80) {
            si80 si80Var = (si80) ti80Var;
            return b64.l("oid:", si80Var.b, "|uri:", si80Var.a);
        }
        w511.b();
        return null;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        tje.N(this.S, null, null, new OrganizationCardsSliderPresenter$detachView$1(this, null), 3);
        super.Cg();
        this.Q.e = true;
    }

    public final void Lg() {
        OrganizationCardAnalyticsParams organizationCardAnalyticsParams;
        ti80 ti80Var = this.a0.a;
        if (jl40.l(this.h0, ti80Var) || (organizationCardAnalyticsParams = (OrganizationCardAnalyticsParams) this.g0.get(ti80Var)) == null) {
            return;
        }
        this.h0 = ti80Var;
        hsj hsjVar = (hsj) this.O.a;
        String str = organizationCardAnalyticsParams.a;
        String str2 = organizationCardAnalyticsParams.b;
        String str3 = organizationCardAnalyticsParams.c;
        String str4 = organizationCardAnalyticsParams.d;
        hsjVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("oid", str);
        hashMap.put("source", str3);
        hsjVar.a.a("Discovery.OrganisationCard.Shown", hashMap, 1, x4e.q(hashMap, LaunchBrowserActivity.KEY_URI, str2, "organisation_name", str4));
    }

    @Override // defpackage.oe80
    public final void Nb() {
        this.J.b.reloadDocument();
        ne80 ne80Var = this.a0;
        this.H.o(ne80Var.a, ne80Var.b);
    }

    public final void Ng(boolean z) {
        Boolean bool = this.e0;
        if (jl40.l(bool, Boolean.valueOf(z))) {
            return;
        }
        this.e0 = Boolean.valueOf(z);
        this.J.d.i(new u131("discovery.is_modal_view_expanded", z));
        if (bool != null) {
            ne80 ne80Var = this.a0;
            com.yandex.go.places.analytics.organization.card.a aVar = this.H;
            if (z) {
                aVar.p(ne80Var.a, ne80Var.b, "Discovery.OrganisationCard.Expanded");
            } else {
                aVar.p(ne80Var.a, ne80Var.b, "Discovery.OrganisationCard.Collapsed");
            }
        }
    }
}
