package defpackage;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class hsx0 implements rjp0, jms {
    public final /* synthetic */ nex0 a;

    public hsx0(nex0 nex0Var) {
        this.a = nex0Var;
    }

    @Override // defpackage.rjp0
    public final void a(boolean z) {
        this.a.c(z);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof rjp0) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.a, nex0.class, "onTariffSwipe", "onTariffSwipe(Z)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
