package xsna;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class me01 implements Runnable {
    public final /* synthetic */ long b;
    public final /* synthetic */ bf01 c;

    public me01(bf01 bf01Var, long j) {
        this.c = bf01Var;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.b;
        bf01 bf01Var = this.c;
        bf01Var.u(j, true);
        ((mb01) bf01Var.b).s().B(new AtomicReference());
    }
}
