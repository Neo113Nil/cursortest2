package xsna;

import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;

/* compiled from: CatalogOwnerInfo.kt */
/* loaded from: classes16.dex */
public final class rba {
    public final UserProfile a;
    public final Group b;

    public rba(UserProfile userProfile, Group group) {
        this.a = userProfile;
        this.b = group;
    }

    public final UserProfile a() {
        return this.a;
    }

    public final Group b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rba)) {
            return false;
        }
        rba rbaVar = (rba) obj;
        return epx.f(this.a, rbaVar.a) && epx.f(this.b, rbaVar.b);
    }

    public final int hashCode() {
        UserProfile userProfile = this.a;
        int hashCode = (userProfile == null ? 0 : userProfile.hashCode()) * 31;
        Group group = this.b;
        return hashCode + (group != null ? group.hashCode() : 0);
    }

    public final String toString() {
        return "CatalogOwnerInfo(profile=" + this.a + ", group=" + this.b + ')';
    }
}
