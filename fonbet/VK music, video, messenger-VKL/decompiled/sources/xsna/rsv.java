package xsna;

/* compiled from: IdeasStoryAction.kt */
/* loaded from: classes6.dex */
public interface rsv extends kj50 {

    /* compiled from: IdeasStoryAction.kt */
    public interface a extends rsv {

        /* compiled from: IdeasStoryAction.kt */
        /* renamed from: xsna.rsv$a$a, reason: collision with other inner class name */
        public static final class C3628a implements a {
            public static final C3628a b = new C3628a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3628a);
            }

            public final int hashCode() {
                return -1648831161;
            }

            public final String toString() {
                return "OnLeftSwipe";
            }
        }

        /* compiled from: IdeasStoryAction.kt */
        public static final class b implements a {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 702751923;
            }

            public final String toString() {
                return "OnTopFling";
            }
        }

        /* compiled from: IdeasStoryAction.kt */
        public static final class c implements a {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1000223637;
            }

            public final String toString() {
                return "Start";
            }
        }

        /* compiled from: IdeasStoryAction.kt */
        public static final class d implements a {
            public final float b;

            public d(float f) {
                this.b = f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && Float.compare(this.b, ((d) obj).b) == 0;
            }

            public final int hashCode() {
                return Float.hashCode(this.b);
            }

            public final String toString() {
                return xq.c(')', this.b, new StringBuilder("UpdateDragProgress(dragScale="));
            }
        }
    }

    /* compiled from: IdeasStoryAction.kt */
    public interface b extends rsv {

        /* compiled from: IdeasStoryAction.kt */
        public static final class a implements b {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1827435007;
            }

            public final String toString() {
                return "HideIdeas";
            }
        }

        /* compiled from: IdeasStoryAction.kt */
        /* renamed from: xsna.rsv$b$b, reason: collision with other inner class name */
        public static final class C3629b implements b {
            public static final C3629b b = new C3629b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3629b);
            }

            public final int hashCode() {
                return 1619469480;
            }

            public final String toString() {
                return "OpenSettings";
            }
        }
    }

    /* compiled from: IdeasStoryAction.kt */
    public interface c extends rsv {

        /* compiled from: IdeasStoryAction.kt */
        public static final class a implements c {
            public final boolean b;

            public a(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.b == ((a) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("BackGradient(show="), this.b, ')');
            }
        }

        /* compiled from: IdeasStoryAction.kt */
        public static final class b implements c {
            public final boolean b;

            public b(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.b == ((b) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("BottomControls(show="), this.b, ')');
            }
        }

        /* compiled from: IdeasStoryAction.kt */
        /* renamed from: xsna.rsv$c$c, reason: collision with other inner class name */
        public static final class C3630c implements c {
            public final boolean b;
            public final boolean c;
            public final boolean d;

            public C3630c(boolean z, boolean z2, boolean z3) {
                this.b = z;
                this.c = z2;
                this.d = z3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3630c)) {
                    return false;
                }
                C3630c c3630c = (C3630c) obj;
                return this.b == c3630c.b && this.c == c3630c.c && this.d == c3630c.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Controls(show=");
                sb.append(this.b);
                sb.append(", withDelay=");
                sb.append(this.c);
                sb.append(", excludeAnimation=");
                return defpackage.q0.a(sb, this.d, ')');
            }
        }

        /* compiled from: IdeasStoryAction.kt */
        public static final class d implements c {
        }
    }
}
