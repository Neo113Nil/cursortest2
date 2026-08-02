package defpackage;

import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes11.dex */
public final class gyk0 {
    public final int a;
    public final int b;
    public final Path c;

    public gyk0(float f, int i, int i2) {
        this.a = i;
        this.b = i2;
        RectF rectF = new RectF(0.0f, 0.0f, i, i2);
        Path path = new Path();
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        this.c = path;
    }
}
