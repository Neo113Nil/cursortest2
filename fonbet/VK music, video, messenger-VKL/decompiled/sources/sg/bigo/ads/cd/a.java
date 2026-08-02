package sg.bigo.ads.cd;

import android.content.Context;
import android.graphics.Point;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import sg.bigo.ads.an.i;

/* loaded from: classes9.dex */
public final class a extends GestureDetector {

    @NonNull
    public C2451a a;
    public i b;
    private long c;

    /* renamed from: sg.bigo.ads.cd.a$a, reason: collision with other inner class name */
    public static class C2451a extends GestureDetector.SimpleOnGestureListener {
        public boolean a = false;

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            this.a = true;
            return super.onSingleTapUp(motionEvent);
        }
    }

    public a(@NonNull Context context) {
        this(context, new C2451a());
    }

    public final boolean a() {
        return System.currentTimeMillis() - this.c <= 3000;
    }

    @Override // android.view.GestureDetector
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.a.a = false;
            this.c = System.currentTimeMillis();
            this.b.a = new Point(Math.round(motionEvent.getX()), Math.round(motionEvent.getY()));
        } else if (motionEvent.getActionMasked() == 1) {
            this.b.b = new Point(Math.round(motionEvent.getX()), Math.round(motionEvent.getY()));
        }
        return super.onTouchEvent(motionEvent);
    }

    private a(Context context, @NonNull C2451a c2451a) {
        super(context, c2451a);
        this.c = -1L;
        this.b = new i();
        this.a = c2451a;
        setIsLongpressEnabled(false);
    }
}
