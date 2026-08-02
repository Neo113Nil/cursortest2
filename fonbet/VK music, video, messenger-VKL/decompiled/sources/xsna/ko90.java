package xsna;

import java.util.ArrayList;

/* compiled from: PastBroadcastsListViewState.kt */
/* loaded from: classes7.dex */
public final class ko90 {
    public final ArrayList a;
    public final boolean b;

    public ko90(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ko90)) {
            return false;
        }
        ko90 ko90Var = (ko90) obj;
        return this.a.equals(ko90Var.a) && this.b == ko90Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PastBroadcastsListViewState(items=");
        sb.append(this.a);
        sb.append(", reloadingInBackground=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
