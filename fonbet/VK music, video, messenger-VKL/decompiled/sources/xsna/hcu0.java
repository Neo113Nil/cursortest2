package xsna;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.vk.auth.ui.VkAuthIncorrectLoginView;

/* compiled from: VkAuthIncorrectLoginView.kt */
/* loaded from: classes15.dex */
public final class hcu0 extends ClickableSpan {
    public final /* synthetic */ int b;
    public final /* synthetic */ VkAuthIncorrectLoginView c;

    public hcu0(int i, VkAuthIncorrectLoginView vkAuthIncorrectLoginView) {
        this.b = i;
        this.c = vkAuthIncorrectLoginView;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        gzs<s3q0> gzsVar = this.c.b;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setColor(this.b);
    }
}
