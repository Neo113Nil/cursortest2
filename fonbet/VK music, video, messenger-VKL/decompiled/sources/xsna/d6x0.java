package xsna;

/* compiled from: VoipVmojiState.kt */
/* loaded from: classes7.dex */
public interface d6x0 extends km50 {

    /* compiled from: VoipVmojiState.kt */
    public static final class a implements d6x0 {
        public static final a b = new a();
    }

    /* compiled from: VoipVmojiState.kt */
    public static final class b implements d6x0 {
        public static final b b = new b();
    }

    /* compiled from: VoipVmojiState.kt */
    public static final class c implements d6x0 {
        public static final c b = new c();
    }

    /* compiled from: VoipVmojiState.kt */
    public static final class d implements d6x0 {
        public static final d b = new d();
    }

    /* compiled from: VoipVmojiState.kt */
    public static final class e implements d6x0 {
        public final a b;
        public final boolean c;

        /* compiled from: VoipVmojiState.kt */
        public static final class a {
            public final w5w0 a;
            public final String b;

            public a(w5w0 w5w0Var, String str) {
                this.a = w5w0Var;
                this.b = str;
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
                StringBuilder sb = new StringBuilder("Details(avatar=");
                sb.append(this.a);
                sb.append(", svg=");
                return ho8.a(sb, this.b, ')');
            }
        }

        public e(a aVar, boolean z) {
            this.b = aVar;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.b, eVar.b) && this.c == eVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VmojiFound(vmoji=");
            sb.append(this.b);
            sb.append(", enabled=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: VoipVmojiState.kt */
    public static final class f implements d6x0 {
        public static final f b = new f();
    }

    /* compiled from: VoipVmojiState.kt */
    public static final class g implements d6x0 {
        public final boolean b;

        public g(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.b == ((g) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("WaitingForExternalChange(enabled="), this.b, ')');
        }
    }
}
