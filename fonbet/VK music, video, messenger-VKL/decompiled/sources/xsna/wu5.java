package xsna;

import android.os.Build;
import android.window.BackEvent;

/* compiled from: BackEventCompat.kt */
/* loaded from: classes11.dex */
public final class wu5 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final long e;

    public wu5(float f, float f2, float f3, int i, long j) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
        this.e = j;
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
        return vu5.a(')', this.e, sb);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wu5(BackEvent backEvent) {
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

    public wu5(hy50 hy50Var) {
        this(hy50Var.c, hy50Var.d, hy50Var.b, hy50Var.a, hy50Var.e);
    }
}
