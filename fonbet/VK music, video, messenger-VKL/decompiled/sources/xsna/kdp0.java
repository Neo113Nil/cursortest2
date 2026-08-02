package xsna;

import android.text.TextPaint;
import android.text.style.ClickableSpan;

/* compiled from: TouchableSpan.kt */
/* loaded from: classes15.dex */
public abstract class kdp0 extends ClickableSpan {
    public final int b;
    public final int c;
    public final int d;
    public boolean e;

    public kdp0(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(this.e ? this.c : this.b);
        textPaint.bgColor = this.e ? this.d : 0;
    }
}
