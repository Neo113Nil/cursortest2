package xsna;

/* compiled from: RequestTagExt.kt */
/* loaded from: classes.dex */
public abstract class k8g0 {

    /* compiled from: RequestTagExt.kt */
    public static final class a extends k8g0 {
        public final int a;
        public final String b;

        public a(int i, String str) {
            this.a = i;
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
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ApiRequest(retryCount=");
            sb.append(this.a);
            sb.append(", method=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: RequestTagExt.kt */
    public static final class b extends k8g0 {
        public static final b a = new b();
    }

    /* compiled from: RequestTagExt.kt */
    public static final class c extends k8g0 {
        public final int a;

        public c(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("LongPoll(timeoutSec="), this.a, ')');
        }
    }

    /* compiled from: RequestTagExt.kt */
    /* loaded from: classes17.dex */
    public static final class d extends k8g0 {
        public static final d a = new d();
    }

    /* compiled from: RequestTagExt.kt */
    public static final class e extends k8g0 {
        public final long a;

        public e(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("Stat(id="));
        }
    }
}
