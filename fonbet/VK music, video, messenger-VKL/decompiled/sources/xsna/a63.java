package xsna;

/* compiled from: GamesAchievementBlockModel.kt */
/* loaded from: classes17.dex */
public final class a63 {
    public final int a;
    public final String b;

    public a63(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a63)) {
            return false;
        }
        a63 a63Var = (a63) obj;
        return this.a == a63Var.a && epx.f(this.b, a63Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppLaunchParamsModel(appId=");
        sb.append(this.a);
        sb.append(", webviewUrl=");
        return ho8.a(sb, this.b, ')');
    }
}
