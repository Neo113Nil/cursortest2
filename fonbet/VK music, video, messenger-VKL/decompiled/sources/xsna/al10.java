package xsna;

/* compiled from: MatchState.kt */
/* loaded from: classes17.dex */
public final class al10 {
    public final t7o0 a;
    public final t7o0 b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public al10(t7o0 t7o0Var, t7o0 t7o0Var2, String str, Integer num, Integer num2, String str2, String str3, String str4, String str5) {
        this.a = t7o0Var;
        this.b = t7o0Var2;
        this.c = str;
        this.d = num;
        this.e = num2;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al10)) {
            return false;
        }
        al10 al10Var = (al10) obj;
        return epx.f(this.a, al10Var.a) && epx.f(this.b, al10Var.b) && epx.f(this.c, al10Var.c) && epx.f(this.d, al10Var.d) && epx.f(this.e, al10Var.e) && epx.f(this.f, al10Var.f) && epx.f(this.g, al10Var.g) && epx.f(this.h, al10Var.h) && epx.f(this.i, al10Var.i);
    }

    public final int hashCode() {
        t7o0 t7o0Var = this.a;
        int hashCode = (t7o0Var == null ? 0 : t7o0Var.hashCode()) * 31;
        t7o0 t7o0Var2 = this.b;
        int hashCode2 = (hashCode + (t7o0Var2 == null ? 0 : t7o0Var2.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.f;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        return hashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MatchState(teamA=");
        sb.append(this.a);
        sb.append(", teamB=");
        sb.append(this.b);
        sb.append(", iconUrl=");
        sb.append(this.c);
        sb.append(", scoreA=");
        sb.append(this.d);
        sb.append(", scoreB=");
        sb.append(this.e);
        sb.append(", state=");
        sb.append(this.f);
        sb.append(", liveUrl=");
        sb.append(this.g);
        sb.append(", actionUrl=");
        sb.append(this.h);
        sb.append(", actionTarget=");
        return ho8.a(sb, this.i, ')');
    }
}
