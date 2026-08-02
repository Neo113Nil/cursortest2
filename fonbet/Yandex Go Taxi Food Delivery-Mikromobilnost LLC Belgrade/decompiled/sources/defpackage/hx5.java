package defpackage;

import com.ybsdk.feature.pin.internal.screens.biometry.BiometricFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class hx5 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ BiometricFragment b;

    public /* synthetic */ hx5(BiometricFragment biometricFragment, int i) {
        this.a = i;
        this.b = biometricFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        tls successCallback_delegate$lambda$3;
        ey5 biometricPrompt_delegate$lambda$6;
        zy11 biometricPrompt_delegate$lambda$6$lambda$4;
        int i = this.a;
        BiometricFragment biometricFragment = this.b;
        switch (i) {
            case 0:
                successCallback_delegate$lambda$3 = BiometricFragment.successCallback_delegate$lambda$3(biometricFragment);
                return successCallback_delegate$lambda$3;
            case 1:
                biometricPrompt_delegate$lambda$6 = BiometricFragment.biometricPrompt_delegate$lambda$6(biometricFragment);
                return biometricPrompt_delegate$lambda$6;
            default:
                biometricPrompt_delegate$lambda$6$lambda$4 = BiometricFragment.biometricPrompt_delegate$lambda$6$lambda$4(biometricFragment);
                return biometricPrompt_delegate$lambda$6$lambda$4;
        }
    }
}
