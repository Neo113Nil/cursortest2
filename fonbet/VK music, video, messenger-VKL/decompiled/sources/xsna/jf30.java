package xsna;

import xsna.mno0;

/* compiled from: MovieSearchSuggestionVh.kt */
/* loaded from: classes16.dex */
public final class jf30 {
    public final int a;
    public final mno0.i b;
    public final String c;
    public final Float d;
    public final String e;
    public final Integer f;
    public final String g;
    public final Integer h;
    public final String i;

    public jf30(int i, mno0.i iVar, String str, Float f, String str2, Integer num, String str3, Integer num2, String str4) {
        this.a = i;
        this.b = iVar;
        this.c = str;
        this.d = f;
        this.e = str2;
        this.f = num;
        this.g = str3;
        this.h = num2;
        this.i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf30)) {
            return false;
        }
        jf30 jf30Var = (jf30) obj;
        return this.a == jf30Var.a && this.b.equals(jf30Var.b) && epx.f(this.c, jf30Var.c) && epx.f(this.d, jf30Var.d) && epx.f(this.e, jf30Var.e) && epx.f(this.f, jf30Var.f) && epx.f(this.g, jf30Var.g) && epx.f(this.h, jf30Var.h) && epx.f(this.i, jf30Var.i);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(Integer.hashCode(this.a) * 31, 31, this.b.a), 31, this.c);
        Float f = this.d;
        int hashCode = (a + (f == null ? 0 : f.hashCode())) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.g;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.h;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.i;
        return Boolean.hashCode(false) + ((hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MovieSearchSuggestionState(movieId=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", posterUrl=");
        sb.append(this.c);
        sb.append(", rating=");
        sb.append(this.d);
        sb.append(", ageRestriction=");
        sb.append(this.e);
        sb.append(", releaseYear=");
        sb.append(this.f);
        sb.append(", country=");
        sb.append(this.g);
        sb.append(", durationMinutes=");
        sb.append(this.h);
        sb.append(", originalName=");
        return i5s.a(sb, this.i, ", isWatchable=false)");
    }
}
