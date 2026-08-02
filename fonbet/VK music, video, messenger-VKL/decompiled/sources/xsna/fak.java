package xsna;

/* compiled from: CreateRoomsTimeLimitPresetListItem.kt */
/* loaded from: classes7.dex */
public final class fak implements hfz {
    public final int b;
    public final boolean c;

    public fak(int i, boolean z) {
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fak)) {
            return false;
        }
        fak fakVar = (fak) obj;
        return this.b == fakVar.b && this.c == fakVar.c;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateRoomsTimeLimitPresetListItem(durationMinutes=");
        sb.append(this.b);
        sb.append(", isActive=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
