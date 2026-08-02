package xsna;

import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;

/* compiled from: ScreenName.kt */
/* loaded from: classes14.dex */
public final class mch0 {
    public final String a;
    public final long b;
    public final UserId c;
    public final UserProfile d;
    public final Group e;
    public final ApiApplication f;
    public final se3 g;

    public mch0(String str, long j, UserId userId, UserProfile userProfile, Group group, ApiApplication apiApplication, se3 se3Var) {
        this.a = str;
        this.b = j;
        this.c = userId;
        this.d = userProfile;
        this.e = group;
        this.f = apiApplication;
        this.g = se3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mch0)) {
            return false;
        }
        mch0 mch0Var = (mch0) obj;
        return epx.f(this.a, mch0Var.a) && this.b == mch0Var.b && epx.f(this.c, mch0Var.c) && epx.f(this.d, mch0Var.d) && epx.f(this.e, mch0Var.e) && epx.f(this.f, mch0Var.f) && epx.f(this.g, mch0Var.g);
    }

    public final int hashCode() {
        int a = bh10.a(bh10.a(this.a.hashCode() * 31, 31, this.b), 31, this.c.b);
        UserProfile userProfile = this.d;
        int hashCode = (a + (userProfile == null ? 0 : userProfile.hashCode())) * 31;
        Group group = this.e;
        int hashCode2 = (hashCode + (group == null ? 0 : group.hashCode())) * 31;
        ApiApplication apiApplication = this.f;
        int hashCode3 = (hashCode2 + (apiApplication == null ? 0 : apiApplication.hashCode())) * 31;
        se3 se3Var = this.g;
        return hashCode3 + (se3Var != null ? se3Var.hashCode() : 0);
    }

    public final String toString() {
        return "ScreenName(type=" + this.a + ", objectId=" + this.b + ", communityId=" + this.c + ", user=" + this.d + ", group=" + this.e + ", app=" + this.f + ", embeddedUrl=" + this.g + ')';
    }
}
