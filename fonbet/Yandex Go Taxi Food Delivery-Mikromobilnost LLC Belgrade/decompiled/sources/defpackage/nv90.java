package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.yandex.payment.sdk.core.data.Merchant;
import com.yandex.payment.sdk.core.data.Payer;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.core.data.PaymentSdkEnvironment;
import com.yandex.payment.sdk.core.data.PaymentToken;
import com.yandex.payment.sdk.model.data.AdditionalSettings;
import com.yandex.payment.sdk.transportcards.ui.TransportCardsActivity;
import com.yandex.payment.sdk.ui.BaseActivity;
import com.yandex.payment.sdk.ui.DefaultTheme;
import com.yandex.payment.sdk.ui.payment.PaymentActivity;

/* loaded from: classes2.dex */
public final class nv90 extends x40 {
    @Override // defpackage.x40
    public final Intent a(Context context, Object obj) {
        Bundle bundle = (Bundle) obj;
        PaymentSdkEnvironment paymentSdkEnvironment = bundle != null ? (PaymentSdkEnvironment) bundle.getParcelable(BaseActivity.EXTRA_ENVIRONMENT) : null;
        Payer payer = bundle != null ? (Payer) bundle.getParcelable(BaseActivity.EXTRA_PAYER_DATA) : null;
        AdditionalSettings additionalSettings = bundle != null ? (AdditionalSettings) bundle.getParcelable(BaseActivity.ADDITIONAL_SETTINGS) : null;
        PaymentToken paymentToken = bundle != null ? (PaymentToken) bundle.getParcelable(BaseActivity.EXTRA_PAYMENT_TOKEN) : null;
        PaymentMethod paymentMethod = bundle != null ? (PaymentMethod) bundle.getParcelable(BaseActivity.EXTRA_SELECTED_METHOD) : null;
        Merchant merchant = bundle != null ? (Merchant) bundle.getParcelable(BaseActivity.EXTRA_MERCHANT_DATA) : null;
        if (paymentSdkEnvironment == null || payer == null || additionalSettings == null || paymentToken == null || paymentMethod == null || merchant == null) {
            return new Intent();
        }
        a0a0 a0a0Var = new a0a0();
        a0a0Var.a = context.getApplicationContext();
        a0a0Var.b = paymentSdkEnvironment;
        Intent a = a0a0Var.a().a(payer, merchant, additionalSettings, kpa1.d(context) ? DefaultTheme.LIGHT : DefaultTheme.DARK, null).a(false, PaymentActivity.class);
        a.putExtra(BaseActivity.EXTRA_PAYMENT_TOKEN, paymentToken);
        a.putExtra(BaseActivity.EXTRA_SELECTED_METHOD, paymentMethod);
        a.putExtra(TransportCardsActivity.EXTRA_IS_TRANSPORT_CARDS_FLOW, true);
        return a;
    }

    @Override // defpackage.x40
    public final Object c(int i, Intent intent) {
        return new ov90(i, intent);
    }
}
