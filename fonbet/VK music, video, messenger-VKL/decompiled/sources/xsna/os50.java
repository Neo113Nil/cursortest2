package xsna;

/* compiled from: MyTargetParcerModel.kt */
/* loaded from: classes17.dex */
public final class os50 {
    public final gjx a;
    public final aq50 b;

    public os50(gjx gjxVar, aq50 aq50Var) {
        this.a = gjxVar;
        this.b = aq50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof os50)) {
            return false;
        }
        os50 os50Var = (os50) obj;
        return this.a.equals(os50Var.a) && this.b.equals(os50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MyTargetParcerModel(internalNativeBanner=" + this.a + ", myTargetFacade=" + this.b + ')';
    }
}
