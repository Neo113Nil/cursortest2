package xsna;

/* compiled from: PackageReference.kt */
/* loaded from: classes8.dex */
public final class b890 implements pfc {
    public final Class<?> b;

    public b890(Class cls) {
        this.b = cls;
    }

    @Override // xsna.pfc
    public final Class<?> a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b890) {
            return epx.f(this.b, ((b890) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString() + " (Kotlin reflection is not available)";
    }
}
