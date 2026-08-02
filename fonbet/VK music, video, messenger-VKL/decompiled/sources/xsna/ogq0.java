package xsna;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.vk.dto.common.id.UserId;

/* compiled from: Spans.kt */
/* loaded from: classes3.dex */
public class ogq0 extends ClickableSpan implements i420 {
    public final UserId b;
    public boolean c;
    public int d;

    public ogq0(UserId userId, int i) {
        this.b = userId;
        this.d = i;
    }

    @Override // xsna.i420
    public final void d1(int i) {
        this.d = i;
    }

    public boolean n1() {
        return this.c;
    }

    public void o1(boolean z) {
        this.c = z;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i = this.d;
        if (i != 0) {
            textPaint.setColor(i);
        }
        textPaint.setUnderlineText(n1());
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
    }
}
