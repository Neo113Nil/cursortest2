package xsna;

/* compiled from: InsetStrategy.kt */
/* loaded from: classes3.dex */
public interface g4x {

    /* compiled from: InsetStrategy.kt */
    public static abstract class a implements g4x {

        /* compiled from: InsetStrategy.kt */
        /* renamed from: xsna.g4x$a$a, reason: collision with other inner class name */
        public static final class C2912a extends a {
            public final c a;

            public C2912a() {
                this(0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2912a) && epx.f(this.a, ((C2912a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "All(margins=" + this.a + ')';
            }

            public C2912a(c cVar) {
                this.a = cVar;
            }

            public /* synthetic */ C2912a(int i) {
                this(new c(0, 0, 0, 0, 15));
            }
        }

        /* compiled from: InsetStrategy.kt */
        public static final class c extends a {
            public final c a;

            public c() {
                this(0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "LeftRight(margins=" + this.a + ')';
            }

            public c(c cVar) {
                this.a = cVar;
            }

            public /* synthetic */ c(int i) {
                this(new c(0, 0, 0, 0, 15));
            }
        }

        /* compiled from: InsetStrategy.kt */
        public static final class d extends a {
            public final c a;

            public d() {
                this(0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "LeftRightBottomIfLandscapeTabletOrGestures(margins=" + this.a + ')';
            }

            public d(int i) {
                this.a = new c(0, 0, 0, 0, 15);
            }
        }

        /* compiled from: InsetStrategy.kt */
        public static final class b extends a {
            public final c a;

            public b(c cVar) {
                this.a = cVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Left(margins=" + this.a + ')';
            }

            public b() {
                this(new c(0, 0, 0, 0, 15));
            }
        }

        /* compiled from: InsetStrategy.kt */
        public static final class e extends a {
            public final c a;

            public e(c cVar) {
                this.a = cVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "LeftTopBottom(margins=" + this.a + ')';
            }

            public e() {
                this(new c(0, 0, 0, 0, 15));
            }
        }
    }

    /* compiled from: InsetStrategy.kt */
    public static final class b implements g4x {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 286582234;
        }

        public final String toString() {
            return "Ignore";
        }
    }

    /* compiled from: InsetStrategy.kt */
    public static final class c {
        public final int a;
        public final int b;
        public final int c;
        public final int d;

        public c() {
            this(0, 0, 0, 0, 15);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Margins(top=");
            sb.append(this.a);
            sb.append(", bottom=");
            sb.append(this.b);
            sb.append(", left=");
            sb.append(this.c);
            sb.append(", right=");
            return vu5.b(sb, this.d, ')');
        }

        public c(int i, int i2, int i3, int i4, int i5) {
            i = (i5 & 1) != 0 ? 0 : i;
            i2 = (i5 & 2) != 0 ? 0 : i2;
            i3 = (i5 & 4) != 0 ? 0 : i3;
            i4 = (i5 & 8) != 0 ? 0 : i4;
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }
    }

    /* compiled from: InsetStrategy.kt */
    public static final class d implements g4x {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -304437134;
        }

        public final String toString() {
            return "ProvideInsetsToChild";
        }
    }
}
