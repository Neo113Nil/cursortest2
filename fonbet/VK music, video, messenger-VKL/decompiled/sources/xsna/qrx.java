package xsna;

/* compiled from: InviteFriendsRender.kt */
/* loaded from: classes14.dex */
public interface qrx extends fm50<erx> {

    /* compiled from: InviteFriendsRender.kt */
    public static final class a implements qrx {
        public static final a a = new a();
    }

    /* compiled from: InviteFriendsRender.kt */
    public static final class b implements qrx {
        public final yzt0<Throwable> a;
        public final yzt0<Boolean> b;
        public final yzt0<uyh0> c;
        public final yzt0<u7p0> d;
        public final yzt0<isx> e;
        public final yzt0<g48> f;

        public b(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
            this.e = h0u0Var5;
            this.f = h0u0Var6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MainRender(error=");
            sb.append(this.a);
            sb.append(", isLoading=");
            sb.append(this.b);
            sb.append(", searchState=");
            sb.append(this.c);
            sb.append(", topBar=");
            sb.append(this.d);
            sb.append(", tabs=");
            sb.append(this.e);
            sb.append(", bottomBar=");
            return tr.c(sb, this.f, ')');
        }
    }
}
