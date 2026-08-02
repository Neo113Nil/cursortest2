package xsna;

import java.util.List;

/* compiled from: VoipSelectVideoPlaylistsTabViewState.kt */
/* loaded from: classes7.dex */
public final class p0x0 implements ao50 {
    public final fi50 a;

    /* compiled from: VoipSelectVideoPlaylistsTabViewState.kt */
    public static final class a implements fm50<o0x0> {
        public final yzt0<b> a;

        public a(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }
    }

    /* compiled from: VoipSelectVideoPlaylistsTabViewState.kt */
    public static abstract class b {

        /* compiled from: VoipSelectVideoPlaylistsTabViewState.kt */
        public static final class a extends b {
            public final List<zzw0> a;
            public final boolean b;

            /* JADX WARN: Multi-variable type inference failed */
            public a(List<? extends zzw0> list, boolean z) {
                this.a = list;
                this.b = z;
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
                return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Content(items=");
                sb.append(this.a);
                sb.append(", isSwrLoading=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }
    }

    public p0x0(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
