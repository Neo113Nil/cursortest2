package defpackage;

/* loaded from: classes2.dex */
public final class cu60 implements za70 {
    public final du60 a;

    public cu60(du60 du60Var) {
        this.a = du60Var;
    }

    public final du60 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cu60) && this.a.equals(((cu60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(externalCompositeOffers=" + this.a + ')';
    }
}
