package defpackage;

/* loaded from: classes2.dex */
public final class db9 implements za70 {
    public final cb9 a;

    public db9(cb9 cb9Var) {
        this.a = cb9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof db9) && this.a.equals(((db9) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "Data(changeVoluntaryAgreementStatus=" + this.a + ')';
    }
}
