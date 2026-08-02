package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: BetterImageSpan.java */
/* loaded from: classes18.dex */
public class cy6 extends ReplacementSpan {
    public int b;
    public int c;
    public Rect d;
    public final Paint.FontMetricsInt e = new Paint.FontMetricsInt();
    public final int f = 2;
    public Drawable g;

    public cy6(cdp cdpVar) {
        this.g = cdpVar;
        b();
    }

    public final Drawable a() {
        return this.g;
    }

    public final void b() {
        Rect bounds = this.g.getBounds();
        this.d = bounds;
        this.b = bounds.width();
        this.c = this.d.height();
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        Paint.FontMetricsInt fontMetricsInt = this.e;
        paint.getFontMetricsInt(fontMetricsInt);
        int i7 = this.c;
        int i8 = this.f;
        if (i8 == 0) {
            i6 = fontMetricsInt.descent - i7;
        } else if (i8 != 2) {
            i6 = -i7;
        } else {
            int i9 = fontMetricsInt.descent;
            int i10 = fontMetricsInt.ascent;
            i6 = defpackage.j0.a(i9, i10, i7, 2, i10);
        }
        canvas.translate(f, i4 + i6);
        this.g.draw(canvas);
        canvas.translate(-f, -r7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy6)) {
            return false;
        }
        cy6 cy6Var = (cy6) obj;
        return this.f == cy6Var.f && Objects.equals(this.d, cy6Var.d) && Objects.equals(this.g, cy6Var.g);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(@NonNull Paint paint, CharSequence charSequence, int i, int i2, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        b();
        if (fontMetricsInt == null) {
            return this.b;
        }
        int i3 = this.c;
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        int i4 = fontMetricsInt2.ascent;
        fontMetricsInt.ascent = i4;
        int i5 = fontMetricsInt2.descent;
        fontMetricsInt.descent = i5;
        fontMetricsInt.leading = fontMetricsInt2.leading;
        int i6 = this.f;
        if (i6 == 0) {
            int i7 = i5 - i3;
            if (i4 > i7) {
                fontMetricsInt.ascent = i7;
            }
        } else if (i6 != 2) {
            int i8 = -i3;
            if (i4 > i8) {
                fontMetricsInt.ascent = i8;
            }
        } else {
            int i9 = i5 - i4;
            if (i9 < i3) {
                int i10 = i4 - ((i3 - i9) / 2);
                fontMetricsInt.ascent = i10;
                fontMetricsInt.descent = i10 + i3;
            }
        }
        fontMetricsInt.top = Math.min(fontMetricsInt2.top, fontMetricsInt.ascent);
        fontMetricsInt.bottom = Math.max(fontMetricsInt2.bottom, fontMetricsInt.descent);
        return this.b;
    }

    public final int hashCode() {
        return Objects.hash(this.d, Integer.valueOf(this.f), this.g);
    }
}
