package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: NotificationView.kt */
/* loaded from: classes4.dex */
public final class ki70 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ li70 b;

    public ki70(li70 li70Var) {
        this.b = li70Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.b.L = false;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        li70 li70Var = this.b;
        li70Var.L = true;
        li70Var.performLongClick();
    }
}
