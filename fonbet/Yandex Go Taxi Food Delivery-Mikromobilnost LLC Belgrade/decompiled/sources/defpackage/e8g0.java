package defpackage;

import android.os.Bundle;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.qr.payments.api.QrPaymentsSecondFactorScreenProvider$Request;
import com.ybsdk.feature.qr.payments.api.QrPaymentsSecondFactorScreenProvider$SecondFactorResult;
import com.ybsdk.rconfig.b;
import com.ybsdk.screens.registration.RegistrationFeature$Result;
import com.ybsdk.screens.registration.a;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams;

/* loaded from: classes3.dex */
public final class e8g0 implements qag0 {
    public final /* synthetic */ tw51 a;
    public final /* synthetic */ b b;

    public e8g0(tw51 tw51Var, b bVar) {
        this.a = tw51Var;
        this.b = bVar;
    }

    public final QrPaymentsSecondFactorScreenProvider$SecondFactorResult a(Bundle bundle) {
        RegistrationFeature$Result registrationFeature$Result = (RegistrationFeature$Result) bundle.getParcelable(TarifficatorScenarioActivity.RESULT_KEY);
        if (jl40.l(registrationFeature$Result, RegistrationFeature$Result.Cancel.INSTANCE)) {
            return QrPaymentsSecondFactorScreenProvider$SecondFactorResult.Cancel.INSTANCE;
        }
        if (registrationFeature$Result instanceof RegistrationFeature$Result.VerificationToken) {
            return new QrPaymentsSecondFactorScreenProvider$SecondFactorResult.VerificationToken(((RegistrationFeature$Result.VerificationToken) registrationFeature$Result).getVerificationToken());
        }
        if (registrationFeature$Result == null) {
            return null;
        }
        w511.b();
        return null;
    }

    public final FragmentScreen b(rbv rbvVar, Text.Empty empty, String str, QrPaymentsSecondFactorScreenProvider$Request qrPaymentsSecondFactorScreenProvider$Request) {
        Integer num;
        a aVar = (a) ((h9g) this.a).R.get();
        CodeConfirmationParams.HeaderText.TwoFAText twoFAText = new CodeConfirmationParams.HeaderText.TwoFAText(unr0.h(Text.Companion, qrPaymentsSecondFactorScreenProvider$Request == QrPaymentsSecondFactorScreenProvider$Request.PAYMENT ? dzh0.ybsdk_common_confirm_purchase_title : dzh0.ybsdk_sms_code_confirmation_enter_code_confirm_account_title));
        CodeConfirmationParams.HeaderImage resource = rbvVar instanceof nbv ? new CodeConfirmationParams.HeaderImage.Resource(((nbv) rbvVar).a) : rbvVar instanceof pbv ? new CodeConfirmationParams.HeaderImage.Url(((pbv) rbvVar).a) : null;
        String key = qrPaymentsSecondFactorScreenProvider$Request.getKey();
        int i = d8g0.a[qrPaymentsSecondFactorScreenProvider$Request.ordinal()];
        if (i != 1) {
            if (i != 2) {
                w511.b();
                return null;
            }
            Integer num2 = new Integer(dzh0.ybsdk_sms_code_confirmation_enter_code_confirm_account_subtitle);
            if (this.b.n().isEnabled()) {
                num = num2;
                return a.e(aVar, twoFAText, str, resource, empty, false, num, null, key, OpenScreenRequirement.WithBuid.INSTANCE, false, null, 3264);
            }
        }
        num = null;
        return a.e(aVar, twoFAText, str, resource, empty, false, num, null, key, OpenScreenRequirement.WithBuid.INSTANCE, false, null, 3264);
    }
}
