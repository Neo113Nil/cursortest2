package defpackage;

/* loaded from: classes2.dex */
public final class ald {
    public final String a;
    public final ct60 b;

    public ald(String str, ct60 ct60Var) {
        this.a = str;
        this.b = ct60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ald)) {
            return false;
        }
        ald aldVar = (ald) obj;
        return this.a.equals(aldVar.a) && this.b.equals(aldVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MaxPoints(__typename=" + this.a + ", offerPrice=" + this.b + ')';
    }
}
