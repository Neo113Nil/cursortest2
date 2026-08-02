package defpackage;

import java.util.List;

/* loaded from: classes14.dex */
public final class cjw extends hjw {
    public final String a;
    public final List b;
    public final String c;

    public cjw(String str, List list, String str2) {
        this.a = str;
        this.b = list;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjw)) {
            return false;
        }
        cjw cjwVar = (cjw) obj;
        return jl40.l(this.a, cjwVar.a) && jl40.l(this.b, cjwVar.b) && jl40.l(this.c, cjwVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }
}
