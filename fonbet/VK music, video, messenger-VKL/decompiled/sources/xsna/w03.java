package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ApiWrapper.kt */
/* loaded from: classes11.dex */
public final /* synthetic */ class w03 implements h200, g0t {
    public final /* synthetic */ tdp b;

    public w03(tdp tdpVar) {
        this.b = tdpVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof h200) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(0, this.b, tdp.class, "getPrefix", "getPrefix()Ljava/lang/String;", 0);
    }

    @Override // xsna.h200
    public final String getPrefix() {
        return this.b.getPrefix();
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
