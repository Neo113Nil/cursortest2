package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: VoipPastCallsFeature.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class nuw0 implements c59, g0t {
    public final /* synthetic */ puw0 b;

    public nuw0(puw0 puw0Var) {
        this.b = puw0Var;
    }

    @Override // xsna.c59
    public final void a(b59 b59Var) {
        this.b.T(b59Var);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof c59) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.b, puw0.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
