package xsna;

/* compiled from: DescriptionAction.kt */
/* loaded from: classes7.dex */
public interface k1m extends lj50 {

    /* compiled from: DescriptionAction.kt */
    public static final class a implements k1m {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1389968279;
        }

        public final String toString() {
            return "BackPressed";
        }
    }

    /* compiled from: DescriptionAction.kt */
    public static final class b implements k1m {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -488973832;
        }

        public final String toString() {
            return "ButtonCancelClick";
        }
    }

    /* compiled from: DescriptionAction.kt */
    public static final class c implements k1m {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1616173909;
        }

        public final String toString() {
            return "ButtonSaveClick";
        }
    }

    /* compiled from: DescriptionAction.kt */
    public static final class d implements k1m, uj50 {
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
            return ho8.a(new StringBuilder("Changed(newDescription="), this.b, ')');
        }
    }

    /* compiled from: DescriptionAction.kt */
    public interface e extends k1m {

        /* compiled from: DescriptionAction.kt */
        public static final class a implements e {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1564525164;
            }

            public final String toString() {
                return "ButtonCancelClick";
            }
        }

        /* compiled from: DescriptionAction.kt */
        public static final class b implements e {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1453712656;
            }

            public final String toString() {
                return "ButtonExitClick";
            }
        }

        /* compiled from: DescriptionAction.kt */
        public static final class c implements e {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 186660226;
            }

            public final String toString() {
                return "Dismiss";
            }
        }
    }
}
