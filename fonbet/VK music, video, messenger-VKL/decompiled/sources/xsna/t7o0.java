package xsna;

/* compiled from: MatchState.kt */
/* loaded from: classes17.dex */
public final class t7o0 {
    public final String a;
    public final String b;
    public final String c;

    public t7o0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7o0)) {
            return false;
        }
        t7o0 t7o0Var = (t7o0) obj;
        return epx.f(this.a, t7o0Var.a) && epx.f(this.b, t7o0Var.b) && epx.f(this.c, t7o0Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TeamState(name=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", imageUrl=");
        return ho8.a(sb, this.c, ')');
    }
}
