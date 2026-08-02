package xsna;

/* compiled from: AutoValue_TracerConfig.java */
/* loaded from: classes8.dex */
public final class do5 extends zdp0 {
    public final boolean b;

    public do5(boolean z) {
        this.b = z;
    }

    @Override // xsna.zdp0
    public final boolean a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof zdp0) && this.b == ((zdp0) obj).a();
    }

    public final int hashCode() {
        return (this.b ? 1231 : 1237) ^ 1000003;
    }

    public final String toString() {
        return n23.b(new StringBuilder("TracerConfig{enabled="), this.b, "}");
    }
}
