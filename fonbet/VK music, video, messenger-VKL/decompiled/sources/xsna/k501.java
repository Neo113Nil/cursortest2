package xsna;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class k501 implements Runnable {
    public final /* synthetic */ long b;
    public final /* synthetic */ w601 c;

    public k501(w601 w601Var, long j) {
        this.c = w601Var;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.q(this.b);
    }
}
