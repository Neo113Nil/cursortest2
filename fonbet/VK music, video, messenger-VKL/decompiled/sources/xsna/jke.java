package xsna;

/* compiled from: ClipsLinksEditViewState.kt */
/* loaded from: classes16.dex */
public final class jke implements ao50 {
    public final fi50 a;
    public final fi50 b;

    /* compiled from: ClipsLinksEditViewState.kt */
    public static final class a implements c {
        public final yzt0<String> a;
        public final yzt0<String> b;
        public final yzt0<Boolean> c;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + sr.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(link=");
            sb.append(this.a);
            sb.append(", name=");
            sb.append(this.b);
            sb.append(", saveEnabled=");
            return tr.c(sb, this.c, ')');
        }
    }

    /* compiled from: ClipsLinksEditViewState.kt */
    public static final class b implements c {
        public static final b a = new b();
    }

    /* compiled from: ClipsLinksEditViewState.kt */
    public interface c extends fm50<ike> {
    }

    public jke(fi50 fi50Var, fi50 fi50Var2) {
        this.a = fi50Var;
        this.b = fi50Var2;
    }
}
