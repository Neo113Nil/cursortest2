package xsna;

/* compiled from: ProductCardTopBarViewState.kt */
/* loaded from: classes18.dex */
public final class cnd0 implements bnd0 {
    public final int a;

    public cnd0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cnd0) && this.a == ((cnd0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("Favourite(counter="), this.a, ')');
    }
}
