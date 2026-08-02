package com.yandex.go.promocodes.base.impl.discounts.presentation.ui.add;

import com.yandex.go.promocodes.base.impl.discounts.domain.analytics.ErrorType;
import com.yandex.go.promocodes.base.impl.discounts.domain.entities.analytics.DiscountsAnalyticsScreen;
import com.yandex.go.promocodes.base.impl.promo_codes.domain.interactors.d;
import defpackage.ad5;
import defpackage.bvf0;
import defpackage.cpj;
import defpackage.da0;
import defpackage.fpj;
import defpackage.jst;
import defpackage.lhj;
import defpackage.o61;
import defpackage.opj;
import defpackage.qnh;
import defpackage.qu;
import defpackage.rpj;
import defpackage.tje;
import defpackage.tse;
import defpackage.vpj;
import defpackage.w511;
import defpackage.wlf0;
import defpackage.xjg;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class b extends ad5 {
    public final com.yandex.go.promocodes.base.impl.discounts.domain.interactors.a A;
    public final rpj B;
    public final List C;
    public final qnh D;
    public boolean E;
    public wlf0 F;
    public final r0 G;
    public final r0 H;
    public boolean I;
    public final tse x;
    public final xjg y;
    public final d z;

    public b(tse tseVar, xjg xjgVar, d dVar, com.yandex.go.promocodes.base.impl.discounts.domain.interactors.a aVar, rpj rpjVar, String str, List list, qnh qnhVar) {
        super(cpj.class);
        this.x = tseVar;
        this.y = xjgVar;
        this.z = dVar;
        this.A = aVar;
        this.B = rpjVar;
        this.C = list;
        this.D = qnhVar;
        this.G = bvf0.c(str);
        this.H = bvf0.c(opj.a);
    }

    public final void Kg() {
        String str = (String) this.G.getValue();
        boolean z = str.length() == 0;
        boolean z2 = this.I;
        o61 o61Var = (o61) this.y.c;
        Boolean valueOf = Boolean.valueOf(z);
        String value = z2 ? ErrorType.NETWORK.getValue() : null;
        o61Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("is_empty", valueOf);
        if (value != null) {
            hashMap.put("type_error", value);
        }
        o61Var.a.a("EnterPromoCodeCard.ActivateButtonTapped", hashMap, 1, new HashMap());
        tje.N(Jg(), null, null, new DiscountsAddPromoCodePresenter$activate$1(this, str, null), 3);
    }

    public final void Lg(DiscountsAddPromoCodeUiState$ButtonType discountsAddPromoCodeUiState$ButtonType) {
        int length = ((CharSequence) this.G.getValue()).length();
        qnh qnhVar = this.D;
        if (length == 0) {
            Mg(true);
            ((da0) qnhVar.a).r(new qu(9));
        }
        int i = fpj.a[discountsAddPromoCodeUiState$ButtonType.ordinal()];
        if (i == 1) {
            Kg();
            return;
        }
        xjg xjgVar = this.y;
        if (i == 2) {
            Ng();
            ((da0) qnhVar.a).r(new lhj(5));
            wlf0 wlf0Var = this.F;
            if (wlf0Var != null) {
                ((vpj) xjgVar.b).b(DiscountsAnalyticsScreen.INPUT, wlf0Var);
                return;
            } else {
                jst.e.u("Unexpected null promo code value");
                return;
            }
        }
        if (i != 3) {
            w511.b();
            return;
        }
        Ng();
        ((da0) qnhVar.a).r(new lhj(6));
        wlf0 wlf0Var2 = this.F;
        if (wlf0Var2 != null) {
            ((vpj) xjgVar.b).c(DiscountsAnalyticsScreen.INPUT, wlf0Var2);
        } else {
            jst.e.u("Unexpected null promo code value");
        }
    }

    public final void Mg(boolean z) {
        boolean z2 = this.I;
        xjg xjgVar = this.y;
        xjgVar.getClass();
        String str = z ? "back_button" : "cancel";
        o61 o61Var = (o61) xjgVar.c;
        String value = z2 ? ErrorType.NETWORK.getValue() : null;
        o61Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("close_reason", str);
        if (value != null) {
            hashMap.put("type_error", value);
        }
        o61Var.a.a("EnterPromoCodeCard.Closed", hashMap, 1, new HashMap());
    }

    public final void Ng() {
        tje.N(this.x, null, null, new DiscountsAddPromoCodePresenter$updatePromoCodes$1(this, null), 3);
    }
}
