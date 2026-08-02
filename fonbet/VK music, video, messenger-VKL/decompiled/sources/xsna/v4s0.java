package xsna;

import android.app.Activity;
import xsna.c63;

/* compiled from: VideoBackgroundQueueController.kt */
/* loaded from: classes2.dex */
public final class v4s0 extends c63.b {
    public final att0 b;

    public v4s0(att0 att0Var) {
        this.b = att0Var;
    }

    @Override // xsna.c63.b
    public final void n(Activity activity) {
        this.b.release();
    }

    @Override // xsna.c63.b
    public final void s() {
        this.b.release();
    }

    @Override // xsna.c63.b
    public final void u() {
        this.b.init();
    }

    @Override // xsna.c63.b
    public final void v() {
        this.b.init();
    }

    @Override // xsna.c63.b
    public final void x(Activity activity) {
        this.b.release();
    }

    @Override // xsna.c63.b
    public final void y(Activity activity) {
        this.b.release();
    }
}
