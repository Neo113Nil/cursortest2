package xsna;

/* compiled from: MiniAppCallPiPFeatureState.kt */
/* loaded from: classes7.dex */
public abstract class ro20 {

    /* compiled from: MiniAppCallPiPFeatureState.kt */
    public static final class a extends ro20 {
        public final uo20 a;
        public final zp20 b;
        public final ep20 c;

        public a(uo20 uo20Var, zp20 zp20Var, ep20 ep20Var) {
            this.a = uo20Var;
            this.b = zp20Var;
            this.c = ep20Var;
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
            uo20 uo20Var = this.a;
            return this.c.hashCode() + ((this.b.hashCode() + ((uo20Var == null ? 0 : uo20Var.hashCode()) * 31)) * 31);
        }

        public final String toString() {
            return "Active(speaker=" + this.a + ", myState=" + this.b + ", callState=" + this.c + ')';
        }
    }

    /* compiled from: MiniAppCallPiPFeatureState.kt */
    public static final class b extends ro20 {
        public static final b a = new b();
    }
}
