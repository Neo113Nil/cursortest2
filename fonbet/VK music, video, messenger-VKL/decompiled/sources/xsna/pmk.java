package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.c;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: BulletSpan.android.kt */
/* loaded from: classes11.dex */
public final class pmk implements LeadingMarginSpan {
    public final r5j0 b;
    public final float c;
    public final float d;
    public final float e;
    public final qio f;
    public final azl g;
    public final int h;
    public final int i;

    public pmk(r5j0 r5j0Var, float f, float f2, float f3, float f4, qio qioVar, azl azlVar, float f5) {
        this.b = r5j0Var;
        this.c = f;
        this.d = f2;
        this.e = f4;
        this.f = qioVar;
        this.g = azlVar;
        int b = an10.b(f + f3);
        this.h = b;
        this.i = an10.b(f5) - b;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(final Canvas canvas, final Paint paint, int i, final int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if (canvas == null) {
            return;
        }
        final float f = (i3 + i5) / 2.0f;
        int i8 = i - this.h;
        if (i8 < 0) {
            i8 = 0;
        }
        final int i9 = i8;
        if (((Spanned) charSequence).getSpanStart(this) != i6 || paint == null) {
            return;
        }
        Paint.Style style = paint.getStyle();
        qbr qbrVar = qbr.a;
        qio qioVar = this.f;
        Integer num = null;
        if (epx.f(qioVar, qbrVar)) {
            paint.setStyle(Paint.Style.FILL);
        } else {
            if (!(qioVar instanceof frm0)) {
                throw new NoWhenBranchMatchedException();
            }
            paint.setStyle(Paint.Style.STROKE);
            frm0 frm0Var = (frm0) qioVar;
            paint.setStrokeWidth(frm0Var.a);
            paint.setStrokeMiter(frm0Var.b);
            int i10 = frm0Var.c;
            paint.setStrokeCap(i10 == 0 ? Paint.Cap.BUTT : i10 == 1 ? Paint.Cap.ROUND : i10 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            int i11 = frm0Var.d;
            paint.setStrokeJoin(i11 == 0 ? Paint.Join.MITER : i11 == 1 ? Paint.Join.ROUND : i11 == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            db2 db2Var = frm0Var.e;
            paint.setPathEffect(db2Var != null ? db2Var.a : null);
        }
        final long floatToRawIntBits = (Float.floatToRawIntBits(this.c) << 32) | (Float.floatToRawIntBits(this.d) & 4294967295L);
        gzs gzsVar = new gzs() { // from class: xsna.omk
            @Override // xsna.gzs
            public final Object invoke() {
                pmk pmkVar = pmk.this;
                r5j0 r5j0Var = pmkVar.b;
                int i12 = i2;
                androidx.compose.ui.graphics.c a = r5j0Var.a(floatToRawIntBits, i12 > 0 ? LayoutDirection.Ltr : LayoutDirection.Rtl, pmkVar.g);
                float f2 = i9;
                boolean z2 = a instanceof c.a;
                Canvas canvas2 = canvas;
                Paint paint2 = paint;
                float f3 = f;
                if (z2) {
                    canvas2.save();
                    c.a aVar = (c.a) a;
                    zhf0 bounds = aVar.a.getBounds();
                    canvas2.translate(f2, f3 - ((bounds.d - bounds.b) / 2.0f));
                    Path path = aVar.a;
                    if (!(path instanceof androidx.compose.ui.graphics.a)) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    canvas2.drawPath(((androidx.compose.ui.graphics.a) path).a, paint2);
                    canvas2.restore();
                } else if (a instanceof c.C0013c) {
                    aog0 aog0Var = ((c.C0013c) a).a;
                    if (ne7.z(aog0Var)) {
                        float intBitsToFloat = Float.intBitsToFloat((int) (aog0Var.e >> 32));
                        canvas2.drawRoundRect(f2, f3 - (aog0Var.a() / 2.0f), (aog0Var.b() * i12) + f2, (aog0Var.a() / 2.0f) + f3, intBitsToFloat, intBitsToFloat, paint2);
                    } else {
                        androidx.compose.ui.graphics.a a2 = androidx.compose.ui.graphics.b.a();
                        a2.q(aog0Var, Path.Direction.CounterClockwise);
                        canvas2.save();
                        canvas2.translate(f2, f3 - (aog0Var.a() / 2.0f));
                        canvas2.drawPath(a2.a, paint2);
                        canvas2.restore();
                    }
                } else {
                    if (!(a instanceof c.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zhf0 zhf0Var = ((c.b) a).a;
                    float f4 = (zhf0Var.d - zhf0Var.b) / 2.0f;
                    canvas2.drawRect(f2, f3 - f4, u11.b(zhf0Var.c, zhf0Var.a, i12, f2), f4 + f3, paint2);
                }
                return s3q0.a;
            }
        };
        if (!Float.isNaN(this.e)) {
            num = Integer.valueOf(paint.getAlpha());
            paint.setAlpha((int) Math.rint(r13 * 255.0f));
        }
        gzsVar.invoke();
        if (num != null) {
            paint.setAlpha(num.intValue());
        }
        paint.setStyle(style);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        int i = this.i;
        if (i >= 0) {
            return 0;
        }
        return Math.abs(i);
    }
}
