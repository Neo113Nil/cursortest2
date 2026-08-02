package xsna;

/* compiled from: ScreenSpinnerMappingData.kt */
/* loaded from: classes17.dex */
public final class tch0 {
    public final boolean a;
    public final ioa0 b;

    public tch0(boolean z, ioa0 ioa0Var) {
        this.a = z;
        this.b = ioa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tch0)) {
            return false;
        }
        tch0 tch0Var = (tch0) obj;
        return this.a == tch0Var.a && epx.f(this.b, tch0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ScreenSpinnerMappingData(fullVideoShowLoading=" + this.a + ", pinnedChangeSpinnerState=" + this.b + ')';
    }
}
