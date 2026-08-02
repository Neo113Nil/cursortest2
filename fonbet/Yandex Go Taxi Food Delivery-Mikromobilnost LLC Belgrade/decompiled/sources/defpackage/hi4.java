package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class hi4 {
    public final String a;
    public final List b;

    public hi4(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi4)) {
            return false;
        }
        hi4 hi4Var = (hi4) obj;
        return jl40.l(this.a, hi4Var.a) && jl40.l(this.b, hi4Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackgroundTv(backgroundColor=");
        sb.append(this.a);
        sb.append(", backgroundGradientsTv=");
        return unr0.t(sb, this.b, ')');
    }
}
