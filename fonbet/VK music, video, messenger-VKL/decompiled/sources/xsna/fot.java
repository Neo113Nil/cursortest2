package xsna;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: GestureDetectorCompat.java */
@Deprecated
/* loaded from: classes11.dex */
public final class fot {
    public final GestureDetector a;

    public fot(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.a = new GestureDetector(context, onGestureListener, handler);
    }

    public final void a(MotionEvent motionEvent) {
        this.a.onTouchEvent(motionEvent);
    }
}
