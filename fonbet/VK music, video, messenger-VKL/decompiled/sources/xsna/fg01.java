package xsna;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class fg01 implements Runnable {
    public final /* synthetic */ dg01 b;
    public final /* synthetic */ dg01 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ kg01 f;

    public fg01(kg01 kg01Var, dg01 dg01Var, dg01 dg01Var2, long j, boolean z) {
        this.f = kg01Var;
        this.b = dg01Var;
        this.c = dg01Var2;
        this.d = j;
        this.e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.o(this.b, this.c, this.d, this.e, null);
    }
}
