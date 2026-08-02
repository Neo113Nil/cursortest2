package xsna;

/* compiled from: OrderListViewState.kt */
/* loaded from: classes18.dex */
public final class c3p0 implements lm50 {
    public final int b;

    public c3p0(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c3p0) && this.b == ((c3p0) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("ToolbarContent(cartQuantity="), this.b, ')');
    }
}
