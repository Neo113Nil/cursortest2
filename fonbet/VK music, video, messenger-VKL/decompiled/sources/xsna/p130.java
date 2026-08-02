package xsna;

/* compiled from: ModalPostReactionsPatch.kt */
/* loaded from: classes4.dex */
public interface p130 extends xl50 {

    /* compiled from: ModalPostReactionsPatch.kt */
    public static final class a implements p130 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1499586323;
        }

        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: ModalPostReactionsPatch.kt */
    public static final class b implements p130 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -190916729;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: ModalPostReactionsPatch.kt */
    public static final class c implements p130 {
        public final int b;
        public final String c;

        public c(int i, String str) {
            this.b = i;
            this.c = str;
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
            StringBuilder sb = new StringBuilder("UpdateCount(count=");
            sb.append(this.b);
            sb.append(", fragmentId=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: ModalPostReactionsPatch.kt */
    public static final class d implements p130 {
        public final o130 b;

        public d(o130 o130Var) {
            this.b = o130Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateInfo(info=" + this.b + ')';
        }
    }
}
