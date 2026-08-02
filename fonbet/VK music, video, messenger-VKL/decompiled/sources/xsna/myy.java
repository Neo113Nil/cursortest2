package xsna;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.ShitAttachment;
import xsna.ryy;

/* compiled from: LeadFormContactsHolder.kt */
/* loaded from: classes4.dex */
public final class myy extends ClickableSpan {
    public final /* synthetic */ com.vk.newsfeed.common.recycler.holders.b b;

    public myy(com.vk.newsfeed.common.recycler.holders.b bVar) {
        this.b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        gd60 a = hd60.a();
        com.vk.newsfeed.common.recycler.holders.b bVar = this.b;
        Context context = bVar.itemView.getContext();
        ShitAttachment.LeadForm.Agreement agreement = ((ryy.b) bVar.m).d;
        gd60.Q0(a, context, agreement.b, agreement.c, null, null, 24);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(dhr0.t.c(R.attr.vk_ui_text_subhead));
    }
}
