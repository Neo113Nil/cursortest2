package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: SpannableUtils.kt */
/* loaded from: classes17.dex */
public final class tzx0 extends ReplacementSpan {
    public final Drawable b;
    public final int c;
    public final float d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public Integer i;
    public int j;
    public boolean k;

    public tzx0(Drawable drawable, int i, float f, boolean z, int i2, int i3, int i4) {
        this.b = drawable;
        this.c = i;
        this.d = f;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6 = this.h;
        if (i6 != 0 && this.j != dhr0.C().c) {
            this.j = dhr0.C().c;
            this.i = Integer.valueOf(dhr0.t.c(i6));
        }
        if (this.e) {
            int color = paint.getColor();
            Integer num = this.i;
            if (num == null || color != num.intValue()) {
                int color2 = paint.getColor();
                this.i = Integer.valueOf(color2);
                float f2 = this.d;
                if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.i = Integer.valueOf((color2 & 16777215) | (((int) (f2 * 255)) << 24));
                }
            }
        }
        Integer num2 = this.i;
        Drawable drawable = this.b;
        if (num2 != null) {
            sjo.b(drawable, num2.intValue(), PorterDuff.Mode.SRC_IN);
        }
        int i7 = this.c;
        if (i7 == 3 && !this.k) {
            int i8 = i5 - i3;
            int height = (i8 - drawable.getBounds().height()) >> 1;
            drawable.getBounds().top = height;
            drawable.getBounds().bottom = i8 - height;
            this.k = true;
        }
        int save = canvas.save();
        canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f);
        float f3 = this.g;
        if (f + f3 + drawable.getBounds().right < canvas.getClipBounds().right) {
            canvas.translate(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        float f4 = i5 - drawable.getBounds().bottom;
        if (i7 == 1) {
            f4 -= paint.getFontMetricsInt().descent;
        }
        canvas.translate(f, f4);
        drawable.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int width = this.b.getBounds().width();
        int i3 = this.g;
        if (i3 < 0) {
            i3 = 0;
        }
        return width + i3;
    }
}
