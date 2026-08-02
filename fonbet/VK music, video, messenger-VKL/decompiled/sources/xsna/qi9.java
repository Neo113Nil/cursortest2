package xsna;

import xsna.xk9;

/* compiled from: CameraFirstFrameCallbackAdapter.kt */
/* loaded from: classes16.dex */
public final class qi9 implements xk9.b {
    public final gzs<s3q0> a;
    public boolean b;

    public qi9(gzs<s3q0> gzsVar) {
        this.a = gzsVar;
    }

    @Override // xsna.xk9.b
    public final void a(long j) {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.invoke();
    }
}
