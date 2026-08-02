package xsna;

import xsna.s9u;

/* compiled from: NativeMapViewBinding.kt */
/* loaded from: classes2.dex */
public final class xv50 implements s9u.a {
    public final /* synthetic */ yv50 a;
    public final /* synthetic */ long b;

    public xv50(yv50 yv50Var, long j) {
        this.a = yv50Var;
        this.b = j;
    }

    @Override // xsna.s9u.a
    public final void onFinish() {
        this.a.o(this.b);
    }

    @Override // xsna.s9u.a
    public final void onCancel() {
    }
}
