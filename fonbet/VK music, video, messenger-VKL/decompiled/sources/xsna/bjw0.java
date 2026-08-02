package xsna;

import java.util.List;
import xsna.yiw0;

/* compiled from: VoipCallServiceViewState.kt */
/* loaded from: classes7.dex */
public final class bjw0 implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;
    public final fi50 d;
    public final fi50 e;
    public final fi50 f;

    /* compiled from: VoipCallServiceViewState.kt */
    public static final class a implements fm50<yiw0.d> {
        public final yzt0<List<Object>> a;

        public a(h0u0 h0u0Var) {
            this.a = h0u0Var;
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
            return tr.c(new StringBuilder("Content(items="), this.a, ')');
        }
    }

    /* compiled from: VoipCallServiceViewState.kt */
    public static final class b implements fm50<yiw0.a> {
        public final yzt0<a> a;

        /* compiled from: VoipCallServiceViewState.kt */
        public static final class a {
            public final boolean a;
            public final boolean b;

            public a(boolean z, boolean z2) {
                this.a = z;
                this.b = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Info(isFromSearch=");
                sb.append(this.a);
                sb.append(", isContactsSyncShowEnabled=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }

        public b(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("Empty(info="), this.a, ')');
        }
    }

    /* compiled from: VoipCallServiceViewState.kt */
    public static final class c implements fm50<yiw0.b> {
        public final yzt0<a> a;

        /* compiled from: VoipCallServiceViewState.kt */
        public static final class a {
            public final boolean a;
            public final Throwable b;

            public a(boolean z, Throwable th) {
                this.a = z;
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && epx.f(this.b, aVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Info(isFromSearch=");
                sb.append(this.a);
                sb.append(", error=");
                return oq.c(sb, this.b, ')');
            }
        }

        public c(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("Error(info="), this.a, ')');
        }
    }

    /* compiled from: VoipCallServiceViewState.kt */
    public static final class d implements fm50<yiw0> {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 190418408;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: VoipCallServiceViewState.kt */
    public static final class e implements fm50<yiw0.e> {
        public final yzt0<List<Object>> a;

        public e(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("Search(items="), this.a, ')');
        }
    }

    /* compiled from: VoipCallServiceViewState.kt */
    public static final class f implements fm50<yiw0.f> {
        public final yzt0<List<Object>> a;

        public f(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("SearchOld(items="), this.a, ')');
        }
    }

    public bjw0(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3, fi50 fi50Var4, fi50 fi50Var5, fi50 fi50Var6) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
        this.d = fi50Var4;
        this.e = fi50Var5;
        this.f = fi50Var6;
    }
}
