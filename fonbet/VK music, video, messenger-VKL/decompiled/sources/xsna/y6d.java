package xsna;

import xsna.z2d;

/* compiled from: ClipItemViewState.kt */
/* loaded from: classes17.dex */
public final class y6d implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;

    /* compiled from: ClipItemViewState.kt */
    public static final class a implements fm50<z2d.a> {
        public final yzt0<j2d> a;

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

    /* compiled from: ClipItemViewState.kt */
    public static final class b implements fm50<z2d> {
        public final yzt0<wch0> a;

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
            return tr.c(new StringBuilder("ScreenSpinnerRender(screenSpinnerState="), this.a, ')');
        }
    }

    /* compiled from: ClipItemViewState.kt */
    public static final class c implements fm50<z2d.a> {
        public final yzt0<String> a;

        public c(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("VideoRender(coverUrl="), this.a, ')');
        }
    }

    public y6d(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
    }
}
