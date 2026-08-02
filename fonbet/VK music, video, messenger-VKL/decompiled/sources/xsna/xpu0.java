package xsna;

import android.os.Handler;

/* compiled from: VkDelayedProgressDialog.kt */
/* loaded from: classes6.dex */
public final class xpu0 implements bqu0 {
    public final bqu0 a;
    public boolean d;
    public final long b = 150;
    public final Handler c = new Handler();
    public final ja6 e = new ja6(this, 10);

    public xpu0(bqu0 bqu0Var) {
        this.a = bqu0Var;
    }

    @Override // xsna.bqu0
    public final void a(izs<? super bqu0, s3q0> izsVar) {
        this.a.a(izsVar);
    }

    public final void b() {
        if (this.d) {
            this.e.run();
        }
    }

    @Override // xsna.bqu0
    public final void dismiss() {
        if (this.d) {
            this.c.postDelayed(this.e, this.b);
        }
    }

    @Override // xsna.bqu0
    public final void show() {
        if (this.d) {
            return;
        }
        this.c.removeCallbacks(this.e);
        this.d = true;
        this.a.show();
    }
}
