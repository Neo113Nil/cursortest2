package xsna;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: TextViewExt.kt */
/* loaded from: classes17.dex */
public final class ino0 extends ClickableSpan {
    public final /* synthetic */ gzs<s3q0> b;
    public final /* synthetic */ int c;

    public ino0(int i, gzs gzsVar) {
        this.b = gzsVar;
        this.c = i;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        gzs<s3q0> gzsVar = this.b;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(this.c);
    }
}
