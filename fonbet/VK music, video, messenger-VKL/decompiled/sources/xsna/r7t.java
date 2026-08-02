package xsna;

import com.vk.games.model.GamesCatalogSection;
import com.vk.games.model.GamesCatalogUser;
import com.vk.games.presentation.catalog.model.SectionTypePrefixKey;
import java.util.Objects;

/* compiled from: GameNotificationItem.kt */
/* loaded from: classes17.dex */
public final class r7t extends uet {
    public final sbt d;
    public final GamesCatalogUser e;
    public final GamesCatalogSection.GamesNotificationSection.GamesNotificationInfo.Type f;
    public final String g;
    public final boolean h;
    public final int i;
    public final Long j;
    public final int k;
    public final String l;
    public final String m;
    public final String n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r7t(sbt sbtVar, GamesCatalogUser gamesCatalogUser, GamesCatalogSection.GamesNotificationSection.GamesNotificationInfo.Type type, String str, boolean z, int i, Long l, int i2, String str2, String str3) {
        super(r0, sbtVar.c, sbtVar.d);
        long j = sbtVar.a.b;
        this.d = sbtVar;
        this.e = gamesCatalogUser;
        this.f = type;
        this.g = str;
        this.h = z;
        this.i = i;
        this.j = l;
        this.k = i2;
        this.l = str2;
        this.m = str3;
        this.n = SectionTypePrefixKey.NOTIFICATION_SECTION.h() + '_' + Objects.hash(Long.valueOf(j), gamesCatalogUser.a, type, str, Integer.valueOf(i), Integer.valueOf(i2), str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7t)) {
            return false;
        }
        r7t r7tVar = (r7t) obj;
        return epx.f(this.d, r7tVar.d) && epx.f(this.e, r7tVar.e) && this.f == r7tVar.f && epx.f(this.g, r7tVar.g) && this.h == r7tVar.h && this.i == r7tVar.i && epx.f(this.j, r7tVar.j) && this.k == r7tVar.k && epx.f(this.l, r7tVar.l) && epx.f(this.m, r7tVar.m);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31)) * 31;
        String str = this.g;
        int a = shy.a(this.i, qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.h), 31);
        Long l = this.j;
        int a2 = shy.a(this.k, (a + (l == null ? 0 : l.hashCode())) * 31, 31);
        String str2 = this.l;
        int hashCode2 = (a2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.m;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameNotificationItem(extendedApp=");
        sb.append(this.d);
        sb.append(", userProfile=");
        sb.append(this.e);
        sb.append(", type=");
        sb.append(this.f);
        sb.append(", text=");
        sb.append(this.g);
        sb.append(", unread=");
        sb.append(this.h);
        sb.append(", requestId=");
        sb.append(this.i);
        sb.append(", fromId=");
        sb.append(this.j);
        sb.append(", date=");
        sb.append(this.k);
        sb.append(", key=");
        sb.append(this.l);
        sb.append(", name=");
        return ho8.a(sb, this.m, ')');
    }
}
