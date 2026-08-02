package defpackage;

/* loaded from: classes2.dex */
public final class me70 {
    public final String a;
    public final ct60 b;

    public me70(String str, ct60 ct60Var) {
        this.a = str;
        this.b = ct60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me70)) {
            return false;
        }
        me70 me70Var = (me70) obj;
        return this.a.equals(me70Var.a) && this.b.equals(me70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CommonPrice(__typename=" + this.a + ", offerPrice=" + this.b + ')';
    }
}
