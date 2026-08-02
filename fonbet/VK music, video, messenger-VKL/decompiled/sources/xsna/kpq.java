package xsna;

import com.vk.dto.newsfeed.FaveTag;
import com.vk.fave.entities.FaveSource;
import com.vk.fave.entities.FaveType;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: FaveFeedMviState.kt */
/* loaded from: classes4.dex */
public final class kpq implements tw60<kpq> {
    public final FaveType b;
    public final FaveTag c;
    public final FaveSource d;
    public final boolean e;
    public final MobileOfficialAppsCoreNavStat$EventScreen f;
    public final tqq g;
    public final ur60 h;

    public kpq(FaveType faveType, FaveTag faveTag, FaveSource faveSource, boolean z, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, tqq tqqVar, ur60 ur60Var) {
        this.b = faveType;
        this.c = faveTag;
        this.d = faveSource;
        this.e = z;
        this.f = mobileOfficialAppsCoreNavStat$EventScreen;
        this.g = tqqVar;
        this.h = ur60Var;
    }

    public static kpq a(kpq kpqVar, FaveTag faveTag, tqq tqqVar, ur60 ur60Var, int i) {
        FaveType faveType = kpqVar.b;
        if ((i & 2) != 0) {
            faveTag = kpqVar.c;
        }
        FaveTag faveTag2 = faveTag;
        FaveSource faveSource = kpqVar.d;
        boolean z = kpqVar.e;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = kpqVar.f;
        if ((i & 32) != 0) {
            tqqVar = kpqVar.g;
        }
        tqq tqqVar2 = tqqVar;
        if ((i & 64) != 0) {
            ur60Var = kpqVar.h;
        }
        kpqVar.getClass();
        return new kpq(faveType, faveTag2, faveSource, z, mobileOfficialAppsCoreNavStat$EventScreen, tqqVar2, ur60Var);
    }

    @Override // xsna.tw60
    public final kpq b(ur60 ur60Var) {
        return a(this, null, null, ur60Var, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kpq)) {
            return false;
        }
        kpq kpqVar = (kpq) obj;
        return this.b == kpqVar.b && epx.f(this.c, kpqVar.c) && this.d == kpqVar.d && this.e == kpqVar.e && this.f == kpqVar.f && epx.f(this.g, kpqVar.g) && epx.f(this.h, kpqVar.h);
    }

    public final int hashCode() {
        FaveType faveType = this.b;
        int hashCode = (faveType == null ? 0 : faveType.hashCode()) * 31;
        FaveTag faveTag = this.c;
        int hashCode2 = (hashCode + (faveTag == null ? 0 : faveTag.hashCode())) * 31;
        FaveSource faveSource = this.d;
        int hashCode3 = (this.f.hashCode() + qoy.b((hashCode2 + (faveSource == null ? 0 : faveSource.hashCode())) * 31, 31, this.e)) * 31;
        tqq tqqVar = this.g;
        return this.h.hashCode() + ((hashCode3 + (tqqVar != null ? tqqVar.hashCode() : 0)) * 31);
    }

    @Override // xsna.tw60
    public final ur60 p() {
        return this.h;
    }

    public final String toString() {
        return "FaveFeedMviState(faveType=" + this.b + ", selectedTag=" + this.c + ", source=" + this.d + ", isTablet=" + this.e + ", screenName=" + this.f + ", pages=" + this.g + ", listState=" + this.h + ')';
    }
}
