package xsna;

/* compiled from: BirthdaysListPatch.kt */
/* loaded from: classes15.dex */
public interface ta7 extends xl50 {

    /* compiled from: BirthdaysListPatch.kt */
    public static abstract class a implements ta7 {

        /* compiled from: BirthdaysListPatch.kt */
        /* renamed from: xsna.ta7$a$a, reason: collision with other inner class name */
        public static final class C3732a extends a {
            public final Throwable b;

            public C3732a(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3732a) && epx.f(this.b, ((C3732a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: BirthdaysListPatch.kt */
        public static final class b extends a {
            public final la7 b;

            public b(la7 la7Var) {
                this.b = la7Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Result(content=" + this.b + ')';
            }
        }

        /* compiled from: BirthdaysListPatch.kt */
        public static final class c extends a {
            public static final c b = new c();
        }
    }

    /* compiled from: BirthdaysListPatch.kt */
    public static abstract class b implements ta7 {

        /* compiled from: BirthdaysListPatch.kt */
        public static final class a extends b {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: BirthdaysListPatch.kt */
        /* renamed from: xsna.ta7$b$b, reason: collision with other inner class name */
        public static final class C3733b extends b {
            public final qa7 b;

            public C3733b(qa7 qa7Var) {
                this.b = qa7Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3733b) && epx.f(this.b, ((C3733b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Result(page=" + this.b + ')';
            }
        }

        /* compiled from: BirthdaysListPatch.kt */
        public static final class c extends b {
            public static final c b = new c();
        }
    }

    /* compiled from: BirthdaysListPatch.kt */
    public static abstract class c implements ta7 {

        /* compiled from: BirthdaysListPatch.kt */
        public static final class a extends c {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: BirthdaysListPatch.kt */
        public static final class b extends c {
            public final la7 b;

            public b(la7 la7Var) {
                this.b = la7Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Result(content=" + this.b + ')';
            }
        }

        /* compiled from: BirthdaysListPatch.kt */
        /* renamed from: xsna.ta7$c$c, reason: collision with other inner class name */
        public static final class C3734c extends c {
            public static final C3734c b = new C3734c();
        }
    }
}
