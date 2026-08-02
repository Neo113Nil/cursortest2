package xsna;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import androidx.annotation.NonNull;

/* compiled from: MemberClickableSpan.java */
/* loaded from: classes2.dex */
public abstract class u120 extends ClickableSpan {
    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(@NonNull TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
