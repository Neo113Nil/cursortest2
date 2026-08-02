package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import defpackage.d6z;
import defpackage.jp11;

/* loaded from: classes10.dex */
public abstract class EmojiSpan extends ReplacementSpan {
    private final jp11 mRasterizer;
    private final Paint.FontMetricsInt mTmpFontMetrics = new Paint.FontMetricsInt();
    private short mWidth = -1;
    private short mHeight = -1;
    private float mRatio = 1.0f;

    public EmojiSpan(jp11 jp11Var) {
        d6z.v(jp11Var, "rasterizer cannot be null");
        this.mRasterizer = jp11Var;
    }

    public final int getHeight() {
        return this.mHeight;
    }

    public final int getId() {
        return getTypefaceRasterizer().c();
    }

    public final float getRatio() {
        return this.mRatio;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.mTmpFontMetrics);
        Paint.FontMetricsInt fontMetricsInt2 = this.mTmpFontMetrics;
        this.mRatio = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / (this.mRasterizer.d().a(14) != 0 ? r4.b.getShort(r6 + r4.a) : (short) 0);
        this.mHeight = (short) ((this.mRasterizer.d().a(14) != 0 ? r3.b.getShort(r4 + r3.a) : (short) 0) * this.mRatio);
        short s = (short) ((this.mRasterizer.d().a(12) != 0 ? r3.b.getShort(r4 + r3.a) : (short) 0) * this.mRatio);
        this.mWidth = s;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.mTmpFontMetrics;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return s;
    }

    public final jp11 getTypefaceRasterizer() {
        return this.mRasterizer;
    }

    public final int getWidth() {
        return this.mWidth;
    }
}
