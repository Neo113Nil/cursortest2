package xsna;

/* compiled from: PastBroadcastsListViewItem.kt */
/* loaded from: classes7.dex */
public final class ho90 implements hfz {
    public final int b;

    public ho90(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ho90) && this.b == ((ho90) obj).b;
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
