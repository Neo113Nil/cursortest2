package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class ksu0 {
    public final String a;
    public final String b;
    public final Map c;

    public ksu0(String str, String str2, Map map) {
        this.a = str;
        this.b = str2;
        this.c = map;
    }

    public final String a() {
        return this.a;
    }

    public final Map b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksu0)) {
            return false;
        }
        ksu0 ksu0Var = (ksu0) obj;
        return this.a.equals(ksu0Var.a) && this.b.equals(ksu0Var.b) && jl40.l(this.c, ksu0Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        Map map = this.c;
        return b + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnActionPerformCrossAction(actionId=");
        sb.append(this.a);
        sb.append(", actionToken=");
        sb.append(this.b);
        sb.append(", actionMeta=");
        return smw0.n(sb, this.c, ')');
    }
}
