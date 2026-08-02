package androidx.biometric;

import defpackage.ny5;

/* loaded from: classes10.dex */
public final class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CharSequence b;
    public final /* synthetic */ BiometricFragment c;

    public a(BiometricFragment biometricFragment, int i, CharSequence charSequence) {
        this.c = biometricFragment;
        this.a = i;
        this.b = charSequence;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BiometricViewModel biometricViewModel = this.c.mViewModel;
        if (biometricViewModel.c == null) {
            biometricViewModel.c = new ny5();
        }
        biometricViewModel.c.a(this.a, this.b);
    }
}
