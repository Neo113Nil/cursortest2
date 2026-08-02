package defpackage;

import com.ybsdk.feature.pin.internal.screens.checkpin.CheckPinFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class ghb implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ CheckPinFragment b;

    public /* synthetic */ ghb(CheckPinFragment checkPinFragment, int i) {
        this.a = i;
        this.b = checkPinFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 successCallback_delegate$lambda$1$lambda$0;
        zy11 errorCallback_delegate$lambda$3$lambda$2;
        zy11 showBiometricPrompt$lambda$19;
        zy11 onViewCreated$lambda$13$lambda$8;
        zy11 onViewCreated$lambda$13$lambda$12;
        int i = this.a;
        CheckPinFragment checkPinFragment = this.b;
        switch (i) {
            case 0:
                successCallback_delegate$lambda$1$lambda$0 = CheckPinFragment.successCallback_delegate$lambda$1$lambda$0(checkPinFragment, (ay5) obj);
                return successCallback_delegate$lambda$1$lambda$0;
            case 1:
                errorCallback_delegate$lambda$3$lambda$2 = CheckPinFragment.errorCallback_delegate$lambda$3$lambda$2(checkPinFragment, ((Integer) obj).intValue());
                return errorCallback_delegate$lambda$3$lambda$2;
            case 2:
                showBiometricPrompt$lambda$19 = CheckPinFragment.showBiometricPrompt$lambda$19(checkPinFragment, (Throwable) obj);
                return showBiometricPrompt$lambda$19;
            case 3:
                onViewCreated$lambda$13$lambda$8 = CheckPinFragment.onViewCreated$lambda$13$lambda$8(checkPinFragment, ((Character) obj).charValue());
                return onViewCreated$lambda$13$lambda$8;
            default:
                onViewCreated$lambda$13$lambda$12 = CheckPinFragment.onViewCreated$lambda$13$lambda$12(checkPinFragment, (String) obj);
                return onViewCreated$lambda$13$lambda$12;
        }
    }
}
