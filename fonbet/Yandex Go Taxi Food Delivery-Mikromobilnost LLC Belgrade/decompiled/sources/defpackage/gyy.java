package defpackage;

/* loaded from: classes8.dex */
public final class gyy implements iyy {
    public final Throwable a;

    public gyy(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gyy) && this.a.equals(((gyy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.s(new StringBuilder("Error(throwable="), this.a, ')');
    }
}
