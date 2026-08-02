package xsna;

/* compiled from: VideoProfileErrorViewState.kt */
/* loaded from: classes6.dex */
public abstract class w7t0 {

    /* compiled from: VideoProfileErrorViewState.kt */
    public static final class a extends w7t0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -2126013522;
        }

        public final String toString() {
            return "Gone";
        }
    }

    /* compiled from: VideoProfileErrorViewState.kt */
    public static final class b extends w7t0 {
        public final CharSequence a;
        public final CharSequence b;
        public final boolean c;

        public b(String str, String str2, boolean z) {
            this.a = str;
            this.b = str2;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + u11.c(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Visible(title=");
            sb.append((Object) this.a);
            sb.append(", description=");
            sb.append((Object) this.b);
            sb.append(", canRetry=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }
}
