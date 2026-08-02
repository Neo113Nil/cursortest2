package xsna;

/* compiled from: PastAsrListViewItem.kt */
/* loaded from: classes7.dex */
public final class ln90 implements hfz {
    public final int b;

    public ln90() {
        this(0, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ln90) && this.b == ((ln90) obj).b;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        return h5s.c(this.b, ", marginBottom=0)", new StringBuilder("Divider(marginTop="));
    }

    public ln90(int i, int i2) {
        this.b = (i2 & 1) != 0 ? 0 : i;
    }
}
