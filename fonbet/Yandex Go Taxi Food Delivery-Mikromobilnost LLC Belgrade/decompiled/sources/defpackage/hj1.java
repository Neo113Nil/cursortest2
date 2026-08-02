package defpackage;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class hj1 implements gj1, jms {
    public final /* synthetic */ yo70 a;

    public hj1(yo70 yo70Var) {
        this.a = yo70Var;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof gj1) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(0, this.a, Runnable.class, "run", "run()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
