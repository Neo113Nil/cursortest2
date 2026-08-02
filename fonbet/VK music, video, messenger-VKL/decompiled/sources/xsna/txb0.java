package xsna;

import xsna.rxb0;

/* compiled from: PopupSettingsViewState.kt */
/* loaded from: classes6.dex */
public final class txb0 implements ao50 {
    public final fi50 a;
    public final fi50 b;

    /* compiled from: PopupSettingsViewState.kt */
    public static final class a implements fm50<rxb0.a> {
        public final yzt0<nyb0> a;

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
            return tr.c(new StringBuilder("ContentScene(popupSettingsModel="), this.a, ')');
        }
    }

    /* compiled from: PopupSettingsViewState.kt */
    public static final class b implements fm50<rxb0.b> {
        public static final b a = new b();
    }

    public txb0(fi50 fi50Var, fi50 fi50Var2) {
        this.a = fi50Var;
        this.b = fi50Var2;
    }
}
