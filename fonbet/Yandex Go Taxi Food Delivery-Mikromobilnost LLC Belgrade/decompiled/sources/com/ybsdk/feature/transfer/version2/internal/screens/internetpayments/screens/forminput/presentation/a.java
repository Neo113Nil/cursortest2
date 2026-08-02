package com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.forminput.presentation;

import android.os.Bundle;
import com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.forminput.presentation.InternetPaymentFormInputResult;
import defpackage.uj01;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;

/* loaded from: classes3.dex */
public final class a implements wls {
    public final uj01 a;

    public a(uj01 uj01Var) {
        this.a = uj01Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        InternetPaymentFormInputResult.Companion.getClass();
        InternetPaymentFormInputResult internetPaymentFormInputResult = (InternetPaymentFormInputResult) ((Bundle) obj2).getParcelable("InternetPaymentFormInputResult");
        if (internetPaymentFormInputResult instanceof InternetPaymentFormInputResult.Success) {
            InternetPaymentFormInputResult.Success success = (InternetPaymentFormInputResult.Success) internetPaymentFormInputResult;
            this.a.invoke(success.getProvider(), success.getAccountNumber());
        } else if (internetPaymentFormInputResult != null) {
            w511.b();
            return null;
        }
        return zy11.a;
    }
}
