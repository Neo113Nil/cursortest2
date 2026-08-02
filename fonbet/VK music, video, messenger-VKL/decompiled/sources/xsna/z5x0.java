package xsna;

/* compiled from: VoipVmojiPatch.kt */
/* loaded from: classes7.dex */
public interface z5x0 extends xl50 {

    /* compiled from: VoipVmojiPatch.kt */
    public static final class a implements z5x0 {
        public static final a b = new a();
    }

    /* compiled from: VoipVmojiPatch.kt */
    public static final class b implements z5x0 {
        public static final b b = new b();
    }

    /* compiled from: VoipVmojiPatch.kt */
    public static final class c implements z5x0 {
        public static final c b = new c();
    }

    /* compiled from: VoipVmojiPatch.kt */
    public static final class d implements z5x0 {
        public static final d b = new d();
    }

    /* compiled from: VoipVmojiPatch.kt */
    public static final class e implements z5x0 {
        public static final e b = new e();
    }

    /* compiled from: VoipVmojiPatch.kt */
    public static final class f implements z5x0 {
        public static final f b = new f();
    }

    /* compiled from: VoipVmojiPatch.kt */
    public static final class g implements z5x0 {
        public final w5w0 b;
        public final String c;
        public final boolean d;

        public g(w5w0 w5w0Var, String str, boolean z) {
            this.b = w5w0Var;
            this.c = str;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.b, gVar.b) && epx.f(this.c, gVar.c) && this.d == gVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + urd0.a(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VmojiFound(vmoji=");
            sb.append(this.b);
            sb.append(", svg=");
            sb.append(this.c);
            sb.append(", enabled=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: VoipVmojiPatch.kt */
    public static final class h implements z5x0 {
        public final boolean b;

        public h(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.b == ((h) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("VmojiToggled(enabled="), this.b, ')');
        }
    }
}
