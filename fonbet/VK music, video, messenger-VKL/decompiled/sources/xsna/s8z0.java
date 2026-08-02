package xsna;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class s8z0 implements View.OnTouchListener {
    public final a b;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface a {
        void i(z9z0 z9z0Var);
    }

    public s8z0(a aVar) {
        this.b = aVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        z9z0 z9z0Var;
        if (motionEvent.getAction() == 1) {
            if (motionEvent.getAction() == 1) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                float f = sqe0.b(view).widthPixels;
                float f2 = sqe0.b(view).heightPixels;
                view.getLocationOnScreen(new int[2]);
                z9z0Var = new c7z0((r5[0] + x) / f, (r5[1] + y) / f2);
            } else {
                z9z0Var = null;
            }
            if (z9z0Var == null) {
                z9z0Var = new y9z0();
            }
            this.b.i(z9z0Var);
        }
        return false;
    }
}
