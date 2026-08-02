package xsna;

/* compiled from: BusinessNotifyConfig.kt */
/* loaded from: classes.dex */
public final class oo8 {
    public final boolean a;
    public final int b;

    public oo8(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo8)) {
            return false;
        }
        oo8 oo8Var = (oo8) obj;
        return this.a == oo8Var.a && this.b == oo8Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BusinessNotifyConfig(enabled=");
        sb.append(this.a);
        sb.append(", phase=");
        return vu5.b(sb, this.b, ')');
    }
}
