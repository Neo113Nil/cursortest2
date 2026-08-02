package xsna;

import com.vk.dto.user.RequestUserProfile;
import java.util.List;

/* compiled from: FriendsAndFollowersTabContent.kt */
/* loaded from: classes15.dex */
public final class dls {
    public final List<RequestUserProfile> a;
    public final boolean b;

    /* JADX WARN: Multi-variable type inference failed */
    public dls(List<? extends RequestUserProfile> list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dls)) {
            return false;
        }
        dls dlsVar = (dls) obj;
        return epx.f(this.a, dlsVar.a) && this.b == dlsVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsAndFollowersTabContent(items=");
        sb.append(this.a);
        sb.append(", hasMore=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
