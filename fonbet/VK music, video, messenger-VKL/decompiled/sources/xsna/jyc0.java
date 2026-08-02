package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.wmi0;

/* compiled from: PreferenceInitTaskLogic.kt */
/* loaded from: classes11.dex */
public final /* synthetic */ class jyc0 implements wmi0.b, g0t {
    public final /* synthetic */ com.vk.metrics.eventtracking.b b;

    public jyc0(com.vk.metrics.eventtracking.b bVar) {
        this.b = bVar;
    }

    @Override // xsna.wmi0.b
    public final void a(Throwable th) {
        this.b.a(th);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof wmi0.b) && (obj instanceof g0t)) {
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
