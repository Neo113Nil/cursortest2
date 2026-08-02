package xsna;

/* compiled from: GamesCatalogViewState.kt */
/* loaded from: classes17.dex */
public final class xet implements ao50 {
    public final fi50 a;

    public xet(fi50 fi50Var) {
        this.a = fi50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xet) && this.a.equals(((xet) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return j8.b(new StringBuilder("GamesCatalogViewState(content="), this.a, ')');
    }
}
