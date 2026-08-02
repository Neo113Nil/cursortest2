package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.r3n0;

/* compiled from: EntryPointsHolder.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class rrp implements r3n0.b, g0t {
    public final /* synthetic */ urp b;

    public rrp(urp urpVar) {
        this.b = urpVar;
    }

    @Override // xsna.r3n0.b
    public final boolean a(int i) {
        this.b.getClass();
        return true;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof r3n0.b) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.b, urp.class, "isViewTypeNeedsDecoration", "isViewTypeNeedsDecoration(I)Z", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
