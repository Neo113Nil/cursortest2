package xsna;

import java.util.HashMap;

/* compiled from: ClipsTrendingHashtagsPreloader.kt */
/* loaded from: classes17.dex */
public final class saf {
    public static final HashMap<String, spp0> d = new HashMap<>();
    public static a e = a.b.a;
    public final r4k a;
    public io.reactivex.rxjava3.internal.operators.single.n b;
    public io.reactivex.rxjava3.disposables.c c;

    /* compiled from: ClipsTrendingHashtagsPreloader.kt */
    public interface a {

        /* compiled from: ClipsTrendingHashtagsPreloader.kt */
        /* renamed from: xsna.saf$a$a, reason: collision with other inner class name */
        public static final class C3655a implements a {
            public static final C3655a a = new C3655a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3655a);
            }

            public final int hashCode() {
                return 884846191;
            }

            public final String toString() {
                return "Error";
            }
        }

        /* compiled from: ClipsTrendingHashtagsPreloader.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1275574925;
            }

            public final String toString() {
                return "Idle";
            }
        }

        /* compiled from: ClipsTrendingHashtagsPreloader.kt */
        public static final class c implements a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1857544318;
            }

            public final String toString() {
                return "Loaded";
            }
        }

        /* compiled from: ClipsTrendingHashtagsPreloader.kt */
        public static final class d implements a {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 1749303267;
            }

            public final String toString() {
                return "Loading";
            }
        }
    }

    public saf(r4k r4kVar) {
        this.a = r4kVar;
    }

    public final io.reactivex.rxjava3.internal.operators.single.n a() {
        return new io.reactivex.rxjava3.internal.operators.single.n(new io.reactivex.rxjava3.internal.operators.single.o(rsg0.D0(yfb.x(((mgj0) ((b1y) ((jn4) this.a.b).b).c).A(null))).l(new mj1(new oj(9), 10)), new gn0(new qu(this, 23), 13)).h(new bg1(new lb(this, 26), 18)), new hz(new ire(this, 2), 20));
    }

    public final void b() {
        if (epx.f(e, a.d.a) || epx.f(e, a.c.a)) {
            return;
        }
        io.reactivex.rxjava3.internal.operators.single.n a2 = a();
        this.b = a2;
        this.c = itg0.n(a2);
    }
}
