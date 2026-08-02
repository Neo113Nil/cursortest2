package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: PollGradientShapedDrawable.kt */
/* loaded from: classes18.dex */
public final class eqb0 extends dqb0 {
    public Path g;

    @Override // xsna.dqb0, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Path path = this.g;
        if (path != null) {
            canvas.clipPath(path);
            Shader shader = (Shader) this.e.getValue();
            Paint paint = this.c;
            paint.setShader(shader);
            canvas.drawPath(path, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        Rect rect = new Rect(i, i2, i3, i4);
        Path path = new Path();
        float width = rect.width() / 16.0f;
        float width2 = rect.width() - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float height = rect.height() - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        path.reset();
        float f = width + width;
        path.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f);
        path.quadTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, width, width);
        Float[] fArr = lbs.d;
        path.lineTo(fArr[0].floatValue() * width2, width);
        float floatValue = fArr[1].floatValue() * width2;
        float floatValue2 = fArr[2].floatValue() * width2;
        Float[] fArr2 = lbs.e;
        path.cubicTo(floatValue, width, floatValue2, fArr2[0].floatValue() * width, fArr[3].floatValue() * width2, fArr2[1].floatValue() * width);
        path.cubicTo(fArr[4].floatValue() * width2, fArr2[2].floatValue() * width, fArr[5].floatValue() * width2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width2 * 0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        path.cubicTo((1.0f - fArr[5].floatValue()) * width2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (1.0f - fArr[4].floatValue()) * width2, fArr2[2].floatValue() * width, (1.0f - fArr[3].floatValue()) * width2, fArr2[1].floatValue() * width);
        path.cubicTo((1.0f - fArr[2].floatValue()) * width2, fArr2[0].floatValue() * width, (1.0f - fArr[1].floatValue()) * width2, width, (1.0f - fArr[0].floatValue()) * width2, width);
        float f2 = width2 - width;
        path.lineTo(f2, width);
        path.quadTo(width2, width, width2, f);
        float f3 = height - width;
        path.lineTo(width2, f3);
        path.quadTo(width2, height, f2, height);
        path.lineTo(width, height);
        path.quadTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, height, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3);
        path.lineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f);
        path.close();
        this.g = path;
    }
}
