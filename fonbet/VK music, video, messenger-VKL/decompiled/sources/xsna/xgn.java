package xsna;

/* compiled from: CancellableContinuation.kt */
/* loaded from: classes11.dex */
public final class xgn implements mp9 {
    public final ogn b;

    public xgn(ogn ognVar) {
        this.b = ognVar;
    }

    @Override // xsna.mp9
    public final void a(Throwable th) {
        this.b.dispose();
    }

    public final String toString() {
        return "DisposeOnCancel[" + this.b + ']';
    }
}
