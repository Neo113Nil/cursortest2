package xsna;

/* loaded from: classes8.dex */
public final class rc1 implements qc1 {
    public final String a;

    public rc1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rc1) && epx.f(this.a, ((rc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return zr.a("Custom(config=", this.a, ")");
    }
}
