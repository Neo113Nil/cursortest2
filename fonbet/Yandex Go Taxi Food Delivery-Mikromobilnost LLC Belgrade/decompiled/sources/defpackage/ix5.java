package defpackage;

import com.ybsdk.feature.pin.internal.screens.biometry.BiometricFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class ix5 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ BiometricFragment b;

    public /* synthetic */ ix5(BiometricFragment biometricFragment, int i) {
        this.a = i;
        this.b = biometricFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 showBiometricPrompt$lambda$9;
        zy11 successCallback_delegate$lambda$3$lambda$2;
        zy11 biometricPrompt_delegate$lambda$6$lambda$5;
        int i = this.a;
        BiometricFragment biometricFragment = this.b;
        switch (i) {
            case 0:
                showBiometricPrompt$lambda$9 = BiometricFragment.showBiometricPrompt$lambda$9(biometricFragment, (Throwable) obj);
                return showBiometricPrompt$lambda$9;
            case 1:
                successCallback_delegate$lambda$3$lambda$2 = BiometricFragment.successCallback_delegate$lambda$3$lambda$2(biometricFragment, (ay5) obj);
                return successCallback_delegate$lambda$3$lambda$2;
            default:
                biometricPrompt_delegate$lambda$6$lambda$5 = BiometricFragment.biometricPrompt_delegate$lambda$6$lambda$5(biometricFragment, ((Integer) obj).intValue());
                return biometricPrompt_delegate$lambda$6$lambda$5;
        }
    }
}
