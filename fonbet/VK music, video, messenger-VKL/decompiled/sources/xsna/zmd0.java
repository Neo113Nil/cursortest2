package xsna;

/* compiled from: ProductCardTopBarViewState.kt */
/* loaded from: classes18.dex */
public final class zmd0 implements dnd0, bnd0 {
    public final int a;

    public zmd0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zmd0) && this.a == ((zmd0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("Cart(counter="), this.a, ')');
    }
}
