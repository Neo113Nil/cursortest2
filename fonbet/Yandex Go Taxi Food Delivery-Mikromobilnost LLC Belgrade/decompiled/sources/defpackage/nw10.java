package defpackage;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import defpackage.fxa1;
import defpackage.jng0;
import defpackage.nw10;
import defpackage.oyh0;

/* loaded from: classes15.dex */
public final class nw10 {
    public final sls a;
    public final TextView b;
    public final View c;

    public nw10(LayoutInflater layoutInflater, sls slsVar, final sls slsVar2, final sls slsVar3) {
        this.a = slsVar;
        final View inflate = layoutInflater.inflate(olh0.msg_v_ai_bot_action_img_and_txt_item, (ViewGroup) null);
        this.b = (TextView) inflate.findViewById(e9h0.ai_bot_action_txt);
        ImageView imageView = (ImageView) inflate.findViewById(e9h0.ai_bot_action_icon);
        if (imageView != null) {
            imageView.setImageResource(wwg0.msg_ic_message_translation_button);
            imageView.getDrawable().setTint(drb1.c(jng0.messagingCommonIconsSecondaryColor, imageView.getContext()));
        }
        inflate.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.messaging.internal.view.timeline.translations.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nw10 nw10Var = nw10.this;
                TextView textView = nw10Var.b;
                View view2 = inflate;
                Resources resources = view2.getResources();
                MessageTextTranslationHelper$getTranslationButton$2$1 messageTextTranslationHelper$getTranslationButton$2$1 = (MessageTextTranslationHelper$getTranslationButton$2$1) nw10Var.a;
                textView.setText(resources.getString(((Boolean) messageTextTranslationHelper$getTranslationButton$2$1.invoke()).booleanValue() ? oyh0.translator_chat_translate_text : oyh0.translator_chat_show_original_text));
                textView.setTextColor(fxa1.c(jng0.messagingCommonIconsSecondaryColor, view2.getContext()).data);
                if (((Boolean) messageTextTranslationHelper$getTranslationButton$2$1.invoke()).booleanValue()) {
                    ((MessageTextTranslationHelper$getTranslationButton$2$2) slsVar2).invoke();
                } else {
                    ((MessageTextTranslationHelper$getTranslationButton$2$3) slsVar3).invoke();
                }
            }
        });
        this.c = inflate;
    }
}
