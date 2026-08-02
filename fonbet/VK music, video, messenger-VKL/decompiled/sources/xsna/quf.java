package xsna;

/* compiled from: ClipsWrapperUiVisibility.kt */
/* loaded from: classes17.dex */
public final class quf {
    public final boolean a;

    public quf() {
        this(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof quf) && this.a == ((quf) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("ClipsWrapperUiVisibility(isVisible="), this.a, ')');
    }

    public quf(boolean z) {
        this.a = z;
    }
}
