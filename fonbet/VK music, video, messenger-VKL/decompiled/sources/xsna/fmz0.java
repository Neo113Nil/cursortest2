package xsna;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class fmz0 implements Runnable {
    public final /* synthetic */ gmz0 b;

    public fmz0(gmz0 gmz0Var) {
        this.b = gmz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hmz0 hmz0Var = this.b.a;
        hmz0Var.b.disconnect(hmz0Var.b.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
