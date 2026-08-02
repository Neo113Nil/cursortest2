package defpackage;

import android.content.Context;
import com.yandex.payment.sdk.core.data.ConsoleLoggingMode;
import com.yandex.payment.sdk.core.data.Merchant;
import com.yandex.payment.sdk.core.data.MetricaInitMode;
import com.yandex.payment.sdk.core.data.Payer;
import com.yandex.payment.sdk.core.data.PaymentSdkEnvironment;
import com.yandex.payment.sdk.model.data.AdditionalSettings;
import com.yandex.payment.sdk.model.data.PersonalInfoConfig;
import com.yandex.payment.sdk.model.data.PersonalInfoMode;
import com.yandex.payment.sdk.model.data.PersonalInfoVisibility;

/* loaded from: classes2.dex */
public final class a55 implements v7p {
    public final /* synthetic */ int a;
    public final w3i b;

    public /* synthetic */ a55(w3i w3iVar, int i) {
        this.a = i;
        this.b = w3iVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        String email;
        int i = this.a;
        w3i w3iVar = this.b;
        switch (i) {
            case 0:
                PaymentSdkEnvironment paymentSdkEnvironment = (PaymentSdkEnvironment) w3iVar.z;
                q5z.i(paymentSdkEnvironment);
                return paymentSdkEnvironment;
            case 1:
                AdditionalSettings additionalSettings = (AdditionalSettings) w3iVar.x;
                q5z.i(additionalSettings);
                return additionalSettings;
            case 2:
                Context context = (Context) w3iVar.b;
                q5z.i(context);
                return context;
            case 3:
                return egb1.a(((AdditionalSettings) w3iVar.x).getCardValidationConfig());
            case 4:
                ConsoleLoggingMode consoleLoggingMode = (ConsoleLoggingMode) w3iVar.A;
                q5z.i(consoleLoggingMode);
                return consoleLoggingMode;
            case 5:
                return (String) w3iVar.B;
            case 6:
                return new pcy((PaymentSdkEnvironment) w3iVar.z);
            case 7:
                Merchant merchant = (Merchant) w3iVar.w;
                q5z.i(merchant);
                return merchant;
            case 8:
                Payer payer = (Payer) w3iVar.c;
                q5z.i(payer);
                return payer;
            case 9:
                return new h2a0((Context) w3iVar.b, (PaymentSdkEnvironment) w3iVar.z, (ConsoleLoggingMode) w3iVar.A, MetricaInitMode.DO_NOT_INIT);
            default:
                b5b0 b5b0Var = PersonalInfoVisibility.Companion;
                Payer payer2 = (Payer) w3iVar.c;
                PersonalInfoConfig personalInfoConfig = ((AdditionalSettings) w3iVar.x).getPersonalInfoConfig();
                b5b0Var.getClass();
                return new PersonalInfoVisibility(personalInfoConfig.getMode() == PersonalInfoMode.SHOW || (personalInfoConfig.getMode() == PersonalInfoMode.SHOW_IF_NOT_AUTHORIZED && !payer2.isAuthorized()) || (personalInfoConfig.getMode() == PersonalInfoMode.SHOW_IF_HAS_NO_EMAIL && ((email = payer2.getEmail()) == null || email.length() == 0)), personalInfoConfig);
        }
    }
}
