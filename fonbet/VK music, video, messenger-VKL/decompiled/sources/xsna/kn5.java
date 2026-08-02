package xsna;

/* compiled from: AutoValue_MeterConfig.java */
/* loaded from: classes8.dex */
public final class kn5 extends bj20 {
    public final boolean b;

    public kn5(boolean z) {
        this.b = z;
    }

    @Override // xsna.bj20
    public final boolean a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof bj20) && this.b == ((bj20) obj).a();
    }

    public final int hashCode() {
        return (this.b ? 1231 : 1237) ^ 1000003;
    }

    public final String toString() {
        return n23.b(new StringBuilder("MeterConfig{enabled="), this.b, "}");
    }
}
