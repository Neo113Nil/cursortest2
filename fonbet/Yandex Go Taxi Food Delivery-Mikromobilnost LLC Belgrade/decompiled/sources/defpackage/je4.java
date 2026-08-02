package defpackage;

import android.os.Build;
import android.window.BackEvent;

/* loaded from: classes10.dex */
public final class je4 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final long e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public je4(BackEvent backEvent) {
        this(r1, r2, r3, r4, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        progress = backEvent.getProgress();
        swipeEdge = backEvent.getSwipeEdge();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat(touchX=");
        sb.append(this.a);
        sb.append(", touchY=");
        sb.append(this.b);
        sb.append(", progress=");
        sb.append(this.c);
        sb.append(", swipeEdge=");
        sb.append(this.d);
        sb.append(", frameTimeMillis=");
        return b64.o(sb, this.e, ')');
    }

    public je4(float f, float f2, float f3, int i, long j) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
        this.e = j;
    }

    public je4(i750 i750Var) {
        this(i750Var.c, i750Var.d, i750Var.b, i750Var.a, i750Var.e);
    }
}
