package xsna;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.auth.api.models.AuthResult;
import com.vk.auth.main.SignUpData;
import com.vk.auth.validation.VkPhoneValidationCompleteResult;
import com.vk.auth.validation.VkPhoneValidationErrorReason;
import com.vk.music.notifications.inapp.InAppNotification;
import com.vk.superapp.api.dto.auth.validatephonecheck.AuthValidatePhoneCheckResponse;
import com.vkontakte.android.R;
import com.vkontakte.android.VKActivity;
import ru.ok.android.commons.http.Http;

/* compiled from: MusicSubscriptionsWasBoughtVerifyPhonePopup.kt */
/* loaded from: classes3.dex */
public final class p950 extends com.vk.music.notifications.inapp.c implements s25 {
    public final VKActivity i;
    public final r55 j;
    public final q55 k;
    public final AuthValidatePhoneCheckResponse l;
    public boolean m;
    public int n;
    public final InAppNotification.DisplayingStrategy o;
    public final int p;

    public p950(VKActivity vKActivity, AuthValidatePhoneCheckResponse authValidatePhoneCheckResponse) {
        r55 r55Var = r55.a;
        q55 q55Var = q55.a;
        this.i = vKActivity;
        this.j = r55Var;
        this.k = q55Var;
        this.l = authValidatePhoneCheckResponse;
        this.o = InAppNotification.DisplayingStrategy.REPLACE_ANY;
        this.p = R.layout.popup_music_was_bought_v2;
    }

    @Override // com.vk.music.notifications.inapp.c, com.vk.music.notifications.inapp.InAppNotification
    public final InAppNotification.DisplayingStrategy E() {
        return this.o;
    }

    @Override // com.vk.music.notifications.inapp.InAppNotification
    public final int G() {
        return this.p;
    }

    @Override // com.vk.music.notifications.inapp.InAppNotification
    public final void d3(View view) {
        ((TextView) view.findViewById(R.id.music_bought_subscription_title)).setText(R.string.music_popup_subscription_was_bougth_title);
        ((TextView) view.findViewById(R.id.music_bought_subscription_content)).setText(R.string.music_popup_subscription_was_bougth_subtitle_v2);
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.music_bought_subscription_container);
        constraintLayout.setMinHeight(iah0.a(576));
        constraintLayout.setMaxWidth(iah0.a(Http.StatusCode.RANGE_NOT_SATISFIABLE));
        TextView textView = (TextView) view.findViewById(R.id.music_bought_subscription_action_button);
        textView.setText(R.string.confirm_tag);
        textView.setOnClickListener(new zh0(this, 4));
    }

    @Override // xsna.s25
    public final void h(VkPhoneValidationCompleteResult vkPhoneValidationCompleteResult) {
        bn40.f(new Object[0]);
        this.k.getClass();
        q55.e(this);
        d();
    }

    @Override // xsna.s25
    public final void v(VkPhoneValidationErrorReason vkPhoneValidationErrorReason) {
        bn40.f("reason = ", vkPhoneValidationErrorReason);
        this.k.getClass();
        q55.e(this);
        boolean z = true;
        if (vkPhoneValidationErrorReason == VkPhoneValidationErrorReason.API) {
            int i = this.n + 1;
            this.n = i;
            if (i < 2) {
                z = false;
            }
        }
        this.m = z;
        if (z) {
            d();
        }
    }

    @Override // xsna.s25
    public final void A() {
    }

    @Override // xsna.s25
    public final void m() {
    }

    @Override // xsna.s25
    public final void o() {
    }

    @Override // xsna.s25
    public final void p() {
    }

    @Override // xsna.s25
    public final void t() {
    }

    @Override // xsna.s25
    public final void u() {
    }

    @Override // xsna.s25
    public final void b(String str) {
    }

    @Override // xsna.s25
    @ozl
    public final void l(jq0 jq0Var) {
    }

    @Override // xsna.s25
    public final void n(AuthResult authResult) {
    }

    @Override // xsna.s25
    public final void r(t6v0 t6v0Var) {
    }

    @Override // xsna.s25
    public final void j(long j, SignUpData signUpData) {
    }
}
