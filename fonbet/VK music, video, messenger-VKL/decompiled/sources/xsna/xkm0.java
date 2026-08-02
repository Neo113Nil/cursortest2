package xsna;

import com.vk.dto.stories.model.StoryEntry;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;

/* compiled from: StoryViewAnalyticsParams.kt */
/* loaded from: classes6.dex */
public final class xkm0 {
    public final String a;
    public final MobileOfficialAppsConStoriesStat$ViewEntryPoint b;
    public final u8m0 c;
    public final StoryEntry d;
    public final Long e;

    public xkm0(String str, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, u8m0 u8m0Var, StoryEntry storyEntry, Long l) {
        this.a = str;
        this.b = mobileOfficialAppsConStoriesStat$ViewEntryPoint;
        this.c = u8m0Var;
        this.d = storyEntry;
        this.e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkm0)) {
            return false;
        }
        xkm0 xkm0Var = (xkm0) obj;
        return epx.f(this.a, xkm0Var.a) && this.b == xkm0Var.b && epx.f(this.c, xkm0Var.c) && epx.f(this.d, xkm0Var.d) && epx.f(this.e, xkm0Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint = this.b;
        int hashCode2 = (hashCode + (mobileOfficialAppsConStoriesStat$ViewEntryPoint == null ? 0 : mobileOfficialAppsConStoriesStat$ViewEntryPoint.hashCode())) * 31;
        u8m0 u8m0Var = this.c;
        int hashCode3 = (hashCode2 + (u8m0Var == null ? 0 : u8m0Var.hashCode())) * 31;
        StoryEntry storyEntry = this.d;
        int hashCode4 = (hashCode3 + (storyEntry == null ? 0 : storyEntry.hashCode())) * 31;
        Long l = this.e;
        return hashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryViewAnalyticsParams(ref=");
        sb.append(this.a);
        sb.append(", viewEntryPoint=");
        sb.append(this.b);
        sb.append(", positionInfo=");
        sb.append(this.c);
        sb.append(", story=");
        sb.append(this.d);
        sb.append(", loadingDuration=");
        return iq.b(sb, this.e, ')');
    }
}
