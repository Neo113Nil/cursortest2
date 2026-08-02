package xsna;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.vkontakte.android.R;

/* compiled from: BaseFriendsProfileVh.kt */
/* loaded from: classes16.dex */
public final class kd6 extends ClickableSpan {
    public final /* synthetic */ ax5 b;
    public final /* synthetic */ Context c;

    public kd6(ax5 ax5Var, Context context) {
        this.b = ax5Var;
        this.c = context;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.b.invoke();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(e3m.f(R.attr.vk_ui_text_link_themed, this.c));
    }
}
