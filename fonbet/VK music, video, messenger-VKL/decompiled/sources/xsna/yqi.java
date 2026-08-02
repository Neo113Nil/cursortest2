package xsna;

/* compiled from: TabbarSettingsMvi.kt */
/* loaded from: classes6.dex */
public interface yqi extends fm50<mwn0> {

    /* compiled from: TabbarSettingsMvi.kt */
    public static final class a implements yqi {
        public final yzt0<y2j0> a;
        public final yzt0<t0j0> b;
        public final yzt0<Boolean> c;
        public final yzt0<Boolean> d;

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
            StringBuilder sb = new StringBuilder("Data(mainData=");
            sb.append(this.a);
            sb.append(", bottomData=");
            sb.append(this.b);
            sb.append(", isResetButtonEnabled=");
            sb.append(this.c);
            sb.append(", shouldShowGroupSelection=");
            return tr.c(sb, this.d, ')');
        }
    }

    /* compiled from: TabbarSettingsMvi.kt */
    public static final class b implements yqi {
        public static final b a = new b();
    }
}
