package xsna;

import xsna.nkq;

/* compiled from: FaqViewState.kt */
/* loaded from: classes14.dex */
public interface mkq<T extends nkq> extends fm50<T> {

    /* compiled from: FaqViewState.kt */
    public static final class a implements mkq<nkq> {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -215815766;
        }

        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: FaqViewState.kt */
    public static final class b implements mkq<nkq.a> {
        public final yzt0<nkq.a> a;
        public final yzt0<Boolean> b;

        public b(h0u0 h0u0Var, h0u0 h0u0Var2) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Main(listState=");
            sb.append(this.a);
            sb.append(", fillHeight=");
            return tr.c(sb, this.b, ')');
        }
    }
}
