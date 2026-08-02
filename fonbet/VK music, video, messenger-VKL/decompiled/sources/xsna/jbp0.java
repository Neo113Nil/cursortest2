package xsna;

/* compiled from: TopshelfCardState.kt */
/* loaded from: classes2.dex */
public interface jbp0 {

    /* compiled from: TopshelfCardState.kt */
    public static final class a implements jbp0 {
        public final gap0 a;
        public final sbp0 b;
        public final sbp0 c;
        public final rbp0 d;
        public final bbp0 e;
        public final iap0 f;
        public final xap0 g;
        public final xap0 h;

        public a(gap0 gap0Var, sbp0 sbp0Var, sbp0 sbp0Var2, rbp0 rbp0Var, bbp0 bbp0Var, iap0 iap0Var, xap0 xap0Var, xap0 xap0Var2) {
            this.a = gap0Var;
            this.b = sbp0Var;
            this.c = sbp0Var2;
            this.d = rbp0Var;
            this.e = bbp0Var;
            this.f = iap0Var;
            this.g = xap0Var;
            this.h = xap0Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && this.f.equals(aVar.f) && epx.f(this.g, aVar.g) && this.h.equals(aVar.h);
        }

        public final int hashCode() {
            int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            sbp0 sbp0Var = this.c;
            int hashCode2 = (hashCode + (sbp0Var == null ? 0 : sbp0Var.hashCode())) * 31;
            rbp0 rbp0Var = this.d;
            int hashCode3 = (hashCode2 + (rbp0Var == null ? 0 : rbp0Var.hashCode())) * 31;
            bbp0 bbp0Var = this.e;
            int hashCode4 = (this.f.hashCode() + ((hashCode3 + (bbp0Var == null ? 0 : bbp0Var.hashCode())) * 31)) * 31;
            xap0 xap0Var = this.g;
            return this.h.hashCode() + ((hashCode4 + (xap0Var != null ? xap0Var.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "Loaded(background=" + this.a + ", title=" + this.b + ", extraTitle=" + this.c + ", subtitle=" + this.d + ", metaInfo=" + this.e + ", primaryButton=" + this.f + ", secondaryButton=" + this.g + ", topEndButton=" + this.h + ')';
        }
    }

    /* compiled from: TopshelfCardState.kt */
    public static final class b implements jbp0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -2019091625;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
