package xsna;

import com.google.android.gms.internal.measurement.zzpd;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class xe01 implements Runnable {
    public final /* synthetic */ xwz0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ xwz0 f;
    public final /* synthetic */ bf01 g;

    public xe01(bf01 bf01Var, xwz0 xwz0Var, int i, long j, boolean z, xwz0 xwz0Var2) {
        this.g = bf01Var;
        this.b = xwz0Var;
        this.c = i;
        this.d = j;
        this.e = z;
        this.f = xwz0Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bf01 bf01Var = this.g;
        xwz0 xwz0Var = this.b;
        bf01Var.y(xwz0Var);
        bf01.F(this.g, this.b, this.c, this.d, false, this.e);
        zzpd.zzc();
        if (((mb01) bf01Var.b).h.t(null, s701.i0)) {
            bf01.E(bf01Var, xwz0Var, this.f);
        }
    }
}
