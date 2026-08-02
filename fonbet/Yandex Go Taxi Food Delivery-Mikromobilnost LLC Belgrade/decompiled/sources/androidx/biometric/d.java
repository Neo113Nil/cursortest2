package androidx.biometric;

import defpackage.ny5;
import defpackage.zx5;

/* loaded from: classes10.dex */
public final class d implements Runnable {
    public final /* synthetic */ zx5 a;
    public final /* synthetic */ BiometricFragment b;

    public d(BiometricFragment biometricFragment, zx5 zx5Var) {
        this.b = biometricFragment;
        this.a = zx5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BiometricViewModel biometricViewModel = this.b.mViewModel;
        if (biometricViewModel.c == null) {
            biometricViewModel.c = new ny5();
        }
        biometricViewModel.c.c(this.a);
    }
}
