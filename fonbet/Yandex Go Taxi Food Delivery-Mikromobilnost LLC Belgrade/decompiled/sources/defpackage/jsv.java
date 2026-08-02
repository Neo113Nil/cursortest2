package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import defpackage.jsv;
import defpackage.xtr;

/* loaded from: classes.dex */
public final class jsv {
    public final tls a;
    public int b = 0;
    public boolean c;
    public final GestureDetector d;

    public jsv(Context context, tls tlsVar) {
        this.a = tlsVar;
        this.d = new GestureDetector(context, new GestureDetector.OnGestureListener() { // from class: androidx.compose.ui.platform.IndirectPointerNavigationGestureDetector$gestureDetector$1
            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent e) {
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
                jsv jsvVar = jsv.this;
                if (!jsvVar.c) {
                    int i = jsvVar.b;
                    if (i == 1) {
                        if (Math.abs(velocityX) > Math.abs(velocityY)) {
                            ((AndroidComposeView$indirectPointerNavigationGestureDetector$1) jsv.this.a).invoke(xtr.a(velocityX > 0.0f ? 1 : 2));
                            return true;
                        }
                    } else if (i == 2 && Math.abs(velocityY) > Math.abs(velocityX)) {
                        ((AndroidComposeView$indirectPointerNavigationGestureDetector$1) jsv.this.a).invoke(xtr.a(velocityY > 0.0f ? 1 : 2));
                    }
                }
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent e) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public void onShowPress(MotionEvent e) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent e) {
                return true;
            }
        });
    }
}
