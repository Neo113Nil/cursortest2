package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.widget.TextView;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class x9z0 extends TextView {
    public final GradientDrawable b;
    public final int c;

    public x9z0(Context context) {
        super(context, null, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.b = gradientDrawable;
        gradientDrawable.setStroke(0, -13421773);
        gradientDrawable.setColor(0);
        this.c = (int) TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics());
    }

    public final void a(int i, int i2) {
        GradientDrawable gradientDrawable = this.b;
        gradientDrawable.setStroke(1, i);
        gradientDrawable.setCornerRadius(i2);
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft() - this.c;
        int paddingTop = getPaddingTop();
        int width = getWidth();
        int height = getHeight();
        GradientDrawable gradientDrawable = this.b;
        gradientDrawable.setBounds(paddingLeft, paddingTop, width, height);
        gradientDrawable.draw(canvas);
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension((this.c * 2) + getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.b.setColor(i);
        invalidate();
    }
}
