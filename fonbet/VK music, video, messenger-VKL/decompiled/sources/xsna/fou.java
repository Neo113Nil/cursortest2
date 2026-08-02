package xsna;

/* compiled from: GroupedNotificationParams.kt */
/* loaded from: classes4.dex */
public interface fou {

    /* compiled from: GroupedNotificationParams.kt */
    public static final class a implements fou {
        public final long a;
        public final String b;

        public a(long j, String str) {
            this.a = j;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Group(id=");
            sb.append(this.a);
            sb.append(", name=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: GroupedNotificationParams.kt */
    public static final class b implements fou {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Query(query="), this.a, ')');
        }
    }
}
