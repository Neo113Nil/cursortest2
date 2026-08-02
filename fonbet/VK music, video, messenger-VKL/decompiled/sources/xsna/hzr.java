package xsna;

import java.util.ArrayList;

/* compiled from: FolderPeersExcludedUpdateLpEvent.kt */
/* loaded from: classes2.dex */
public final class hzr implements e900 {
    public final int a;
    public final ArrayList b;

    public hzr(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hzr)) {
            return false;
        }
        hzr hzrVar = (hzr) obj;
        return this.a == hzrVar.a && this.b.equals(hzrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FolderPeersExcludedUpdateLpEvent(id=");
        sb.append(this.a);
        sb.append(", excludedPeers=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
    }
}
