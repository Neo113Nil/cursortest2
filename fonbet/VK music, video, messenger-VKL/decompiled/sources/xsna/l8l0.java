package xsna;

/* compiled from: StickersAchievementInfo.kt */
/* loaded from: classes17.dex */
public final class l8l0 {
    public final String a;
    public final String b;
    public final String c;

    public l8l0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8l0)) {
            return false;
        }
        l8l0 l8l0Var = (l8l0) obj;
        return epx.f(this.a, l8l0Var.a) && epx.f(this.b, l8l0Var.b) && epx.f(this.c, l8l0Var.c);
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
        StringBuilder sb = new StringBuilder("StickersAchievementInfo(achievementUserName=");
        sb.append(this.a);
        sb.append(", achievementMiddleText=");
        sb.append(this.b);
        sb.append(", achievementName=");
        return ho8.a(sb, this.c, ')');
    }
}
