package defpackage;

import android.content.Context;
import com.yandex.payment.sdk.core.data.ConsoleLoggingMode;
import com.yandex.payment.sdk.core.data.Merchant;
import com.yandex.payment.sdk.core.data.Payer;
import com.yandex.payment.sdk.core.data.PaymentMethodsFilter;
import com.yandex.payment.sdk.core.data.PaymentSdkEnvironment;
import com.yandex.payment.sdk.model.data.AdditionalSettings;
import com.yandex.payment.sdk.model.data.ResultScreenClosing;
import ru.yandex.tankerapp.models.dto.PaymentKitConfiguration;
import ru.yandex.tankerapp.models.dto.PaymentKitResultScreenClosing;
import ru.yandex.tankerapp.models.dto.PaymentKitSettings;

/* loaded from: classes5.dex */
public final class e3a0 {
    public static final e3a0 a = new e3a0();

    public static ksi0 a(Context context, PaymentKitConfiguration paymentKitConfiguration) {
        PaymentSdkEnvironment paymentSdkEnvironment;
        long j;
        a0a0 a0a0Var = new a0a0();
        a0a0Var.a = context.getApplicationContext();
        int i = l3a0.a[paymentKitConfiguration.getPaymentKitEnvironment().ordinal()];
        if (i == 1) {
            paymentSdkEnvironment = PaymentSdkEnvironment.PRODUCTION;
        } else if (i == 2) {
            paymentSdkEnvironment = PaymentSdkEnvironment.TESTING;
        } else if (i == 3) {
            paymentSdkEnvironment = PaymentSdkEnvironment.MIMINOTESTING;
        } else if (i == 4) {
            paymentSdkEnvironment = PaymentSdkEnvironment.LOCALTESTING;
        } else {
            if (i != 5) {
                w511.b();
                return null;
            }
            paymentSdkEnvironment = PaymentSdkEnvironment.CROWDTESTING;
        }
        a0a0Var.b = paymentSdkEnvironment;
        a0a0Var.c = ConsoleLoggingMode.ENABLED;
        c0a0 a2 = a0a0Var.a();
        Merchant merchant = new Merchant(paymentKitConfiguration.getPaymentKitSettings().getMerchant().getServiceToken());
        PaymentKitSettings.Payer payer = paymentKitConfiguration.getPaymentKitSettings().getPayer();
        Payer payer2 = new Payer(payer.getOauthToken(), payer.getEmail(), payer.getUid(), null, null, null);
        b3a0 b3a0Var = new b3a0(jl40.l(paymentKitConfiguration.getIsDarkTheme(), Boolean.TRUE));
        AdditionalSettings.a aVar = new AdditionalSettings.a();
        String currency = paymentKitConfiguration.getCurrency();
        if (currency != null) {
            if (evu0.J(currency)) {
                currency = null;
            }
            if (currency != null) {
                aVar.i = currency;
            }
        }
        Integer regionId = paymentKitConfiguration.getRegionId();
        if (regionId != null) {
            aVar.k = regionId.intValue();
        }
        aVar.h = true;
        PaymentKitResultScreenClosing paymentKitResultsScreenClosing = paymentKitConfiguration.getPaymentKitResultsScreenClosing();
        if (paymentKitResultsScreenClosing != null) {
            int i2 = c3a0.a[paymentKitResultsScreenClosing.ordinal()];
            if (i2 == 1) {
                j = 0;
            } else if (i2 == 2) {
                j = 2000;
            } else {
                if (i2 != 3) {
                    w511.b();
                    return null;
                }
                j = -1;
            }
            aVar.e = new ResultScreenClosing(false, j, 1, null);
        }
        Boolean isSBPAvailable = paymentKitConfiguration.getPaymentKitSettings().getIsSBPAvailable();
        boolean booleanValue = isSBPAvailable != null ? isSBPAvailable.booleanValue() : false;
        Boolean isNewSBPTokenAvailable = paymentKitConfiguration.getPaymentKitSettings().getIsNewSBPTokenAvailable();
        aVar.b = new PaymentMethodsFilter(false, false, booleanValue, false, isNewSBPTokenAvailable != null ? isNewSBPTokenAvailable.booleanValue() : false, false, 43, null);
        return a2.a(payer2, merchant, aVar.a(), b3a0Var, null);
    }
}
