package xsna;

/* compiled from: GamesCatalogAchievementsModalBottomSheet.kt */
/* loaded from: classes17.dex */
public final class i9t {
    public final String a;
    public final String b;
    public final String c;
    public final wpo0 d;
    public final String e;
    public final String f;

    public i9t(String str, String str2, String str3, wpo0 wpo0Var, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = wpo0Var;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9t)) {
            return false;
        }
        i9t i9tVar = (i9t) obj;
        return epx.f(this.a, i9tVar.a) && epx.f(this.b, i9tVar.b) && epx.f(this.c, i9tVar.c) && epx.f(this.d, i9tVar.d) && epx.f(this.e, i9tVar.e) && epx.f(this.f, i9tVar.f);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GamesCatalogAchievementsModalBottomSheet(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", buttonLabel=");
        sb.append(this.c);
        sb.append(", image=");
        sb.append(this.d);
        sb.append(", rulesText=");
        sb.append(this.e);
        sb.append(", rulesLink=");
        return ho8.a(sb, this.f, ')');
    }
}
