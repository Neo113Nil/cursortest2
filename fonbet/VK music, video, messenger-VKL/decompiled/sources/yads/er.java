package yads;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes10.dex */
public final class er extends View {
    public final float a;
    public final float b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public float f;

    public er(Context context, pg0 pg0Var) {
        super(context);
        pg0Var.getClass();
        this.a = pg0.a(context, 34.0f);
        float a = pg0.a(context, 3.0f);
        this.b = a;
        float a2 = pg0.a(context, 20.0f);
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.c = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(a);
        paint2.setAntiAlias(true);
        this.d = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(style);
        paint3.setTextSize(a2);
        paint3.setTextAlign(Paint.Align.CENTER);
        this.e = paint3;
        this.f = 40.0f;
        a();
    }

    public final void a() {
        this.d.setColor(om3.a(-65536, this.f));
        this.c.setColor(om3.a(-1, this.f));
        this.e.setColor(om3.a(-65536, this.f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = 2;
        float f2 = this.a / f;
        canvas.drawCircle(f2, f2, f2, this.c);
        canvas.drawCircle(f2, f2, f2 - (this.b / f), this.d);
        float f3 = this.a / f;
        canvas.drawText("!", f3, f3 - ((this.e.ascent() + this.e.descent()) / f), this.e);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = (int) this.a;
        setMeasuredDimension(i3, i3);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        this.f = z ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 40.0f;
        a();
        invalidate();
    }
}
