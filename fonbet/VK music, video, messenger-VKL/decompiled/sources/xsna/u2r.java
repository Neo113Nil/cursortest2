package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* compiled from: FeedProductPinCircleView.kt */
/* loaded from: classes18.dex */
public final class u2r extends View {
    public final Paint b;
    public final Paint c;
    public final Paint d;

    public u2r(l7s l7sVar) {
        super(l7sVar, null);
        Paint paint = new Paint(1);
        paint.setColor(l8g.f(0.7f, krv0.m(R.attr.vk_ui_icon_primary, l7sVar)));
        paint.setShadowLayer(v2r.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, l7sVar.getColor(R.color.vk_black_alpha16));
        this.b = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(krv0.m(R.attr.vk_ui_icon_contrast, l7sVar));
        this.c = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(0.5f);
        paint3.setColor(krv0.m(R.attr.vk_ui_field_border_alpha, l7sVar));
        this.d = paint3;
        setLayerType(2, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        int i = v2r.a;
        float f = v2r.c / 2;
        float f2 = v2r.a / 2;
        Paint paint = this.d;
        Paint paint2 = this.b;
        if (paint2 != null) {
            canvas.drawCircle(width, height, f, paint2);
            canvas.drawCircle(width, height, f, paint);
        }
        canvas.drawCircle(width, height, f2, this.c);
        canvas.drawCircle(width, height, f2, paint);
    }
}
