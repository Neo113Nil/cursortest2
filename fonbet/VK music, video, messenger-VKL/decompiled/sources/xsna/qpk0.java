package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class qpk0 extends View {
    public static final Paint g;
    public int b;
    public float c;
    public float d;
    public Bitmap e;
    public boolean f;

    static {
        Paint paint = new Paint();
        g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
    }

    public final Path a(float f, int i, int i2) {
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        int i3 = 0;
        while (i3 < i2) {
            float f2 = i3;
            double d = (f2 * this.c) + (f2 * f * 2.0f) + i + f;
            double d2 = f;
            float f3 = 2.0f * f;
            path.moveTo((float) ((Math.sin(ConnectivityTracker.DEFAULT_UPLINK_BITRATE) * d2) + d), f3 - ((float) ((Math.cos(ConnectivityTracker.DEFAULT_UPLINK_BITRATE) * d2) + d2)));
            double d3 = 0.45f * f;
            double d4 = 0.6283185307179586d;
            path.lineTo((float) ((Math.sin(0.6283185307179586d) * d3) + d), f3 - ((float) ((Math.cos(0.6283185307179586d) * d3) + d2)));
            int i4 = 1;
            while (i4 < 5) {
                double d5 = i4 * 1.2566370614359172d;
                double d6 = d4;
                path.lineTo((float) ((Math.sin(d5) * d2) + d), f3 - ((float) ((Math.cos(d5) * d2) + d2)));
                double d7 = d5 + d6;
                path.lineTo((float) ((Math.sin(d7) * d3) + d), f3 - ((float) ((Math.cos(d7) * d3) + d2)));
                i4++;
                i3 = i3;
                d4 = d6;
            }
            i3++;
        }
        path.close();
        return path;
    }

    @Override // android.view.View
    public final void onDraw(@NonNull Canvas canvas) {
        if (this.d > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            Bitmap bitmap = this.e;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
            } else {
                if (this.b <= 0 || this.f) {
                    return;
                }
                this.f = true;
                post(new qd0(this, 15));
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.b;
        if (i3 <= 0) {
            i3 = View.MeasureSpec.getSize(i2);
            this.b = i3;
        }
        setMeasuredDimension((int) ((this.c * 4.0f) + (i3 * 5)), i3);
    }

    public void setRating(float f) {
        setContentDescription(Float.toString(f));
        if (f > 5.0f || f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            gu8.c(null, "StarsRatingView: Rating is out of bounds - " + f);
            this.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            this.d = f;
        }
        invalidate();
    }

    public void setStarSize(int i) {
        this.b = i;
    }

    public void setStarsPadding(float f) {
        this.c = f;
    }
}
