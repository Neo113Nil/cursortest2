package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.friends.groupinvite.impl.models.InviteFriendsTabIndex;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: InviteFriendsPath.kt */
/* loaded from: classes14.dex */
public interface orx extends xl50 {

    /* compiled from: InviteFriendsPath.kt */
    public static final class a implements orx {
    }

    /* compiled from: InviteFriendsPath.kt */
    public static final class b implements orx {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(true);
        }

        public final String toString() {
            return "Loading(isLoading=true)";
        }
    }

    /* compiled from: InviteFriendsPath.kt */
    public interface c extends orx {

        /* compiled from: InviteFriendsPath.kt */
        public static final class a implements c {
            public final List<UserId> b;

            public a(List<UserId> list) {
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("ChangeFriendsSelection(selectedFriendsIds="), this.b);
            }
        }

        /* compiled from: InviteFriendsPath.kt */
        public static final class b implements c {
            public final InviteFriendsTabIndex b;

            public b(InviteFriendsTabIndex inviteFriendsTabIndex) {
                this.b = inviteFriendsTabIndex;
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
                return "ChangeTab(tabIndex=" + this.b + ')';
            }
        }

        /* compiled from: InviteFriendsPath.kt */
        /* renamed from: xsna.orx$c$c, reason: collision with other inner class name */
        public static final class C3467c implements c {
            public final InviteFriendsTabIndex b;
            public final asx c;

            public C3467c(InviteFriendsTabIndex inviteFriendsTabIndex, asx asxVar) {
                this.b = inviteFriendsTabIndex;
                this.c = asxVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3467c)) {
                    return false;
                }
                C3467c c3467c = (C3467c) obj;
                return this.b == c3467c.b && epx.f(this.c, c3467c.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                return "ChangeTabState(tabIndex=" + this.b + ", state=" + this.c + ')';
            }
        }

        /* compiled from: InviteFriendsPath.kt */
        public static final class d implements c {
            public final UserId b;

            public d(UserId userId) {
                this.b = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
            }

            public final int hashCode() {
                return Long.hashCode(this.b.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("RevokeInvite(userId="), this.b, ')');
            }
        }

        /* compiled from: InviteFriendsPath.kt */
        public static final class e implements c {
            public final yrx b;
            public final yrx c;
            public final yrx d;
            public final lps e;

            public e(yrx yrxVar, yrx yrxVar2, yrx yrxVar3, lps lpsVar) {
                this.b = yrxVar;
                this.c = yrxVar2;
                this.d = yrxVar3;
                this.e = lpsVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c) && epx.f(this.d, eVar.d) && epx.f(this.e, eVar.e);
            }

            public final int hashCode() {
                int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
                yrx yrxVar = this.d;
                return this.e.hashCode() + ((hashCode + (yrxVar == null ? 0 : yrxVar.hashCode())) * 31);
            }

            public final String toString() {
                return "SetMainData(notInvitedTab=" + this.b + ", selectedTab=" + this.c + ", invitedTab=" + this.d + ", invitationState=" + this.e + ')';
            }
        }
    }

    /* compiled from: InviteFriendsPath.kt */
    public interface d extends orx {

        /* compiled from: InviteFriendsPath.kt */
        public static final class b implements d {
            public static final b b = new b();
        }

        /* compiled from: InviteFriendsPath.kt */
        public static final class c implements d {
            public static final c b = new c();
        }

        /* compiled from: InviteFriendsPath.kt */
        /* renamed from: xsna.orx$d$d, reason: collision with other inner class name */
        public static final class C3468d implements d {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3468d)) {
                    return false;
                }
                ((C3468d) obj).getClass();
                return true;
            }

            public final int hashCode() {
                return Boolean.hashCode(false);
            }

            public final String toString() {
                return "Loading(isLoading=false)";
            }
        }

        /* compiled from: InviteFriendsPath.kt */
        public static final class e implements d {
            public final boolean b;

            public e(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.b == ((e) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("SetLoading(isLoading="), this.b, ')');
            }
        }

        /* compiled from: InviteFriendsPath.kt */
        public static final class f implements d {
            public final String b;

            public f(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("SetSearchQuery(query="), this.b, ')');
            }
        }

        /* compiled from: InviteFriendsPath.kt */
        public static final class g implements d {
            public final String b;
            public final List<jis> c;
            public final String d;

            public g(String str, List<jis> list, String str2) {
                this.b = str;
                this.c = list;
                this.d = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return epx.f(this.b, gVar.b) && epx.f(this.c, gVar.c) && epx.f(this.d, gVar.d);
            }

            public final int hashCode() {
                int a = fw3.a(this.b.hashCode() * 31, 31, this.c);
                String str = this.d;
                return a + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("SetSearchResult(query=");
                sb.append(this.b);
                sb.append(", foundedFriends=");
                sb.append(this.c);
                sb.append(", nextFrom=");
                return ho8.a(sb, this.d, ')');
            }
        }

        /* compiled from: InviteFriendsPath.kt */
        public static final class h implements d {
            public static final h b = new h();
        }

        /* compiled from: InviteFriendsPath.kt */
        public static final class i implements d {
            public final jis b;

            public i(jis jisVar) {
                this.b = jisVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "ToggleFriend(friend=" + this.b + ')';
            }
        }

        /* compiled from: InviteFriendsPath.kt */
        public static final class a implements d {
            public final List<jis> b;
            public final String c;

            public a(List<jis> list, String str) {
                this.b = list;
                this.c = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
            }

            public final int hashCode() {
                int hashCode = this.b.hashCode() * 31;
                String str = this.c;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AddSearchResult(foundedFriends=");
                sb.append(this.b);
                sb.append(", nextFrom=");
                return ho8.a(sb, this.c, ')');
            }

            public a() {
                this(EmptyList.b, null);
            }
        }
    }
}
