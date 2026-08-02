package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: PollStickerButton.kt */
/* loaded from: classes6.dex */
public final class iqb0 extends View {
    public final RectF b;
    public final float c;
    public final float d;
    public final float e;
    public final Paint f;
    public final Paint g;
    public final List<Float> h;

    public iqb0(Context context) {
        super(context);
        this.b = new RectF();
        this.c = iah0.a(10);
        this.d = iah0.a(8);
        this.e = iah0.a(4);
        Paint paint = new Paint(1);
        paint.setColor(dhr0.Y(R.attr.vk_ui_background_secondary_alpha, context));
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(dhr0.Y(R.attr.vk_ui_background_secondary_alpha, context));
        paint2.setStyle(style);
        this.g = paint2;
        this.h = e43.l(Float.valueOf(0.8f), Float.valueOf(0.4f), Float.valueOf(0.7f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Iterator<T> it = this.h.iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            float floatValue = ((Number) it.next()).floatValue();
            float width = getWidth();
            float f2 = this.c;
            RectF rectF = this.b;
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, width, f + f2);
            Paint paint = this.f;
            float f3 = this.d;
            canvas.drawRoundRect(rectF, f3, f3, paint);
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, getWidth() * floatValue, f + f2);
            canvas.drawRoundRect(rectF, f3, f3, this.g);
            f += f2 + this.e;
        }
    }
}
