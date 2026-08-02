package xsna;

import com.vk.games.model.GamesAchievementLabelColor;

/* compiled from: GamesAchievementModels.kt */
/* loaded from: classes17.dex */
public final class o8t {
    public final String a;
    public final GamesAchievementLabelColor b;

    public o8t(String str, GamesAchievementLabelColor gamesAchievementLabelColor) {
        this.a = str;
        this.b = gamesAchievementLabelColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8t)) {
            return false;
        }
        o8t o8tVar = (o8t) obj;
        return epx.f(this.a, o8tVar.a) && this.b == o8tVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GamesAchievementLabel(text=" + this.a + ", color=" + this.b + ')';
    }
}
