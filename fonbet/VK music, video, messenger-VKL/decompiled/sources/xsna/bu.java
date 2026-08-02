package xsna;

/* compiled from: Action.kt */
/* loaded from: classes8.dex */
public interface bu {

    /* compiled from: Action.kt */
    public interface a extends bu {

        /* compiled from: Action.kt */
        /* renamed from: xsna.bu$a$a, reason: collision with other inner class name */
        public static final class C2622a implements a {
            public static final C2622a a = new C2622a();
        }

        /* compiled from: Action.kt */
        public static final class b implements a {
            public static final b a = new b();
        }

        /* compiled from: Action.kt */
        public static final class c implements a {
            public static final c a = new c();
        }

        /* compiled from: Action.kt */
        public static final class d implements a {
            public static final d a = new d();
        }

        /* compiled from: Action.kt */
        public static final class e implements a {
            public static final e a = new e();
        }

        /* compiled from: Action.kt */
        public static final class f implements a {
            public static final f a = new f();
        }

        /* compiled from: Action.kt */
        public static final class g implements a {
            public static final g a = new g();
        }

        /* compiled from: Action.kt */
        public static final class h implements a {
            public static final h a = new h();
        }

        /* compiled from: Action.kt */
        public static final class i implements a {
            public static final i a = new i();
        }

        /* compiled from: Action.kt */
        public static final class j implements a {
            public static final j a = new j();
        }

        /* compiled from: Action.kt */
        public static final class k implements a {
            public static final k a = new k();
        }

        /* compiled from: Action.kt */
        public static final class l implements a {
            public static final l a = new l();
        }

        /* compiled from: Action.kt */
        public static final class m implements a {
            public static final m a = new m();
        }

        /* compiled from: Action.kt */
        public static final class n implements a {
            public static final n a = new n();
        }
    }

    /* compiled from: Action.kt */
    public static final class b implements bu {
        public static final b a = new b();
    }

    /* compiled from: Action.kt */
    public interface c extends bu {

        /* compiled from: Action.kt */
        public static final class a implements c {
            public static final a a = new a();
        }

        /* compiled from: Action.kt */
        public static final class b implements c {
            public static final b a = new b();
        }

        /* compiled from: Action.kt */
        /* renamed from: xsna.bu$c$c, reason: collision with other inner class name */
        public static final class C2623c implements c {
            public static final C2623c a = new C2623c();
        }

        /* compiled from: Action.kt */
        public static final class d implements c {
            public static final d a = new d();
        }
    }

    /* compiled from: Action.kt */
    public static final class d implements bu {
        public static final d a = new d();
    }

    /* compiled from: Action.kt */
    public interface e extends bu {

        /* compiled from: Action.kt */
        public static final class a implements e {
            public final sox a;
            public final int b;

            public a(sox soxVar, int i) {
                this.a = soxVar;
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && this.b == aVar.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "SeekbarIntervalChanged(intervals=" + this.a + ", intervalIndex=" + this.b + ")";
            }
        }

        /* compiled from: Action.kt */
        public static final class b implements e {
            public final long a;

            public b(long j) {
                this.a = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return Long.hashCode(this.a);
            }

            public final String toString() {
                return qlb0.a(this.a, "SeekbarPositionChanged(position=", ")");
            }
        }

        /* compiled from: Action.kt */
        public static final class c implements e {
            public static final c a = new c();
        }

        /* compiled from: Action.kt */
        public static final class d implements e {
            public static final d a = new d();
        }
    }

    /* compiled from: Action.kt */
    public interface f extends bu {

        /* compiled from: Action.kt */
        public static final class a implements f {
            public final boolean a;

            public a(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a == ((a) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return com.vk.movika.sdk.android.defaultplayer.interactive.c.a("ModeChanged(animate=", ")", this.a);
            }
        }
    }
}
