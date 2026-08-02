package xsna;

import com.vk.friends.impl.friendsandfollowers.tabbedscreen.domain.FriendsAndFollowersTabType;

/* compiled from: FriendsAndFollowersAction.kt */
/* loaded from: classes15.dex */
public interface eks extends kj50 {

    /* compiled from: FriendsAndFollowersAction.kt */
    public static final class a implements eks {
        public final FriendsAndFollowersTabType b;
        public final els c;

        public a(FriendsAndFollowersTabType friendsAndFollowersTabType, els elsVar) {
            this.b = friendsAndFollowersTabType;
            this.c = elsVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "Init(selectedTabType=" + this.b + ", tabData=" + this.c + ')';
        }
    }

    /* compiled from: FriendsAndFollowersAction.kt */
    public static final class b implements eks {
        public final FriendsAndFollowersTabType b;

        public b(FriendsAndFollowersTabType friendsAndFollowersTabType) {
            this.b = friendsAndFollowersTabType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SelectTab(type=" + this.b + ')';
        }
    }

    /* compiled from: FriendsAndFollowersAction.kt */
    public static final class c implements eks {
        public final FriendsAndFollowersTabType b;
        public final int c;

        public c(int i, FriendsAndFollowersTabType friendsAndFollowersTabType) {
            this.b = friendsAndFollowersTabType;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.b == cVar.b && this.c == cVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateTabCount(type=");
            sb.append(this.b);
            sb.append(", count=");
            return vu5.b(sb, this.c, ')');
        }
    }
}
