package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.WallGetMode;
import kotlin.Pair;

/* compiled from: UserProfileWallFactory.kt */
/* loaded from: classes3.dex */
public final class xwq0 {
    public final WallGetMode a;
    public final boolean b;
    public final UserId c;
    public final boolean d;
    public final Pair<String, String> e;
    public final foq0 f;
    public final foq0 g;

    public xwq0(WallGetMode wallGetMode, boolean z, UserId userId, boolean z2, Pair pair, foq0 foq0Var, foq0 foq0Var2) {
        this.a = wallGetMode;
        this.b = z;
        this.c = userId;
        this.d = z2;
        this.e = pair;
        this.f = foq0Var;
        this.g = foq0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xwq0)) {
            return false;
        }
        xwq0 xwq0Var = (xwq0) obj;
        xwq0Var.getClass();
        return this.a == xwq0Var.a && this.b == xwq0Var.b && epx.f(this.c, xwq0Var.c) && this.d == xwq0Var.d && epx.f(this.e, xwq0Var.e) && this.f.equals(xwq0Var.f) && this.g.equals(xwq0Var.g);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(bh10.a(qoy.b((this.a.hashCode() + (Boolean.hashCode(false) * 31)) * 31, 31, this.b), 31, this.c.b), 31, true), 31, this.d);
        Pair<String, String> pair = this.e;
        return this.g.hashCode() + ((this.f.hashCode() + ((b + (pair != null ? pair.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "UserProfileWallParams(viewCreatedWithFragment=false, initWallMode=" + this.a + ", isMainWallAvailable=" + this.b + ", userId=" + this.c + ", wallIsAvailable=true, isPromotable=" + this.d + ", adsEasyPromoteCampaigns=" + this.e + ", userProfileWallCallback=" + this.f + ", userProfileContentCallback=" + this.g + ')';
    }
}
