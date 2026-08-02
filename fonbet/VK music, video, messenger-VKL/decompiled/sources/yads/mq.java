package yads;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes10.dex */
public final class mq extends FrameLayout {
    public final pg0 a;
    public final jk1 b;
    public final int c;
    public final Paint d;

    public mq(Context context, pg0 pg0Var, jk1 jk1Var) {
        super(context);
        this.a = pg0Var;
        this.b = jk1Var;
        pg0Var.getClass();
        this.c = pg0.a(context, 0.5f);
        this.d = new Paint();
        a(context);
    }

    public final void a(Context context) {
        this.a.getClass();
        int a = pg0.a(context, 1.0f);
        this.d.setStyle(Paint.Style.STROKE);
        this.d.setStrokeWidth(a);
        this.d.setColor(-65536);
        setClickable(false);
        setFocusable(false);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.c;
        canvas.drawRect(f, f, getWidth() - this.c, getHeight() - this.c, this.d);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object parent = getParent();
        if (!(parent instanceof View)) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        View view = (View) parent;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        setLeft(0);
        setTop(0);
        setRight(measuredWidth);
        setBottom(measuredHeight);
        super.onLayout(z, 0, 0, measuredWidth, measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        ik1 a = this.b.a(i, i2);
        super.onMeasure(a.a, a.b);
    }

    public final void setColor(int i) {
        if (this.d.getColor() != i) {
            this.d.setColor(i);
            requestLayout();
        }
    }
}
