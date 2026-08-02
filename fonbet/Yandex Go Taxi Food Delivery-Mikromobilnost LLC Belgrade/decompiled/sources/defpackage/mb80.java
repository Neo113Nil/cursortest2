package defpackage;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes14.dex */
public final /* synthetic */ class mb80 implements tsx0, jms {
    public final /* synthetic */ e840 a;

    public mb80(e840 e840Var) {
        this.a = e840Var;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof tsx0) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(0, this.a, yvf0.class, "get", "get()Ljava/lang/Object;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
