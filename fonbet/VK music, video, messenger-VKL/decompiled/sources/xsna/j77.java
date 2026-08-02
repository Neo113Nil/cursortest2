package xsna;

/* compiled from: BiometricsLockPinSideEffect.kt */
/* loaded from: classes15.dex */
public final class j77 implements com.vk.biometrics.lock.impl.presentation.base.mvi.pin.g {
    public final wla0 a;

    public j77(wla0 wla0Var) {
        this.a = wla0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j77) && epx.f(this.a, ((j77) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Update(backoff=" + this.a + ')';
    }
}
