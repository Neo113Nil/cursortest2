package xsna;

import android.os.Handler;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class emr implements Runnable {
    public final /* synthetic */ int b;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                if (!fmr.f) {
                    fmr.f = true;
                    Handler handler = fmr.a;
                    thq thqVar = fmr.h;
                    handler.removeCallbacks(thqVar);
                    handler.postDelayed(thqVar, 120L);
                    break;
                }
                break;
            default:
                fl4 g = lyd.g();
                int i = fl4.a;
                g.x(null, false);
                break;
        }
    }
}
