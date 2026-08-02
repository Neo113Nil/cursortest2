package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import defpackage.df61;

/* loaded from: classes10.dex */
public final class df61 {
    public final int a;
    public final vfc0 b;
    public final boolean c = true;
    public final boolean d = true;
    public float e;
    public float f;
    public boolean g;
    public float h;
    public float i;
    public float j;
    public int k;
    public final GestureDetector l;
    public boolean m;

    public df61(Context context, vfc0 vfc0Var) {
        this.a = ViewConfiguration.get(context).getScaledTouchSlop() * 2;
        this.b = vfc0Var;
        this.l = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: androidx.camera.view.impl.ZoomGestureDetector$gestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent e) {
                df61.this.i = e.getX();
                df61.this.j = e.getY();
                df61.this.k = 1;
                return true;
            }
        });
    }

    public final boolean a() {
        return this.k != 0;
    }
}
