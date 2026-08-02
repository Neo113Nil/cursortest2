package xsna;

import com.vk.design.demo.presentation.nav.ScreenKey;

/* compiled from: DesignDemoRender.kt */
/* loaded from: classes18.dex */
public interface w3m extends fm50<x3m> {

    /* compiled from: DesignDemoRender.kt */
    public static final class a implements w3m {
        public static final a a = new a();
    }

    /* compiled from: DesignDemoRender.kt */
    public static final class b implements w3m {
        public final yzt0<ScreenKey> a;

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
            return tr.c(new StringBuilder("Main(currentScreen="), this.a, ')');
        }
    }
}
