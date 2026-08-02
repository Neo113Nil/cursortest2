package defpackage;

import android.os.Build;
import android.util.Log;
import androidx.biometric.BiometricFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;

/* loaded from: classes10.dex */
public final class ey5 {
    public FragmentManager a;

    public final void a(cy5 cy5Var, ay5 ay5Var) {
        int i = cy5Var.d;
        if (i == 0) {
            i = 15;
        }
        if ((i & 255) == 255) {
            ny61.g("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
            return;
        }
        if (Build.VERSION.SDK_INT < 30 && p1b1.d(i)) {
            ny61.g("Crypto-based authentication is not supported for device credential prior to API 30.");
            return;
        }
        FragmentManager fragmentManager = this.a;
        if (fragmentManager == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        if (fragmentManager.S()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
            return;
        }
        FragmentManager fragmentManager2 = this.a;
        BiometricFragment biometricFragment = (BiometricFragment) fragmentManager2.F("androidx.biometric.BiometricFragment");
        if (biometricFragment == null) {
            biometricFragment = BiometricFragment.newInstance();
            a aVar = new a(fragmentManager2);
            aVar.f(0, biometricFragment, "androidx.biometric.BiometricFragment", 1);
            aVar.l(true, true);
            fragmentManager2.C();
        }
        biometricFragment.authenticate(cy5Var, ay5Var);
    }

    public final void b() {
        FragmentManager fragmentManager = this.a;
        if (fragmentManager == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        BiometricFragment biometricFragment = (BiometricFragment) fragmentManager.F("androidx.biometric.BiometricFragment");
        if (biometricFragment == null) {
            Log.e("BiometricPromptCompat", "Unable to cancel authentication. BiometricFragment not found.");
        } else {
            biometricFragment.cancelAuthentication(3);
        }
    }
}
