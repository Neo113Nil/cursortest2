package xsna;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.vkontakte.android.R;

/* compiled from: ContentInfoBottomSheetView.kt */
/* loaded from: classes17.dex */
public final class rgj extends ClickableSpan {
    public final /* synthetic */ sgj b;
    public final /* synthetic */ Context c;

    public rgj(sgj sgjVar, Context context) {
        this.b = sgjVar;
        this.c = context;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        gzs<s3q0> onCloseButtonClick = this.b.getOnCloseButtonClick();
        if (onCloseButtonClick != null) {
            onCloseButtonClick.invoke();
        }
        izs<String, s3q0> onLegalLinkClick = this.b.getOnLegalLinkClick();
        if (onLegalLinkClick != null) {
            onLegalLinkClick.invoke("https://" + a0a.d + "/legal/recommendations");
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(krv0.m(R.attr.vk_ui_text_link_themed, this.c));
    }
}
