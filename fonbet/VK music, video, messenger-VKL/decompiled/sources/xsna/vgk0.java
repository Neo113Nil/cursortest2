package xsna;

/* compiled from: ListItems.kt */
/* loaded from: classes7.dex */
public final class vgk0 implements hfz {
    public final int b;

    public vgk0(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vgk0) && this.b == ((vgk0) obj).b;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("SpaceForScrollItem(width="), this.b, ')');
    }
}
