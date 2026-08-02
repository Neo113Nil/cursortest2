package defpackage;

/* loaded from: classes2.dex */
public final class ezj0 extends kzj0 {
    public final int b;
    public final String c;

    public ezj0(int i, String str) {
        super(null);
        this.b = i;
        this.c = str;
    }

    public final String b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ezj0)) {
            return false;
        }
        ezj0 ezj0Var = (ezj0) obj;
        return this.b == ezj0Var.b && jl40.l(this.c, ezj0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Api(code=");
        sb.append(this.b);
        sb.append(", message=");
        return b64.p(sb, this.c, ')');
    }
}
