package xsna;

import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.profile.user.api.data.UserProfileSkeletonParams;
import com.vk.profile.user.api.domain.UserProfileMode;

/* compiled from: UserProfileParams.kt */
/* loaded from: classes5.dex */
public final class htq0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final SearchStatsLoggingInfo f;
    public boolean g;
    public final gzs<Boolean> h;
    public final UserProfileMode i;
    public final UserProfileSkeletonParams j;
    public final boolean k;
    public final Integer l;
    public final boolean m;
    public final boolean n;

    public htq0() {
        this(null, null, null, null, false, null, false, null, 16383);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof htq0)) {
            return false;
        }
        htq0 htq0Var = (htq0) obj;
        return epx.f(this.a, htq0Var.a) && epx.f(this.b, htq0Var.b) && epx.f(this.c, htq0Var.c) && epx.f(this.d, htq0Var.d) && this.e == htq0Var.e && epx.f(this.f, htq0Var.f) && this.g == htq0Var.g && epx.f(this.h, htq0Var.h) && this.i == htq0Var.i && epx.f(this.j, htq0Var.j) && this.k == htq0Var.k && epx.f(this.l, htq0Var.l) && this.m == htq0Var.m && this.n == htq0Var.n;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int b = qoy.b((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.e);
        SearchStatsLoggingInfo searchStatsLoggingInfo = this.f;
        int hashCode4 = (this.i.hashCode() + sf3.a(qoy.b((b + (searchStatsLoggingInfo == null ? 0 : searchStatsLoggingInfo.hashCode())) * 31, 31, this.g), 31, this.h)) * 31;
        UserProfileSkeletonParams userProfileSkeletonParams = this.j;
        int b2 = qoy.b((hashCode4 + (userProfileSkeletonParams == null ? 0 : userProfileSkeletonParams.hashCode())) * 31, 31, this.k);
        Integer num = this.l;
        return Boolean.hashCode(this.n) + qoy.b((b2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.m);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserProfileParams(fragmentStrKey=");
        sb.append(this.a);
        sb.append(", accessKey=");
        sb.append(this.b);
        sb.append(", parentRef=");
        sb.append(this.c);
        sb.append(", trackCode=");
        sb.append(this.d);
        sb.append(", isTablet=");
        sb.append(this.e);
        sb.append(", searchInfo=");
        sb.append(this.f);
        sb.append(", showChangeAvatar=");
        sb.append(this.g);
        sb.append(", isTabRoot=");
        sb.append(this.h);
        sb.append(", mode=");
        sb.append(this.i);
        sb.append(", skeletonParams=");
        sb.append(this.j);
        sb.append(", isCurrentUser=");
        sb.append(this.k);
        sb.append(", initialTab=");
        sb.append(this.l);
        sb.append(", useDefaultNativeNavigation=");
        sb.append(this.m);
        sb.append(", navigateToEditProfile=");
        return defpackage.q0.a(sb, this.n, ')');
    }

    public htq0(String str, String str2, String str3, String str4, boolean z, SearchStatsLoggingInfo searchStatsLoggingInfo, boolean z2, gzs<Boolean> gzsVar, UserProfileMode userProfileMode, UserProfileSkeletonParams userProfileSkeletonParams, boolean z3, Integer num, boolean z4, boolean z5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = searchStatsLoggingInfo;
        this.g = z2;
        this.h = gzsVar;
        this.i = userProfileMode;
        this.j = userProfileSkeletonParams;
        this.k = z3;
        this.l = num;
        this.m = z4;
        this.n = z5;
    }

    public /* synthetic */ htq0(String str, String str2, String str3, String str4, boolean z, SearchStatsLoggingInfo searchStatsLoggingInfo, boolean z2, gzs gzsVar, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : searchStatsLoggingInfo, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? new c24(0) : gzsVar, UserProfileMode.Profile, null, false, null, false, false);
    }
}
