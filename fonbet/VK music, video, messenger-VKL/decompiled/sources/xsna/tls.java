package xsna;

import com.vk.friends.impl.friendsandfollowers.tabbedscreen.domain.FriendsAndFollowersTabType;

/* compiled from: FriendsAndFollowersViewState.kt */
/* loaded from: classes15.dex */
public final class tls implements ao50 {
    public final fi50 a;

    /* compiled from: FriendsAndFollowersViewState.kt */
    public static final class a implements fm50<xks> {
        public final yzt0<FriendsAndFollowersTabType> a;
        public final yzt0<els> b;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(selectedTabType=");
            sb.append(this.a);
            sb.append(", tabData=");
            return tr.c(sb, this.b, ')');
        }
    }

    public tls(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
