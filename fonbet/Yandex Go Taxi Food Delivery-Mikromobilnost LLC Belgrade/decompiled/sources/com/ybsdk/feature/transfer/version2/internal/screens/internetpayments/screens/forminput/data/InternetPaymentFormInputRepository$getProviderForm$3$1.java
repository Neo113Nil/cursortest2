package com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.forminput.data;

import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.PaymentProviderEntity;
import com.ybsdk.feature.transfer.version2.internal.data.dto.FormFieldValidationDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.internetpayments.GetInternetProviderFormResponse;
import com.ybsdk.feature.transfer.version2.internal.network.dto.internetpayments.InternetProviderInputFieldDto;
import defpackage.cuw;
import defpackage.m4m0;
import defpackage.pnb1;
import defpackage.q4s;
import defpackage.wls;
import defpackage.wsw;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.text.Regex;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class InternetPaymentFormInputRepository$getProviderForm$3$1 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        GetInternetProviderFormResponse getInternetProviderFormResponse = (GetInternetProviderFormResponse) obj;
        ((a) this.receiver).getClass();
        PaymentProviderEntity c = pnb1.c(getInternetProviderFormResponse.getProvider());
        InternetProviderInputFieldDto inputField = getInternetProviderFormResponse.getInputField();
        String label = inputField.getLabel();
        FormFieldValidationDto fieldValidation = inputField.getFieldValidation();
        return new wsw(c, new cuw(label, fieldValidation != null ? new q4s(new Regex(fieldValidation.getRegex()), fieldValidation.getErrorHint()) : null, inputField.getComment()), m4m0.k(getInternetProviderFormResponse.getHeader()));
    }
}
