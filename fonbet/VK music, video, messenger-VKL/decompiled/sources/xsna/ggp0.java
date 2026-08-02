package xsna;

import com.vk.dto.common.DownloadingState;

/* compiled from: TrackMenuViewState.kt */
/* loaded from: classes3.dex */
public final class ggp0 implements ao50 {
    public final fi50 a;

    /* compiled from: TrackMenuViewState.kt */
    public interface a extends fm50<fgp0> {

        /* compiled from: TrackMenuViewState.kt */
        /* renamed from: xsna.ggp0$a$a, reason: collision with other inner class name */
        public static final class C2942a implements a {
            public final yzt0<sb50> a;
            public final yzt0<wow<uc50>> b;
            public final yzt0<DownloadingState> c;
            public final yzt0<wzm0> d;

            public C2942a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4) {
                this.a = h0u0Var;
                this.b = h0u0Var2;
                this.c = h0u0Var3;
                this.d = h0u0Var4;
            }
        }

        /* compiled from: TrackMenuViewState.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 175620701;
            }

            public final String toString() {
                return "Empty";
            }
        }
    }

    public ggp0(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
