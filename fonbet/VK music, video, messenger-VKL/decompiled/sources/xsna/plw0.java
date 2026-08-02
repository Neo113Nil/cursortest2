package xsna;

/* compiled from: VoipCallsJoinToCallByPasswordViewState.kt */
/* loaded from: classes7.dex */
public final class plw0 implements ao50 {
    public final fi50 a;

    /* compiled from: VoipCallsJoinToCallByPasswordViewState.kt */
    public static final class a {
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
            return defpackage.q0.a(new StringBuilder("Button(isEnabled="), this.a, ')');
        }
    }

    /* compiled from: VoipCallsJoinToCallByPasswordViewState.kt */
    public static final class b implements fm50<klw0> {
        public final yzt0<c> a;
        public final yzt0<d> b;
        public final yzt0<a> c;

        public b(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
        }
    }

    /* compiled from: VoipCallsJoinToCallByPasswordViewState.kt */
    public static final class c {
        public final String a;

        public c(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("Link(link="), this.a, ')');
        }
    }

    /* compiled from: VoipCallsJoinToCallByPasswordViewState.kt */
    public static final class d {
        public final String a;
        public final boolean b;

        public d(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && this.b == dVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Password(password=");
            sb.append(this.a);
            sb.append(", isVisible=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    public plw0(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
