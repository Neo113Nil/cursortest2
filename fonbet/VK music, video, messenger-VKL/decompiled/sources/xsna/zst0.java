package xsna;

import java.util.Stack;

/* compiled from: VideosQueue.kt */
/* loaded from: classes3.dex */
public interface zst0 {

    /* compiled from: VideosQueue.kt */
    public interface a {

        /* compiled from: VideosQueue.kt */
        /* renamed from: xsna.zst0$a$a, reason: collision with other inner class name */
        public static final class C4199a implements a {
            public static final C4199a a = new C4199a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C4199a);
            }

            public final int hashCode() {
                return 1160643374;
            }

            public final String toString() {
                return "History";
            }
        }

        /* compiled from: VideosQueue.kt */
        public static final class b implements a {
            public final boolean a;

            public b(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("Playlist(isDownloaded="), this.a, ')');
            }
        }
    }

    void a(ece0 ece0Var);

    a2s0 b(boolean z, boolean z2);

    a2s0 c();

    kat0 d();

    void e(nct0 nct0Var);

    Stack<a2s0> f();

    void g();

    void h(a aVar, boolean z, boolean z2);

    void i(pat0 pat0Var);

    a u();
}
