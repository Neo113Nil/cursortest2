package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.r3n0;

/* compiled from: EntryPointsHolder.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class srp implements r3n0.a, g0t {
    public final /* synthetic */ urp b;

    public srp(urp urpVar) {
        this.b = urpVar;
    }

    @Override // xsna.r3n0.a
    public final float a(int i) {
        this.b.getClass();
        return cn70.a() * 10.0f;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof r3n0.a) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.b, urp.class, "getDecorationCornerRadius", "getDecorationCornerRadius(I)F", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
