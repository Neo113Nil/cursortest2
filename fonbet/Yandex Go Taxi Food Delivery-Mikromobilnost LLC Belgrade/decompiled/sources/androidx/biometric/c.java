package androidx.biometric;

import defpackage.dy40;
import defpackage.gx5;
import defpackage.pq60;
import defpackage.zx5;

/* loaded from: classes10.dex */
public final class c implements pq60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BiometricFragment b;

    public /* synthetic */ c(BiometricFragment biometricFragment, int i) {
        this.a = i;
        this.b = biometricFragment;
    }

    @Override // defpackage.pq60
    public final void a(Object obj) {
        int i = this.a;
        BiometricFragment biometricFragment = this.b;
        switch (i) {
            case 0:
                zx5 zx5Var = (zx5) obj;
                if (zx5Var != null) {
                    biometricFragment.onAuthenticationSucceeded(zx5Var);
                    BiometricViewModel biometricViewModel = biometricFragment.mViewModel;
                    if (biometricViewModel.I == null) {
                        biometricViewModel.I = new dy40();
                    }
                    BiometricViewModel.a0(biometricViewModel.I, null);
                    break;
                }
                break;
            case 1:
                gx5 gx5Var = (gx5) obj;
                if (gx5Var != null) {
                    biometricFragment.onAuthenticationError(gx5Var.a, gx5Var.b);
                    biometricFragment.mViewModel.W(null);
                    break;
                }
                break;
            case 2:
                CharSequence charSequence = (CharSequence) obj;
                if (charSequence != null) {
                    biometricFragment.onAuthenticationHelp(charSequence);
                    biometricFragment.mViewModel.W(null);
                    break;
                }
                break;
            case 3:
                if (((Boolean) obj).booleanValue()) {
                    biometricFragment.onAuthenticationFailed();
                    BiometricViewModel biometricViewModel2 = biometricFragment.mViewModel;
                    if (biometricViewModel2.L == null) {
                        biometricViewModel2.L = new dy40();
                    }
                    BiometricViewModel.a0(biometricViewModel2.L, Boolean.FALSE);
                    break;
                }
                break;
            case 4:
                if (((Boolean) obj).booleanValue()) {
                    if (biometricFragment.isManagingDeviceCredentialButton()) {
                        biometricFragment.onDeviceCredentialButtonPressed();
                    } else {
                        biometricFragment.onCancelButtonPressed();
                    }
                    biometricFragment.mViewModel.Z(false);
                    break;
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    biometricFragment.cancelAuthentication(1);
                    biometricFragment.dismiss();
                    BiometricViewModel biometricViewModel3 = biometricFragment.mViewModel;
                    if (biometricViewModel3.O == null) {
                        biometricViewModel3.O = new dy40();
                    }
                    BiometricViewModel.a0(biometricViewModel3.O, Boolean.FALSE);
                    break;
                }
                break;
        }
    }
}
