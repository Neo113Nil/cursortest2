package xsna;

/* compiled from: PastAsrListViewItem.kt */
/* loaded from: classes7.dex */
public final class mn90 implements hfz {
    public final int b;

    public mn90(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mn90) && this.b == ((mn90) obj).b;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("EmptySpace(height="), this.b, ')');
    }
}
