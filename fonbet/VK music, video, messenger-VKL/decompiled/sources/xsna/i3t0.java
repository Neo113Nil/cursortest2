package xsna;

/* compiled from: VideoPickerViewState.kt */
/* loaded from: classes4.dex */
public final class i3t0 implements ao50 {
    public final fi50 a;

    /* compiled from: VideoPickerViewState.kt */
    public static final class a implements fm50<c3t0> {
        public final yzt0<e3t0<m0w0>> a;

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
            return tr.c(new StringBuilder("Data(result="), this.a, ')');
        }
    }

    public i3t0(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
