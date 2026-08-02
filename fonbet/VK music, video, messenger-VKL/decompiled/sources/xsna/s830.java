package xsna;

/* compiled from: MoreContentState.kt */
/* loaded from: classes16.dex */
public final class s830 {
    public final boolean a;

    public s830() {
        this(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s830) && this.a == ((s830) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("MoreContentState(isAvailable="), this.a, ')');
    }

    public s830(boolean z) {
        this.a = z;
    }
}
