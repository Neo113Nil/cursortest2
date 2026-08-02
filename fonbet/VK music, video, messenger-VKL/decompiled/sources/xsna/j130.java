package xsna;

/* compiled from: ModalPostReactionsAction.kt */
/* loaded from: classes4.dex */
public abstract class j130 implements kj50 {

    /* compiled from: ModalPostReactionsAction.kt */
    public static final class a extends j130 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -704623559;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: ModalPostReactionsAction.kt */
    public static final class b extends j130 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -360439649;
        }

        public final String toString() {
            return "Retry";
        }
    }

    /* compiled from: ModalPostReactionsAction.kt */
    public static final class c extends j130 {
        public final int b;
        public final String c = "donats";

        public c(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.b == cVar.b && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateTabsCount(count=");
            sb.append(this.b);
            sb.append(", fragmentId=");
            return ho8.a(sb, this.c, ')');
        }
    }
}
