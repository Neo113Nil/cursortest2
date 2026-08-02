package xsna;

import com.vk.external.miniapp.net.app.WebImage;
import com.vk.games.model.GamesAchievementState;
import com.vk.games.model.GamesAchievementType;
import java.util.List;

/* compiled from: GamesAchievementBlockModel.kt */
/* loaded from: classes17.dex */
public final class m8t {
    public final String a;
    public final String b;
    public final Integer c;
    public final GamesAchievementType d;
    public final GamesAchievementState e;
    public final ut f;
    public final List<WebImage> g;
    public final tt h;
    public final nkx0 i;

    public m8t(String str, String str2, Integer num, GamesAchievementType gamesAchievementType, GamesAchievementState gamesAchievementState, ut utVar, List<WebImage> list, tt ttVar, nkx0 nkx0Var) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = gamesAchievementType;
        this.e = gamesAchievementState;
        this.f = utVar;
        this.g = list;
        this.h = ttVar;
        this.i = nkx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8t)) {
            return false;
        }
        m8t m8tVar = (m8t) obj;
        return epx.f(this.a, m8tVar.a) && epx.f(this.b, m8tVar.b) && epx.f(this.c, m8tVar.c) && this.d == m8tVar.d && this.e == m8tVar.e && epx.f(this.f, m8tVar.f) && epx.f(this.g, m8tVar.g) && epx.f(this.h, m8tVar.h) && epx.f(this.i, m8tVar.i);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        GamesAchievementType gamesAchievementType = this.d;
        int hashCode4 = (hashCode3 + (gamesAchievementType == null ? 0 : gamesAchievementType.hashCode())) * 31;
        GamesAchievementState gamesAchievementState = this.e;
        int hashCode5 = (hashCode4 + (gamesAchievementState == null ? 0 : gamesAchievementState.hashCode())) * 31;
        ut utVar = this.f;
        int hashCode6 = (hashCode5 + (utVar == null ? 0 : utVar.hashCode())) * 31;
        List<WebImage> list = this.g;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        tt ttVar = this.h;
        int hashCode8 = (hashCode7 + (ttVar == null ? 0 : ttVar.hashCode())) * 31;
        nkx0 nkx0Var = this.i;
        return hashCode8 + (nkx0Var != null ? nkx0Var.hashCode() : 0);
    }

    public final String toString() {
        return "GamesAchievementBlockModel(title=" + this.a + ", subtitle=" + this.b + ", progress=" + this.c + ", achievementType=" + this.d + ", state=" + this.e + ", label=" + this.f + ", image=" + this.g + ", button=" + this.h + ", whatInsideModalInfo=" + this.i + ')';
    }
}
