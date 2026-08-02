package xsna;

import xsna.oe10;

/* compiled from: MarketShopConditionsViewState.kt */
/* loaded from: classes18.dex */
public final class ve10 implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;

    /* compiled from: MarketShopConditionsViewState.kt */
    public interface a<T extends oe10> extends fm50<oe10> {

        /* compiled from: MarketShopConditionsViewState.kt */
        /* renamed from: xsna.ve10$a$a, reason: collision with other inner class name */
        public static final class C3884a implements a<oe10.a> {
            public final yzt0<hej0> a;

            public C3884a(h0u0 h0u0Var) {
                this.a = h0u0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3884a) && epx.f(this.a, ((C3884a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return tr.c(new StringBuilder("Content(data="), this.a, ')');
            }
        }

        /* compiled from: MarketShopConditionsViewState.kt */
        public static final class b implements a<oe10.b> {
            public static final b a = new b();
        }

        /* compiled from: MarketShopConditionsViewState.kt */
        public static final class c implements a<oe10.c> {
            public static final c a = new c();
        }
    }

    public ve10(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
    }
}
