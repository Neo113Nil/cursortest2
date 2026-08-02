package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.r3n0;

/* compiled from: BaseProfilesRecommendationsHolder.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class sl6 implements r3n0.a, g0t {
    public final /* synthetic */ ol6 b;

    public sl6(ol6 ol6Var) {
        this.b = ol6Var;
    }

    @Override // xsna.r3n0.a
    public final float a(int i) {
        float f;
        float a;
        this.b.getClass();
        if (i == 3) {
            f = 6.0f;
            a = cn70.a();
        } else {
            f = 8.0f;
            a = cn70.a();
        }
        return a * f;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof r3n0.a) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.b, ol6.class, "getDecorationCornerRadius", "getDecorationCornerRadius(I)F", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
