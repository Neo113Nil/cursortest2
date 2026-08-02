package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import android.text.style.ReplacementSpan;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import kotlin.LazyThreadSafetyMode;

/* compiled from: BaseChipSpan.kt */
/* loaded from: classes4.dex */
public abstract class db6 extends ReplacementSpan implements Cloneable, LineHeightSpan, rku0, l2v0, uou0 {
    public final boolean b;
    public final Object c;
    public final Object d;
    public CharSequence e;
    public boolean f;
    public boolean g;
    public boolean h;
    public final boolean i;

    public db6(boolean z) {
        this.b = z;
        zq3 zq3Var = new zq3(3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, zq3Var);
        this.d = msy.a(lazyThreadSafetyMode, new f84(2));
        this.h = true;
        this.i = true;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent - fontMetricsInt.ascent;
        if (i5 <= 0) {
            return;
        }
        int j = j();
        int b = an10.b(fontMetricsInt.descent * (j / i5));
        fontMetricsInt.descent = b;
        fontMetricsInt.ascent = b - j;
        int a = iah0.a(4);
        int i6 = this.g ? a * 2 : a;
        fontMetricsInt.top -= i6;
        fontMetricsInt.ascent -= i6;
        if (!this.h) {
            a = 0;
        }
        fontMetricsInt.bottom += a;
        fontMetricsInt.descent += a;
    }

    public Object clone() {
        return super.clone();
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        CharSequence charSequence2;
        CharSequence charSequence3;
        int i6;
        niq niqVar;
        float f2;
        float f3;
        Paint paint2;
        Paint paint3;
        Canvas canvas2;
        Canvas canvas3 = canvas;
        if (!(paint instanceof TextPaint) || (charSequence2 = this.e) == null) {
            return;
        }
        TextPaint textPaint = (TextPaint) paint;
        s(textPaint);
        if (!t() || !this.f) {
            canvas3.drawText(charSequence2, 0, charSequence2.length(), f, i4, paint);
            return;
        }
        CharSequence o = o(charSequence2);
        CharSequence q = q();
        int intValue = ((Number) this.c.getValue()).intValue();
        boolean booleanValue = ((Boolean) this.d.getValue()).booleanValue();
        float f4 = intValue;
        float f5 = f + f4;
        if (q == null || ((String) q).length() <= 0) {
            q = null;
        }
        float f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float measureText = q != null ? textPaint.measureText(q, 0, ((String) q).length()) : 0.0f;
        float a = f4 - mac.a(f4, i3, i5);
        if (a < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            a = 0.0f;
        }
        if (measureText > a) {
            measureText = a;
        }
        if (q != null) {
            f6 = measureText;
        }
        if (booleanValue) {
            float f7 = f5 - f6;
            charSequence3 = q;
            i6 = 0;
            niqVar = new niq(f, f7, f7 - mac.a(f7 - f, i3, i5), f7, Paint.Align.LEFT);
            f3 = f;
            f2 = f5;
        } else {
            charSequence3 = q;
            i6 = 0;
            float f8 = f + f6;
            float a2 = f8 + mac.a(f5 - f8, i3, i5);
            Paint.Align align = Paint.Align.RIGHT;
            Paint.Align align2 = Paint.Align.LEFT;
            f2 = f5;
            niqVar = new niq(f2, f, f8, a2, align);
            f3 = f;
        }
        int save = canvas3.save();
        Shader shader = textPaint.getShader();
        Paint.Align textAlign = textPaint.getTextAlign();
        try {
            canvas3.clipRect(f3, i3, f2, i5);
            float f9 = niqVar.c;
            float f10 = niqVar.d;
            int color = textPaint.getColor();
            int argb = Color.argb(i6, Color.red(color), Color.green(color), Color.blue(color));
            textPaint.setShader(new LinearGradient(f9, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, booleanValue ? color : argb, booleanValue ? argb : color, Shader.TileMode.CLAMP));
            textPaint.setTextAlign(niqVar.e);
            float f11 = i4;
            Canvas canvas4 = canvas3;
            Paint paint4 = textPaint;
            try {
                canvas4.drawText(o, 0, o.length(), niqVar.a, f11, paint4);
                try {
                    paint4.setShader(null);
                    if (charSequence3 != null) {
                        paint4.setTextAlign(Paint.Align.LEFT);
                        canvas4 = canvas;
                        paint4 = paint4;
                        canvas4.drawText(charSequence3, 0, ((String) charSequence3).length(), niqVar.b, f11, paint4);
                        canvas2 = canvas4;
                        paint3 = paint4;
                    } else {
                        paint3 = paint4;
                        canvas2 = canvas;
                    }
                    paint3.setShader(shader);
                    paint3.setTextAlign(textAlign);
                    canvas2.restoreToCount(save);
                } catch (Throwable th) {
                    th = th;
                    paint2 = paint4;
                    canvas3 = canvas;
                    paint2.setShader(shader);
                    paint2.setTextAlign(textAlign);
                    canvas3.restoreToCount(save);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                canvas3 = canvas4;
                paint2 = paint4;
            }
        } catch (Throwable th3) {
            th = th3;
            paint2 = textPaint;
        }
    }

    @Override // xsna.rku0
    public final boolean e() {
        return this.i;
    }

    @Override // xsna.l2v0
    public final int getColor() {
        return m().a();
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if ((paint instanceof TextPaint) && charSequence != null) {
            try {
                String obj = charSequence.toString();
                if (obj != null) {
                    CharSequence subSequence = obj.subSequence(i, i2);
                    if (subSequence != null) {
                        if (fontMetricsInt != null) {
                            Paint.FontMetrics fontMetrics = ((TextPaint) paint).getFontMetrics();
                            fontMetricsInt.top = (int) fontMetrics.top;
                            fontMetricsInt.bottom = (int) fontMetrics.bottom;
                            fontMetricsInt.ascent = (int) fontMetrics.ascent;
                            fontMetricsInt.descent = (int) fontMetrics.descent;
                        }
                        s((TextPaint) paint);
                        int measureText = (int) paint.measureText(subSequence, 0, subSequence.length());
                        ?? r11 = this.c;
                        if (measureText > ((Number) r11.getValue()).intValue()) {
                            this.f = true;
                            CharSequence p = p(subSequence);
                            subSequence = n(paint.breakText(p, 0, p.length(), ((Boolean) this.d.getValue()).booleanValue(), ((Number) r11.getValue()).intValue(), null), subSequence);
                            measureText = ((Number) r11.getValue()).intValue();
                        } else {
                            this.f = false;
                        }
                        this.e = subSequence;
                        return measureText;
                    }
                }
            } catch (IndexOutOfBoundsException unused) {
            }
        }
        return 0;
    }

    @Override // xsna.l2v0
    public final /* bridge */ /* synthetic */ String i() {
        return null;
    }

    public abstract int j();

    public abstract float k();

    public abstract Typeface l();

    public abstract apo m();

    public abstract CharSequence n(int i, CharSequence charSequence);

    public abstract CharSequence p(CharSequence charSequence);

    public CharSequence q() {
        return null;
    }

    public abstract boolean r();

    public final void s(TextPaint textPaint) {
        if (this.b) {
            textPaint.setColor(m().a());
            return;
        }
        textPaint.setTextSize(k());
        textPaint.setTypeface(l());
        textPaint.setColor(m().a());
    }

    public boolean t() {
        return false;
    }

    public CharSequence o(CharSequence charSequence) {
        return charSequence;
    }

    @Override // xsna.rku0
    public final void a(Context context, View view) {
    }
}
