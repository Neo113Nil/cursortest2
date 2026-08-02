package xsna;

/* compiled from: ScreenViewState.kt */
/* loaded from: classes7.dex */
public interface jdh0 extends lm50 {

    /* compiled from: ScreenViewState.kt */
    public static final class a implements jdh0 {
        public final c4p0 b;
        public final n3k c;
        public final boolean d;

        public a(c4p0 c4p0Var, n3k n3kVar, boolean z) {
            this.b = c4p0Var;
            this.c = n3kVar;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + ((this.c.a.hashCode() + (this.b.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(toolbar=");
            sb.append(this.b);
            sb.append(", cover=");
            sb.append(this.c);
            sb.append(", isSpinnerVisible=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: ScreenViewState.kt */
    public static final class b implements jdh0 {
        public final c4p0 b;

        public b(c4p0 c4p0Var) {
            this.b = c4p0Var;
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
            return "Loading(toolbar=" + this.b + ')';
        }
    }
}
