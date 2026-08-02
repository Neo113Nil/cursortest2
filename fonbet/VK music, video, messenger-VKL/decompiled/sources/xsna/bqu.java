package xsna;

import java.util.ArrayList;

/* compiled from: ExecuteGroupsGet.kt */
/* loaded from: classes14.dex */
public final class bqu {
    public final ArrayList a;
    public final long b;

    public bqu(ArrayList arrayList, long j) {
        this.a = arrayList;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqu)) {
            return false;
        }
        bqu bquVar = (bqu) obj;
        return this.a.equals(bquVar.a) && this.b == bquVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGetResult(groups=");
        sb.append(this.a);
        sb.append(", lastUpdateTime=");
        return vu5.a(')', this.b, sb);
    }
}
