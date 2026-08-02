package xsna;

/* compiled from: CompletableFromAction.kt */
/* loaded from: classes5.dex */
public final class r7i extends l7i {
    public final gzs<s3q0> a;

    public r7i(gzs<s3q0> gzsVar) {
        this.a = gzsVar;
    }

    @Override // xsna.l7i
    public final void a(u7i u7iVar) {
        try {
            this.a.invoke();
        } catch (Throwable th) {
            if (th instanceof VirtualMachineError) {
                throw ((VirtualMachineError) th);
            }
            if (th instanceof ThreadDeath) {
                throw ((ThreadDeath) th);
            }
            if (th instanceof LinkageError) {
                throw ((LinkageError) th);
            }
            u7iVar.onError(th);
        }
        u7iVar.onComplete();
    }
}
