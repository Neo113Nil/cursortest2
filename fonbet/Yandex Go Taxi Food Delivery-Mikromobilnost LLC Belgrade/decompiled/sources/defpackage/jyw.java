package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes4.dex */
public final class jyw extends t8x {
    public static final /* synthetic */ AtomicIntegerFieldUpdater B = AtomicIntegerFieldUpdater.newUpdater(jyw.class, "_invoked$volatile");
    public final tls A;
    private volatile /* synthetic */ int _invoked$volatile;

    public jyw(tls tlsVar) {
        this.A = tlsVar;
    }

    @Override // defpackage.t8x
    public final boolean n() {
        return true;
    }

    @Override // defpackage.t8x
    public final void o(Throwable th) {
        if (B.compareAndSet(this, 0, 1)) {
            this.A.invoke(th);
        }
    }
}
