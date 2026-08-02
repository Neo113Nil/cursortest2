package xsna;

/* compiled from: MusicPickerPatch.kt */
/* loaded from: classes4.dex */
public interface fu40 extends xl50 {

    /* compiled from: MusicPickerPatch.kt */
    public interface a extends fu40 {
    }

    /* compiled from: MusicPickerPatch.kt */
    public static final class b implements fu40 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1525479004;
        }

        public final String toString() {
            return "RemoveAttach";
        }
    }

    /* compiled from: MusicPickerPatch.kt */
    public interface c extends fu40 {

        /* compiled from: MusicPickerPatch.kt */
        public static final class a implements c {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1909772506;
            }

            public final String toString() {
                return "Clear";
            }
        }

        /* compiled from: MusicPickerPatch.kt */
        public static final class b implements c {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -843201626;
            }

            public final String toString() {
                return "Finish";
            }
        }

        /* compiled from: MusicPickerPatch.kt */
        /* renamed from: xsna.fu40$c$c, reason: collision with other inner class name */
        public static final class C2894c implements c {
            public static final C2894c b = new C2894c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C2894c);
            }

            public final int hashCode() {
                return 1924783855;
            }

            public final String toString() {
                return "Start";
            }
        }

        /* compiled from: MusicPickerPatch.kt */
        public static final class d implements c {
            public final String b;

            public d(String str) {
                this.b = str;
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
                return ho8.a(new StringBuilder("UpdateQuery(query="), this.b, ')');
            }
        }
    }
}
