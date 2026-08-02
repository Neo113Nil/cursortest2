package xsna;

/* compiled from: GamesAchievementModels.kt */
/* loaded from: classes17.dex */
public final class y9t {
    public final int a;
    public final String b;

    public y9t(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9t)) {
            return false;
        }
        y9t y9tVar = (y9t) obj;
        return this.a == y9tVar.a && epx.f(this.b, y9tVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GamesCatalogAppLaunchParams(appId=");
        sb.append(this.a);
        sb.append(", webviewUrl=");
        return ho8.a(sb, this.b, ')');
    }
}
