package xsna;

/* compiled from: AutoValue_LogLimits.java */
/* loaded from: classes11.dex */
public final class gn5 extends l000 {
    public final int b;
    public final int c;

    public gn5(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // xsna.l000
    public final int a() {
        return this.c;
    }

    @Override // xsna.l000
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l000)) {
            return false;
        }
        l000 l000Var = (l000) obj;
        return this.b == l000Var.b() && this.c == l000Var.a();
    }

    public final int hashCode() {
        return ((this.b ^ 1000003) * 1000003) ^ this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogLimits{maxNumberOfAttributes=");
        sb.append(this.b);
        sb.append(", maxAttributeValueLength=");
        return h5s.c(this.c, "}", sb);
    }
}
