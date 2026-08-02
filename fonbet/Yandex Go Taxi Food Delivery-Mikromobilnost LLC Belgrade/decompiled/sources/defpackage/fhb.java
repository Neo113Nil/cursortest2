package defpackage;

import com.ybsdk.feature.pin.internal.screens.checkpin.CheckPinFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class fhb implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ CheckPinFragment b;

    public /* synthetic */ fhb(CheckPinFragment checkPinFragment, int i) {
        this.a = i;
        this.b = checkPinFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 cancelCallback_delegate$lambda$5$lambda$4;
        tls successCallback_delegate$lambda$1;
        tls errorCallback_delegate$lambda$3;
        sls cancelCallback_delegate$lambda$5;
        ey5 biometricPrompt_delegate$lambda$6;
        zy11 onViewCreated$lambda$13$lambda$9;
        zy11 onViewCreated$lambda$13$lambda$10;
        int i = this.a;
        CheckPinFragment checkPinFragment = this.b;
        switch (i) {
            case 0:
                cancelCallback_delegate$lambda$5$lambda$4 = CheckPinFragment.cancelCallback_delegate$lambda$5$lambda$4(checkPinFragment);
                return cancelCallback_delegate$lambda$5$lambda$4;
            case 1:
                successCallback_delegate$lambda$1 = CheckPinFragment.successCallback_delegate$lambda$1(checkPinFragment);
                return successCallback_delegate$lambda$1;
            case 2:
                errorCallback_delegate$lambda$3 = CheckPinFragment.errorCallback_delegate$lambda$3(checkPinFragment);
                return errorCallback_delegate$lambda$3;
            case 3:
                cancelCallback_delegate$lambda$5 = CheckPinFragment.cancelCallback_delegate$lambda$5(checkPinFragment);
                return cancelCallback_delegate$lambda$5;
            case 4:
                biometricPrompt_delegate$lambda$6 = CheckPinFragment.biometricPrompt_delegate$lambda$6(checkPinFragment);
                return biometricPrompt_delegate$lambda$6;
            case 5:
                onViewCreated$lambda$13$lambda$9 = CheckPinFragment.onViewCreated$lambda$13$lambda$9(checkPinFragment);
                return onViewCreated$lambda$13$lambda$9;
            default:
                onViewCreated$lambda$13$lambda$10 = CheckPinFragment.onViewCreated$lambda$13$lambda$10(checkPinFragment);
                return onViewCreated$lambda$13$lambda$10;
        }
    }
}
