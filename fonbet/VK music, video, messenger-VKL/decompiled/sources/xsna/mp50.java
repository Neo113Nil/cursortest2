package xsna;

/* compiled from: MyTargetClickHandler.kt */
/* loaded from: classes2.dex */
public interface mp50 {

    /* compiled from: MyTargetClickHandler.kt */
    public interface a {

        /* compiled from: MyTargetClickHandler.kt */
        /* renamed from: xsna.mp50$a$a, reason: collision with other inner class name */
        public static final class C3362a implements a {
            public final String a;

            public C3362a(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3362a) && epx.f(this.a, ((C3362a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("AdChoice(alias="), this.a, ')');
            }
        }

        /* compiled from: MyTargetClickHandler.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 939467756;
            }

            public final String toString() {
                return "Cta";
            }
        }

        /* compiled from: MyTargetClickHandler.kt */
        public static final class c implements a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 900775220;
            }

            public final String toString() {
                return "Title";
            }
        }
    }

    void a(a aVar);
}
