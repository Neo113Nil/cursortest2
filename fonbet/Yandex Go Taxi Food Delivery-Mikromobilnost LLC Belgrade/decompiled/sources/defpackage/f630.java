package defpackage;

import java.util.Objects;

/* loaded from: classes11.dex */
public final class f630 {
    public final cjx a;
    public final int b;
    public final String c;
    public final String d;

    public f630(cjx cjxVar, int i, String str, String str2) {
        this.a = cjxVar;
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f630)) {
            return false;
        }
        f630 f630Var = (f630) obj;
        return this.a == f630Var.a && this.b == f630Var.b && this.c.equals(f630Var.c) && this.d.equals(f630Var.d);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), this.c, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(status=");
        sb.append(this.a);
        sb.append(", keyId=");
        sb.append(this.b);
        sb.append(", keyType='");
        return g8e.r(sb, this.c, "', keyPrefix='", this.d, "')");
    }
}
