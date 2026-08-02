package xsna;

import com.vk.games.model.GamesCatalogActionType;

/* compiled from: GamesAchievementModels.kt */
/* loaded from: classes17.dex */
public final class cat {
    public final GamesCatalogActionType a;
    public final y9t b;
    public final String c;

    public cat(GamesCatalogActionType gamesCatalogActionType, y9t y9tVar, String str) {
        this.a = gamesCatalogActionType;
        this.b = y9tVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cat)) {
            return false;
        }
        cat catVar = (cat) obj;
        return this.a == catVar.a && epx.f(this.b, catVar.b) && epx.f(this.c, catVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        y9t y9tVar = this.b;
        int hashCode2 = (hashCode + (y9tVar == null ? 0 : y9tVar.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GamesCatalogButtonAction(type=");
        sb.append(this.a);
        sb.append(", appLaunchParams=");
        sb.append(this.b);
        sb.append(", url=");
        return ho8.a(sb, this.c, ')');
    }
}
