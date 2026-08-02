package xsna;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class ig01 implements Runnable {
    public final /* synthetic */ dg01 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ kg01 d;

    public ig01(kg01 kg01Var, dg01 dg01Var, long j) {
        this.d = kg01Var;
        this.b = dg01Var;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.c;
        kg01 kg01Var = this.d;
        kg01Var.p(this.b, false, j);
        kg01Var.h = null;
        yh01 s = ((mb01) kg01Var.b).s();
        s.k();
        s.l();
        s.w(new ng01(s, null));
    }
}
