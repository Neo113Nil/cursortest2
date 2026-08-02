package xsna;

/* compiled from: DiSettings.kt */
/* loaded from: classes.dex */
public final class p8m {
    public final boolean a;

    public p8m() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p8m) && this.a == ((p8m) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("DiSettings(allowStubs="), this.a, ')');
    }

    public p8m(int i) {
        this.a = true;
    }
}
