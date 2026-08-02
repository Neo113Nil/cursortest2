package defpackage;

/* loaded from: classes7.dex */
public final class ic91 {
    public final int a;
    public final int b;

    public ic91(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ic91) {
            ic91 ic91Var = (ic91) obj;
            if (this.a == ic91Var.a && this.b == ic91Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(65);
        sb.append("ImageProperties{imageFormat=");
        sb.append(this.a);
        sb.append(", storageType=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
