package xsna;

import com.vk.dto.group.GroupContentTabType;

/* compiled from: CommunityProfileOnboardingFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class hxg {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final GroupContentTabType e;

    public hxg(boolean z, boolean z2, boolean z3, boolean z4, GroupContentTabType groupContentTabType) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = groupContentTabType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxg)) {
            return false;
        }
        hxg hxgVar = (hxg) obj;
        return this.a == hxgVar.a && this.b == hxgVar.b && this.c == hxgVar.c && this.d == hxgVar.d && this.e == hxgVar.e;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        GroupContentTabType groupContentTabType = this.e;
        return b + (groupContentTabType == null ? 0 : groupContentTabType.hashCode());
    }

    public final String toString() {
        return "CommunityConfigParams(isForAdmin=" + this.a + ", isForEditor=" + this.b + ", showChannelOnboarding=" + this.c + ", isAdBloggerBannerEnabled=" + this.d + ", priorityBlockType=" + this.e + ')';
    }
}
