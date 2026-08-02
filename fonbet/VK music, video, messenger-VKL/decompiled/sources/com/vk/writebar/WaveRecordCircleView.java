package com.vk.writebar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.iah0;
import xsna.xq4;

/* loaded from: classes7.dex */
public class WaveRecordCircleView extends AppCompatImageView {
    public final Paint b;
    public final Paint c;
    public final float d;
    public final float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public long j;

    public WaveRecordCircleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        this.f = 1.0f;
        paint2.setColor(context.getResources().getColor(R.color.vk_blue_400));
        paint.setColor(context.getResources().getColor(R.color.vk_blue_400));
        paint.setAlpha(70);
        this.e = context.getResources().getDimension(R.dimen.voice_rec_button_size) / 2.0f;
        this.d = context.getResources().getDimension(R.dimen.voice_rec_min_wave_radius);
    }

    public float getScale() {
        return this.f;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        long currentTimeMillis = System.currentTimeMillis() - this.j;
        float f = this.h;
        float f2 = this.g;
        if (f != f2) {
            float f3 = this.i;
            float f4 = (currentTimeMillis * f3) + f2;
            this.g = f4;
            if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (f4 > f) {
                    this.g = f;
                }
            } else if (f4 < f) {
                this.g = f;
            }
            invalidate();
        }
        this.j = System.currentTimeMillis();
        if (this.g != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, ((iah0.a(40.0f) * this.g) + this.d) * this.f, this.b);
        }
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, this.e, this.c);
        super.onDraw(canvas);
    }

    public void setAmplitude(Double d) {
        if (d == null) {
            this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            double abs = Math.abs(xq4.B);
            this.h = ((float) Math.min(abs, Math.max(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, abs - Math.abs(d.doubleValue())))) / ((float) abs);
        }
        this.i = (this.h - this.g) / 150.0f;
        this.j = System.currentTimeMillis();
        invalidate();
    }

    public void setPaintColor(int i) {
        this.c.setColor(i);
        Paint paint = this.b;
        paint.setColor(i);
        paint.setAlpha(70);
        invalidate();
    }

    public void setScale(float f) {
        this.f = f;
        invalidate();
    }
}
