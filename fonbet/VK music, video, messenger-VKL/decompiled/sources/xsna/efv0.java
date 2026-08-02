package xsna;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.vkontakte.android.R;

/* compiled from: VkRedesignSubscriptionSheetDialog.kt */
/* loaded from: classes6.dex */
public final class efv0 extends ClickableSpan {
    public final /* synthetic */ ffv0 b;

    public efv0(ffv0 ffv0Var) {
        this.b = ffv0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        ffv0 ffv0Var = this.b;
        p210 p210Var = ffv0Var.o1;
        if (p210Var == null) {
            p210Var = null;
        }
        p210Var.invoke();
        ffv0Var.p1 = true;
        ffv0Var.dismiss();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(e3m.f(R.attr.vk_ui_text_accent, this.b.requireContext()));
        textPaint.setUnderlineText(false);
    }
}
