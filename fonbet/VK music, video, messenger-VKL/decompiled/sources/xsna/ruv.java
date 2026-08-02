package xsna;

/* compiled from: IdeasStoryViewState.kt */
/* loaded from: classes6.dex */
public final class ruv implements ao50 {
    public final fi50 a;

    /* compiled from: IdeasStoryViewState.kt */
    public static final class a implements fm50<juv> {
        public final yzt0<fa90> a;
        public final yzt0<v3e0> b;
        public final yzt0<brj> c;
        public final yzt0<Boolean> d;
        public final yzt0<Boolean> e;
        public final yzt0<Boolean> f;
        public final yzt0<Boolean> g;
        public final yzt0<Float> h;
        public final yzt0<Boolean> i;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6, h0u0 h0u0Var7, h0u0 h0u0Var8, h0u0 h0u0Var9) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
            this.e = h0u0Var5;
            this.f = h0u0Var6;
            this.g = h0u0Var7;
            this.h = h0u0Var8;
            this.i = h0u0Var9;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i);
        }

        public final int hashCode() {
            return this.i.hashCode() + sr.a(this.h, sr.a(this.g, sr.a(this.f, sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(currentPage=");
            sb.append(this.a);
            sb.append(", progress=");
            sb.append(this.b);
            sb.append(", controls=");
            sb.append(this.c);
            sb.append(", isPlaying=");
            sb.append(this.d);
            sb.append(", isExternalLoaderVisible=");
            sb.append(this.e);
            sb.append(", isAnyLoaderVisible=");
            sb.append(this.f);
            sb.append(", isErrorVisible=");
            sb.append(this.g);
            sb.append(", dragScale=");
            sb.append(this.h);
            sb.append(", isClosing=");
            return tr.c(sb, this.i, ')');
        }
    }

    public ruv(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
