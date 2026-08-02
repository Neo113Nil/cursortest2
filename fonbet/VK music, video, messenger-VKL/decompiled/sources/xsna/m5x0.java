package xsna;

import android.content.Context;

/* compiled from: VoipVmojiAction.kt */
/* loaded from: classes7.dex */
public interface m5x0 extends kj50 {

    /* compiled from: VoipVmojiAction.kt */
    public static final class a implements m5x0 {
        public final w5w0 b;

        public a(w5w0 w5w0Var) {
            this.b = w5w0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ApplyExternalChange(vmoji=" + this.b + ')';
        }
    }

    /* compiled from: VoipVmojiAction.kt */
    public static final class b implements m5x0 {
        public final Context b;

        public b(Context context) {
            this.b = context;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "CreateVmoji(context=" + this.b + ')';
        }
    }

    /* compiled from: VoipVmojiAction.kt */
    public static final class c implements m5x0 {
        public static final c b = new c();
    }

    /* compiled from: VoipVmojiAction.kt */
    public static final class d implements m5x0 {
        public final Context b;

        public d(Context context) {
            this.b = context;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "EditVmoji(context=" + this.b + ')';
        }
    }

    /* compiled from: VoipVmojiAction.kt */
    public static final class e implements m5x0 {
        public static final e b = new e();
    }

    /* compiled from: VoipVmojiAction.kt */
    public static final class f implements m5x0 {
        public static final f b = new f();
    }

    /* compiled from: VoipVmojiAction.kt */
    public static final class g implements m5x0 {
        public static final g b = new g();
    }

    /* compiled from: VoipVmojiAction.kt */
    public static final class h implements m5x0 {
        public final w5w0 b;
        public final String c;
        public final boolean d;

        public h(w5w0 w5w0Var, String str, boolean z) {
            this.b = w5w0Var;
            this.c = str;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return epx.f(this.b, hVar.b) && epx.f(this.c, hVar.c) && this.d == hVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + urd0.a(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VmojiDataLoaded(vmoji=");
            sb.append(this.b);
            sb.append(", svg=");
            sb.append(this.c);
            sb.append(", vmojiEnabled=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: VoipVmojiAction.kt */
    public static final class i implements m5x0 {
        public static final i b = new i();
    }

    /* compiled from: VoipVmojiAction.kt */
    public static final class j implements m5x0 {
        public static final j b = new j();
    }

    /* compiled from: VoipVmojiAction.kt */
    public static final class k implements m5x0 {
        public final w5w0 b;

        public k(w5w0 w5w0Var) {
            this.b = w5w0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && epx.f(this.b, ((k) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "VmojiEnabled(vmoji=" + this.b + ')';
        }
    }
}
