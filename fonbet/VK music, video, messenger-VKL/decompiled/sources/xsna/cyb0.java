package xsna;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.vk.stickers.settings.StickerSettingsFragment;
import com.vkontakte.android.R;

/* compiled from: PopupStickersAutoplaySettingComponent.kt */
/* loaded from: classes2.dex */
public final class cyb0 extends ClickableSpan {
    public final /* synthetic */ Context b;

    public cyb0(Context context) {
        this.b = context;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        new StickerSettingsFragment.a().k(this.b);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(e3m.f(R.attr.vk_ui_text_link_themed, this.b));
    }
}
