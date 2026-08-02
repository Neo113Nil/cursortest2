package xsna;

import com.vk.games.presentation.catalog.model.items.GameCatalogBadge;

/* compiled from: GameWithBadge.kt */
/* loaded from: classes17.dex */
public final class h8t extends uet {
    public final sbt d;
    public final String e;
    public final String f;
    public final GameCatalogBadge g;
    public final String h;
    public final c8t i;
    public final boolean j;

    public h8t(sbt sbtVar, String str, String str2, GameCatalogBadge gameCatalogBadge, String str3, c8t c8tVar, boolean z) {
        super(sbtVar.a.b, sbtVar.c, sbtVar.d);
        this.d = sbtVar;
        this.e = str;
        this.f = str2;
        this.g = gameCatalogBadge;
        this.h = str3;
        this.i = c8tVar;
        this.j = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8t)) {
            return false;
        }
        h8t h8tVar = (h8t) obj;
        return epx.f(this.d, h8tVar.d) && epx.f(this.e, h8tVar.e) && epx.f(this.f, h8tVar.f) && this.g == h8tVar.g && epx.f(this.h, h8tVar.h) && epx.f(this.i, h8tVar.i) && this.j == h8tVar.j;
    }

    public final int hashCode() {
        int a = urd0.a(this.d.hashCode() * 31, 31, this.e);
        String str = this.f;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        GameCatalogBadge gameCatalogBadge = this.g;
        int a2 = urd0.a((hashCode + (gameCatalogBadge == null ? 0 : gameCatalogBadge.hashCode())) * 31, 31, this.h);
        c8t c8tVar = this.i;
        return Boolean.hashCode(this.j) + ((a2 + (c8tVar != null ? c8tVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameWithBadge(extendedApp=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", subtitle=");
        sb.append(this.f);
        sb.append(", badge=");
        sb.append(this.g);
        sb.append(", backgroundUrl=");
        sb.append(this.h);
        sb.append(", userStack=");
        sb.append(this.i);
        sb.append(", hasAchievementLabel=");
        return defpackage.q0.a(sb, this.j, ')');
    }
}
