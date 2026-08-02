package xsna;

import java.util.ArrayList;

/* compiled from: GetMsgReactedPeersCmd.kt */
/* loaded from: classes2.dex */
public final class eze0 {
    public final ArrayList a;
    public final ArrayList b;

    public eze0(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eze0)) {
            return false;
        }
        eze0 eze0Var = (eze0) obj;
        return this.a.equals(eze0Var.a) && this.b.equals(eze0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReactedPeers(peers=");
        sb.append(this.a);
        sb.append(", counters=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
    }
}
