package defpackage;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class ni2 implements zcv, jms {
    public final /* synthetic */ b7z0 a;

    public ni2(b7z0 b7z0Var) {
        this.a = b7z0Var;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof zcv) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(0, this.a, b7z0.class, "uptimeMillis", "uptimeMillis()J", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // defpackage.zcv
    public final long uptimeMillis() {
        return this.a.uptimeMillis();
    }
}
