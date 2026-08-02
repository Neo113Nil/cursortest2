package xsna;

import xsna.nz0;

/* compiled from: AdsItemViewState.kt */
/* loaded from: classes17.dex */
public final class c11 implements ao50 {
    public final fi50 a;
    public final fi50 b;

    /* compiled from: AdsItemViewState.kt */
    public static final class a implements fm50<nz0.a> {
        public final yzt0<ez0> a;

        public a(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("OverlayRender(overlayState="), this.a, ')');
        }
    }

    /* compiled from: AdsItemViewState.kt */
    public static final class b implements fm50<nz0.a> {
        public final yzt0<String> a;

        public b(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("VideoRender(coverUrl="), this.a, ')');
        }
    }

    public c11(fi50 fi50Var, fi50 fi50Var2) {
        this.a = fi50Var;
        this.b = fi50Var2;
    }
}
