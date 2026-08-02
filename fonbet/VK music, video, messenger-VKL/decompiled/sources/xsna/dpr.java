package xsna;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: FlexLayoutDragListener.kt */
/* loaded from: classes18.dex */
public interface dpr extends View.OnLongClickListener {
    public static final a q7 = a.a;

    /* compiled from: FlexLayoutDragListener.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final float b = iah0.a(8);
        public static final float c = iah0.a(2);
        public static final float d = iah0.a(16);
    }

    void F(Canvas canvas);

    boolean dispatchTouchEvent(MotionEvent motionEvent);

    int getChildDrawingOrder(int i, int i2);
}
