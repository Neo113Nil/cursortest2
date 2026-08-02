package xsna;

import android.os.SystemClock;
import xsna.uni0;

/* compiled from: RetryWrapper.kt */
/* loaded from: classes6.dex */
public final class nfg0 implements uni0.a {
    public final uni0 a;
    public int b;
    public final ro c;
    public final gzs<Boolean> d;
    public final uni0.a e;

    public nfg0(uni0 uni0Var, int i, ro roVar, gzs<Boolean> gzsVar, uni0.a aVar) {
        this.a = uni0Var;
        this.b = i;
        this.c = roVar;
        this.d = gzsVar;
        this.e = aVar;
    }

    @Override // xsna.uni0.a
    public final void a(long j) {
        ro roVar = this.c;
        if (roVar != null) {
            roVar.k("RW.onTimeResolvingSuccess");
        }
        this.e.a(j);
    }

    @Override // xsna.uni0.a
    public final void b() {
        int i = this.b;
        ro roVar = this.c;
        if (i <= 0 || !this.d.invoke().booleanValue()) {
            if (roVar != null) {
                roVar.k("RW.onTimeResolvingFailed. No more retries!");
            }
            this.e.b();
            return;
        }
        if (roVar != null) {
            roVar.k("RW.onTimeResolvingFailed. retries: " + this.b);
        }
        this.b = this.b - 1;
        SystemClock.sleep(qni0.e * ((qni0.d - r0) + 1));
        uni0 uni0Var = this.a;
        if (uni0Var != null) {
            uni0Var.a(this);
        }
    }
}
