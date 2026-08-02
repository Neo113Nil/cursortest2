package xsna;

/* compiled from: RelatedUserPinInputPatch.kt */
/* loaded from: classes6.dex */
public interface psf0 extends xl50 {

    /* compiled from: RelatedUserPinInputPatch.kt */
    public static abstract class a implements psf0 {

        /* compiled from: RelatedUserPinInputPatch.kt */
        /* renamed from: xsna.psf0$a$a, reason: collision with other inner class name */
        public static final class C3528a extends a {
            public static final C3528a b = new C3528a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3528a);
            }

            public final int hashCode() {
                return -1477161902;
            }

            public final String toString() {
                return "CommonError";
            }
        }

        /* compiled from: RelatedUserPinInputPatch.kt */
        public static final class b extends a {
            public final String b;

            public b(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                String str = this.b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("NetworkError(message="), this.b, ')');
            }
        }

        /* compiled from: RelatedUserPinInputPatch.kt */
        public static final class c extends a {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 45777332;
            }

            public final String toString() {
                return "ToManyTries";
            }
        }
    }

    /* compiled from: RelatedUserPinInputPatch.kt */
    public static final class b implements psf0 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1182505625;
        }

        public final String toString() {
            return "FirstInteraction";
        }
    }

    /* compiled from: RelatedUserPinInputPatch.kt */
    public static final class c implements psf0 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1359500091;
        }

        public final String toString() {
            return "Input";
        }
    }

    /* compiled from: RelatedUserPinInputPatch.kt */
    public static final class d implements psf0 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1867244407;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
