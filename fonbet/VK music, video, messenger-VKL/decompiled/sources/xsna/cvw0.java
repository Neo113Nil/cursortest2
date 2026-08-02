package xsna;

import xsna.avw0;

/* compiled from: VoipPastCallsViewState.kt */
/* loaded from: classes7.dex */
public final class cvw0 implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;

    /* compiled from: VoipPastCallsViewState.kt */
    public static final class a implements fm50<avw0.a> {
        public final yzt0<m59> a;
        public final yzt0<xo90> b;

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
            StringBuilder sb = new StringBuilder("Content(listState=");
            sb.append(this.a);
            sb.append(", pastCallDetailsDialogState=");
            return tr.c(sb, this.b, ')');
        }
    }

    /* compiled from: VoipPastCallsViewState.kt */
    public static final class b implements fm50<avw0.b> {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -699319793;
        }

        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: VoipPastCallsViewState.kt */
    public static final class c implements fm50<avw0.c> {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -215784573;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public cvw0(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
    }
}
