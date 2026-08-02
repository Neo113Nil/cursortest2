package xsna;

/* compiled from: HideAppContentViewState.kt */
/* loaded from: classes15.dex */
public final class l3v implements ao50 {
    public final fi50 a;

    public l3v(fi50 fi50Var) {
        this.a = fi50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l3v) && this.a.equals(((l3v) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return j8.b(new StringBuilder("HideAppContentViewState(scene="), this.a, ')');
    }
}
