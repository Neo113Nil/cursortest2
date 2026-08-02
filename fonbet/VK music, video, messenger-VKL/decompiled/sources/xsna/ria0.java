package xsna;

/* compiled from: PickerRootViewState.kt */
/* loaded from: classes5.dex */
public final class ria0 implements ao50 {
    public final fi50 a;

    /* compiled from: PickerRootViewState.kt */
    public static final class a implements fm50<oia0> {
        public final yzt0<Boolean> a;

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
            return tr.c(new StringBuilder("Data(isShowTabs="), this.a, ')');
        }
    }

    public ria0(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
