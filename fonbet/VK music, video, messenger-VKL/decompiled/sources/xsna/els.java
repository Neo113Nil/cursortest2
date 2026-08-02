package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.friends.impl.friendsandfollowers.tabbedscreen.domain.FriendsAndFollowersTabType;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: FriendsAndFollowersTabData.kt */
/* loaded from: classes15.dex */
public final class els {
    public static final els e = new els(UserId.d, EmptyList.b, "", true);
    public final UserId a;
    public final boolean b;
    public final String c;
    public final List<a> d;

    /* compiled from: FriendsAndFollowersTabData.kt */
    public static final class a {
        public final int a;
        public final FriendsAndFollowersTabType b;

        public a(int i, FriendsAndFollowersTabType friendsAndFollowersTabType) {
            this.a = i;
            this.b = friendsAndFollowersTabType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "Tab(count=" + this.a + ", type=" + this.b + ')';
        }
    }

    public els(UserId userId, List list, String str, boolean z) {
        this.a = userId;
        this.b = z;
        this.c = str;
        this.d = list;
    }

    public static els a(els elsVar, String str, ArrayList arrayList, int i) {
        UserId userId = elsVar.a;
        boolean z = elsVar.b;
        if ((i & 4) != 0) {
            str = elsVar.c;
        }
        elsVar.getClass();
        return new els(userId, arrayList, str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof els)) {
            return false;
        }
        els elsVar = (els) obj;
        return epx.f(this.a, elsVar.a) && this.b == elsVar.b && epx.f(this.c, elsVar.c) && epx.f(this.d, elsVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(qoy.b(Long.hashCode(this.a.b) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsAndFollowersTabData(userId=");
        sb.append(this.a);
        sb.append(", canAccessProfile=");
        sb.append(this.b);
        sb.append(", ownerName=");
        sb.append(this.c);
        sb.append(", tabs=");
        return ms9.a(')', sb, this.d);
    }
}
