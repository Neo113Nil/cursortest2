package xsna;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: ClipItemGestureDetector.kt */
/* loaded from: classes17.dex */
public final class w0d extends GestureDetector {
    public final w1d a;

    public w0d(Context context, w1d w1dVar) {
        super(context, w1dVar);
        this.a = w1dVar;
    }

    @Override // android.view.GestureDetector
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        w1d w1dVar = this.a;
        if (action == 1) {
            w1dVar.b.a(c5d.b);
        } else if (action == 3) {
            w1dVar.b.a(y4d.b);
        }
        return super.onTouchEvent(motionEvent);
    }
}
