package xsna;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: MusicExponentialLongTapEventsGenerator.kt */
/* loaded from: classes3.dex */
public final class gk40 implements View.OnTouchListener {
    public final io.reactivex.rxjava3.subjects.f<Long> b = new io.reactivex.rxjava3.subjects.f<>();
    public final Handler c = new Handler();
    public long d;
    public final GestureDetector e;

    public gk40(Context context) {
        this.e = new GestureDetector(context, new fk40(this));
    }

    public final boolean a() {
        boolean z = this.d > 0;
        this.d = 0L;
        this.c.removeCallbacksAndMessages(null);
        this.b.onNext(0L);
        return z;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.e.onTouchEvent(motionEvent);
        if ((motionEvent.getAction() != 1 && motionEvent.getAction() != 3) || motionEvent.getPointerCount() >= 2) {
            return false;
        }
        boolean a = a();
        if (view != null) {
            view.setPressed(!a);
        }
        return a;
    }
}
