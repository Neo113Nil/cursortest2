package xsna;

import com.vk.games.model.GamesHeaderSectionInfo;

/* compiled from: GamesCatalogSectionHeader.kt */
/* loaded from: classes17.dex */
public final class wdt {
    public final GamesHeaderSectionInfo a;
    public final String b;
    public final boolean c;

    public wdt(GamesHeaderSectionInfo gamesHeaderSectionInfo, String str, boolean z) {
        this.a = gamesHeaderSectionInfo;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wdt)) {
            return false;
        }
        wdt wdtVar = (wdt) obj;
        return epx.f(this.a, wdtVar.a) && epx.f(this.b, wdtVar.b) && this.c == wdtVar.c;
    }

    public final int hashCode() {
        GamesHeaderSectionInfo gamesHeaderSectionInfo = this.a;
        return Boolean.hashCode(this.c) + urd0.a((gamesHeaderSectionInfo == null ? 0 : gamesHeaderSectionInfo.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GamesCatalogSectionHeader(sectionInfo=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", hasAction=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
