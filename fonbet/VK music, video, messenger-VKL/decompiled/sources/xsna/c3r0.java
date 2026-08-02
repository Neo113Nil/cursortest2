package xsna;

import android.graphics.Color;
import java.lang.reflect.Field;

/* compiled from: Utils.java */
/* loaded from: classes7.dex */
public final class c3r0 {
    public static Field a;

    public static int a(float f, int i, int i2) {
        return Math.round(f * (i2 - i)) + i;
    }

    public static int b(float f, int i, int i2) {
        return Color.argb(a(f, Color.alpha(i), Color.alpha(i2)), a(f, Color.red(i), Color.red(i2)), a(f, Color.green(i), Color.green(i2)), a(f, Color.blue(i), Color.blue(i2)));
    }
}
