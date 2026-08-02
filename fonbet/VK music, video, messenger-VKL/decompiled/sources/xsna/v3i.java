package xsna;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.vkontakte.android.R;

/* compiled from: CommunityTitleViewDataDelegate.kt */
/* loaded from: classes5.dex */
public final class v3i extends ClickableSpan {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v3i(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                ((gzs) this.c).invoke();
                break;
            default:
                if (!jjc.b()) {
                    qvl qvlVar = (qvl) this.c;
                    qvlVar.o.f8(16, (iag) qvlVar.m, qvlVar);
                    break;
                }
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        switch (this.b) {
            case 1:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(e3m.f(R.attr.vk_ui_text_link, ((qvl) this.c).itemView.getContext()));
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }
}
