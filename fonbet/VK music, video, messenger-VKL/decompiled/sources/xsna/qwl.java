package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import com.unity3d.services.UnityAdsConstants;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;

/* compiled from: DeliveryPointsClusterIconProvider.kt */
/* loaded from: classes18.dex */
public final class qwl extends q76 {
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final Paint i;

    public qwl() {
        super(1);
        abg0 abg0Var = dhr0.t;
        int c = abg0Var.c(R.attr.vk_ui_background_contrast);
        this.c = c;
        this.d = abg0Var.c(R.attr.vk_ui_icon_accent);
        this.e = abg0Var.c(R.attr.vk_ui_text_contrast);
        this.f = Color.argb(an10.b(15.299999f), 0, 0, 0);
        this.g = cn70.b(32);
        this.h = cn70.b(2);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(c);
        this.i = paint;
    }

    @Override // xsna.q76
    public final Object j(Object obj) {
        return Integer.valueOf(((jwf) obj).getSize());
    }

    @Override // xsna.q76
    public final sb7 l(Object obj, Object obj2) {
        ((Number) obj).intValue();
        String valueOf = String.valueOf(((jwf) obj2).getSize());
        int i = this.g;
        int i2 = (((int) 4.0f) * 2) + i;
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawARGB(0, 0, 0, 0);
        float width = canvas.getWidth() / 2.0f;
        float height = canvas.getHeight() / 2.0f;
        float f = i * 0.5f;
        int i3 = this.c;
        Paint paint = this.i;
        paint.setColor(i3);
        paint.setShadowLayer(4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, this.f);
        canvas.drawCircle(width, height, f, paint);
        paint.clearShadowLayer();
        paint.setColor(this.d);
        canvas.drawCircle(width, height, f - this.h, paint);
        paint.setColor(this.e);
        paint.setTextAlign(Paint.Align.CENTER);
        dhr0.a.getClass();
        com.vk.typography.b.j(paint, dhr0.E(), FontFamily.MEDIUM, Float.valueOf(13.0f), 8);
        canvas.drawText(valueOf, 0, valueOf.length(), width, ((paint.getTextSize() / 2.0f) + (canvas.getHeight() / 2.0f)) - iah0.a(1.5f), paint);
        vj00 vj00Var = ofx.a;
        if (vj00Var == null) {
            vj00Var = null;
        }
        vj00Var.getClass();
        return xx1.h(createBitmap);
    }
}
