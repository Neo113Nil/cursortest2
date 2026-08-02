package xsna;

/* compiled from: ConfigureSessionRoomsListItemUnassignedHeader.kt */
/* loaded from: classes7.dex */
public final class h2j implements hfz {
    public final int b;

    public h2j(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h2j) && this.b == ((h2j) obj).b;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return -2;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("ConfigureSessionRoomsListItemUnassignedHeader(count="), this.b, ')');
    }
}
