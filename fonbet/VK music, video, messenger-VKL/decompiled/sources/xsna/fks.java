package xsna;

import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.friends.impl.friendsandfollowers.tabbedscreen.domain.FriendsAndFollowersTabType;

/* compiled from: FriendsAndFollowersEvent.kt */
/* loaded from: classes15.dex */
public interface fks {

    /* compiled from: FriendsAndFollowersEvent.kt */
    public static final class a implements fks {
        public final UsersUserFullDto a;

        public a(UsersUserFullDto usersUserFullDto) {
            this.a = usersUserFullDto;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "FriendsAndFollowersOwnerProfileUpdate(profile=" + this.a + ')';
        }
    }

    /* compiled from: FriendsAndFollowersEvent.kt */
    public static final class b implements fks {
        public final FriendsAndFollowersTabType a;
        public final int b;

        public b(int i, FriendsAndFollowersTabType friendsAndFollowersTabType) {
            this.a = friendsAndFollowersTabType;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TabCountChanged(type=");
            sb.append(this.a);
            sb.append(", count=");
            return vu5.b(sb, this.b, ')');
        }
    }
}
