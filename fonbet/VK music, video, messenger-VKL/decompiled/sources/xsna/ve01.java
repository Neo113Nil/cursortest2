package xsna;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class ve01 implements Runnable {
    public final /* synthetic */ Boolean b;
    public final /* synthetic */ bf01 c;

    public ve01(bf01 bf01Var, Boolean bool) {
        this.c = bf01Var;
        this.b = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.B(true, this.b);
    }
}
