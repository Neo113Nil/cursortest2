package xsna;

import com.vk.games.model.GamesAchievementLabelColor;

/* compiled from: GamesAchievementBlockModel.kt */
/* loaded from: classes17.dex */
public final class ut {
    public final String a;
    public final GamesAchievementLabelColor b;

    public ut(String str, GamesAchievementLabelColor gamesAchievementLabelColor) {
        this.a = str;
        this.b = gamesAchievementLabelColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ut)) {
            return false;
        }
        ut utVar = (ut) obj;
        return epx.f(this.a, utVar.a) && this.b == utVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AchievementLabelModel(text=" + this.a + ", color=" + this.b + ')';
    }
}
