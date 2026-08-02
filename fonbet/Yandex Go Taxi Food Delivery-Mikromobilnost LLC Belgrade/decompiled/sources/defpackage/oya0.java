package defpackage;

import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes8.dex */
public final /* synthetic */ class oya0 implements dya0, jms {
    public final /* synthetic */ sya0 a;

    public oya0(sya0 sya0Var) {
        this.a = sya0Var;
    }

    @Override // defpackage.dya0
    public final void a(List list) {
        this.a.f(list);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof dya0) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.a, sya0.class, "updatePermissionGrants", "updatePermissionGrants(Ljava/util/List;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
