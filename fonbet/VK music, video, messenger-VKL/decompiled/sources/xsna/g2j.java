package xsna;

/* compiled from: ConfigureSessionRoomsListItemRoom.kt */
/* loaded from: classes7.dex */
public final class g2j implements hfz {
    public final lvi0 b;

    public g2j(lvi0 lvi0Var) {
        this.b = lvi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g2j) && epx.f(this.b, ((g2j) obj).b);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b.a.a.getId());
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ConfigureSessionRoomsListItemRoom(room=" + this.b + ')';
    }
}
