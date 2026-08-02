package xsna;

import com.vk.dto.newsfeed.entries.ProfilesRecommendations;

/* compiled from: FriendsAddWithRecommendations.kt */
/* loaded from: classes14.dex */
public final class bks {
    public final int a;
    public final ProfilesRecommendations b;

    public bks(int i, ProfilesRecommendations profilesRecommendations) {
        this.a = i;
        this.b = profilesRecommendations;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bks)) {
            return false;
        }
        bks bksVar = (bks) obj;
        return this.a == bksVar.a && epx.f(this.b, bksVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        ProfilesRecommendations profilesRecommendations = this.b;
        return hashCode + (profilesRecommendations == null ? 0 : profilesRecommendations.hashCode());
    }

    public final String toString() {
        return "FriendsAddWithRecommendationsResult(status=" + this.a + ", recommendations=" + this.b + ')';
    }
}
