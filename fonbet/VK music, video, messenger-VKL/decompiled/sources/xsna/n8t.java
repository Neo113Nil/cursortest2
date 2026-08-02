package xsna;

/* compiled from: GamesAchievementModels.kt */
/* loaded from: classes17.dex */
public final class n8t {
    public final String a;
    public final String b;
    public final cat c;

    public n8t(String str, String str2, cat catVar) {
        this.a = str;
        this.b = str2;
        this.c = catVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8t)) {
            return false;
        }
        n8t n8tVar = (n8t) obj;
        return epx.f(this.a, n8tVar.a) && epx.f(this.b, n8tVar.b) && epx.f(this.c, n8tVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        cat catVar = this.c;
        return hashCode2 + (catVar != null ? catVar.hashCode() : 0);
    }

    public final String toString() {
        return "GamesAchievementButton(label=" + this.a + ", tooltip=" + this.b + ", action=" + this.c + ')';
    }
}
