package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.appcompat.widget.AppCompatImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* compiled from: RoundImageView.kt */
/* loaded from: classes6.dex */
public final class yng0 extends AppCompatImageView implements too0 {
    public final RectF b;
    public final Path c;
    public final Paint d;
    public final float e;

    public yng0(Context context) {
        super(context, null, 0);
        this.b = new RectF();
        this.c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setColor(krv0.m(R.attr.vk_ui_image_border_alpha, context));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(iah0.b(0.5f));
        this.e = iah0.b(10.0f);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, xsna.too0
    public final void Ng() {
        this.d.setColor(krv0.m(R.attr.vk_ui_image_border_alpha, getContext()));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.clipPath(this.c);
        super.onDraw(canvas);
        float f = this.e;
        canvas.drawRoundRect(this.b, f, f, this.d);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.b;
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredWidth, measuredHeight);
        Path path = this.c;
        path.reset();
        float f = this.e;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
    }
}
