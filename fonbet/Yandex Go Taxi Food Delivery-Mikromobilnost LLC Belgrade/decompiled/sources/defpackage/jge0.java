package defpackage;

/* loaded from: classes.dex */
public final class jge0 {
    public final int a;
    public final int b;
    public final int c;

    public jge0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jge0)) {
            return false;
        }
        jge0 jge0Var = (jge0) obj;
        return this.a == jge0Var.a && this.b == jge0Var.b && this.c == jge0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreCreationModel(capacity=");
        sb.append(this.a);
        sb.append(", min=");
        sb.append(this.b);
        sb.append(", max=");
        return oyr.s(sb, this.c, ')');
    }

    public /* synthetic */ jge0(int i) {
        this(i, 0, Integer.MAX_VALUE);
    }
}
