package xsna;

import com.vk.games.model.GamesWhatInsideModalInfoGiftType;

/* compiled from: GamesWhatInsideModalInfoModels.kt */
/* loaded from: classes17.dex */
public final class mgt {
    public final String a;
    public final GamesWhatInsideModalInfoGiftType b;
    public final wpo0 c;

    public mgt(String str, GamesWhatInsideModalInfoGiftType gamesWhatInsideModalInfoGiftType, wpo0 wpo0Var) {
        this.a = str;
        this.b = gamesWhatInsideModalInfoGiftType;
        this.c = wpo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mgt)) {
            return false;
        }
        mgt mgtVar = (mgt) obj;
        return epx.f(this.a, mgtVar.a) && this.b == mgtVar.b && epx.f(this.c, mgtVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        GamesWhatInsideModalInfoGiftType gamesWhatInsideModalInfoGiftType = this.b;
        return this.c.hashCode() + ((hashCode + (gamesWhatInsideModalInfoGiftType == null ? 0 : gamesWhatInsideModalInfoGiftType.hashCode())) * 31);
    }

    public final String toString() {
        return "GamesWhatInsideModalInfoGift(text=" + this.a + ", type=" + this.b + ", image=" + this.c + ')';
    }
}
