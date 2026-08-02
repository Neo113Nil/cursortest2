package xsna;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: QRViewUtils.kt */
/* loaded from: classes5.dex */
public final class vme0 extends ClickableSpan {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs<s3q0> c;

    public vme0(int i, gzs<s3q0> gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.c.invoke();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.b);
        textPaint.setUnderlineText(false);
    }
}
