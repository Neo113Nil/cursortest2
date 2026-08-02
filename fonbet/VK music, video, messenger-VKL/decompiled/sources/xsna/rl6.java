package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.r3n0;

/* compiled from: BaseProfilesRecommendationsHolder.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class rl6 implements r3n0.b, g0t {
    public final /* synthetic */ ol6 b;

    public rl6(ol6 ol6Var) {
        this.b = ol6Var;
    }

    @Override // xsna.r3n0.b
    public final boolean a(int i) {
        this.b.getClass();
        return (i == 0 || i == 1 || i == 2 || i == 5 || i == 6 || i == 7) ? false : true;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof r3n0.b) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.b, ol6.class, "isViewTypeNeedsDecoration", "isViewTypeNeedsDecoration(I)Z", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
