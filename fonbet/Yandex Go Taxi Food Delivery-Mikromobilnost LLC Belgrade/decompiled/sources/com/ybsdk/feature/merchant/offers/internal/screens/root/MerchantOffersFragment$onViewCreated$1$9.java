package com.ybsdk.feature.merchant.offers.internal.screens.root;

import com.ybsdk.core.utils.dto.common.FailDataException;
import defpackage.h791;
import defpackage.nq10;
import defpackage.sls;
import defpackage.uc5;
import defpackage.yo10;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class MerchantOffersFragment$onViewCreated$1$9 extends FunctionReferenceImpl implements sls {
    public MerchantOffersFragment$onViewCreated$1$9(uc5 uc5Var) {
        super(0, uc5Var, b.class, "onErrorSecondaryButtonClick", "onErrorSecondaryButtonClick()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        String supportUrl;
        b bVar = (b) this.receiver;
        Throwable th = ((nq10) bVar.X()).c;
        FailDataException failDataException = th instanceof FailDataException ? (FailDataException) th : null;
        if (failDataException != null && (supportUrl = failDataException.getSupportUrl()) != null) {
            h791.f(bVar.E, supportUrl, com.ybsdk.feature.webview.api.a.b(((yo10) bVar.F).a, supportUrl, null, null, 6));
        }
        return zy11.a;
    }
}
