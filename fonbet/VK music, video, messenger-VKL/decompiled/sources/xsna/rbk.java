package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CreationOnBoardingTasksScreen.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class rbk implements xy, g0t {
    public final /* synthetic */ mm50<xck, cck, tck> b;

    public rbk(mm50<xck, cck, tck> mm50Var) {
        this.b = mm50Var;
    }

    @Override // xsna.xy
    public final void a(lj50 lj50Var) {
        this.b.b((cck) lj50Var);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof xy) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.b, mm50.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
