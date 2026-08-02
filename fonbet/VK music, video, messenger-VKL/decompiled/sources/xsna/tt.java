package xsna;

/* compiled from: GamesAchievementBlockModel.kt */
/* loaded from: classes17.dex */
public final class tt {
    public final String a;
    public final String b;
    public final st c;

    public tt(String str, String str2, st stVar) {
        this.a = str;
        this.b = str2;
        this.c = stVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt)) {
            return false;
        }
        tt ttVar = (tt) obj;
        return epx.f(this.a, ttVar.a) && epx.f(this.b, ttVar.b) && epx.f(this.c, ttVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        st stVar = this.c;
        return hashCode2 + (stVar != null ? stVar.hashCode() : 0);
    }

    public final String toString() {
        return "AchievementButtonModel(label=" + this.a + ", tooltip=" + this.b + ", action=" + this.c + ')';
    }
}
