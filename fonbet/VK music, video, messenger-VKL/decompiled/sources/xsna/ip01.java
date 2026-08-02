package xsna;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class ip01 implements Runnable {
    public final /* synthetic */ ds01 b;
    public final /* synthetic */ int c;

    public ip01(nr01 nr01Var, ds01 ds01Var, int i) {
        this.b = ds01Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.d.onApplicationDisconnected(this.c);
    }
}
