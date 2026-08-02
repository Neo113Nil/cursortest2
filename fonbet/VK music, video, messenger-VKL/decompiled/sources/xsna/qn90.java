package xsna;

import java.util.ArrayList;

/* compiled from: PastAsrsListViewState.kt */
/* loaded from: classes7.dex */
public final class qn90 {
    public final ArrayList a;
    public final boolean b;

    public qn90(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qn90)) {
            return false;
        }
        qn90 qn90Var = (qn90) obj;
        return this.a.equals(qn90Var.a) && this.b == qn90Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PastAsrsListViewState(items=");
        sb.append(this.a);
        sb.append(", reloadingInBackground=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
