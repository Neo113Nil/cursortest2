package xsna;

/* compiled from: BroadcastManagementFeatureSideEffect.kt */
/* loaded from: classes7.dex */
public abstract class gh8 {

    /* compiled from: BroadcastManagementFeatureSideEffect.kt */
    public static abstract class a extends gh8 {

        /* compiled from: BroadcastManagementFeatureSideEffect.kt */
        /* renamed from: xsna.gh8$a$a, reason: collision with other inner class name */
        public static final class C2944a extends a {
            public static final C2944a a = new C2944a();
        }

        /* compiled from: BroadcastManagementFeatureSideEffect.kt */
        public static final class b extends a {
            public static final b a = new b();
        }
    }

    /* compiled from: BroadcastManagementFeatureSideEffect.kt */
    public static abstract class b extends gh8 {

        /* compiled from: BroadcastManagementFeatureSideEffect.kt */
        public static final class a extends b {
            public static final a a = new a();
        }

        /* compiled from: BroadcastManagementFeatureSideEffect.kt */
        /* renamed from: xsna.gh8$b$b, reason: collision with other inner class name */
        public static final class C2945b extends b {
            public static final C2945b a = new C2945b();
        }
    }

    /* compiled from: BroadcastManagementFeatureSideEffect.kt */
    public static final class c extends gh8 {
        public static final c a = new c();
    }

    /* compiled from: BroadcastManagementFeatureSideEffect.kt */
    public static abstract class d extends gh8 {

        /* compiled from: BroadcastManagementFeatureSideEffect.kt */
        public static final class a extends d {
            public final String a;
            public final String b;

            public a(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Start(id=");
                sb.append(this.a);
                sb.append(", ownerId=");
                return ho8.a(sb, this.b, ')');
            }
        }

        /* compiled from: BroadcastManagementFeatureSideEffect.kt */
        public static final class b extends d {
            public static final b a = new b();
        }
    }

    /* compiled from: BroadcastManagementFeatureSideEffect.kt */
    public static abstract class e extends gh8 {

        /* compiled from: BroadcastManagementFeatureSideEffect.kt */
        public static final class a extends e {
            public static final a a = new a();
        }

        /* compiled from: BroadcastManagementFeatureSideEffect.kt */
        public static final class b extends e {
            public static final b a = new b();
        }
    }

    /* compiled from: BroadcastManagementFeatureSideEffect.kt */
    public static abstract class f extends gh8 {

        /* compiled from: BroadcastManagementFeatureSideEffect.kt */
        public static final class a extends f {
            public final String a;
            public final String b;
            public final boolean c;
            public final boolean d;

            public a(String str, String str2, boolean z, boolean z2) {
                this.a = str;
                this.b = str2;
                this.c = z;
                this.d = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + qoy.b(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Start(id=");
                sb.append(this.a);
                sb.append(", ownerId=");
                sb.append(this.b);
                sb.append(", inStories=");
                sb.append(this.c);
                sb.append(", onWall=");
                return defpackage.q0.a(sb, this.d, ')');
            }
        }

        /* compiled from: BroadcastManagementFeatureSideEffect.kt */
        public static final class b extends f {
            public static final b a = new b();
        }
    }

    /* compiled from: BroadcastManagementFeatureSideEffect.kt */
    public static final class g extends gh8 {
        public final rmy a;

        public g(rmy rmyVar) {
            this.a = rmyVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "StartLaunch(config=" + this.a + ')';
        }
    }

    /* compiled from: BroadcastManagementFeatureSideEffect.kt */
    public static final class h extends gh8 {
        public static final h a = new h();
    }

    /* compiled from: BroadcastManagementFeatureSideEffect.kt */
    public static final class i extends gh8 {
        public static final i a = new i();
    }

    /* compiled from: BroadcastManagementFeatureSideEffect.kt */
    public static final class j extends gh8 {
        public static final j a = new j();
    }

    /* compiled from: BroadcastManagementFeatureSideEffect.kt */
    public static final class k extends gh8 {
        public static final k a = new k();
    }

    /* compiled from: BroadcastManagementFeatureSideEffect.kt */
    public static final class l extends gh8 {
    }
}
