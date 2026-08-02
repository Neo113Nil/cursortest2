package xsna;

import java.util.ArrayList;

/* compiled from: TabsInfo.kt */
/* loaded from: classes4.dex */
public final class hyn0 {
    public final ArrayList a;
    public final q030 b;

    public hyn0(ArrayList arrayList, q030 q030Var) {
        this.a = arrayList;
        this.b = q030Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hyn0)) {
            return false;
        }
        hyn0 hyn0Var = (hyn0) obj;
        return this.a.equals(hyn0Var.a) && this.b.equals(hyn0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TabsInfo(tabs=" + this.a + ", analyticsData=" + this.b + ')';
    }
}
