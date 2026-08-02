package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ClipsAuthorItem.kt */
/* loaded from: classes14.dex */
public interface chd {

    /* compiled from: ClipsAuthorItem.kt */
    public static final class a {
        public static chd a(UserId userId) {
            if (!fkq0.d(userId) || userId.equals(o25.a().c())) {
                return (fkq0.d(userId) && userId.equals(o25.a().c())) ? new d(o25.a().o()) : new b(fkq0.a(userId), null);
            }
            com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException("Must be user id of current user or group id"));
            return c.a;
        }
    }

    /* compiled from: ClipsAuthorItem.kt */
    public static final class b implements chd {
        public final UserId a;
        public final String b;
        public final UserId c;

        public b(UserId userId, String str) {
            this.a = userId;
            this.b = str;
            this.c = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        @Override // xsna.chd
        public final UserId getId() {
            return this.c;
        }

        @Override // xsna.chd
        public final String getName() {
            return this.b;
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.a.b) * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // xsna.chd
        public final String i() {
            return "";
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GroupItem(groupId=");
            sb.append(this.a);
            sb.append(", name=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: ClipsAuthorItem.kt */
    public static final class c implements chd {
        public static final c a = new c();

        @Override // xsna.chd
        public final UserId getId() {
            return null;
        }

        @Override // xsna.chd
        public final String getName() {
            return "";
        }

        @Override // xsna.chd
        public final String i() {
            return null;
        }
    }

    /* compiled from: ClipsAuthorItem.kt */
    public static final class d implements chd {
        public final cn a;
        public final String b;
        public final UserId c;
        public final String d;

        public d(cn cnVar) {
            this.a = cnVar;
            this.b = cnVar.b;
            this.c = cnVar.a;
            this.d = cnVar.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        @Override // xsna.chd
        public final UserId getId() {
            return this.c;
        }

        @Override // xsna.chd
        public final String getName() {
            return this.b;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // xsna.chd
        public final String i() {
            return this.d;
        }

        public final String toString() {
            return "UserItem(user=" + this.a + ')';
        }
    }

    UserId getId();

    String getName();

    String i();
}
