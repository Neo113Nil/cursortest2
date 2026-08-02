package xsna;

import android.view.Choreographer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class jtu implements Choreographer.FrameCallback {
    public final /* synthetic */ lq9 b;

    public /* synthetic */ jtu(lq9 lq9Var) {
        this.b = lq9Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        bdn bdnVar = bdn.a;
        this.b.A(ie00.a, Long.valueOf(j));
    }
}
