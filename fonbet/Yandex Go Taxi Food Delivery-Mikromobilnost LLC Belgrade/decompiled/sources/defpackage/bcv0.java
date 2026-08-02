package defpackage;

import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.messaging.internal.entities.Suggest;

/* loaded from: classes15.dex */
public final class bcv0 implements kh00 {
    public boolean a;
    public final /* synthetic */ AppCompatTextView b;
    public final /* synthetic */ boolean c;

    public bcv0(AppCompatTextView appCompatTextView, Suggest suggest, sls slsVar, boolean z) {
        this.b = appCompatTextView;
        this.c = z;
        appCompatTextView.setText(suggest.getText());
        appCompatTextView.setContentDescription(suggest.getText());
        appCompatTextView.setTag(e9h0.ai_bot_suggest_original_text_tag, suggest.getText());
        appCompatTextView.setOnClickListener(new tai0(25, this, slsVar));
    }

    @Override // defpackage.kh00
    public final boolean a() {
        this.a = false;
        AppCompatTextView appCompatTextView = this.b;
        appCompatTextView.setTextColor(drb1.c(jng0.messagingOutgoingPrimaryColor, appCompatTextView.getContext()));
        nib1.b(appCompatTextView, this.c, true);
        return true;
    }

    @Override // defpackage.kh00
    public final void b() {
        this.a = true;
        AppCompatTextView appCompatTextView = this.b;
        appCompatTextView.setTextColor(drb1.c(jng0.messagingCommonSuggestDisabledTextColor, appCompatTextView.getContext()));
        nib1.b(appCompatTextView, this.c, false);
    }

    @Override // defpackage.kh00
    public final void c() {
        this.a = true;
        AppCompatTextView appCompatTextView = this.b;
        appCompatTextView.setTextColor(drb1.c(jng0.messagingCommonSuggestDisabledTextColor, appCompatTextView.getContext()));
        nib1.b(appCompatTextView, this.c, false);
    }
}
