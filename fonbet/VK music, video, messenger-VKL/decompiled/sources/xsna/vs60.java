package xsna;

import xsna.xn60;

/* compiled from: NewsfeedMainAction.kt */
/* loaded from: classes4.dex */
public interface vs60 extends lj50 {

    /* compiled from: NewsfeedMainAction.kt */
    public interface a extends vs60 {

        /* compiled from: NewsfeedMainAction.kt */
        /* renamed from: xsna.vs60$a$a, reason: collision with other inner class name */
        public static final class C3901a implements a {
            public static final C3901a b = new C3901a();
        }
    }

    /* compiled from: NewsfeedMainAction.kt */
    public static final class b implements vs60 {
        public final xn60.a b;

        public b(xn60.a aVar) {
            this.b = aVar;
        }
    }

    /* compiled from: NewsfeedMainAction.kt */
    public interface c extends vs60 {

        /* compiled from: NewsfeedMainAction.kt */
        public static final class a implements c {
            public static final a b = new a();
        }

        /* compiled from: NewsfeedMainAction.kt */
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
                return defpackage.q0.a(new StringBuilder("ScrollAppBar(scrolled="), this.b, ')');
            }
        }

        /* compiled from: NewsfeedMainAction.kt */
        /* renamed from: xsna.vs60$c$c, reason: collision with other inner class name */
        public static final class C3902c implements c {
            public final long b;

            public C3902c(long j) {
                this.b = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3902c) && this.b == ((C3902c) obj).b;
            }

            public final int hashCode() {
                return Long.hashCode(this.b);
            }

            public final String toString() {
                return "ScrollList(scrollPositions=" + ((Object) ("ScrollPositions(packed=" + this.b + ')')) + ')';
            }
        }
    }

    /* compiled from: NewsfeedMainAction.kt */
    public interface d extends vs60 {

        /* compiled from: NewsfeedMainAction.kt */
        public static final class a implements d {
            public static final a b = new a();
        }
    }

    /* compiled from: NewsfeedMainAction.kt */
    public static final class e implements vs60 {
        public final xn60.b b;

        public e(xn60.b bVar) {
            this.b = bVar;
        }
    }

    /* compiled from: NewsfeedMainAction.kt */
    public interface f extends vs60 {

        /* compiled from: NewsfeedMainAction.kt */
        public static final class a implements f {
            public final xn60.c b;

            public a(xn60.c cVar) {
                this.b = cVar;
            }
        }
    }

    /* compiled from: NewsfeedMainAction.kt */
    public interface g extends vs60 {

        /* compiled from: NewsfeedMainAction.kt */
        public static final class a implements g {
            public static final a b = new a();
        }

        /* compiled from: NewsfeedMainAction.kt */
        public static final class b implements g {
            public static final b b = new b();
        }

        /* compiled from: NewsfeedMainAction.kt */
        public static final class c implements g {
            public static final c b = new c();
        }
    }

    /* compiled from: NewsfeedMainAction.kt */
    public interface h extends vs60 {
    }

    /* compiled from: NewsfeedMainAction.kt */
    public interface i extends vs60 {

        /* compiled from: NewsfeedMainAction.kt */
        public static final class a implements i {
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
                return defpackage.q0.a(new StringBuilder("CallInAppReviewForGarland(needReset="), this.b, ')');
            }
        }

        /* compiled from: NewsfeedMainAction.kt */
        public static final class b implements i {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -850093045;
            }

            public final String toString() {
                return "InitCallInAppReview";
            }
        }

        /* compiled from: NewsfeedMainAction.kt */
        public static final class c implements i {
            public final k070 b;

            public c(k070 k070Var) {
                this.b = k070Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Loaded(stories=" + this.b + ')';
            }
        }

        /* compiled from: NewsfeedMainAction.kt */
        public static final class d implements i {
        }

        /* compiled from: NewsfeedMainAction.kt */
        public static final class e implements i {
            public final k070 b;

            public e(k070 k070Var) {
                this.b = k070Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "UpdateStories(stories=" + this.b + ')';
            }
        }
    }
}
