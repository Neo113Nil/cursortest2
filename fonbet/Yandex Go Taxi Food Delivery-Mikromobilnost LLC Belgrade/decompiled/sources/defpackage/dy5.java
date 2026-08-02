package defpackage;

import androidx.biometric.BiometricViewModel;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.w;
import java.lang.ref.WeakReference;

/* loaded from: classes10.dex */
public final class dy5 implements oey {
    public final WeakReference a;

    public dy5(BiometricViewModel biometricViewModel) {
        this.a = new WeakReference(biometricViewModel);
    }

    @w(Lifecycle.Event.ON_DESTROY)
    public void resetCallback() {
        WeakReference weakReference = this.a;
        if (weakReference.get() != null) {
            ((BiometricViewModel) weakReference.get()).c = null;
        }
    }
}
