package xsna;

import com.vk.music.offline.configs.api.domain.model.ReactionsConfig;

/* compiled from: AudioReactionsViewState.kt */
/* loaded from: classes3.dex */
public final class lu4 implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;

    /* compiled from: AudioReactionsViewState.kt */
    public interface a extends fm50<ku4> {

        /* compiled from: AudioReactionsViewState.kt */
        /* renamed from: xsna.lu4$a$a, reason: collision with other inner class name */
        public static final class C3302a implements a {
            public final yzt0<ReactionsConfig> a;
            public final yzt0<String> b;

            public C3302a(h0u0 h0u0Var, h0u0 h0u0Var2) {
                this.a = h0u0Var;
                this.b = h0u0Var2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3302a)) {
                    return false;
                }
                C3302a c3302a = (C3302a) obj;
                return epx.f(this.a, c3302a.a) && epx.f(this.b, c3302a.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Content(reactions=");
                sb.append(this.a);
                sb.append(", selectedId=");
                return tr.c(sb, this.b, ')');
            }
        }

        /* compiled from: AudioReactionsViewState.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 481330000;
            }

            public final String toString() {
                return "Error";
            }
        }

        /* compiled from: AudioReactionsViewState.kt */
        public static final class c implements a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 517300356;
            }

            public final String toString() {
                return "Loading";
            }
        }
    }

    public lu4(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
    }
}
