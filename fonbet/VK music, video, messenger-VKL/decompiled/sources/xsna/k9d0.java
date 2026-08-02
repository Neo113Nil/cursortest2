package xsna;

/* compiled from: PrimaryButtonsFeatureState.kt */
/* loaded from: classes7.dex */
public final class k9d0 {
    public final boolean a;
    public final b b;
    public final c c;
    public final e d;
    public final d e;
    public final f f;
    public final g g;
    public final boolean h;
    public final boolean i;
    public final h j;

    /* compiled from: PrimaryButtonsFeatureState.kt */
    public static abstract class a {

        /* compiled from: PrimaryButtonsFeatureState.kt */
        /* renamed from: xsna.k9d0$a$a, reason: collision with other inner class name */
        public static final class C3171a extends a {
            public static final C3171a a = new C3171a();
        }

        /* compiled from: PrimaryButtonsFeatureState.kt */
        public static final class b extends a {
            public final boolean a;
            public final b69 b;

            public b(boolean z, b69 b69Var) {
                this.a = z;
                this.b = b69Var;
            }
        }

        /* compiled from: PrimaryButtonsFeatureState.kt */
        public static final class c extends a {
            public static final c a = new c();
        }
    }

    /* compiled from: PrimaryButtonsFeatureState.kt */
    public static final class b {
        public final boolean a;
        public final a b;

        public b() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "FeedbackState(isEnabled=" + this.a + ", buttonState=" + this.b + ')';
        }

        public b(boolean z, a aVar) {
            this.a = z;
            this.b = aVar;
        }

        public /* synthetic */ b(int i) {
            this(false, a.C3171a.a);
        }
    }

    /* compiled from: PrimaryButtonsFeatureState.kt */
    public static final class c {
        public final boolean a;
        public final boolean b;

        public c() {
            this(false, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OwnCameraState(isEnabled=");
            sb.append(this.a);
            sb.append(", isOn=");
            return defpackage.q0.a(sb, this.b, ')');
        }

        public c(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }
    }

    /* compiled from: PrimaryButtonsFeatureState.kt */
    public static final class d {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public d() {
            this(false, false, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b && this.c == dVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OwnHandState(isVisible=");
            sb.append(this.a);
            sb.append(", isRaised=");
            sb.append(this.b);
            sb.append(", isEnabled=");
            return defpackage.q0.a(sb, this.c, ')');
        }

        public d(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }
    }

    /* compiled from: PrimaryButtonsFeatureState.kt */
    public static final class e {
        public final boolean a;
        public final boolean b;

        public e() {
            this(false, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && this.b == eVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OwnMicState(isEnabled=");
            sb.append(this.a);
            sb.append(", isOn=");
            return defpackage.q0.a(sb, this.b, ')');
        }

        public e(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }
    }

    /* compiled from: PrimaryButtonsFeatureState.kt */
    public static final class f {
        public final boolean a;
        public final boolean b;

        public f() {
            this(false, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a == fVar.a && this.b == fVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SpeakerState(isLoudSpeakerOn=");
            sb.append(this.a);
            sb.append(", isVisible=");
            return defpackage.q0.a(sb, this.b, ')');
        }

        public f(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }
    }

    /* compiled from: PrimaryButtonsFeatureState.kt */
    public static final class g {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;

        public g() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a == gVar.a && this.b == gVar.b && this.c == gVar.c && this.d == gVar.d && this.e == gVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("WatchTogetherState(isVisible=");
            sb.append(this.a);
            sb.append(", isPlaying=");
            sb.append(this.b);
            sb.append(", isButtonEnabled=");
            sb.append(this.c);
            sb.append(", isMediaOptionAllowed=");
            sb.append(this.d);
            sb.append(", isPlayAllowed=");
            return defpackage.q0.a(sb, this.e, ')');
        }

        public /* synthetic */ g(int i) {
            this(false, false, false, false, false);
        }

        public g(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
            this.e = z5;
        }
    }

    /* compiled from: PrimaryButtonsFeatureState.kt */
    public static final class h {
        public final boolean a;

        public h() {
            this(false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.a == ((h) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("WhiteboardState(isVisible="), this.a, ')');
        }

        public h(boolean z) {
            this.a = z;
        }
    }

    public k9d0(boolean z, b bVar, c cVar, e eVar, d dVar, f fVar, g gVar, boolean z2, boolean z3, h hVar) {
        this.a = z;
        this.b = bVar;
        this.c = cVar;
        this.d = eVar;
        this.e = dVar;
        this.f = fVar;
        this.g = gVar;
        this.h = z2;
        this.i = z3;
        this.j = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9d0)) {
            return false;
        }
        k9d0 k9d0Var = (k9d0) obj;
        return this.a == k9d0Var.a && epx.f(this.b, k9d0Var.b) && epx.f(this.c, k9d0Var.c) && epx.f(this.d, k9d0Var.d) && epx.f(this.e, k9d0Var.e) && epx.f(this.f, k9d0Var.f) && epx.f(this.g, k9d0Var.g) && this.h == k9d0Var.h && this.i == k9d0Var.i && epx.f(this.j, k9d0Var.j);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j.a) + qoy.b(qoy.b((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.h), 31, this.i);
    }

    public final String toString() {
        return "PrimaryButtonsFeatureState(isVisible=" + this.a + ", feedbackState=" + this.b + ", ownCameraState=" + this.c + ", ownMicState=" + this.d + ", ownHandState=" + this.e + ", speakerState=" + this.f + ", watchTogetherState=" + this.g + ", isCloseButtonVisible=" + this.h + ", isLeaveRoomButtonVisible=" + this.i + ", whiteboardState=" + this.j + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k9d0() {
        this(true, new b(r0), new c(false, false), new e(false, false), new d(false, false, false), new f(false, false), new g(r0), true, false, new h(false));
        int i = 0;
    }
}
