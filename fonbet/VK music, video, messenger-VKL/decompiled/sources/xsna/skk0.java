package xsna;

/* compiled from: SpinnerViewState.kt */
/* loaded from: classes7.dex */
public final class skk0 {
    public final boolean a;

    public skk0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof skk0) && this.a == ((skk0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("SpinnerViewState(isCancelable="), this.a, ')');
    }
}
