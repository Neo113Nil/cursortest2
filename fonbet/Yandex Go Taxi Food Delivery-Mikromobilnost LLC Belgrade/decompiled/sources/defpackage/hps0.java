package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class hps0 {
    public int a;
    public int b;

    public final void a(Drawable drawable, int i, Canvas canvas) {
        if (drawable == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        drawable.setBounds(i - intrinsicWidth, (this.b / 2) - (drawable.getIntrinsicHeight() / 2), i + intrinsicWidth, (drawable.getIntrinsicHeight() / 2) + (this.b / 2));
        drawable.draw(canvas);
    }
}
