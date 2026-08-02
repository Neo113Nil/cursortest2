package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.auth.api.models.AuthResult;
import com.vk.auth.main.SignUpData;
import com.vk.auth.validation.VkPhoneValidationCompleteResult;
import com.vk.auth.validation.VkPhoneValidationErrorReason;
import com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetBehavior;
import com.vk.superapp.api.dto.auth.validatephonecheck.AuthValidatePhoneCheckResponse;
import com.vkontakte.android.R;

/* compiled from: MusicSubscriptionsWasBoughtVerifyPhoneController.kt */
/* loaded from: classes3.dex */
public final class o950 extends bh6 implements s25 {
    public final AppCompatActivity n;
    public final r55 o;
    public final q55 p;
    public final AuthValidatePhoneCheckResponse q;
    public boolean r;
    public int s;

    public o950(AppCompatActivity appCompatActivity, AuthValidatePhoneCheckResponse authValidatePhoneCheckResponse) {
        r55 r55Var = r55.a;
        q55 q55Var = q55.a;
        this.n = appCompatActivity;
        this.o = r55Var;
        this.p = q55Var;
        this.q = authValidatePhoneCheckResponse;
        CustomisableBottomSheetBehavior<FrameLayout> customisableBottomSheetBehavior = new CustomisableBottomSheetBehavior<>(appCompatActivity);
        customisableBottomSheetBehavior.i = true;
        customisableBottomSheetBehavior.I(iah0.u());
        customisableBottomSheetBehavior.J(3);
        this.k = customisableBottomSheetBehavior;
        this.d = false;
        this.g = new kn40(this, 1);
    }

    @Override // xsna.s25
    public final void h(VkPhoneValidationCompleteResult vkPhoneValidationCompleteResult) {
        bn40.d(new Object[0]);
        this.p.getClass();
        q55.e(this);
        CustomisableBottomSheetBehavior<FrameLayout> customisableBottomSheetBehavior = this.k;
        if (customisableBottomSheetBehavior != null) {
            customisableBottomSheetBehavior.J(5);
        }
    }

    @Override // xsna.s25
    public final void v(VkPhoneValidationErrorReason vkPhoneValidationErrorReason) {
        CustomisableBottomSheetBehavior<FrameLayout> customisableBottomSheetBehavior;
        bn40.d("reason = ", vkPhoneValidationErrorReason);
        this.p.getClass();
        q55.e(this);
        boolean z = true;
        if (vkPhoneValidationErrorReason == VkPhoneValidationErrorReason.API) {
            int i = this.s + 1;
            this.s = i;
            if (i < 2) {
                z = false;
            }
        }
        this.r = z;
        if (!z || (customisableBottomSheetBehavior = this.k) == null) {
            return;
        }
        customisableBottomSheetBehavior.J(5);
    }

    @Override // xsna.bh6
    public final View z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.popup_music_was_bought_v2, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.music_bought_subscription_title)).setText(R.string.music_popup_subscription_was_bougth_title);
        ((TextView) inflate.findViewById(R.id.music_bought_subscription_content)).setText(R.string.music_popup_subscription_was_bougth_subtitle_v2);
        TextView textView = (TextView) inflate.findViewById(R.id.music_bought_subscription_action_button);
        textView.setText(R.string.confirm_tag);
        textView.setOnClickListener(new com.vk.im.video.d(this, 9));
        return inflate;
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
