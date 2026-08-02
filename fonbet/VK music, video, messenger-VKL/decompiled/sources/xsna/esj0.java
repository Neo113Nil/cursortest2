package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.vkontakte.android.R;

/* compiled from: SimpleProgressDrawable.kt */
/* loaded from: classes14.dex */
public final class esj0 extends Drawable {
    public final boolean a;
    public final Drawable b;
    public boolean c;
    public long d;

    public esj0(Context context) {
        this.a = qq2.d(context);
        this.b = m33.a(R.drawable.ic_progress_ring_12, context);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.b;
        if (drawable == null || drawable.getAlpha() == 0) {
            return;
        }
        canvas.save();
        if (this.c) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.d > 700) {
                this.d = elapsedRealtime;
            }
            canvas.rotate(((elapsedRealtime - this.d) / 700) * 360.0f, getBounds().width() / 2.0f, getBounds().height() / 2.0f);
        }
        drawable.setBounds(getBounds());
        drawable.draw(canvas);
        canvas.restore();
        if (!this.c || this.a) {
            return;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        this.c = false;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                return true;
            }
            int i2 = iArr[i];
            boolean z2 = this.c;
            if (i2 != 16842913) {
                z = false;
            }
            this.c = z | z2;
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
