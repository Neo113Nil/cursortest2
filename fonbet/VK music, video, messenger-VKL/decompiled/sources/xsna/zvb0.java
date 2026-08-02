package xsna;

/* compiled from: BlockInput.kt */
/* loaded from: classes17.dex */
public final class zvb0 {
    public final kf7 a;

    public zvb0(kf7 kf7Var) {
        this.a = kf7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zvb0) && epx.f(this.a, ((zvb0) obj).a);
    }

    public final int hashCode() {
        kf7 kf7Var = this.a;
        if (kf7Var == null) {
            return 0;
        }
        return kf7Var.hashCode();
    }

    public final String toString() {
        return "PopResult(focusedBlock=" + this.a + ')';
    }
}
