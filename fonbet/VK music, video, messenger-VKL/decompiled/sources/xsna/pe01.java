package xsna;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class pe01 implements Runnable {
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ bf01 e;

    public pe01(bf01 bf01Var, AtomicReference atomicReference, String str, String str2) {
        this.e = bf01Var;
        this.b = atomicReference;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yh01 s = ((mb01) this.e.b).s();
        s.k();
        s.l();
        s.w(new qh01(s, this.b, this.c, this.d, s.t(false)));
    }
}
