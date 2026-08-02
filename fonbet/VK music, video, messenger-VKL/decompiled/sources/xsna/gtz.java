package xsna;

/* compiled from: LoadingItem.kt */
/* loaded from: classes18.dex */
public final class gtz implements hfz {
    public final int b;

    public gtz() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gtz) && this.b == ((gtz) obj).b;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("LoadingItem(id="), this.b, ')');
    }

    public gtz(int i) {
        this.b = i;
    }
}
