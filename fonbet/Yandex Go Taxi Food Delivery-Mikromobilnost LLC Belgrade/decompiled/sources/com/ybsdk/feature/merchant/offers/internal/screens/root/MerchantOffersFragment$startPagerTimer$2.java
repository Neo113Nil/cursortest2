package com.ybsdk.feature.merchant.offers.internal.screens.root;

import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class MerchantOffersFragment$startPagerTimer$2 extends FunctionReferenceImpl implements sls {
    public MerchantOffersFragment$startPagerTimer$2(MerchantOffersFragment merchantOffersFragment) {
        super(0, merchantOffersFragment, MerchantOffersFragment.class, "onProgressBarFinished", "onProgressBarFinished()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        ((MerchantOffersFragment) this.receiver).onProgressBarFinished();
        return zy11.a;
    }
}
