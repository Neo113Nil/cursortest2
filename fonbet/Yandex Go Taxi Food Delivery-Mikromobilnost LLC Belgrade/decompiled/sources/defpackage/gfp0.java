package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* loaded from: classes11.dex */
public final class gfp0 {
    public final long a;
    public final int b;
    public final int[] c;
    public final PointF[] d;
    public final int e;

    public gfp0(Context context, MotionEvent motionEvent) {
        this.a = motionEvent.getEventTime();
        this.b = motionEvent.getAction();
        int pointerCount = motionEvent.getPointerCount();
        this.c = new int[pointerCount];
        this.d = new PointF[pointerCount];
        for (int i = 0; i < pointerCount; i++) {
            this.c[i] = motionEvent.getPointerId(i);
            this.d[i] = new PointF(motionEvent.getX(i), motionEvent.getY(i));
        }
        this.e = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public final int a() {
        return (this.b & 65280) >> 8;
    }

    public final int b() {
        return this.b & 255;
    }

    public final long c() {
        return this.a;
    }

    public final int d() {
        return this.c.length;
    }

    public final int e(int i) {
        return this.c[i];
    }

    public final int f() {
        return this.e;
    }

    public final float g(int i) {
        return this.d[i].x;
    }

    public final float h(int i) {
        return this.d[i].y;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ScreenTouch{eventTime=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", pointerId=");
        int[] iArr = this.c;
        sb.append(iArr[0]);
        sb.append(", x=");
        sb.append(g(0));
        sb.append(", y=");
        sb.append(h(0));
        if (iArr.length > 1) {
            str = " pointerId2=" + iArr[1] + ", x2=" + g(1) + ", y2=" + h(1);
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(", scaledTouchSlop=");
        return oyr.m(this.e, "}", sb);
    }
}
