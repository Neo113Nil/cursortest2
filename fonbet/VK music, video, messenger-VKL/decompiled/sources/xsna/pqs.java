package xsna;

import com.vk.dto.user.UserProfile;

/* compiled from: FriendsListItem.kt */
/* loaded from: classes15.dex */
public final class pqs implements nqs {
    public final UserProfile a;

    public pqs(UserProfile userProfile) {
        this.a = userProfile;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pqs) && epx.f(this.a, ((pqs) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Profile(profile=" + this.a + ')';
    }
}
