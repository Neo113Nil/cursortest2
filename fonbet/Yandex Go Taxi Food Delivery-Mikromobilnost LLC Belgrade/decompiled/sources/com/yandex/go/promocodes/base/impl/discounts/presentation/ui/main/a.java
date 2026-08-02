package com.yandex.go.promocodes.base.impl.discounts.presentation.ui.main;

import android.net.Uri;
import com.yandex.go.promocodes.base.impl.discounts.domain.analytics.ItemType;
import com.yandex.go.promocodes.base.impl.discounts.domain.interactors.b;
import com.yandex.go.promocodes.base.impl.promo_codes.domain.interactors.c;
import com.yandex.go.promocodes.base.impl.promo_codes.domain.interactors.d;
import com.yandex.go.promocodes.referral.api.net.dto.ReferralOverrides;
import com.yandex.go.promocodes.referral.api.net.dto.ReferralService;
import defpackage.ad5;
import defpackage.bvf0;
import defpackage.jst;
import defpackage.k7x0;
import defpackage.kqj;
import defpackage.nrj;
import defpackage.pqj;
import defpackage.prj;
import defpackage.tje;
import defpackage.tpj;
import defpackage.wlf0;
import defpackage.xpj;
import java.util.Collections;
import java.util.List;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class a extends ad5 {
    public static final List L = Collections.singletonList("scooters");
    public final c A;
    public final xpj B;
    public final b C;
    public final kqj D;
    public final com.yandex.go.promocodes.base.impl.promo_codes.domain.interactors.b E;
    public final Uri F;
    public final List G;
    public final prj H;
    public final r0 I;
    public nrj J;
    public boolean K;
    public final k7x0 x;
    public final tpj y;
    public final d z;

    public a(k7x0 k7x0Var, tpj tpjVar, d dVar, c cVar, xpj xpjVar, b bVar, kqj kqjVar, com.yandex.go.promocodes.base.impl.promo_codes.domain.interactors.b bVar2, Uri uri, List list, prj prjVar) {
        super(pqj.class);
        this.x = k7x0Var;
        this.y = tpjVar;
        this.z = dVar;
        this.A = cVar;
        this.B = xpjVar;
        this.C = bVar;
        this.D = kqjVar;
        this.E = bVar2;
        this.F = uri;
        this.G = list;
        this.H = prjVar;
        this.I = bvf0.c(Boolean.FALSE);
        DiscountsToolbarEditModeViewState discountsToolbarEditModeViewState = DiscountsToolbarEditModeViewState.ENABLED;
        this.J = new nrj(false, ReferralOverrides.f, ReferralService.UNKNOWN);
    }

    public final void Kg(String str) {
        wlf0 a = this.z.a(str, this.G);
        if (a == null) {
            jst.e.u("No matching promo code by value '" + str + "' in cache during delete handing");
            return;
        }
        tje.N(Jg(), null, null, new DiscountsViewPresenter$deletePromoCode$1(this, a, null), 3);
        ((pqj) Dg()).sg(true);
        ItemType itemType = ItemType.DELETE;
        tpj tpjVar = this.y;
        tpjVar.getClass();
        tpjVar.c(itemType, a.e, a.f);
    }
}
