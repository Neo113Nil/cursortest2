package xsna;

import com.vk.games.model.GamesWhatInsideModalInfoGiftType;

/* compiled from: GamesAchievementBlockModel.kt */
/* loaded from: classes17.dex */
public final class mkx0 {
    public final String a;
    public final GamesWhatInsideModalInfoGiftType b;
    public final wpo0 c;

    public mkx0(String str, GamesWhatInsideModalInfoGiftType gamesWhatInsideModalInfoGiftType, wpo0 wpo0Var) {
        this.a = str;
        this.b = gamesWhatInsideModalInfoGiftType;
        this.c = wpo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mkx0)) {
            return false;
        }
        mkx0 mkx0Var = (mkx0) obj;
        return epx.f(this.a, mkx0Var.a) && this.b == mkx0Var.b && epx.f(this.c, mkx0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        GamesWhatInsideModalInfoGiftType gamesWhatInsideModalInfoGiftType = this.b;
        return this.c.hashCode() + ((hashCode + (gamesWhatInsideModalInfoGiftType == null ? 0 : gamesWhatInsideModalInfoGiftType.hashCode())) * 31);
    }

    public final String toString() {
        return "WhatInsideModalInfoGiftModel(text=" + this.a + ", type=" + this.b + ", image=" + this.c + ')';
    }
}
