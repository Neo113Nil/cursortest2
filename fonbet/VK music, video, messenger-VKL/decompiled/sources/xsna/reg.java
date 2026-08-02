package xsna;

import com.vk.channels.api.CommentsHistory;

/* compiled from: CommentsHeaderItem.kt */
/* loaded from: classes16.dex */
public final class reg implements hfz {
    public final int b;
    public final CommentsHistory.Order c;
    public final boolean d;

    public reg(int i, CommentsHistory.Order order, boolean z) {
        this.b = i;
        this.c = order;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof reg)) {
            return false;
        }
        reg regVar = (reg) obj;
        return this.b == regVar.b && this.c == regVar.c && this.d == regVar.d;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + (Integer.hashCode(this.b) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommentsHeaderItem(totalCount=");
        sb.append(this.b);
        sb.append(", order=");
        sb.append(this.c);
        sb.append(", isInProgress=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
