package xsna;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: TrendsBackgroundViewOutlineProvider.kt */
/* loaded from: classes17.dex */
public final class aqp0 extends ViewOutlineProvider {
    public final float a;
    public final e4 b;
    public int c;

    public aqp0(float f, e4 e4Var) {
        this.a = f;
        this.b = e4Var;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        if (width == 0) {
            width = view.getMeasuredWidth();
        }
        int i = width;
        int height = view.getHeight();
        if (height == 0) {
            height = view.getMeasuredHeight();
        }
        int i2 = height + this.c;
        float intValue = i2 - ((Number) this.b.invoke()).intValue();
        float f = this.a;
        float f2 = intValue > f ? f : intValue;
        outline.setRoundRect(0, -an10.b(f2), i, i2, f2);
    }
}
