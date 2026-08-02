package defpackage;

/* loaded from: classes4.dex */
public final class j9i0 extends l9i0 {
    public final Exception a;

    public j9i0(Exception exc) {
        this.a = exc;
    }

    public final Exception a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j9i0) && jl40.l(this.a, ((j9i0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "log-list.json failed to load with ".concat(kca1.g(this.a));
    }
}
