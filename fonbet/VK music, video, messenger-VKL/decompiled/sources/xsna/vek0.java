package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: SolidColorView.kt */
/* loaded from: classes17.dex */
public class vek0 extends View {
    public final Paint b;
    public final RectF c;
    public int d;
    public float e;

    public vek0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Paint();
        this.c = new RectF();
    }

    public final int getColor() {
        return this.d;
    }

    public final float getCornerRadius() {
        return this.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d == 0) {
            return;
        }
        RectF rectF = this.c;
        rectF.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        float f = this.e;
        Paint paint = this.b;
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            canvas.drawRect(rectF, paint);
        } else {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    public final void setColor(int i) {
        this.d = i;
        this.b.setColor(i);
        invalidate();
    }

    public final void setCornerRadius(float f) {
        this.e = f;
        invalidate();
    }

    public vek0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.b = new Paint();
        this.c = new RectF();
    }
}
