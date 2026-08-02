package defpackage;

/* loaded from: classes2.dex */
public final class ied0 {
    public final boolean a;
    public final boolean b;

    public ied0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ied0)) {
            return false;
        }
        ied0 ied0Var = (ied0) obj;
        return this.a == ied0Var.a && this.b == ied0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Attributes(isNewPaymentMethod=");
        sb.append(this.a);
        sb.append(", hasArrowIcon=");
        return unr0.u(sb, this.b, ')');
    }
}
