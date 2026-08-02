package defpackage;

import androidx.biometric.BiometricFragment;
import androidx.biometric.BiometricViewModel;
import java.lang.ref.WeakReference;

/* loaded from: classes10.dex */
public final class px5 implements Runnable {
    public final /* synthetic */ int a;
    public final WeakReference b;

    public px5(BiometricViewModel biometricViewModel, int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = new WeakReference(biometricViewModel);
                break;
            default:
                this.b = new WeakReference(biometricViewModel);
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        WeakReference weakReference = this.b;
        switch (i) {
            case 0:
                if (weakReference.get() != null) {
                    ((BiometricFragment) weakReference.get()).showPromptForAuthentication();
                    break;
                }
                break;
            case 1:
                if (weakReference.get() != null) {
                    ((BiometricViewModel) weakReference.get()).G = false;
                    break;
                }
                break;
            default:
                if (weakReference.get() != null) {
                    ((BiometricViewModel) weakReference.get()).H = false;
                    break;
                }
                break;
        }
    }

    public px5(BiometricFragment biometricFragment) {
        this.a = 0;
        this.b = new WeakReference(biometricFragment);
    }
}
