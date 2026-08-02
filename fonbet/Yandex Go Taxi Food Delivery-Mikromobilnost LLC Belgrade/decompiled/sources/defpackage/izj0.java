package defpackage;

/* loaded from: classes8.dex */
public final class izj0 extends kzj0 {
    public final int b;
    public final String c;

    public izj0(int i, String str) {
        super(null);
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izj0)) {
            return false;
        }
        izj0 izj0Var = (izj0) obj;
        return this.b == izj0Var.b && jl40.l(this.c, izj0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Unauthorized(code=");
        sb.append(this.b);
        sb.append(", message=");
        return b64.p(sb, this.c, ')');
    }
}
