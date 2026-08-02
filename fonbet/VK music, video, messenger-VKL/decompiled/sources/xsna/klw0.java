package xsna;

/* compiled from: VoipCallsJoinToCallByPasswordState.kt */
/* loaded from: classes7.dex */
public final class klw0 implements km50 {
    public final b b;
    public final c c;
    public final a d;

    /* compiled from: VoipCallsJoinToCallByPasswordState.kt */
    public static final class a {
        public final boolean a;

        public a() {
            this(false);
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

        public a(boolean z) {
            this.a = z;
        }
    }

    /* compiled from: VoipCallsJoinToCallByPasswordState.kt */
    public static final class b {
        public final String a;

        public b() {
            this(0);
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
            return ho8.a(new StringBuilder("Link(link="), this.a, ')');
        }

        public /* synthetic */ b(int i) {
            this("");
        }

        public b(String str) {
            this.a = str;
        }
    }

    /* compiled from: VoipCallsJoinToCallByPasswordState.kt */
    public static final class c {
        public final String a;
        public final boolean b;

        public c() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b;
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

        public c(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public /* synthetic */ c(int i) {
            this("", false);
        }
    }

    public klw0() {
        this(0);
    }

    public static klw0 a(klw0 klw0Var, b bVar, c cVar, a aVar, int i) {
        if ((i & 1) != 0) {
            bVar = klw0Var.b;
        }
        if ((i & 2) != 0) {
            cVar = klw0Var.c;
        }
        if ((i & 4) != 0) {
            aVar = klw0Var.d;
        }
        klw0Var.getClass();
        return new klw0(bVar, cVar, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof klw0)) {
            return false;
        }
        klw0 klw0Var = (klw0) obj;
        return epx.f(this.b, klw0Var.b) && epx.f(this.c, klw0Var.c) && epx.f(this.d, klw0Var.d);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d.a) + ((this.c.hashCode() + (this.b.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VoipCallsJoinToCallByPasswordState(link=" + this.b + ", password=" + this.c + ", button=" + this.d + ')';
    }

    public klw0(b bVar, c cVar, a aVar) {
        this.b = bVar;
        this.c = cVar;
        this.d = aVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ klw0(int i) {
        this(new b(r0), new c(r0), new a(false));
        int i2 = 0;
    }
}
