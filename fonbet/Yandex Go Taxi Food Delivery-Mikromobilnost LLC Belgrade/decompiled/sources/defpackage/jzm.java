package defpackage;

import java.util.Calendar;

/* loaded from: classes6.dex */
public final class jzm implements lzm {
    public final String a;
    public final String b;
    public final prs0 c;
    public final Calendar d;
    public final long e;
    public final boolean f;
    public final String g;

    public jzm(String str, String str2, prs0 prs0Var, Calendar calendar, long j, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = prs0Var;
        this.d = calendar;
        this.e = j;
        this.f = z;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzm)) {
            return false;
        }
        jzm jzmVar = (jzm) obj;
        return jl40.l(this.a, jzmVar.a) && jl40.l(this.b, jzmVar.b) && this.c.equals(jzmVar.c) && jl40.l(this.d, jzmVar.d) && e3n.d(this.e, jzmVar.e) && this.f == jzmVar.f && this.g.equals(jzmVar.g);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.lzm
    public final String getLabel() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31;
        Calendar calendar = this.d;
        int hashCode2 = (hashCode + (calendar == null ? 0 : calendar.hashCode())) * 31;
        o430 o430Var = e3n.b;
        return this.g.hashCode() + unr0.e(qv10.c(hashCode2, 31, this.e), 31, this.f);
    }
}
