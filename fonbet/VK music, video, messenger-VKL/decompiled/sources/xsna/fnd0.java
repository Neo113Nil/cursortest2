package xsna;

/* compiled from: ProductCardTopBarViewState.kt */
/* loaded from: classes18.dex */
public interface fnd0 {

    /* compiled from: ProductCardTopBarViewState.kt */
    public static final class a implements fnd0 {
        public final boolean a;
        public final dnd0 b;
        public final bnd0 c;
        public final bnd0 d;

        public a(boolean z, dnd0 dnd0Var, bnd0 bnd0Var, bnd0 bnd0Var2) {
            this.a = z;
            this.b = dnd0Var;
            this.c = bnd0Var;
            this.d = bnd0Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && this.c.equals(aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            int hashCode = (this.c.hashCode() + ((this.b.hashCode() + qoy.b(Boolean.hashCode(this.a) * 31, 31, false)) * 31)) * 31;
            bnd0 bnd0Var = this.d;
            return hashCode + (bnd0Var != null ? bnd0Var.hashCode() : 0);
        }

        public final String toString() {
            return "Content(isService=" + this.a + ", showSearch=false, main=" + this.b + ", extra=" + this.c + ", secondExtra=" + this.d + ')';
        }
    }

    /* compiled from: ProductCardTopBarViewState.kt */
    public static final class b implements fnd0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1664388588;
        }

        public final String toString() {
            return "Empty";
        }
    }
}
