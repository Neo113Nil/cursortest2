package defpackage;

import android.os.Bundle;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.feature.card.api.CardSecondFactorHelper$Request;
import com.ybsdk.feature.card.api.CardSecondFactorHelper$SecondFactorResult;
import com.ybsdk.screens.registration.RegistrationFeature$Result;
import com.ybsdk.screens.registration.a;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationTarget;

/* loaded from: classes3.dex */
public final class mf8 implements qn8 {
    public final /* synthetic */ a a;

    public mf8(a aVar) {
        this.a = aVar;
    }

    public final CardSecondFactorHelper$SecondFactorResult a(Bundle bundle) {
        RegistrationFeature$Result registrationFeature$Result = (RegistrationFeature$Result) bundle.getParcelable(TarifficatorScenarioActivity.RESULT_KEY);
        if (jl40.l(registrationFeature$Result, RegistrationFeature$Result.Cancel.INSTANCE)) {
            return CardSecondFactorHelper$SecondFactorResult.Cancel.INSTANCE;
        }
        if (registrationFeature$Result instanceof RegistrationFeature$Result.VerificationToken) {
            return new CardSecondFactorHelper$SecondFactorResult.VerificationToken(((RegistrationFeature$Result.VerificationToken) registrationFeature$Result).getVerificationToken());
        }
        if (registrationFeature$Result == null) {
            return null;
        }
        w511.b();
        return null;
    }

    public final FragmentScreen b(String str, CardSecondFactorHelper$Request cardSecondFactorHelper$Request) {
        CodeConfirmationParams.HeaderText.UniversalText universalText = new CodeConfirmationParams.HeaderText.UniversalText(null, 1, null);
        String key = cardSecondFactorHelper$Request.getKey();
        CodeConfirmationTarget.YbAuthorization ybAuthorization = CodeConfirmationTarget.YbAuthorization.INSTANCE;
        return a.e(this.a, universalText, str, null, null, false, null, null, key, OpenScreenRequirement.WithBuid.INSTANCE, false, ybAuthorization, 1260);
    }
}
