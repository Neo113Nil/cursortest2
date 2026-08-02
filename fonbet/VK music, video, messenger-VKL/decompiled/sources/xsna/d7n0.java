package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: SuperAppAnalyticsImpl.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class d7n0 implements vtj, g0t {
    public final /* synthetic */ com.vk.metrics.eventtracking.b b;

    public d7n0(com.vk.metrics.eventtracking.b bVar) {
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
