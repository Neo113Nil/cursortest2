package xsna;

import com.vk.friends.impl.friendsandfollowers.tabbedscreen.domain.FriendsAndFollowersTabType;

/* compiled from: FriendsAndFollowersPatch.kt */
/* loaded from: classes15.dex */
public interface oks extends xl50 {

    /* compiled from: FriendsAndFollowersPatch.kt */
    public static final class a implements oks {
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
            return "InitialDataLoaded(selectedTabType=" + this.b + ", tabData=" + this.c + ')';
        }
    }

    /* compiled from: FriendsAndFollowersPatch.kt */
    public static final class b implements oks {
        public final FriendsAndFollowersTabType b;
        public final int c;

        public b(int i, FriendsAndFollowersTabType friendsAndFollowersTabType) {
            this.b = friendsAndFollowersTabType;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && this.c == bVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TabCountUpdated(type=");
            sb.append(this.b);
            sb.append(", count=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: FriendsAndFollowersPatch.kt */
    public static final class c implements oks {
        public final els b;

        public c(els elsVar) {
            this.b = elsVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "TabDataUpdated(tabData=" + this.b + ')';
        }
    }

    /* compiled from: FriendsAndFollowersPatch.kt */
    public static final class d implements oks {
        public final FriendsAndFollowersTabType b;

        public d(FriendsAndFollowersTabType friendsAndFollowersTabType) {
            this.b = friendsAndFollowersTabType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "TabSelected(type=" + this.b + ')';
        }
    }
}
