package xsna;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class emz0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ hmz0 c;

    public emz0(hmz0 hmz0Var, int i) {
        this.b = i;
        this.c = hmz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.b(this.b);
    }
}
