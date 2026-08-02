package xsna;

import xsna.iyw0;

/* compiled from: VoipScheduledCallSettingsViewState.kt */
/* loaded from: classes7.dex */
public final class myw0 implements ao50 {
    public final fi50 a;

    /* compiled from: VoipScheduledCallSettingsViewState.kt */
    public static final class a implements fm50<iyw0.a> {
        public final yzt0<byw0> a;

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
            return tr.c(new StringBuilder("Content(contentState="), this.a, ')');
        }
    }

    public myw0(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
