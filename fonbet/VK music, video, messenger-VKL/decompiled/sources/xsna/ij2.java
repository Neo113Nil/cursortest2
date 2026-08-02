package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* compiled from: AnimatedDropDownView.kt */
/* loaded from: classes3.dex */
public final class ij2 extends View implements too0 {
    public static final float g = iah0.b(5.0f);
    public static final float h = iah0.b(3.0f);
    public static final float i = iah0.b(0.6666667f);
    public boolean b;
    public final Paint c;
    public final Path d;
    public long e;
    public float f;

    public ij2(Context context) {
        super(context, null, 0);
        this.b = true;
        Paint paint = new Paint();
        paint.setColor(e3m.f(R.attr.vk_ui_icon_tertiary_alpha, context));
        paint.setStrokeWidth(h);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.c = paint;
        this.d = new Path();
    }

    private final float getGetBottomPeek() {
        return (getHeight() / 2) - (g / 2);
    }

    private final float getGetPeek() {
        return getGetBottomPeek() + this.f;
    }

    @Override // xsna.too0
    public final void Ng() {
        this.c.setColor(e3m.f(R.attr.vk_ui_icon_tertiary_alpha, getContext()));
    }

    public final boolean getCollapse() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Path path = this.d;
        path.reset();
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.e;
        float f = g;
        if (j > 15) {
            this.e = currentTimeMillis;
            boolean z = this.b;
            float f2 = i;
            this.f = z ? Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f - f2) : Math.min(f, this.f + f2);
        }
        path.moveTo(0 + f, getGetBottomPeek());
        path.lineTo(getWidth() / 2, getGetPeek());
        path.lineTo(getWidth() - f, getGetBottomPeek());
        canvas.drawPath(path, this.c);
        boolean z2 = this.b;
        if ((!z2 || this.f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && (z2 || this.f >= f)) {
            return;
        }
        invalidate();
    }

    public final void setCollapse(boolean z) {
        if (z == this.b) {
            return;
        }
        this.b = z;
        invalidate();
    }
}
