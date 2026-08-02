package xsna;

/* compiled from: VideoAdBannerRepository.kt */
/* loaded from: classes2.dex */
public interface lyr0 {

    /* compiled from: VideoAdBannerRepository.kt */
    public interface a {

        /* compiled from: VideoAdBannerRepository.kt */
        /* renamed from: xsna.lyr0$a$a, reason: collision with other inner class name */
        public static final class C3311a implements a {
            public final boolean a;

            public C3311a() {
                this(false);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3311a) && this.a == ((C3311a) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("Empty(noAd="), this.a, ')');
            }

            public C3311a(boolean z) {
                this.a = z;
            }
        }

        /* compiled from: VideoAdBannerRepository.kt */
        public static final class b implements a {
            public final cw50 a;
            public final zu50 b;

            public b(cw50 cw50Var, zu50 zu50Var) {
                this.a = cw50Var;
                this.b = zu50Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Native(banner=" + this.a + ", nativeAd=" + this.b + ')';
            }
        }

        /* compiled from: VideoAdBannerRepository.kt */
        public static final class c implements a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -2057282270;
            }

            public final String toString() {
                return "TrapBanner";
            }
        }
    }

    void a(String str, String str2);

    io.reactivex.rxjava3.core.q<a> b();
}
