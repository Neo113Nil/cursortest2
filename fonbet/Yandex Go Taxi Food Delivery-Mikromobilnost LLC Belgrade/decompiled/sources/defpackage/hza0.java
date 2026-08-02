package defpackage;

import java.util.List;

/* loaded from: classes11.dex */
public final class hza0 {
    public final int a;
    public final List b;
    public final List c;

    public hza0(List list, List list2, int i) {
        this.a = i;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hza0)) {
            return false;
        }
        hza0 hza0Var = (hza0) obj;
        return this.a == hza0Var.a && this.b.equals(hza0Var.b) && this.c.equals(hza0Var.c);
    }

    public final int hashCode() {
        return oyr.b(0, unr0.c(unr0.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PermissionRequest(requestCode=");
        sb.append(this.a);
        sb.append(", requiredPermissions=");
        sb.append(this.b);
        sb.append(", optionalPermissions=");
        return ly3.s(sb, this.c, ", explainMessageResId=0, explainMessage=null)");
    }
}
