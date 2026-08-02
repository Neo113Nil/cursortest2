package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import xsna.tl6;

/* compiled from: DrawingDelegate.java */
/* loaded from: classes13.dex */
public abstract class qlo<S extends tl6> {
    public final S a;

    /* compiled from: DrawingDelegate.java */
    public static class a {
        public float a;
        public float b;
        public int c;
        public int d;
    }

    public qlo(S s) {
        this.a = s;
    }

    public abstract void a(@NonNull Canvas canvas, @NonNull Rect rect, float f, boolean z, boolean z2);

    public abstract void b(@NonNull Canvas canvas, int i, int i2, @NonNull Paint paint);

    public abstract void c(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull a aVar, int i);

    public abstract void d(@NonNull Canvas canvas, @NonNull Paint paint, float f, float f2, int i, int i2, int i3);

    public abstract int e();

    public abstract int f();
}
