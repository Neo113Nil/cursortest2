package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.WallGetMode;
import kotlin.Pair;

/* compiled from: UserProfileWallArguments.kt */
/* loaded from: classes4.dex */
public final class jvq0 {
    public final UserId a;
    public final WallGetMode b;
    public final WallGetMode c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final Boolean h;
    public final boolean i;
    public final Pair<String, String> j;

    public jvq0(UserId userId, WallGetMode wallGetMode, WallGetMode wallGetMode2, String str, String str2, String str3, boolean z, Boolean bool, boolean z2, Pair<String, String> pair) {
        this.a = userId;
        this.b = wallGetMode;
        this.c = wallGetMode2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = z;
        this.h = bool;
        this.i = z2;
        this.j = pair;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvq0)) {
            return false;
        }
        jvq0 jvq0Var = (jvq0) obj;
        return epx.f(this.a, jvq0Var.a) && this.b == jvq0Var.b && this.c == jvq0Var.c && epx.f(this.d, jvq0Var.d) && epx.f(this.e, jvq0Var.e) && epx.f(this.f, jvq0Var.f) && this.g == jvq0Var.g && epx.f(this.h, jvq0Var.h) && this.i == jvq0Var.i && epx.f(this.j, jvq0Var.j);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Long.hashCode(this.a.b) * 31)) * 31;
        WallGetMode wallGetMode = this.c;
        int hashCode2 = (hashCode + (wallGetMode == null ? 0 : wallGetMode.hashCode())) * 31;
        String str = this.d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int b = qoy.b((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.g);
        Boolean bool = this.h;
        int b2 = qoy.b((b + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.i);
        Pair<String, String> pair = this.j;
        return b2 + (pair != null ? pair.hashCode() : 0);
    }

    public final String toString() {
        return "UserProfileWallArguments(ownerId=" + this.a + ", wallMode=" + this.b + ", pendingWallMode=" + this.c + ", accessKey=" + this.d + ", parentRef=" + this.e + ", trackCode=" + this.f + ", isMainWallAvailable=" + this.g + ", wallIsAvailable=" + this.h + ", isPromotable=" + this.i + ", adsEasyPromoteCampaigns=" + this.j + ')';
    }
}
