package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: VideoDynamicPollDelegate.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class iis0 implements g0t {
    public final /* synthetic */ kis0 b;

    public iis0(kis0 kis0Var) {
        this.b = kis0Var;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof iis0) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(0, this.b, kis0.class, "onVisibilityReached", "onVisibilityReached()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
