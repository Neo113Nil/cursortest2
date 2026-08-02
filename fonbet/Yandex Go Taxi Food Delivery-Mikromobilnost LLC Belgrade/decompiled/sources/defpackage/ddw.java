package defpackage;

import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class ddw {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final ArrayList e;

    public ddw(String str, String str2, String str3, String str4, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddw)) {
            return false;
        }
        ddw ddwVar = (ddw) obj;
        return jl40.l(this.a, ddwVar.a) && jl40.l(this.b, ddwVar.b) && jl40.l(this.c, ddwVar.c) && jl40.l(this.d, ddwVar.d) && this.e.equals(ddwVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
