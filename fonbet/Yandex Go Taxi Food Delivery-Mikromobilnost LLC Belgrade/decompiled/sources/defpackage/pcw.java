package defpackage;

import java.util.List;

/* loaded from: classes14.dex */
public final class pcw {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    public pcw(String str, String str2, String str3, String str4, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pcw)) {
            return false;
        }
        pcw pcwVar = (pcw) obj;
        return jl40.l(this.a, pcwVar.a) && jl40.l(this.b, pcwVar.b) && jl40.l(this.c, pcwVar.c) && jl40.l(this.d, pcwVar.d) && jl40.l(this.e, pcwVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
