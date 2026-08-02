package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CommunityProfileContentUiViewTracker.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class ilh implements vtj, g0t {
    public final /* synthetic */ com.vk.metrics.eventtracking.b b;

    public ilh(com.vk.metrics.eventtracking.b bVar) {
        this.b = bVar;
    }

    @Override // xsna.vtj
    public final void a(IllegalStateException illegalStateException) {
        this.b.a(illegalStateException);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof vtj) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.b, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
