package defpackage;

/* loaded from: classes2.dex */
public final class os60 {
    public final ns60 a;
    public final Object b;

    public os60(ns60 ns60Var, Object obj) {
        this.a = ns60Var;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof os60)) {
            return false;
        }
        os60 os60Var = (os60) obj;
        return this.a.equals(os60Var.a) && this.b.equals(os60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfferIntroUntilPlan(price=");
        sb.append(this.a);
        sb.append(", until=");
        return qv10.r(sb, this.b, ')');
    }
}
