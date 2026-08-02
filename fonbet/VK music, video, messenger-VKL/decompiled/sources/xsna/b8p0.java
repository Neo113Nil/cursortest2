package xsna;

/* compiled from: ProductListViewState.kt */
/* loaded from: classes18.dex */
public final class b8p0 {
    public final tlo0 a;

    public b8p0(tlo0 tlo0Var) {
        this.a = tlo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b8p0) && epx.f(this.a, ((b8p0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return bt.a(new StringBuilder("TopBarViewState(title="), this.a, ')');
    }
}
