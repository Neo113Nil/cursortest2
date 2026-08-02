package xsna;

/* compiled from: ComposeAboutAppRender.kt */
/* loaded from: classes6.dex */
public interface api extends fm50<o2> {

    /* compiled from: ComposeAboutAppRender.kt */
    public static final class a implements api {
        public final yzt0<Boolean> a;
        public final yzt0<Boolean> b;
        public final yzt0<Boolean> c;
        public final yzt0<y0> d;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Actual(isLoading=");
            sb.append(this.a);
            sb.append(", isError=");
            sb.append(this.b);
            sb.append(", isShowUnverified=");
            sb.append(this.c);
            sb.append(", content=");
            return tr.c(sb, this.d, ')');
        }
    }

    /* compiled from: ComposeAboutAppRender.kt */
    public static final class b implements api {
        public static final b a = new b();
    }
}
