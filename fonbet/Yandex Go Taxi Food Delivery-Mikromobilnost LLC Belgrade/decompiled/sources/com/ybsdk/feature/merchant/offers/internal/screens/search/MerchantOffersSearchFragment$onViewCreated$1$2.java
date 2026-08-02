package com.ybsdk.feature.merchant.offers.internal.screens.search;

import defpackage.gq10;
import defpackage.jq10;
import defpackage.sls;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class MerchantOffersSearchFragment$onViewCreated$1$2 extends FunctionReferenceImpl implements sls {
    public MerchantOffersSearchFragment$onViewCreated$1$2(uc5 uc5Var) {
        super(0, uc5Var, a.class, "onErrorViewButtonClick", "onErrorViewButtonClick()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        a aVar = (a) this.receiver;
        String str = ((gq10) aVar.X()).d;
        if (str == null || str.length() == 0) {
            str = null;
        }
        if (str != null) {
            aVar.c0(0L, str);
        } else {
            aVar.e0();
        }
        aVar.Z(jq10.a);
        return zy11.a;
    }
}
