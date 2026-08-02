package xsna;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: BaseLogoDrawer.kt */
/* loaded from: classes3.dex */
public class og6 implements gr9 {
    public final Drawable a;
    public final int b;
    public final int c;

    public og6(float f, float f2, int i, Drawable drawable) {
        this.a = drawable;
        int b = an10.b(i * f2);
        this.b = b;
        int b2 = an10.b(b * f);
        this.c = b2;
        drawable.setBounds(0, 0, b2, b);
    }

    @Override // xsna.gr9
    public void draw(Canvas canvas) {
        this.a.draw(canvas);
    }

    public /* synthetic */ og6(int i, float f, Drawable drawable) {
        this(f, 0.03f, i, drawable);
    }
}
