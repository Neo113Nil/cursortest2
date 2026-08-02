package xsna;

/* compiled from: SessionRoomsListItem.kt */
/* loaded from: classes7.dex */
public final class axi0 implements hfz {
    public final lvi0 b;
    public final boolean c;

    public axi0(lvi0 lvi0Var, boolean z) {
        this.b = lvi0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axi0)) {
            return false;
        }
        axi0 axi0Var = (axi0) obj;
        return epx.f(this.b, axi0Var.b) && this.c == axi0Var.c;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b.a.a.getId());
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionRoomsListItem(room=");
        sb.append(this.b);
        sb.append(", isSelected=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
