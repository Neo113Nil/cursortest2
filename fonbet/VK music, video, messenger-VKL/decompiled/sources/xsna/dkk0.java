package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import io.jsonwebtoken.JwtParser;

/* compiled from: SpeedLabelDrawer.kt */
/* loaded from: classes18.dex */
public final class dkk0 {
    public static final float g = dn70.a() * 5.0f;
    public static final float h = dn70.a() * 5.0f;
    public static final float i = dn70.a() * 0.5f;
    public static final float j = dn70.a() * 16.0f;
    public static final float k = dn70.a() * 5.0f;
    public final Context a;
    public final RectF b;
    public final Paint c;
    public final Paint d;
    public final int e;
    public final float f;

    public dkk0(mwo0 mwo0Var) {
        Context context = mwo0Var.a;
        this.a = context;
        this.b = new RectF();
        Paint paint = new Paint(1);
        paint.setColor(context.getColor(R.color.vk_white));
        com.vk.typography.b.j(paint, context, FontFamily.MEDIUM, Float.valueOf(12.0f), 8);
        paint.setTextAlign(Paint.Align.CENTER);
        this.c = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        this.d = paint2;
        int color = context.getColor(R.color.vk_black_alpha35);
        this.e = Color.alpha(color);
        paint2.setColor(color);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        this.f = (-(fontMetrics.descent + fontMetrics.ascent)) / 2.0f;
    }

    public final void a(Canvas canvas, float f, RectF rectF, float f2, float f3) {
        if (f == 1.0f) {
            return;
        }
        String replace = wlb0.t(this.a, R.string.clips_editor_timeline_speed_multiply, Float.valueOf(f)).replace(JwtParser.SEPARATOR_CHAR, ',');
        float f4 = f2 + g;
        RectF rectF2 = this.b;
        rectF2.left = f4;
        float f5 = 2;
        float f6 = j / f5;
        float f7 = i;
        rectF2.bottom = f6 + f3 + f7;
        rectF2.top = (f3 - f6) - f7;
        Paint paint = this.c;
        float measureText = (h * f5) + paint.measureText(replace) + f4;
        rectF2.right = measureText;
        float f8 = swe0.f((rectF.right - measureText) / (rectF2.width() / 2.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        Paint paint2 = this.d;
        paint2.setAlpha((int) (this.e * f8));
        paint.setAlpha((int) (f8 * 255));
        int save = canvas.save();
        try {
            canvas.clipRect(rectF2);
            float f9 = k;
            canvas.drawRoundRect(rectF2, f9, f9, paint2);
            canvas.drawText(replace, rectF2.centerX(), rectF2.centerY() + this.f, paint);
        } finally {
            canvas.restoreToCount(save);
        }
    }
}
