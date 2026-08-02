package xsna;

import java.util.ArrayList;

/* compiled from: FriendsMutualStorageModel.kt */
/* loaded from: classes2.dex */
public final class irs {
    public final ArrayList a;
    public final long b;

    public irs(ArrayList arrayList, long j) {
        this.a = arrayList;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof irs)) {
            return false;
        }
        irs irsVar = (irs) obj;
        return this.a.equals(irsVar.a) && this.b == irsVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsMutualStorageModel(friends=");
        sb.append(this.a);
        sb.append(", syncTime=");
        return vu5.a(')', this.b, sb);
    }
}
