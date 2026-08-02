package xsna;

import android.annotation.SuppressLint;
import android.os.Build;
import android.window.BackEvent;

/* compiled from: NavigationEvent.android.kt */
/* loaded from: classes12.dex */
public final class ry50 {
    @SuppressLint({"WrongConstant"})
    public static final hy50 a(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        progress = backEvent.getProgress();
        swipeEdge = backEvent.getSwipeEdge();
        return new hy50(progress, touchX, touchY, swipeEdge, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }
}
