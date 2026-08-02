package xsna;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import com.vkontakte.android.R;

/* compiled from: SimpleHashtagSpan.kt */
/* loaded from: classes6.dex */
public final class tqj0 extends CharacterStyle implements p0m0 {
    public final int b = e43.a.getColor(R.color.vk_blue_200_muted);

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.b);
        textPaint.setUnderlineText(true);
    }
}
