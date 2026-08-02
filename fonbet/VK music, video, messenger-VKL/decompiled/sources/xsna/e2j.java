package xsna;

/* compiled from: ConfigureSessionRoomsListItemAssignRandomly.kt */
/* loaded from: classes7.dex */
public final class e2j implements hfz {
    public final boolean b;
    public final int c;

    public e2j(boolean z, int i) {
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2j)) {
            return false;
        }
        e2j e2jVar = (e2j) obj;
        return this.b == e2jVar.b && this.c == e2jVar.c;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return -1;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfigureSessionRoomsListItemAssignRandomly(inProgress=");
        sb.append(this.b);
        sb.append(", unassignedUsersCount=");
        return vu5.b(sb, this.c, ')');
    }
}
