package xsna;

/* compiled from: SimpleSubtitleDecoder.java */
/* loaded from: classes8.dex */
public final class ssj0 extends y0n0 {
    public final /* synthetic */ usj0 g;

    public ssj0(usj0 usj0Var) {
        this.g = usj0Var;
    }

    @Override // xsna.k8l
    public final void h() {
        usj0 usj0Var = this.g;
        synchronized (usj0Var.b) {
            c();
            O[] oArr = usj0Var.f;
            int i = usj0Var.h;
            usj0Var.h = i + 1;
            oArr[i] = this;
            if (!usj0Var.c.isEmpty() && usj0Var.h > 0) {
                usj0Var.b.notify();
            }
        }
    }
}
