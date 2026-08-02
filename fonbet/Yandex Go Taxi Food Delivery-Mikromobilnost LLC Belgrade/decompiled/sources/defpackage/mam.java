package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes6.dex */
public abstract class mam {
    public static final ColorDrawable a = new ColorDrawable(0);

    public static void a(Drawable drawable, int i) {
        b(drawable, i, false);
        int i2 = (-i) / 2;
        drawable.getBounds().offset(i2, i2);
    }

    public static final void b(Drawable drawable, int i, boolean z) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float max = Math.max(intrinsicWidth, intrinsicHeight);
        if (max <= 0.0f) {
            drawable.setBounds(0, 0, i, i);
            return;
        }
        float f = i;
        if (max > f || z) {
            intrinsicWidth = (int) ((intrinsicWidth / max) * f);
            intrinsicHeight = (int) ((intrinsicHeight / max) * f);
        }
        int i2 = (i - intrinsicWidth) / 2;
        int i3 = (i - intrinsicHeight) / 2;
        drawable.setBounds(i2, i3, intrinsicWidth + i2, intrinsicHeight + i3);
    }
}
