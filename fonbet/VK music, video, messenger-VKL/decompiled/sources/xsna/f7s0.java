package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.gyi;

/* compiled from: VideoBoundTimelineWrapper.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class f7s0 implements gyi.a, g0t {
    public final /* synthetic */ dkt0 b;

    public f7s0(dkt0 dkt0Var) {
        this.b = dkt0Var;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof gyi.a) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.b, dkt0.class, "updateCorrectionsForTimestamp", "updateCorrectionsForTimestamp(J)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
