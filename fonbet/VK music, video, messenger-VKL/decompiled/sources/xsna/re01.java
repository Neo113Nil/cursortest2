package xsna;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class re01 implements Runnable {
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ bf01 f;

    public re01(bf01 bf01Var, AtomicReference atomicReference, String str, String str2, boolean z) {
        this.f = bf01Var;
        this.b = atomicReference;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yh01 s = ((mb01) this.f.b).s();
        s.k();
        s.l();
        s.w(new sh01(s, this.b, this.c, this.d, s.t(false), this.e));
    }
}
