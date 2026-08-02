package xsna;

/* compiled from: GameNotificationIntercation.kt */
/* loaded from: classes17.dex */
public abstract class q7t {

    /* compiled from: GameNotificationIntercation.kt */
    public static final class a extends q7t {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -2054626818;
        }

        public final String toString() {
            return "AllNotificationViewed";
        }
    }

    /* compiled from: GameNotificationIntercation.kt */
    public static final class b extends q7t {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("NotificationDelete(requestId="), this.a, ')');
        }
    }

    /* compiled from: GameNotificationIntercation.kt */
    public static final class c extends q7t {
        public final int a;
        public final sbt b;
        public final Integer c;
        public final String d;

        public c(int i, sbt sbtVar, Integer num, String str) {
            this.a = i;
            this.b = sbtVar;
            this.c = num;
            this.d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d);
        }

        public final int hashCode() {
            int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
            Integer num = this.c;
            return this.d.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationPlay(requestId=");
            sb.append(this.a);
            sb.append(", app=");
            sb.append(this.b);
            sb.append(", innerIndex=");
            sb.append(this.c);
            sb.append(", requestKey=");
            return ho8.a(sb, this.d, ')');
        }
    }

    /* compiled from: GameNotificationIntercation.kt */
    public static final class d extends q7t {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1317342825;
        }

        public final String toString() {
            return "ShowAllNotificationScreen";
        }
    }
}
