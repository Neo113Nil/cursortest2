package xsna;

import com.vk.dto.user.RequestUserProfile;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: FriendsAndFollowersListPage.kt */
/* loaded from: classes15.dex */
public final class jks {
    public static final jks d = new jks(null, EmptyList.b, false);
    public final List<RequestUserProfile> a;
    public final boolean b;
    public final Integer c;

    public jks(Integer num, List list, boolean z) {
        this.a = list;
        this.b = z;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jks)) {
            return false;
        }
        jks jksVar = (jks) obj;
        return epx.f(this.a, jksVar.a) && this.b == jksVar.b && epx.f(this.c, jksVar.c);
    }

    public final int hashCode() {
        int b = qoy.b(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return b + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsAndFollowersListPage(items=");
        sb.append(this.a);
        sb.append(", hasMore=");
        sb.append(this.b);
        sb.append(", totalCount=");
        return uqi.b(sb, this.c, ')');
    }
}
