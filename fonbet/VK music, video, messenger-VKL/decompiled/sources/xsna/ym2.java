package xsna;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: AnimationBackend.java */
/* loaded from: classes12.dex */
public interface ym2 extends rp2 {

    /* compiled from: AnimationBackend.java */
    public interface a {
    }

    void clear();

    boolean drawFrame(Drawable drawable, Canvas canvas, int i);

    int getIntrinsicHeight();

    int getIntrinsicWidth();

    void setAlpha(int i);

    void setAnimationListener(a aVar);

    void setBounds(Rect rect);

    void setColorFilter(ColorFilter colorFilter);
}
