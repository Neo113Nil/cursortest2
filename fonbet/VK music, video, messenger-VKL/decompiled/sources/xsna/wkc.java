package xsna;

import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: ClickableViewDelegate.kt */
/* loaded from: classes18.dex */
public final class wkc {
    public final Rect a = new Rect();
    public final RectF b = new RectF();
    public final Paint c;
    public final Path d;

    public wkc() {
        Paint c = x9.c(true);
        c.setPathEffect(new CornerPathEffect(cn70.a() * 3.0f));
        this.c = c;
        this.d = new Path();
    }
}
