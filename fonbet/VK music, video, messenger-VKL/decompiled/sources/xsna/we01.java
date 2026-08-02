package xsna;

import com.google.android.gms.internal.measurement.zzpd;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class we01 implements Runnable {
    public final /* synthetic */ xwz0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ xwz0 g;
    public final /* synthetic */ bf01 h;

    public we01(bf01 bf01Var, xwz0 xwz0Var, long j, int i, long j2, boolean z, xwz0 xwz0Var2) {
        this.h = bf01Var;
        this.b = xwz0Var;
        this.c = j;
        this.d = i;
        this.e = j2;
        this.f = z;
        this.g = xwz0Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bf01 bf01Var = this.h;
        xwz0 xwz0Var = this.b;
        bf01Var.y(xwz0Var);
        bf01Var.u(this.c, false);
        bf01.F(this.h, this.b, this.d, this.e, true, this.f);
        zzpd.zzc();
        if (((mb01) bf01Var.b).h.t(null, s701.i0)) {
            bf01.E(bf01Var, xwz0Var, this.g);
        }
    }
}
