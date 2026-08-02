package xsna;

/* compiled from: CallDebugMenuViewState.kt */
/* loaded from: classes7.dex */
public final class p29 implements ao50 {
    public final fi50 a;

    /* compiled from: CallDebugMenuViewState.kt */
    public static final class a {
        public final String a;

        public a(String str) {
            this.a = str;
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
    }

    /* compiled from: CallDebugMenuViewState.kt */
    public static final class b implements fm50<a29> {
        public final yzt0<c> a;

        public b(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }
    }

    /* compiled from: CallDebugMenuViewState.kt */
    public static final class c {
        public final a a;
        public final d b;
        public final f c;
        public final e d;
        public final h e;
        public final g f;

        public c(a aVar, d dVar, f fVar, e eVar, h hVar, g gVar) {
            this.a = aVar;
            this.b = dVar;
            this.c = fVar;
            this.d = eVar;
            this.e = hVar;
            this.f = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e) && epx.f(this.f, cVar.f);
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f.a) + ((this.e.hashCode() + ((this.d.hashCode() + qoy.b((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31, 31, this.c.a)) * 31)) * 31);
        }

        public final String toString() {
            return "ContentData(callId=" + this.a + ", headersBounds=" + this.b + ", oneLogSend=" + this.c + ", joinAsOptions=" + this.d + ", uiOptions=" + this.e + ", testOptions=" + this.f + ')';
        }
    }

    /* compiled from: CallDebugMenuViewState.kt */
    public static final class d {
        public final boolean a;
        public final boolean b;

        public d(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b;
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
    }

    /* compiled from: CallDebugMenuViewState.kt */
    public static final class e {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;

        public e(boolean z, boolean z2, boolean z3, boolean z4) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && this.b == eVar.b && this.c == eVar.c && this.d == eVar.d;
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
    }

    /* compiled from: CallDebugMenuViewState.kt */
    public static final class f {
        public final boolean a;

        public f(boolean z) {
            this.a = z;
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
            return defpackage.q0.a(new StringBuilder("OneLogSend(isItemVisible="), this.a, ')');
        }
    }

    /* compiled from: CallDebugMenuViewState.kt */
    public static final class g {
        public final boolean a;

        public g(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.a == ((g) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("TestOptions(isCrashOnCameraCloseRequired="), this.a, ')');
        }
    }

    /* compiled from: CallDebugMenuViewState.kt */
    public static final class h {
        public final boolean a;

        public h(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.a == ((h) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return n23.b(new StringBuilder("UIOptions(isStereoUiEnabled="), this.a, ", isStereoUiVisible=false)");
        }
    }

    public p29(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
