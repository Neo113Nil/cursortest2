package xsna;

import com.vk.dto.common.data.VKFromList;
import com.vk.dto.user.RequestUserProfile;

/* compiled from: FriendsRecommendationsPage.kt */
/* loaded from: classes13.dex */
public final class ass {
    public final VKFromList<RequestUserProfile> a;
    public final String b;

    public ass(VKFromList<RequestUserProfile> vKFromList, String str) {
        this.a = vKFromList;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ass)) {
            return false;
        }
        ass assVar = (ass) obj;
        return epx.f(this.a, assVar.a) && epx.f(this.b, assVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsRecommendationsPage(items=");
        sb.append(this.a);
        sb.append(", trackCode=");
        return ho8.a(sb, this.b, ')');
    }
}
