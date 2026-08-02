package defpackage;

/* loaded from: classes13.dex */
public final class d5x implements f5x {
    public final Throwable a;

    public d5x(Throwable th) {
        this.a = th;
    }

    public final Throwable a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d5x) && this.a.equals(((d5x) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.s(new StringBuilder("Failure(error="), this.a, ')');
    }
}
