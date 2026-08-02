package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: CameraPreviewView.kt */
/* loaded from: classes16.dex */
public final class lk9 extends View {
    public final Paint b;
    public final Rect c;
    public Bitmap d;
    public float e;

    public lk9(Context context) {
        super(context, null, 0);
        this.b = new Paint(2);
        this.c = new Rect();
    }

    public final float getProgress() {
        return this.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int save = canvas.save();
        canvas.clipRect(this.c);
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.b);
        }
        canvas.restoreToCount(save);
    }

    public final void setBitmap(Bitmap bitmap) {
        this.d = bitmap;
        invalidate();
    }

    public final void setProgress(float f) {
        if (this.e == f) {
            return;
        }
        this.e = f;
        bwt0.p0(this, f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.c.set(0, 0, (int) (getMeasuredWidth() * this.e), getMeasuredHeight());
        invalidate();
    }
}
