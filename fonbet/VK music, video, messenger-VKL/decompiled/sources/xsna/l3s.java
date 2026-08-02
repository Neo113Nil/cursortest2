package xsna;

import com.vk.dto.common.id.UserId;
import xsna.g3s;
import xsna.j3s;

/* compiled from: FollowersListPatch.kt */
/* loaded from: classes15.dex */
public abstract class l3s implements xl50 {

    /* compiled from: FollowersListPatch.kt */
    public static final class a extends l3s {
        public final UserId b;
        public final boolean c;

        public a(UserId userId, boolean z) {
            this.b = userId;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Long.hashCode(this.b.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AddFollowerToFriends(uid=");
            sb.append(this.b);
            sb.append(", removeListItem=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: FollowersListPatch.kt */
    public static final class b extends l3s {
        public final UserId b;

        public b(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("DeleteFollower(uid="), this.b, ')');
        }
    }

    /* compiled from: FollowersListPatch.kt */
    public static final class c extends l3s {
        public final UserId b;

        public c(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("DeleteFromFriends(uid="), this.b, ')');
        }
    }

    /* compiled from: FollowersListPatch.kt */
    public static abstract class d extends l3s {

        /* compiled from: FollowersListPatch.kt */
        public static final class a extends d {
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

        /* compiled from: FollowersListPatch.kt */
        public static final class b extends d {
            public final g3s.a b;

            public b(g3s.a aVar) {
                this.b = aVar;
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

        /* compiled from: FollowersListPatch.kt */
        public static final class c extends d {
            public static final c b = new c();
        }
    }

    /* compiled from: FollowersListPatch.kt */
    public static abstract class e extends l3s {

        /* compiled from: FollowersListPatch.kt */
        public static final class a extends e {
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

        /* compiled from: FollowersListPatch.kt */
        public static final class b extends e {
            public final j3s.b b;

            public b(j3s.b bVar) {
                this.b = bVar;
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
                return "Result(page=" + this.b + ')';
            }
        }

        /* compiled from: FollowersListPatch.kt */
        public static final class c extends e {
            public static final c b = new c();
        }
    }

    /* compiled from: FollowersListPatch.kt */
    public static abstract class f extends l3s {

        /* compiled from: FollowersListPatch.kt */
        public static final class a extends f {
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

        /* compiled from: FollowersListPatch.kt */
        public static final class b extends f {
            public final g3s.a b;

            public b(g3s.a aVar) {
                this.b = aVar;
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

        /* compiled from: FollowersListPatch.kt */
        public static final class c extends f {
            public static final c b = new c();
        }
    }

    /* compiled from: FollowersListPatch.kt */
    public static final class g extends l3s {
        public final UserId b;
        public final boolean c;

        public g(UserId userId, boolean z) {
            this.b = userId;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.b, gVar.b) && this.c == gVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Long.hashCode(this.b.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StartMutualFollowing(uid=");
            sb.append(this.b);
            sb.append(", removeListItem=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }
}
