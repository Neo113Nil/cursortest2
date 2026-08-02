package com.yandex.plus.pay.adapter.internal;

import com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import defpackage.gqd;
import defpackage.mqd;
import defpackage.w511;

/* loaded from: classes2.dex */
public abstract class c {
    public static final PlusPaySdkAdapter$CompositeOffer.LegalInfo.Item a(PlusPayLegalInfo.Item item) {
        if (item instanceof PlusPayLegalInfo.Item.Link) {
            return new LegalInfoItemLinkImpl((PlusPayLegalInfo.Item.Link) item);
        }
        if (item instanceof PlusPayLegalInfo.Item.Text) {
            return new LegalInfoItemTextImpl((PlusPayLegalInfo.Item.Text) item);
        }
        w511.b();
        return null;
    }

    public static final PlusPaySdkAdapter$CompositeOffer.Plan b(PlusPayCompositeOffers.Offer.Plan plan) {
        if (plan instanceof PlusPayCompositeOffers.Offer.Plan.Intro) {
            return new IntroPlanImpl((PlusPayCompositeOffers.Offer.Plan.Intro) plan);
        }
        if (plan instanceof PlusPayCompositeOffers.Offer.Plan.IntroUntil) {
            return new IntroUntilPlanImpl((PlusPayCompositeOffers.Offer.Plan.IntroUntil) plan);
        }
        if (plan instanceof PlusPayCompositeOffers.Offer.Plan.Trial) {
            return new TrialPlanImpl((PlusPayCompositeOffers.Offer.Plan.Trial) plan);
        }
        if (plan instanceof PlusPayCompositeOffers.Offer.Plan.TrialUntil) {
            return new TrialUntilPlanImpl((PlusPayCompositeOffers.Offer.Plan.TrialUntil) plan);
        }
        w511.b();
        return null;
    }

    public static final PlusPaySdkAdapter$CompositeOffer.Vendor c(PlusPayCompositeOffers.Offer.Vendor vendor) {
        int i = gqd.b[vendor.ordinal()];
        if (i == 1) {
            return PlusPaySdkAdapter$CompositeOffer.Vendor.GOOGLE_PLAY;
        }
        if (i == 2) {
            return PlusPaySdkAdapter$CompositeOffer.Vendor.NATIVE;
        }
        if (i == 3) {
            return PlusPaySdkAdapter$CompositeOffer.Vendor.UNKNOWN;
        }
        w511.b();
        return null;
    }

    public static final mqd d(PlusPayCompositeOffers plusPayCompositeOffers) {
        return new mqd(plusPayCompositeOffers);
    }
}
