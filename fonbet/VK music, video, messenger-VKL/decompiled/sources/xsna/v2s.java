package xsna;

/* compiled from: FoldingFeature.kt */
/* loaded from: classes12.dex */
public interface v2s extends pen {

    /* compiled from: FoldingFeature.kt */
    public static final class a {
        public static final a b = new a("VERTICAL");
        public static final a c = new a("HORIZONTAL");
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final String toString() {
            return this.a;
        }
    }

    /* compiled from: FoldingFeature.kt */
    public static final class b {
        public static final b b = new b("FLAT");
        public static final b c = new b("HALF_OPENED");
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final String toString() {
            return this.a;
        }
    }

    boolean a();

    a getOrientation();
}
