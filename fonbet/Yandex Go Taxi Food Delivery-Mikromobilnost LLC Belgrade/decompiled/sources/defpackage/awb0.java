package defpackage;

import android.os.Bundle;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.feature.pin.api.SecondFactorHelper$SecondFactorResult;
import com.ybsdk.screens.registration.RegistrationFeature$Result;

/* loaded from: classes3.dex */
public final class awb0 implements eyp0 {
    public final SecondFactorHelper$SecondFactorResult a(Bundle bundle) {
        RegistrationFeature$Result registrationFeature$Result = (RegistrationFeature$Result) bundle.getParcelable(TarifficatorScenarioActivity.RESULT_KEY);
        if (jl40.l(registrationFeature$Result, RegistrationFeature$Result.Cancel.INSTANCE)) {
            return SecondFactorHelper$SecondFactorResult.Cancel.INSTANCE;
        }
        if (registrationFeature$Result instanceof RegistrationFeature$Result.VerificationToken) {
            return new SecondFactorHelper$SecondFactorResult.VerificationToken(((RegistrationFeature$Result.VerificationToken) registrationFeature$Result).getVerificationToken());
        }
        if (registrationFeature$Result == null) {
            return null;
        }
        w511.b();
        return null;
    }
}
