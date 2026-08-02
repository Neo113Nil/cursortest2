package xsna;

import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: FriendsCleanupPage.kt */
/* loaded from: classes15.dex */
public final class hns {
    public final String a;
    public final List<UsersUserFullDto> b;
    public final List<UsersUserFullDto> c;
    public final int d;

    static {
        EmptyList emptyList = EmptyList.b;
    }

    public hns(int i, String str, List list, List list2) {
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hns)) {
            return false;
        }
        hns hnsVar = (hns) obj;
        return epx.f(this.a, hnsVar.a) && epx.f(this.b, hnsVar.b) && epx.f(this.c, hnsVar.c) && this.d == hnsVar.d;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(false) + shy.a(this.d, fw3.a(fw3.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsCleanupPage(description=");
        sb.append(this.a);
        sb.append(", items=");
        sb.append(this.b);
        sb.append(", mutuals=");
        sb.append(this.c);
        sb.append(", totalCount=");
        return h5s.c(this.d, ", hasMore=false)", sb);
    }
}
