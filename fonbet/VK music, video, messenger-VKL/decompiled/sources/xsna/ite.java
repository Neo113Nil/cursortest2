package xsna;

import com.vk.core.compose.component.defaults.SpinnerState;
import xsna.gte;

/* compiled from: ClipsPlaylistsFolderNamingViewState.kt */
/* loaded from: classes16.dex */
public final class ite implements ao50 {
    public final fi50 a;
    public final fi50 b;

    /* compiled from: ClipsPlaylistsFolderNamingViewState.kt */
    public interface a<T extends gte> extends fm50<gte> {

        /* compiled from: ClipsPlaylistsFolderNamingViewState.kt */
        /* renamed from: xsna.ite$a$a, reason: collision with other inner class name */
        public static final class C3080a implements a<gte.a> {
            public final yzt0<tho0> a;
            public final yzt0<tlo0> b;
            public final yzt0<Boolean> c;
            public final yzt0<Boolean> d;
            public final yzt0<SpinnerState> e;
            public final yzt0<Boolean> f;
            public final yzt0<Boolean> g;

            public C3080a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6, h0u0 h0u0Var7) {
                this.a = h0u0Var;
                this.b = h0u0Var2;
                this.c = h0u0Var3;
                this.d = h0u0Var4;
                this.e = h0u0Var5;
                this.f = h0u0Var6;
                this.g = h0u0Var7;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3080a)) {
                    return false;
                }
                C3080a c3080a = (C3080a) obj;
                return epx.f(this.a, c3080a.a) && epx.f(this.b, c3080a.b) && epx.f(this.c, c3080a.c) && epx.f(this.d, c3080a.d) && epx.f(this.e, c3080a.e) && epx.f(this.f, c3080a.f) && epx.f(this.g, c3080a.g);
            }

            public final int hashCode() {
                return this.g.hashCode() + sr.a(this.f, sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Content(name=");
                sb.append(this.a);
                sb.append(", placeholderText=");
                sb.append(this.b);
                sb.append(", isSaveAvailable=");
                sb.append(this.c);
                sb.append(", isAnimated=");
                sb.append(this.d);
                sb.append(", spinnerState=");
                sb.append(this.e);
                sb.append(", textFieldAvailable=");
                sb.append(this.f);
                sb.append(", bsContentVisible=");
                return tr.c(sb, this.g, ')');
            }
        }

        /* compiled from: ClipsPlaylistsFolderNamingViewState.kt */
        public static final class b implements a<gte.b> {
            public static final b a = new b();
        }
    }

    public ite(fi50 fi50Var, fi50 fi50Var2) {
        this.a = fi50Var;
        this.b = fi50Var2;
    }
}
