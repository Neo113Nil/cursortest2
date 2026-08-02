package xsna;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import com.unity3d.services.UnityAdsConstants;
import kotlin.KotlinNothingValueException;

/* compiled from: PlaceholderSpan.android.kt */
/* loaded from: classes11.dex */
public final class qsa0 extends ReplacementSpan {
    public final float b;
    public final int c;
    public final float d;
    public final int e;
    public final float f;
    public final float g;
    public final int h;
    public Paint.FontMetricsInt i;
    public int j;
    public int k;
    public boolean l;

    public qsa0(float f, int i, float f2, int i2, azl azlVar, int i3) {
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float u0 = i == 0 ? azlVar.u0(l2l0.n(f, 4294967296L)) : 0.0f;
        f3 = i2 == 0 ? azlVar.u0(l2l0.n(f2, 4294967296L)) : f3;
        this.b = f;
        this.c = i;
        this.d = f2;
        this.e = i2;
        this.f = u0;
        this.g = f3;
        this.h = i3;
    }

    public final int a() {
        if (!this.l) {
            vzw.c("PlaceholderSpan is not laid out yet.");
        }
        return this.k;
    }

    public final int b() {
        if (!this.l) {
            vzw.c("PlaceholderSpan is not laid out yet.");
        }
        return this.j;
    }

    @Override // android.text.style.ReplacementSpan
    @SuppressLint({"DocumentExceptions"})
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float f;
        float f2;
        this.l = true;
        float textSize = paint.getTextSize();
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        this.i = fontMetricsInt2;
        int i3 = (fontMetricsInt2 != null ? fontMetricsInt2 : null).descent;
        if (fontMetricsInt2 == null) {
            fontMetricsInt2 = null;
        }
        if (i3 <= fontMetricsInt2.ascent) {
            vzw.a("Invalid fontMetrics: line height can not be negative.");
        }
        int i4 = this.c;
        if (i4 == 0) {
            f = this.f;
        } else {
            if (i4 != 1) {
                vzw.b("Unsupported unit.");
                throw new KotlinNothingValueException();
            }
            f = this.b * textSize;
        }
        this.j = (int) Math.ceil(f);
        int i5 = this.e;
        if (i5 == 0) {
            f2 = this.g;
        } else {
            if (i5 != 1) {
                vzw.b("Unsupported unit.");
                throw new KotlinNothingValueException();
            }
            f2 = this.d * textSize;
        }
        this.k = (int) Math.ceil(f2);
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.i;
            int i6 = (fontMetricsInt3 != null ? fontMetricsInt3 : null).ascent;
            fontMetricsInt.ascent = i6;
            int i7 = (fontMetricsInt3 != null ? fontMetricsInt3 : null).descent;
            fontMetricsInt.descent = i7;
            if (fontMetricsInt3 == null) {
                fontMetricsInt3 = null;
            }
            fontMetricsInt.leading = fontMetricsInt3.leading;
            switch (this.h) {
                case 0:
                    if (i6 > (-a())) {
                        fontMetricsInt.ascent = -a();
                        break;
                    }
                    break;
                case 1:
                case 4:
                    if (a() + i6 > fontMetricsInt.descent) {
                        fontMetricsInt.descent = a() + fontMetricsInt.ascent;
                        break;
                    }
                    break;
                case 2:
                case 5:
                    if (i6 > i7 - a()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - a();
                        break;
                    }
                    break;
                case 3:
                case 6:
                    if (i7 - i6 < a()) {
                        int a = fontMetricsInt.ascent - ((a() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = a;
                        fontMetricsInt.descent = a() + a;
                        break;
                    }
                    break;
                default:
                    vzw.a("Unknown verticalAlign.");
                    break;
            }
            Paint.FontMetricsInt fontMetricsInt4 = this.i;
            if (fontMetricsInt4 == null) {
                fontMetricsInt4 = null;
            }
            fontMetricsInt.top = Math.min(fontMetricsInt4.top, fontMetricsInt.ascent);
            Paint.FontMetricsInt fontMetricsInt5 = this.i;
            fontMetricsInt.bottom = Math.max((fontMetricsInt5 != null ? fontMetricsInt5 : null).bottom, fontMetricsInt.descent);
        }
        return b();
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
