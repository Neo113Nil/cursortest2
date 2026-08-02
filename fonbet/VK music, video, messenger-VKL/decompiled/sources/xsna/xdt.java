package xsna;

import com.vk.games.model.GamesHeaderSectionInfo;

/* compiled from: GamesCatalogSectionHeaderInfoModel.kt */
/* loaded from: classes17.dex */
public final class xdt {
    public final String a;
    public final GamesHeaderSectionInfo b;
    public final String c;
    public final boolean d;
    public final String e;

    public xdt(String str, GamesHeaderSectionInfo gamesHeaderSectionInfo, String str2, boolean z) {
        this.a = str;
        this.b = gamesHeaderSectionInfo;
        this.c = str2;
        this.d = z;
        StringBuilder b = v1v.b(str2, '_');
        b.append(gamesHeaderSectionInfo != null ? gamesHeaderSectionInfo.d() : null);
        b.append('_');
        b.append(z);
        this.e = b.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xdt)) {
            return false;
        }
        xdt xdtVar = (xdt) obj;
        return epx.f(this.a, xdtVar.a) && epx.f(this.b, xdtVar.b) && epx.f(this.c, xdtVar.c) && this.d == xdtVar.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        GamesHeaderSectionInfo gamesHeaderSectionInfo = this.b;
        return Boolean.hashCode(this.d) + urd0.a((hashCode + (gamesHeaderSectionInfo == null ? 0 : gamesHeaderSectionInfo.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GamesCatalogSectionHeaderInfoModel(sectionTrackCode=");
        sb.append(this.a);
        sb.append(", sectionInfo=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", hasAction=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
