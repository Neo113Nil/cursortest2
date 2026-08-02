package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: BaseCameraView.java */
/* loaded from: classes13.dex */
public final class p96 extends View {
    public Paint b;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.b == null) {
            Paint paint = new Paint();
            this.b = paint;
            paint.setAntiAlias(true);
            this.b.setDither(true);
            this.b.setStyle(Paint.Style.FILL);
            this.b.setStrokeWidth(1.0f);
            this.b.setColor(33554431);
        }
        canvas.drawLine(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, canvas.getHeight(), this.b);
        canvas.drawLine(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, canvas.getWidth(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.b);
    }
}
