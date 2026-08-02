package xsna;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: Spans.kt */
/* loaded from: classes3.dex */
public final class b9z extends ClickableSpan implements i420 {
    public final String b;
    public final izs<String, s3q0> c;
    public boolean d = true;
    public int e;

    public b9z(int i, String str, izs izsVar) {
        this.b = str;
        this.c = izsVar;
        this.e = i;
    }

    @Override // xsna.i420
    public final void d1(int i) {
        this.e = i;
    }

    @Override // xsna.i420
    public final boolean n1() {
        return this.d;
    }

    @Override // xsna.i420
    public final void o1(boolean z) {
        this.d = z;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        izs<String, s3q0> izsVar = this.c;
        if (izsVar != null) {
            izsVar.invoke(this.b);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i = this.e;
        if (i != 0) {
            textPaint.setColor(i);
        }
        textPaint.setUnderlineText(this.d);
    }
}
