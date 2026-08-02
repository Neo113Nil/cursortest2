package xsna;

import java.util.TimerTask;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class g301 extends TimerTask {
    public final /* synthetic */ k301 b;

    public g301(k301 k301Var) {
        this.b = k301Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        k301 k301Var = this.b;
        lvf0 lvf0Var = k301Var.e;
        lvf0Var.I(k301Var.a);
        lvf0Var.b.postDelayed(this, k301Var.b);
    }
}
