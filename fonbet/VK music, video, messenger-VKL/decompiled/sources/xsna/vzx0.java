package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.l5z;

/* compiled from: Wrapper.android.kt */
/* loaded from: classes11.dex */
public final /* synthetic */ class vzx0 implements l5z.a, g0t {
    public final /* synthetic */ cvi b;

    public vzx0(cvi cviVar) {
        this.b = cviVar;
    }

    @Override // xsna.l5z.a
    public final qq9 a(m5z m5zVar) {
        return this.b.v(m5zVar);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof l5z.a) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.b, cvi.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
