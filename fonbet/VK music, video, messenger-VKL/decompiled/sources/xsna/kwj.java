package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import xsna.ixd;

/* compiled from: CorrectionIconView.kt */
/* loaded from: classes16.dex */
public final class kwj extends FrameLayout {
    public static final float k = dn70.a() * 2.0f;
    public final RectF b;
    public final int c;
    public final int d;
    public final VkImageSimple e;
    public final VkText f;
    public final Paint g;
    public float h;
    public boolean i;
    public boolean j;

    public kwj(Context context) {
        super(context, null, 0);
        this.b = new RectF();
        this.c = context.getColor(R.color.vk_white);
        ixd ixdVar = ad0.g;
        ixd.a aVar = (ixdVar != null ? ixdVar : null).b;
        this.d = context.getColor(R.color.vk_blue_300);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(k);
        this.g = paint;
        this.i = true;
        setWillNotDraw(false);
        LayoutInflater.from(context).inflate(R.layout.layout_correction_btn, this);
        this.e = (VkImageSimple) findViewById(R.id.icon);
        this.f = (VkText) findViewById(R.id.text);
    }

    public final void a() {
        this.f.setText(String.valueOf((int) (this.i ? Math.rint((this.h - 0.5f) * 2.0f * 100) : Math.floor(this.h * 100))));
    }

    public final boolean getFromCenterMode() {
        return this.i;
    }

    public final float getValue() {
        return this.h;
    }

    @Override // android.view.View
    public final void onDrawForeground(Canvas canvas) {
        super.onDrawForeground(canvas);
        boolean z = this.i;
        int i = this.d;
        RectF rectF = this.b;
        Paint paint = this.g;
        if (!z) {
            paint.setColor(i);
            canvas.drawArc(rectF, 270.0f, this.h * 360.0f, false, paint);
            return;
        }
        float f = this.h;
        if (f >= 0.51f) {
            paint.setColor(i);
            canvas.drawArc(rectF, 270.0f, (this.h - 0.5f) * 2.0f * 360.0f, false, paint);
        } else if (f <= 0.49f) {
            paint.setColor(this.c);
            canvas.drawArc(rectF, 270.0f, (0.5f - this.h) * 2.0f * (-360.0f), false, paint);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float paddingLeft = getPaddingLeft();
        RectF rectF = this.b;
        rectF.left = paddingLeft;
        rectF.top = getPaddingTop();
        rectF.right = getWidth() - getPaddingRight();
        rectF.bottom = getHeight() - getPaddingBottom();
        float f = k;
        rectF.inset(f, f);
    }

    public final void setFromCenterMode(boolean z) {
        if (this.i != z) {
            this.i = z;
            a();
            invalidate();
        }
    }

    public final void setIcon(int i) {
        this.e.setImageResource(i);
    }

    public final void setShowValue(boolean z) {
        if (this.j != z) {
            this.j = z;
            awt0.v(this.f, z);
            awt0.v(this.e, !z);
        }
    }

    public final void setValue(float f) {
        float f2 = swe0.f(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        if (this.h == f2) {
            return;
        }
        this.h = f2;
        a();
        invalidate();
    }
}
