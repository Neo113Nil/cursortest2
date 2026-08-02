package xsna;

/* compiled from: AudioBookPersonAction.kt */
/* loaded from: classes3.dex */
public interface uh4 extends kj50 {

    /* compiled from: AudioBookPersonAction.kt */
    public static final class a implements uh4 {
        public final int b;

        public a(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ClickByPerson(id="), this.b, ')');
        }
    }

    /* compiled from: AudioBookPersonAction.kt */
    public static final class b implements uh4 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -918286633;
        }

        public final String toString() {
            return "CopyLinkClick";
        }
    }

    /* compiled from: AudioBookPersonAction.kt */
    public static final class c implements uh4 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 684397106;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: AudioBookPersonAction.kt */
    public static final class d implements uh4 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1034460021;
        }

        public final String toString() {
            return "ShareClick";
        }
    }
}
