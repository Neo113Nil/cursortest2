package xsna;

import com.vk.api.generated.users.dto.UsersUserFullDto;

/* compiled from: FriendsAndFollowersTabState.kt */
/* loaded from: classes15.dex */
public interface ols extends km50 {

    /* compiled from: FriendsAndFollowersTabState.kt */
    public static final class a implements ols {
        public final dls b;
        public final qtf0 c;
        public final rf90 d;

        public a(dls dlsVar, qtf0 qtf0Var, rf90 rf90Var) {
            this.b = dlsVar;
            this.c = qtf0Var;
            this.d = rf90Var;
        }

        public static a a(a aVar, dls dlsVar, qtf0 qtf0Var, rf90 rf90Var, int i) {
            if ((i & 1) != 0) {
                dlsVar = aVar.b;
            }
            if ((i & 2) != 0) {
                qtf0Var = aVar.c;
            }
            if ((i & 4) != 0) {
                rf90Var = aVar.d;
            }
            aVar.getClass();
            return new a(dlsVar, qtf0Var, rf90Var);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "Content(content=" + this.b + ", reloadState=" + this.c + ", pagingState=" + this.d + ')';
        }
    }

    /* compiled from: FriendsAndFollowersTabState.kt */
    public static final class b implements ols {
        public final UsersUserFullDto b;
        public final boolean c;

        public b(UsersUserFullDto usersUserFullDto, boolean z) {
            this.b = usersUserFullDto;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && this.c == bVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ContentUnavailable(profile=");
            sb.append(this.b);
            sb.append(", isActionCommitted=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: FriendsAndFollowersTabState.kt */
    public static final class c implements ols {
        public final Throwable b;

        public c(Throwable th) {
            this.b = th;
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
            return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
        }
    }

    /* compiled from: FriendsAndFollowersTabState.kt */
    public static final class d implements ols {
        public static final d b = new d();
    }
}
