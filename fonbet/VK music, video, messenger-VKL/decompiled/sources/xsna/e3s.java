package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: FollowersListAction.kt */
/* loaded from: classes15.dex */
public abstract class e3s implements kj50 {

    /* compiled from: FollowersListAction.kt */
    public static abstract class a extends e3s {

        /* compiled from: FollowersListAction.kt */
        /* renamed from: xsna.e3s$a$a, reason: collision with other inner class name */
        public static final class C2775a extends a {
            public final UserId b;
            public final boolean c;
            public final boolean d;

            public C2775a(boolean z, UserId userId, boolean z2) {
                this.b = userId;
                this.c = z;
                this.d = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2775a)) {
                    return false;
                }
                C2775a c2775a = (C2775a) obj;
                return epx.f(this.b, c2775a.b) && this.c == c2775a.c && this.d == c2775a.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + qoy.b(Long.hashCode(this.b.b) * 31, 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AddedToFriends(uid=");
                sb.append(this.b);
                sb.append(", isExternalAction=");
                sb.append(this.c);
                sb.append(", notifyExternal=");
                return defpackage.q0.a(sb, this.d, ')');
            }
        }

        /* compiled from: FollowersListAction.kt */
        public static final class b extends a {
            public final UserId b;
            public final boolean c;
            public final boolean d;

            public b(boolean z, UserId userId, boolean z2) {
                this.b = userId;
                this.c = z;
                this.d = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + qoy.b(Long.hashCode(this.b.b) * 31, 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Deleted(uid=");
                sb.append(this.b);
                sb.append(", isExternalAction=");
                sb.append(this.c);
                sb.append(", notifyExternal=");
                return defpackage.q0.a(sb, this.d, ')');
            }
        }

        /* compiled from: FollowersListAction.kt */
        public static final class c extends a {
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
                return gp.b(new StringBuilder("DeletedFromFriends(uid="), this.b, ')');
            }
        }

        /* compiled from: FollowersListAction.kt */
        public static final class d extends a {
            public final UserId b;
            public final boolean c;
            public final boolean d;

            public d(boolean z, UserId userId, boolean z2) {
                this.b = userId;
                this.c = z;
                this.d = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return epx.f(this.b, dVar.b) && this.c == dVar.c && this.d == dVar.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + qoy.b(Long.hashCode(this.b.b) * 31, 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("StartedMutualFollowing(uid=");
                sb.append(this.b);
                sb.append(", isExternalAction=");
                sb.append(this.c);
                sb.append(", notifyExternal=");
                return defpackage.q0.a(sb, this.d, ')');
            }
        }
    }

    /* compiled from: FollowersListAction.kt */
    public static abstract class b extends e3s {

        /* compiled from: FollowersListAction.kt */
        public static final class a extends b {
            public static final a b = new a();
        }

        /* compiled from: FollowersListAction.kt */
        /* renamed from: xsna.e3s$b$b, reason: collision with other inner class name */
        public static final class C2776b extends b {
            public static final C2776b b = new C2776b();
        }
    }

    /* compiled from: FollowersListAction.kt */
    public static abstract class c extends e3s {

        /* compiled from: FollowersListAction.kt */
        public static final class a extends c {
            public static final a b = new a();
        }

        /* compiled from: FollowersListAction.kt */
        public static final class b extends c {
            public static final b b = new b();
        }
    }

    /* compiled from: FollowersListAction.kt */
    public static abstract class d extends e3s {

        /* compiled from: FollowersListAction.kt */
        public static final class a extends d {
            public static final a b = new a();
        }

        /* compiled from: FollowersListAction.kt */
        public static final class b extends d {
            public static final b b = new b();
        }
    }
}
