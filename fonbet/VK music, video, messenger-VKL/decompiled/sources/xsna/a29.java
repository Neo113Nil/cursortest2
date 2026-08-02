package xsna;

/* compiled from: CallDebugMenuFeatureState.kt */
/* loaded from: classes7.dex */
public final class a29 implements km50 {
    public final a b;
    public final b c;
    public final d d;
    public final c e;
    public final f f;
    public final e g;

    /* compiled from: CallDebugMenuFeatureState.kt */
    public static final class a {
        public final String a;

        public a() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("CallId(callId="), this.a, ')');
        }

        public a(String str) {
            this.a = str;
        }

        public /* synthetic */ a(int i) {
            this("");
        }
    }

    /* compiled from: CallDebugMenuFeatureState.kt */
    public static final class b {
        public final boolean a;
        public final boolean b;

        public b() {
            this(false, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HeadersBounds(isItemVisible=");
            sb.append(this.a);
            sb.append(", isHeadersBoundsVisible=");
            return defpackage.q0.a(sb, this.b, ')');
        }

        public b(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }
    }

    /* compiled from: CallDebugMenuFeatureState.kt */
    public static final class c {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;

        public c() {
            this(0);
        }

        public static c a(c cVar, boolean z, boolean z2, boolean z3, boolean z4, int i) {
            if ((i & 1) != 0) {
                z = cVar.a;
            }
            if ((i & 2) != 0) {
                z2 = cVar.b;
            }
            if ((i & 4) != 0) {
                z3 = cVar.c;
            }
            if ((i & 8) != 0) {
                z4 = cVar.d;
            }
            cVar.getClass();
            return new c(z, z2, z3, z4);
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
            return Boolean.hashCode(this.d) + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("JoinAsOptions(isItemVisible=");
            sb.append(this.a);
            sb.append(", isJoinAsGroupEnabled=");
            sb.append(this.b);
            sb.append(", isJoinAsAnonymousEnabled=");
            sb.append(this.c);
            sb.append(", isJoinWithChangedNameEnabled=");
            return defpackage.q0.a(sb, this.d, ')');
        }

        public /* synthetic */ c(int i) {
            this(false, true, true, true);
        }

        public c(boolean z, boolean z2, boolean z3, boolean z4) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
        }
    }

    /* compiled from: CallDebugMenuFeatureState.kt */
    public static final class d {
        public final boolean a;

        public d() {
            this(false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("OneLogSend(isItemVisible="), this.a, ')');
        }

        public d(boolean z) {
            this.a = z;
        }
    }

    /* compiled from: CallDebugMenuFeatureState.kt */
    public static final class e {
        public final boolean a;

        public e() {
            this(false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("TestOptions(isCrashOnCameraCloseRequired="), this.a, ')');
        }

        public e(boolean z) {
            this.a = z;
        }
    }

    /* compiled from: CallDebugMenuFeatureState.kt */
    public static final class f {
        public final boolean a;

        public f() {
            this(false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a == ((f) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("UIOptions(isStereoUIEnabled="), this.a, ')');
        }

        public f(boolean z) {
            this.a = z;
        }
    }

    public a29() {
        this(0);
    }

    public static a29 a(a29 a29Var, a aVar, b bVar, d dVar, c cVar, f fVar, e eVar, int i) {
        if ((i & 1) != 0) {
            aVar = a29Var.b;
        }
        a aVar2 = aVar;
        if ((i & 2) != 0) {
            bVar = a29Var.c;
        }
        b bVar2 = bVar;
        if ((i & 4) != 0) {
            dVar = a29Var.d;
        }
        d dVar2 = dVar;
        if ((i & 8) != 0) {
            cVar = a29Var.e;
        }
        c cVar2 = cVar;
        if ((i & 16) != 0) {
            fVar = a29Var.f;
        }
        f fVar2 = fVar;
        if ((i & 32) != 0) {
            eVar = a29Var.g;
        }
        a29Var.getClass();
        return new a29(aVar2, bVar2, dVar2, cVar2, fVar2, eVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a29)) {
            return false;
        }
        a29 a29Var = (a29) obj;
        return epx.f(this.b, a29Var.b) && epx.f(this.c, a29Var.c) && epx.f(this.d, a29Var.d) && epx.f(this.e, a29Var.e) && epx.f(this.f, a29Var.f) && epx.f(this.g, a29Var.g);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g.a) + qoy.b((this.e.hashCode() + qoy.b((this.c.hashCode() + (this.b.a.hashCode() * 31)) * 31, 31, this.d.a)) * 31, 31, this.f.a);
    }

    public final String toString() {
        return "CallDebugMenuFeatureState(callId=" + this.b + ", headersBounds=" + this.c + ", oneLogSend=" + this.d + ", joinAsOptions=" + this.e + ", uiOptions=" + this.f + ", testOptions=" + this.g + ')';
    }

    public a29(a aVar, b bVar, d dVar, c cVar, f fVar, e eVar) {
        this.b = aVar;
        this.c = bVar;
        this.d = dVar;
        this.e = cVar;
        this.f = fVar;
        this.g = eVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ a29(int i) {
        this(new a(r8), new b(false, false), new d(false), new c(r8), new f(false), new e(false));
        int i2 = 0;
    }
}
