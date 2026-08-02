package yads;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import xsna.tzz;

/* loaded from: classes10.dex */
public final class e12 {
    public static final Object c = new Object();
    public static volatile e12 d;
    public final Handler a;
    public boolean b;

    public e12(Handler handler) {
        this.a = handler;
    }

    public final void a(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (!this.b) {
                view.setAlpha(view.getAlpha() / 2);
                this.b = true;
            }
            this.a.postDelayed(new tzz(7, this, view), 100L);
        }
    }

    public static final void a(e12 e12Var, View view) {
        if (e12Var.b) {
            view.setAlpha(view.getAlpha() * 2);
            e12Var.b = false;
        }
    }
}
