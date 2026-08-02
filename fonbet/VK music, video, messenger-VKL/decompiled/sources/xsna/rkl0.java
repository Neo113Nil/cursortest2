package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: StorefrontAlbumsScreen.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class rkl0 implements xy, g0t {
    public final /* synthetic */ vkl0 b;

    public rkl0(vkl0 vkl0Var) {
        this.b = vkl0Var;
    }

    @Override // xsna.xy
    public final void a(lj50 lj50Var) {
        this.b.b((sjl0) lj50Var);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof xy) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.b, vkl0.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
