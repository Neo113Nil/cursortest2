package xsna;

import xsna.hye;

/* compiled from: ClipsProfileToolbarViewState.kt */
/* loaded from: classes17.dex */
public interface oye<S extends hye> extends fm50<S> {

    /* compiled from: ClipsProfileToolbarViewState.kt */
    public static final class a implements oye<hye.a> {
        public final yzt0<wow<hud0>> a;
        public final yzt0<Integer> b;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(pages=");
            sb.append(this.a);
            sb.append(", initialPage=");
            return tr.c(sb, this.b, ')');
        }
    }

    /* compiled from: ClipsProfileToolbarViewState.kt */
    public static final class b implements oye<hye.b> {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 518261388;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
