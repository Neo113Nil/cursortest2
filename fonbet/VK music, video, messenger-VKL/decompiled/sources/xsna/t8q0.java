package xsna;

/* compiled from: UpdateOnResume.kt */
/* loaded from: classes5.dex */
public final class t8q0 {
    public final boolean a;

    public t8q0() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t8q0) && this.a == ((t8q0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("UpdateOnResume(updateOnlyPostsCount="), this.a, ')');
    }

    public t8q0(boolean z) {
        this.a = z;
    }
}
