package xsna;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: EmojiSpan.java */
/* loaded from: classes12.dex */
public abstract class xdp extends ReplacementSpan {

    @NonNull
    public final jup0 c;
    public final Paint.FontMetricsInt b = new Paint.FontMetricsInt();
    public short d = -1;
    public float e = 1.0f;

    public xdp(@NonNull jup0 jup0Var) {
        obr.e(jup0Var, "rasterizer cannot be null");
        this.c = jup0Var;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(@NonNull Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.b;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        jup0 jup0Var = this.c;
        this.e = abs / (jup0Var.b().a(14) != 0 ? r8.b.getShort(r1 + r8.a) : (short) 0);
        ri20 b = jup0Var.b();
        int a = b.a(14);
        if (a != 0) {
            b.b.getShort(a + b.a);
        }
        short s = (short) ((jup0Var.b().a(12) != 0 ? r5.b.getShort(r7 + r5.a) : (short) 0) * this.e);
        this.d = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
