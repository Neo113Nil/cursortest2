package xsna;

import com.vk.dto.user.RequestUserProfile;
import java.util.List;

/* compiled from: FollowersListRepository.kt */
/* loaded from: classes15.dex */
public final class k4s {
    public final int a;
    public final List<RequestUserProfile> b;

    /* JADX WARN: Multi-variable type inference failed */
    public k4s(int i, List<? extends RequestUserProfile> list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4s)) {
            return false;
        }
        k4s k4sVar = (k4s) obj;
        return this.a == k4sVar.a && epx.f(this.b, k4sVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FollowersPageData(totalCount=");
        sb.append(this.a);
        sb.append(", items=");
        return ms9.a(')', sb, this.b);
    }
}
