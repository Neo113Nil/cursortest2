package xsna;

import android.graphics.drawable.Drawable;

/* compiled from: DrawableUtils.kt */
/* loaded from: classes.dex */
public final class sko {
    public static final void a(Drawable drawable, Drawable drawable2) {
        if (drawable == null || drawable == drawable2) {
            return;
        }
        drawable.setBounds(drawable2.getBounds());
        drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
        drawable.setLevel(drawable2.getLevel());
        drawable.setVisible(drawable2.isVisible(), false);
        drawable.setState(drawable2.getState());
    }

    public static final int b(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & 16777215;
        }
        return (i & 16777215) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(Drawable drawable, Drawable.Callback callback, ujp0 ujp0Var) {
        if (drawable == 0) {
            return;
        }
        drawable.setCallback(callback);
        tjp0 tjp0Var = drawable instanceof tjp0 ? (tjp0) drawable : null;
        if (tjp0Var != null) {
            tjp0Var.c(ujp0Var);
        }
    }
}
