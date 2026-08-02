package xsna;

import java.util.ArrayList;

/* compiled from: FolderPeersIncludedUpdateLpEvent.kt */
/* loaded from: classes2.dex */
public final class izr implements e900 {
    public final int a;
    public final ArrayList b;

    public izr(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izr)) {
            return false;
        }
        izr izrVar = (izr) obj;
        return this.a == izrVar.a && this.b.equals(izrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FolderPeersIncludedUpdateLpEvent(id=");
        sb.append(this.a);
        sb.append(", includedPeers=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
    }
}
