package defpackage;

import java.util.Calendar;

/* loaded from: classes6.dex */
public final class kzm implements lzm {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final Calendar e;
    public final Calendar f;
    public final String g;

    public kzm(String str, String str2, String str3, boolean z, Calendar calendar, Calendar calendar2, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = calendar;
        this.f = calendar2;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kzm)) {
            return false;
        }
        kzm kzmVar = (kzm) obj;
        return jl40.l(this.a, kzmVar.a) && jl40.l(this.b, kzmVar.b) && jl40.l(this.c, kzmVar.c) && this.d == kzmVar.d && jl40.l(this.e, kzmVar.e) && jl40.l(this.f, kzmVar.f) && this.g.equals(kzmVar.g);
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
        int e = unr0.e(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        Calendar calendar = this.e;
        int hashCode = (e + (calendar == null ? 0 : calendar.hashCode())) * 31;
        Calendar calendar2 = this.f;
        return this.g.hashCode() + ((hashCode + (calendar2 != null ? calendar2.hashCode() : 0)) * 31);
    }
}
