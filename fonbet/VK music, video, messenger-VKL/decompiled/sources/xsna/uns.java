package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: FriendsCleanupSideEffect.kt */
/* loaded from: classes15.dex */
public interface uns {

    /* compiled from: FriendsCleanupSideEffect.kt */
    public interface a extends uns {

        /* compiled from: FriendsCleanupSideEffect.kt */
        /* renamed from: xsna.uns$a$a, reason: collision with other inner class name */
        public static final class C3811a implements a {
            public static final C3811a a = new C3811a();
        }

        /* compiled from: FriendsCleanupSideEffect.kt */
        public static final class b implements a {
            public final int a;
            public final boolean b;

            public b(int i, boolean z) {
                this.a = i;
                this.b = z;
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
                return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("DeleteAllSuggestedFriends(count=");
                sb.append(this.a);
                sb.append(", isCurrentUserProfileClosed=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }

        /* compiled from: FriendsCleanupSideEffect.kt */
        public static final class c implements a {
            public static final c a = new c();
        }

        /* compiled from: FriendsCleanupSideEffect.kt */
        public static final class d implements a {
            public final UserId a;
            public final String b;
            public final boolean c;

            public d(UserId userId, String str, boolean z) {
                this.a = userId;
                this.b = str;
                this.c = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && this.c == dVar.c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.c) + urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("DeleteSingleFriend(userId=");
                sb.append(this.a);
                sb.append(", nameAcc=");
                sb.append(this.b);
                sb.append(", isCurrentUserProfileClosed=");
                return defpackage.q0.a(sb, this.c, ')');
            }
        }
    }

    /* compiled from: FriendsCleanupSideEffect.kt */
    public interface b extends uns {

        /* compiled from: FriendsCleanupSideEffect.kt */
        public static final class a implements b {
            public final boolean a;
            public final boolean b;

            public a(boolean z, boolean z2) {
                this.a = z;
                this.b = z2;
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
                return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("CleanupFinished(isAllSuggestedFriendsDeleted=");
                sb.append(this.a);
                sb.append(", isFinishedByBackPress=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }

        /* compiled from: FriendsCleanupSideEffect.kt */
        /* renamed from: xsna.uns$b$b, reason: collision with other inner class name */
        public static final class C3812b implements b {
            public final UserId a;

            public C3812b(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3812b) && epx.f(this.a, ((C3812b) obj).a);
            }

            public final int hashCode() {
                return Long.hashCode(this.a.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("Profile(userId="), this.a, ')');
            }
        }
    }

    /* compiled from: FriendsCleanupSideEffect.kt */
    public interface c extends uns {

        /* compiled from: FriendsCleanupSideEffect.kt */
        public static final class a implements c {
            public final Throwable a;

            public a(Throwable th) {
                this.a = th;
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
                return oq.c(new StringBuilder("Error(error="), this.a, ')');
            }
        }

        /* compiled from: FriendsCleanupSideEffect.kt */
        public static final class b implements c {
            public final String a;
            public final boolean b;
            public final boolean c;

            public b(String str, boolean z, boolean z2) {
                this.a = str;
                this.b = z;
                this.c = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.c) + qoy.b(this.a.hashCode() * 31, 31, this.b);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("FriendDeleted(nameNom=");
                sb.append(this.a);
                sb.append(", isFemale=");
                sb.append(this.b);
                sb.append(", isKeptInFollowers=");
                return defpackage.q0.a(sb, this.c, ')');
            }
        }

        /* compiled from: FriendsCleanupSideEffect.kt */
        /* renamed from: xsna.uns$c$c, reason: collision with other inner class name */
        public static final class C3813c implements c {
            public final boolean a;

            public C3813c(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3813c) && this.a == ((C3813c) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("OutcomingRequest(isFollowOnly="), this.a, ')');
            }
        }
    }
}
