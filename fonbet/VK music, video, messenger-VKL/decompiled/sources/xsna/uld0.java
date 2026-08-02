package xsna;

import kotlin.LazyThreadSafetyMode;

/* compiled from: ProductCardMviComponent.kt */
/* loaded from: classes18.dex */
public final class uld0 extends be {
    public final f5z b;
    public final eph c;
    public final mnd0 d;
    public final Object e = msy.a(LazyThreadSafetyMode.NONE, new n7w(this, 27));

    /* compiled from: ProductCardMviComponent.kt */
    public static final class a implements iyp, g0t {
        public final /* synthetic */ eph b;

        public a(eph ephVar) {
            this.b = ephVar;
        }

        @Override // xsna.iyp
        public final /* synthetic */ void a(pk50 pk50Var) {
            this.b.invoke(pk50Var);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof iyp) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return this.b;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public uld0(zyt0 zyt0Var, f5z f5zVar, eph ephVar, mnd0 mnd0Var) {
        this.b = f5zVar;
        this.c = ephVar;
        this.d = mnd0Var;
    }
}
