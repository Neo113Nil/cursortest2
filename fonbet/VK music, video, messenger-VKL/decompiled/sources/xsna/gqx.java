package xsna;

import com.vk.friends.groupinvite.impl.models.InviteFriendsTabIndex;

/* compiled from: InviteFriendsAction.kt */
/* loaded from: classes14.dex */
public interface gqx extends kj50 {

    /* compiled from: InviteFriendsAction.kt */
    public static final class a implements gqx {
        public static final a b = new a();
    }

    /* compiled from: InviteFriendsAction.kt */
    public static final class b implements gqx {
        public static final b b = new b();
    }

    /* compiled from: InviteFriendsAction.kt */
    public static final class c implements gqx {
        public final InviteFriendsTabIndex b;
        public final String c;

        public c(InviteFriendsTabIndex inviteFriendsTabIndex, String str) {
            this.b = inviteFriendsTabIndex;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.b == cVar.b && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LoadMoreFriends(tabIndex=");
            sb.append(this.b);
            sb.append(", startFrom=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: InviteFriendsAction.kt */
    public static final class d implements gqx {
        public final InviteFriendsTabIndex b;

        public d(InviteFriendsTabIndex inviteFriendsTabIndex) {
            this.b = inviteFriendsTabIndex;
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
            return "TabClicked(tabIndex=" + this.b + ')';
        }
    }
}
