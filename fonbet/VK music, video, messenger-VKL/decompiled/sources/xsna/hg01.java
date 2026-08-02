package xsna;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class hg01 implements Runnable {
    public final /* synthetic */ long b;
    public final /* synthetic */ kg01 c;

    public hg01(kg01 kg01Var, long j) {
        this.c = kg01Var;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kg01 kg01Var = this.c;
        ((mb01) kg01Var.b).m().n(this.b);
        kg01Var.h = null;
    }
}
