package com.yandex.plus.acquisition.sdk.pay.impl.analytics;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionPaymentAnalytics$Params;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.bvf0;
import defpackage.cvw;
import defpackage.d0d0;
import defpackage.ike;
import defpackage.jl40;
import defpackage.jse;
import defpackage.kzs0;
import defpackage.lzs0;
import defpackage.ms90;
import defpackage.tje;
import defpackage.v7d0;
import defpackage.zt90;

/* loaded from: classes2.dex */
public final class a implements d0d0 {
    public final v7d0 a;
    public final ms90 b;
    public final zt90 c;
    public final kzs0 d;
    public final ike e;

    public a(jse jseVar, v7d0 v7d0Var, ms90 ms90Var, zt90 zt90Var, kzs0 kzs0Var) {
        this.a = v7d0Var;
        this.b = ms90Var;
        this.c = zt90Var;
        this.d = kzs0Var;
        this.e = bvf0.a(cvw.U(jl40.a(), jseVar));
    }

    public final void a(PlusAcquisitionSmartOffer plusAcquisitionSmartOffer, PlusAcquisitionPaymentAnalytics$Params plusAcquisitionPaymentAnalytics$Params) {
        PlusPayCompositeOffers.Offer a = ((lzs0) this.d).a(plusAcquisitionSmartOffer);
        if (a != null) {
            tje.N(this.e, null, null, new PaymentAnalytics$sendSmartOfferClicked$1$1(this, a, plusAcquisitionSmartOffer, plusAcquisitionPaymentAnalytics$Params, null), 3);
        }
    }

    public final void b(PlusAcquisitionSmartOffer plusAcquisitionSmartOffer, PlusAcquisitionPaymentAnalytics$Params plusAcquisitionPaymentAnalytics$Params) {
        PlusPayCompositeOffers.Offer a = ((lzs0) this.d).a(plusAcquisitionSmartOffer);
        if (a != null) {
            tje.N(this.e, null, null, new PaymentAnalytics$sendSmartOfferShown$1$1(this, a, plusAcquisitionSmartOffer, plusAcquisitionPaymentAnalytics$Params, null), 3);
        }
    }
}
