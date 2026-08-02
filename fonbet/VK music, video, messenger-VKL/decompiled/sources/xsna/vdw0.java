package xsna;

import xsna.yre0;

/* compiled from: VoipAnonymQueueSyncHolderDelegateImpl.kt */
/* loaded from: classes.dex */
public final class vdw0 implements bww0<yre0.a.b> {
    public final ese0 a;
    public cse0 b;
    public final du2 c = new du2();

    public vdw0(ese0 ese0Var) {
        this.a = ese0Var;
    }

    @Override // xsna.ure0
    public final void a(yre0.a.b bVar) {
        synchronized (this) {
            try {
                cse0 cse0Var = this.b;
                if (cse0Var != null) {
                    cse0Var.h();
                }
                this.b = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.bww0
    public final io.reactivex.rxjava3.internal.operators.observable.z0 b() {
        io.reactivex.rxjava3.subjects.f fVar = (io.reactivex.rxjava3.subjects.f) this.c.a.getValue();
        fVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.z0(fVar);
    }
}
