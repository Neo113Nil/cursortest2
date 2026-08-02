package xsna;

import android.text.TextPaint;
import android.view.View;

/* compiled from: DefaultLinkSpan.kt */
/* loaded from: classes2.dex */
public class ohl extends w2d0 {
    public final Integer c;
    public Integer d;

    public ohl() {
        this(3, null);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        Integer num = this.d;
        int intValue = (num == null && (num = this.c) == null) ? textPaint.linkColor : num.intValue();
        if (!this.b) {
            textPaint.setUnderlineText(intValue == -1);
            textPaint.setColor(intValue);
        } else {
            textPaint.setUnderlineText(intValue == -1);
            textPaint.setColor(l8g.c(0.9f, intValue));
            textPaint.bgColor = 570425344;
        }
    }

    public ohl(int i, Integer num) {
        this.c = (i & 1) != 0 ? null : num;
        this.d = null;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
    }
}
