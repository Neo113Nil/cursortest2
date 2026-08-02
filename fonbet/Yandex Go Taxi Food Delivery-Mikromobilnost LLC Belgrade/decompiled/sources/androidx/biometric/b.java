package androidx.biometric;

import defpackage.ny5;

/* loaded from: classes10.dex */
public final class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BiometricFragment b;

    public /* synthetic */ b(BiometricFragment biometricFragment, int i) {
        this.a = i;
        this.b = biometricFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        BiometricFragment biometricFragment = this.b;
        switch (i) {
            case 0:
                BiometricViewModel biometricViewModel = biometricFragment.mViewModel;
                if (biometricViewModel.c == null) {
                    biometricViewModel.c = new ny5();
                }
                biometricViewModel.c.b();
                break;
            default:
                biometricFragment.mViewModel.N = false;
                break;
        }
    }
}
