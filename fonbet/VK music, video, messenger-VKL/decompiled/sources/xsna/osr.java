package xsna;

import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* compiled from: FlowCoroutine.kt */
/* loaded from: classes11.dex */
public final class osr<T> extends z9h0<T> {
    @Override // xsna.pyx
    public final boolean S(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return M(th);
    }
}
