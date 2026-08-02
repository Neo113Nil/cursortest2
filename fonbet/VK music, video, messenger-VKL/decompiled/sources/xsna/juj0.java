package xsna;

import com.vk.reefton.literx.SimpleDisposable;

/* compiled from: SingleFromCallable.kt */
/* loaded from: classes5.dex */
public final class juj0<T> extends dtj0<T> {
    public final gzs<T> a;

    /* JADX WARN: Multi-variable type inference failed */
    public juj0(gzs<? extends T> gzsVar) {
        this.a = gzsVar;
    }

    @Override // xsna.dtj0
    public final void a(xuj0<T> xuj0Var) {
        xuj0Var.a(new SimpleDisposable());
        try {
            xuj0Var.onSuccess(this.a.invoke());
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
            xuj0Var.onError(th);
        }
    }
}
