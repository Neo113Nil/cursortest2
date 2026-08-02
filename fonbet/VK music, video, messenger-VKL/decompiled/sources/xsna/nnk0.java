package xsna;

/* compiled from: SseEvent.kt */
/* loaded from: classes3.dex */
public abstract class nnk0 {

    /* compiled from: SseEvent.kt */
    public static final class a extends nnk0 {
        public static final a a = new a();
    }

    /* compiled from: SseEvent.kt */
    public static final class b extends nnk0 {
        public final String a;
        public final String b;
        public final String c;

        public b(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return this.c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DataEvent(id=");
            sb.append(this.a);
            sb.append(", type=");
            sb.append(this.b);
            sb.append(", data=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: SseEvent.kt */
    public static final class c extends nnk0 {
        public static final c a = new c();
    }

    /* compiled from: SseEvent.kt */
    public static final class d extends nnk0 {
        public final long a;

        public d(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("RetryChangedEvent(retryTimeout="));
        }
    }
}
