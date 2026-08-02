package xsna;

import com.vk.dto.newsfeed.entries.ProfilesRecommendations;

/* compiled from: AddToFriendResult.kt */
/* loaded from: classes5.dex */
public final class fo0 {
    public final int a;
    public final ProfilesRecommendations b;

    public fo0(int i, ProfilesRecommendations profilesRecommendations) {
        this.a = i;
        this.b = profilesRecommendations;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo0)) {
            return false;
        }
        fo0 fo0Var = (fo0) obj;
        return this.a == fo0Var.a && epx.f(this.b, fo0Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        ProfilesRecommendations profilesRecommendations = this.b;
        return hashCode + (profilesRecommendations == null ? 0 : profilesRecommendations.hashCode());
    }

    public final String toString() {
        return "AddToFriendResult(status=" + this.a + ", recommendations=" + this.b + ')';
    }
}
