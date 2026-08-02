package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes9.dex */
public class RoundedImageView extends ImageView implements sg.bigo.ads.cc.a {
    private float a;
    private float b;
    private float c;
    private float d;
    private float e;
    private int f;

    public RoundedImageView(Context context) {
        this(context, null);
    }

    private void a() {
        if (getOutlineProvider() instanceof sg.bigo.ads.cc.b) {
            return;
        }
        super.setOutlineProvider(new sg.bigo.ads.cc.b());
    }

    private RectF getImageRectF() {
        float f;
        float f2;
        float f3;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        Drawable drawable = getDrawable();
        float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            float[] fArr = new float[9];
            Matrix imageMatrix = getImageMatrix();
            if (imageMatrix != null && !imageMatrix.isIdentity()) {
                imageMatrix.getValues(fArr);
            }
            float f5 = fArr[2];
            float f6 = fArr[5];
            float f7 = fArr[0];
            float f8 = fArr[4];
            float max = Float.isNaN(f5) ? 0.0f : Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5);
            f3 = Float.isNaN(f6) ? 0.0f : Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f6);
            f = Math.min((Float.isNaN(f7) || f7 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? intrinsicWidth + max : (intrinsicWidth * f7) + max, measuredWidth);
            f2 = Math.min((Float.isNaN(f8) || f8 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? intrinsicHeight + f3 : (intrinsicHeight * f8) + f3, measuredHeight);
            f4 = max;
        } else {
            f = measuredWidth;
            f2 = measuredHeight;
            f3 = 0.0f;
        }
        return new RectF(f4, f3, f, f2);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int save = canvas.save();
        Path clipPath = getClipPath();
        if (clipPath != null) {
            canvas.clipPath(clipPath);
        }
        super.draw(canvas);
        RectF imageRectF = getImageRectF();
        if (this.e > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !imageRectF.isEmpty()) {
            Paint paint = new Paint();
            paint.setColor(this.f);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.e);
            paint.setAntiAlias(true);
            float f = this.a;
            canvas.drawRoundRect(imageRectF, f, f, paint);
        }
        canvas.restoreToCount(save);
    }

    @Override // sg.bigo.ads.cc.a
    public Path getClipPath() {
        RectF imageRectF = getImageRectF();
        if (Float.isNaN(this.a) || Float.isNaN(this.b) || Float.isNaN(this.d) || Float.isNaN(this.c) || imageRectF == null || imageRectF.isEmpty()) {
            return null;
        }
        Path path = new Path();
        float[] fArr = new float[8];
        boolean isNaN = Float.isNaN(this.a);
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f2 = isNaN ? 0.0f : this.a;
        fArr[0] = f2;
        fArr[1] = f2;
        float f3 = Float.isNaN(this.b) ? 0.0f : this.b;
        fArr[2] = f3;
        fArr[3] = f3;
        float f4 = Float.isNaN(this.d) ? 0.0f : this.d;
        fArr[4] = f4;
        fArr[5] = f4;
        if (!Float.isNaN(this.c)) {
            f = this.c;
        }
        fArr[6] = f;
        fArr[7] = f;
        path.addRoundRect(imageRectF, fArr, Path.Direction.CW);
        return path;
    }

    public void setCornerRadius(float f) {
        a(f, f, f, f);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        a();
    }

    public void setStrokeColor(int i) {
        this.f = i;
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.e = f;
        invalidate();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        a();
    }

    public RoundedImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        invalidate();
    }

    public RoundedImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = Float.NaN;
        this.b = Float.NaN;
        this.c = Float.NaN;
        this.d = Float.NaN;
        this.f = -1;
    }

    @Override // android.view.View
    public void setOutlineProvider(ViewOutlineProvider viewOutlineProvider) {
    }
}
