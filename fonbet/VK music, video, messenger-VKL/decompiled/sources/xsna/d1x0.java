package xsna;

import java.util.List;

/* compiled from: VoipSelectVideoTabViewState.kt */
/* loaded from: classes7.dex */
public final class d1x0 implements ao50 {
    public final fi50 a;

    /* compiled from: VoipSelectVideoTabViewState.kt */
    public static final class a implements fm50<c1x0> {
        public final yzt0<b> a;

        public a(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }
    }

    /* compiled from: VoipSelectVideoTabViewState.kt */
    public static abstract class b {

        /* compiled from: VoipSelectVideoTabViewState.kt */
        public static final class a extends b {
            public final List<zzw0> a;
            public final long b;

            public a() {
                throw null;
            }

            public a(List list) {
                long currentTimeMillis = System.currentTimeMillis();
                this.a = list;
                this.b = currentTimeMillis;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && this.b == aVar.b;
            }

            public final int hashCode() {
                return Long.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Content(items=");
                sb.append(this.a);
                sb.append(", timeStamp=");
                return vu5.a(')', this.b, sb);
            }
        }
    }

    public d1x0(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
