package xsna;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: NewsfeedListEventsHandler.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class eq60 implements bin0, g0t {
    public final /* synthetic */ AtomicReference<String> b;

    public eq60(AtomicReference<String> atomicReference) {
        this.b = atomicReference;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof bin0) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.bin0
    public final Object get() {
        return this.b.get();
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(0, this.b, AtomicReference.class, "get", "get()Ljava/lang/Object;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
