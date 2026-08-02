package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class e8z0 extends View {
    public static final Paint b;
    public static final Path c;

    static {
        Paint paint = new Paint();
        b = paint;
        c = new Path();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float measuredHeight = getMeasuredHeight() / 2.0f;
        if (measuredHeight == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        Path path = c;
        path.reset();
        path.setFillType(Path.FillType.EVEN_ODD);
        float f = 0.45f * measuredHeight;
        double d = measuredHeight;
        float f2 = measuredHeight * 2.0f;
        path.moveTo((float) ((Math.sin(ConnectivityTracker.DEFAULT_UPLINK_BITRATE) * d) + d), f2 - ((float) ((Math.cos(ConnectivityTracker.DEFAULT_UPLINK_BITRATE) * d) + d)));
        double d2 = f;
        path.lineTo((float) ((Math.sin(0.6283185307179586d) * d2) + d), f2 - ((float) ((Math.cos(0.6283185307179586d) * d2) + d)));
        for (int i = 1; i < 5; i++) {
            double d3 = i * 1.2566370614359172d;
            path.lineTo((float) ((Math.sin(d3) * d) + d), f2 - ((float) ((Math.cos(d3) * d) + d)));
            double d4 = d3 + 0.6283185307179586d;
            path.lineTo((float) ((Math.sin(d4) * d2) + d), f2 - ((float) ((Math.cos(d4) * d2) + d)));
        }
        path.close();
        canvas.drawPath(path, b);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int min = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i));
        setMeasuredDimension(min, min);
    }

    public void setColor(int i) {
        b.setColor(i);
        invalidate();
    }
}
