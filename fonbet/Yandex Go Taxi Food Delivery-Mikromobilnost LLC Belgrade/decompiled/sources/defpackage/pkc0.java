package defpackage;

import java.util.List;

/* loaded from: classes8.dex */
public final class pkc0 {
    public final String a;
    public final List b;
    public final String c;
    public final Boolean d;

    public pkc0(Boolean bool, String str, String str2, List list) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pkc0)) {
            return false;
        }
        pkc0 pkc0Var = (pkc0) obj;
        return jl40.l(this.a, pkc0Var.a) && jl40.l(this.b, pkc0Var.b) && jl40.l(this.c, pkc0Var.c) && jl40.l(this.d, pkc0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.d;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaqueContentDescription(text=");
        sb.append(this.a);
        sb.append(", templates=");
        sb.append(this.b);
        sb.append(", actionText=");
        sb.append(this.c);
        sb.append(", accessibilityEnabled=");
        return oo31.i(sb, this.d, ')');
    }
}
