package xsna;

import xsna.rwo;

/* compiled from: EasyPromoteViewState.kt */
/* loaded from: classes14.dex */
public interface fwo<T extends rwo> extends fm50<T> {

    /* compiled from: EasyPromoteViewState.kt */
    public static final class a implements fwo<rwo> {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1999240974;
        }

        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: EasyPromoteViewState.kt */
    public static final class b implements fwo<rwo.a> {
        public final yzt0<ul8> a;
        public final yzt0<ioo> b;
        public final yzt0<Boolean> c;
        public final yzt0<ymk> d;

        public b(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Main(budgetState=");
            sb.append(this.a);
            sb.append(", durationState=");
            sb.append(this.b);
            sb.append(", buttonEnabled=");
            sb.append(this.c);
            sb.append(", customDateState=");
            return tr.c(sb, this.d, ')');
        }
    }
}
