package com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.selectprovider.presentation;

import android.os.Bundle;
import com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.selectprovider.presentation.InternetPaymentSelectProviderResult;
import defpackage.w511;
import defpackage.wls;
import defpackage.zsw;
import defpackage.zy11;

/* loaded from: classes3.dex */
public final class a implements wls {
    public final zsw a;

    public a(zsw zswVar) {
        this.a = zswVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        InternetPaymentSelectProviderResult.Companion.getClass();
        InternetPaymentSelectProviderResult internetPaymentSelectProviderResult = (InternetPaymentSelectProviderResult) ((Bundle) obj2).getParcelable("InternetPaymentSelectProviderResult");
        if (internetPaymentSelectProviderResult != null) {
            if (!(internetPaymentSelectProviderResult instanceof InternetPaymentSelectProviderResult.Success)) {
                w511.b();
                return null;
            }
            this.a.invoke(((InternetPaymentSelectProviderResult.Success) internetPaymentSelectProviderResult).getProviderId());
        }
        return zy11.a;
    }
}
