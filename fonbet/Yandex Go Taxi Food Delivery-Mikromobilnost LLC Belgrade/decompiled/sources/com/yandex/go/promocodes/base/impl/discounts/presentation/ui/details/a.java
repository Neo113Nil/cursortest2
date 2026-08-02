package com.yandex.go.promocodes.base.impl.discounts.presentation.ui.details;

import defpackage.arj;
import defpackage.bys;
import defpackage.jrj;
import defpackage.l8x;
import defpackage.tje;
import defpackage.tse;
import defpackage.xqj;

/* loaded from: classes13.dex */
public final class a implements arj {
    public final /* synthetic */ DiscountsPromoCodeDetailsModalView a;

    public a(DiscountsPromoCodeDetailsModalView discountsPromoCodeDetailsModalView) {
        this.a = discountsPromoCodeDetailsModalView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        l8x l8xVar;
        tse tseVar;
        xqj binding;
        bys bysVar;
        bys bysVar2;
        jrj jrjVar = (jrj) obj;
        DiscountsPromoCodeDetailsModalView discountsPromoCodeDetailsModalView = this.a;
        l8xVar = discountsPromoCodeDetailsModalView.imageLoadCancellable;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        tseVar = discountsPromoCodeDetailsModalView.coroutineScope;
        discountsPromoCodeDetailsModalView.imageLoadCancellable = tje.N(tseVar, null, null, new DiscountsPromoCodeDetailsModalView$InnerMvpView$render$1(discountsPromoCodeDetailsModalView, jrjVar, null), 3);
        binding = discountsPromoCodeDetailsModalView.getBinding();
        binding.f.setTitle(jrjVar.a);
        bysVar = discountsPromoCodeDetailsModalView.infoAdapter;
        bysVar.submitList(kotlin.collections.a.m0(jrjVar.c, jrjVar.b), null);
        bysVar2 = discountsPromoCodeDetailsModalView.buttonsAdapter;
        bysVar2.submitList(jrjVar.e, null);
    }
}
