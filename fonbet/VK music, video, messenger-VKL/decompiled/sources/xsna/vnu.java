package xsna;

/* compiled from: GroupedNotificationListSideEffect.kt */
/* loaded from: classes4.dex */
public interface vnu {

    /* compiled from: GroupedNotificationListSideEffect.kt */
    public static final class a implements vnu {
        public final ha70 a;

        public a(ha70 ha70Var) {
            this.a = ha70Var;
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
            return "ListItemEffect(action=" + this.a + ')';
        }
    }

    /* compiled from: GroupedNotificationListSideEffect.kt */
    public static final class b implements vnu {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1996371454;
        }

        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: GroupedNotificationListSideEffect.kt */
    public static final class c implements vnu {
        public final long a;
        public final String b;

        public c(long j, String str) {
            this.a = j;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenCommunitySettings(groupId=");
            sb.append(this.a);
            sb.append(", title=");
            return ho8.a(sb, this.b, ')');
        }
    }
}
