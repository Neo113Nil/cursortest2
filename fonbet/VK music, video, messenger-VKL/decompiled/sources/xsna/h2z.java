package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import java.util.Arrays;

/* compiled from: LetterAvatarDrawable.kt */
/* loaded from: classes7.dex */
public final class h2z extends Drawable {
    public final int a;
    public final Paint b;
    public final Paint c;
    public final Rect d;
    public final char[] e;

    public h2z(Context context, String str, int i) {
        Typeface a = cqi.a(Font.Companion, FontFamily.MEDIUM, 13.0f, context);
        TextSizeUnit textSizeUnit = TextSizeUnit.SP;
        this.a = i;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        this.b = paint;
        Paint paint2 = new Paint();
        int i2 = -1;
        paint2.setColor((((double) Color.blue(i)) * 0.114d) + ((((double) Color.green(i)) * 0.587d) + (((double) Color.red(i)) * 0.299d)) > 186.0d ? -16777216 : -1);
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        paint2.setSubpixelText(true);
        paint2.setLinearText(true);
        paint2.setTypeface(a);
        this.c = paint2;
        this.d = new Rect();
        char[] cArr = {0, 0};
        this.e = cArr;
        if (str.length() == 0) {
            return;
        }
        int length = str.length();
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            if (Character.isLetterOrDigit(str.charAt(i3))) {
                i2 = i3;
                break;
            }
            i3++;
        }
        if (i2 < 0) {
            return;
        }
        cArr[0] = Character.toUpperCase(str.charAt(i2));
        int L = drm0.L(str, ' ', i2 + 1, 4);
        if (L >= 0) {
            for (int i4 = L + 1; i4 < str.length(); i4++) {
                char charAt = str.charAt(i4);
                if (Character.isLetterOrDigit(charAt)) {
                    cArr[1] = Character.toUpperCase(charAt);
                    return;
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawCircle(getBounds().exactCenterX(), getBounds().exactCenterY(), getBounds().width() / 2.0f, this.b);
        Paint paint = this.c;
        paint.setTextSize(getBounds().width() * 0.33f);
        char[] cArr = this.e;
        int length = cArr.length;
        Rect rect = this.d;
        paint.getTextBounds(cArr, 0, length, rect);
        float exactCenterX = getBounds().exactCenterX() - rect.exactCenterX();
        float exactCenterY = getBounds().exactCenterY() - rect.exactCenterY();
        char[] cArr2 = this.e;
        canvas.drawText(cArr2, 0, cArr2.length, exactCenterX, exactCenterY, paint);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2z)) {
            return false;
        }
        h2z h2zVar = (h2z) obj;
        return epx.f(this.c.getTypeface(), h2zVar.c.getTypeface()) && Arrays.equals(this.e, h2zVar.e) && this.a == h2zVar.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.e) + (this.c.getTypeface().hashCode() * 31)) * 31) + this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
