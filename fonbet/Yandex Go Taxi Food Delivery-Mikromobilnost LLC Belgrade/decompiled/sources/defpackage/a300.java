package defpackage;

/* loaded from: classes2.dex */
public final class a300 implements za70 {
    public final e300 a;

    public a300(e300 e300Var) {
        this.a = e300Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a300) && this.a.equals(((a300) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(voluntaryMailingAdsAgreement=" + this.a + ')';
    }
}
