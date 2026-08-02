package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: MusicExponentialLongTapEventsGenerator.kt */
/* loaded from: classes3.dex */
public final class fk40 extends GestureDetector.SimpleOnGestureListener implements Runnable {
    public final /* synthetic */ gk40 b;

    public fk40(gk40 gk40Var) {
        this.b = gk40Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        long currentTimeMillis = System.currentTimeMillis();
        gk40 gk40Var = this.b;
        gk40Var.d = currentTimeMillis;
        bn40.f("onLongPress");
        gk40Var.b.onNext(-1L);
        run();
    }

    @Override // java.lang.Runnable
    public final void run() {
        gk40 gk40Var = this.b;
        gk40Var.b.onNext(Long.valueOf(System.currentTimeMillis() - gk40Var.d));
        if (gk40Var.d > 0) {
            gk40Var.c.postDelayed(this, 500L);
        }
    }
}
