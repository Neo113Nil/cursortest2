package xsna;

import com.vk.api.generated.users.dto.UsersUserFullDto;

/* compiled from: FriendsAndFollowersTabPatch.kt */
/* loaded from: classes15.dex */
public interface hls extends xl50 {

    /* compiled from: FriendsAndFollowersTabPatch.kt */
    public interface a extends hls {

        /* compiled from: FriendsAndFollowersTabPatch.kt */
        /* renamed from: xsna.hls$a$a, reason: collision with other inner class name */
        public static final class C3006a implements a {
            public final Throwable b;

            public C3006a(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3006a) && epx.f(this.b, ((C3006a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: FriendsAndFollowersTabPatch.kt */
        public static final class b implements a {
            public final dls b;

            public b(dls dlsVar) {
                this.b = dlsVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Result(content=" + this.b + ')';
            }
        }

        /* compiled from: FriendsAndFollowersTabPatch.kt */
        public static final class c implements a {
            public static final c b = new c();
        }
    }

    /* compiled from: FriendsAndFollowersTabPatch.kt */
    public interface b extends hls {

        /* compiled from: FriendsAndFollowersTabPatch.kt */
        public static final class a implements b {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
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
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: FriendsAndFollowersTabPatch.kt */
        /* renamed from: xsna.hls$b$b, reason: collision with other inner class name */
        public static final class C3007b implements b {
            public final jks b;

            public C3007b(jks jksVar) {
                this.b = jksVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3007b) && epx.f(this.b, ((C3007b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Result(page=" + this.b + ')';
            }
        }

        /* compiled from: FriendsAndFollowersTabPatch.kt */
        public static final class c implements b {
            public static final c b = new c();
        }
    }

    /* compiled from: FriendsAndFollowersTabPatch.kt */
    public static final class c implements hls {
        public final UsersUserFullDto b;

        public c(UsersUserFullDto usersUserFullDto) {
            this.b = usersUserFullDto;
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
            return "RefreshFriendsAndFollowersOwnerProfile(refreshedProfile=" + this.b + ')';
        }
    }

    /* compiled from: FriendsAndFollowersTabPatch.kt */
    public interface d extends hls {

        /* compiled from: FriendsAndFollowersTabPatch.kt */
        public static final class a implements d {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
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
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: FriendsAndFollowersTabPatch.kt */
        public static final class b implements d {
            public final dls b;

            public b(dls dlsVar) {
                this.b = dlsVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Result(content=" + this.b + ')';
            }
        }

        /* compiled from: FriendsAndFollowersTabPatch.kt */
        public static final class c implements d {
            public static final c b = new c();
        }
    }
}
