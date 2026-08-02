package xsna;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: TextDecorationSpan.android.kt */
/* loaded from: classes11.dex */
public final class qdo0 extends CharacterStyle {
    public final boolean a;
    public final boolean b;

    public qdo0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.a);
        textPaint.setStrikeThruText(this.b);
    }
}
