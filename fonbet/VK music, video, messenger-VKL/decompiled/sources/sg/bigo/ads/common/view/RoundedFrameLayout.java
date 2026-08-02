package sg.bigo.ads.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import sg.bigo.ads.R;

/* loaded from: classes9.dex */
public class RoundedFrameLayout extends FrameLayout {
    private float a;
    private float b;
    private float c;
    private float d;
    private float e;
    private int f;
    private Paint g;
    private RectF h;
    private int i;
    private float j;
    private Paint k;
    private RectF l;

    public RoundedFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    private void a() {
        if (this.j > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            setLayerType(1, null);
            setWillNotDraw(false);
            Paint paint = new Paint();
            this.k = paint;
            paint.setShadowLayer(this.j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.i);
        }
    }

    private Path getPath() {
        Path path = new Path();
        float f = this.a;
        float f2 = this.b;
        float f3 = this.d;
        float f4 = this.c;
        float[] fArr = {f, f, f2, f2, f3, f3, f4, f4};
        RectF rectF = this.l;
        if (rectF == null) {
            rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth(), getHeight());
        }
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        return path;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int save = canvas.save();
        if (this.k != null) {
            float f = this.j;
            RectF rectF = new RectF(f, f, getWidth() - this.j, getHeight() - this.j);
            this.l = rectF;
            float f2 = this.a;
            canvas.drawRoundRect(rectF, f2, f2, this.k);
        }
        canvas.clipPath(getPath());
        super.dispatchDraw(canvas);
        Paint paint = this.g;
        float f3 = this.e;
        RectF rectF2 = this.h;
        if (paint != null && rectF2 != null && f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float width = getWidth();
            float height = getHeight();
            if (width > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && height > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                paint.setColor(this.f);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(f3);
                paint.setAntiAlias(true);
                rectF2.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, height);
                float f4 = this.a;
                canvas.drawRoundRect(rectF2, f4, f4, paint);
            }
        }
        canvas.restoreToCount(save);
    }

    public float getCornerRadiusBottomLeft() {
        return this.c;
    }

    public float getCornerRadiusBottomRight() {
        return this.d;
    }

    public float getCornerRadiusTopLeft() {
        return this.a;
    }

    public float getCornerRadiusTopRight() {
        return this.b;
    }

    public void setCornerRadius(float f) {
        a(f, f, f, f);
    }

    public void setShadowColor(int i) {
        this.i = i;
        invalidate();
    }

    public void setShadowRadius(float f) {
        boolean z = this.k == null;
        this.j = f;
        if (z) {
            a();
        }
        invalidate();
    }

    public void setStrokeColor(int i) {
        this.f = i;
        if (this.g == null) {
            this.g = new Paint();
        }
        if (this.h == null) {
            this.h = new RectF();
        }
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.e = f;
        if (this.g == null) {
            this.g = new Paint();
        }
        if (this.h == null) {
            this.h = new RectF();
        }
        invalidate();
    }

    public RoundedFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public final void a(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        invalidate();
    }

    public RoundedFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BigoAd_RoundedFrameLayout);
        try {
            float dimension = obtainStyledAttributes.getDimension(R.styleable.BigoAd_RoundedFrameLayout_bigo_ad_radius, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.a = dimension;
            this.b = dimension;
            this.c = dimension;
            this.d = dimension;
            if (dimension == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.a = obtainStyledAttributes.getDimension(R.styleable.BigoAd_RoundedFrameLayout_bigo_ad_topLeftRadius, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.b = obtainStyledAttributes.getDimension(R.styleable.BigoAd_RoundedFrameLayout_bigo_ad_topRightRadius, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.c = obtainStyledAttributes.getDimension(R.styleable.BigoAd_RoundedFrameLayout_bigo_ad_bottomLeftRadius, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.d = obtainStyledAttributes.getDimension(R.styleable.BigoAd_RoundedFrameLayout_bigo_ad_bottomRightRadius, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            this.i = obtainStyledAttributes.getColor(R.styleable.BigoAd_RoundedFrameLayout_bigo_ad_shadowColor, Color.parseColor("#00FFFFFF"));
            this.j = obtainStyledAttributes.getDimension(R.styleable.BigoAd_RoundedFrameLayout_bigo_ad_shadowRadius, -1.0f);
            a();
            obtainStyledAttributes.recycle();
        } catch (Exception unused) {
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
