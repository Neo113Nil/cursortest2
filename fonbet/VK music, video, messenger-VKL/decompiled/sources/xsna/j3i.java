package xsna;

import com.vk.dto.group.Group;

/* compiled from: CommunitySuggestionsListItem.kt */
/* loaded from: classes5.dex */
public final class j3i implements hfz {
    public final Group b;
    public final String c;

    public j3i(Group group, String str) {
        this.b = group;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3i)) {
            return false;
        }
        j3i j3iVar = (j3i) obj;
        return epx.f(this.b, j3iVar.b) && epx.f(this.c, j3iVar.c);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Long.valueOf(this.b.c.b);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunitySuggestionsListItem(item=");
        sb.append(this.b);
        sb.append(", trackCode=");
        return ho8.a(sb, this.c, ')');
    }
}
