package xsna;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DrawStyleSpan.android.kt */
/* loaded from: classes11.dex */
public final class rio extends CharacterStyle implements UpdateAppearance {
    public final qio b;

    public rio(qio qioVar) {
        this.b = qioVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            qbr qbrVar = qbr.a;
            qio qioVar = this.b;
            if (epx.f(qioVar, qbrVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(qioVar instanceof frm0)) {
                throw new NoWhenBranchMatchedException();
            }
            textPaint.setStyle(Paint.Style.STROKE);
            frm0 frm0Var = (frm0) qioVar;
            textPaint.setStrokeWidth(frm0Var.a);
            textPaint.setStrokeMiter(frm0Var.b);
            int i = frm0Var.d;
            textPaint.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 1 ? Paint.Join.ROUND : i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i2 = frm0Var.c;
            textPaint.setStrokeCap(i2 == 0 ? Paint.Cap.BUTT : i2 == 1 ? Paint.Cap.ROUND : i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            db2 db2Var = frm0Var.e;
            textPaint.setPathEffect(db2Var != null ? db2Var.a : null);
        }
    }
}
