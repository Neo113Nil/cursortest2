package xsna;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: JobSupport.kt */
/* loaded from: classes8.dex */
public final class psx extends jyx {
    public static final /* synthetic */ AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(psx.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;
    public final ic1 f;

    public psx(ic1 ic1Var) {
        this.f = ic1Var;
    }

    @Override // xsna.jyx
    public final boolean h() {
        return true;
    }

    @Override // xsna.jyx
    public final void i(Throwable th) {
        if (g.compareAndSet(this, 0, 1)) {
            this.f.invoke(th);
        }
    }
}
