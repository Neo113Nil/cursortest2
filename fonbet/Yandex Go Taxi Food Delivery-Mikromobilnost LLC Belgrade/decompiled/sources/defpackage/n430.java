package defpackage;

import android.content.Context;
import android.graphics.Paint;

/* loaded from: classes5.dex */
public abstract class n430 {
    public final Context a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final Paint g;

    public n430(Context context, float f, float f2) {
        this.a = context;
        float f3 = context.getResources().getDisplayMetrics().density;
        this.b = f3;
        float f4 = f3 * 460.0f;
        this.c = f2 >= f4 ? 1.0f : f2 / f4;
        this.d = f / 2.0f;
        this.e = f2 / 2.0f;
        this.f = a(25.0f);
        Paint paint = new Paint(1);
        this.g = paint;
        paint.setAntiAlias(true);
        paint.setColor(context.getResources().getColor(nqg0.eats_splash_color_yankee));
    }

    public final float a(float f) {
        return f * this.b * this.c;
    }
}
