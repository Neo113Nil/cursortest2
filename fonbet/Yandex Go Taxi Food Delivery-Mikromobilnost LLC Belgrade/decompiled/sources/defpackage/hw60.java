package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class hw60 {
    public final sq50 a;
    public final ArrayList b;
    public final ArrayList c;

    public hw60(sq50 sq50Var, ArrayList arrayList, ArrayList arrayList2) {
        this.a = sq50Var;
        this.b = arrayList;
        this.c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hw60)) {
            return false;
        }
        hw60 hw60Var = (hw60) obj;
        return jl40.l(this.a, hw60Var.a) && this.b.equals(hw60Var.b) && this.c.equals(hw60Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ly3.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallContext(networkContext=");
        sb.append(this.a);
        sb.append(", rawInterceptors=");
        sb.append(this.b);
        sb.append(", applicationInterceptors=");
        return smw0.m(sb, this.c, ')');
    }
}
