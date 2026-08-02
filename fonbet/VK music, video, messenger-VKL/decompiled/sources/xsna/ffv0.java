package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.ui.themes.VKReplacerView;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.external.miniapp.net.app.WebPhoto;
import com.vk.superapp.api.dto.app.WebSubscriptionInfo;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VkRedesignSubscriptionSheetDialog.kt */
/* loaded from: classes6.dex */
public final class ffv0 extends dw20 {
    public WebApiApplication f1;
    public WebSubscriptionInfo g1;
    public LinearLayout h1;
    public NestedScrollView i1;
    public FrameLayout j1;
    public View k1;
    public View l1;
    public rns0 m1;
    public ew3 n1;
    public p210 o1;
    public boolean p1;

    public ffv0() {
        this.J0 = iah0.a(580);
    }

    public final void Yn(int i) {
        int i2;
        String string;
        float f = 580;
        this.J0 = iah0.a(f);
        boolean z = false;
        if (i == 1) {
            LinearLayout linearLayout = this.h1;
            if (linearLayout == null) {
                linearLayout = null;
            }
            linearLayout.setOrientation(1);
            NestedScrollView nestedScrollView = this.i1;
            if (nestedScrollView == null) {
                nestedScrollView = null;
            }
            nestedScrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            NestedScrollView nestedScrollView2 = this.i1;
            if (nestedScrollView2 == null) {
                nestedScrollView2 = null;
            }
            nestedScrollView2.setBackground(null);
            View view = this.k1;
            if (view == null) {
                view = null;
            }
            view.setVisibility(8);
            View view2 = this.l1;
            if (view2 == null) {
                view2 = null;
            }
            view2.setVisibility(0);
            i2 = Zn() ? R.layout.vk_subscription_button_vertical_trial : R.layout.vk_subscription_button_horizontal;
        } else {
            if (Zn()) {
                this.J0 = iah0.a(IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED);
            }
            LinearLayout linearLayout2 = this.h1;
            if (linearLayout2 == null) {
                linearLayout2 = null;
            }
            linearLayout2.setOrientation(0);
            NestedScrollView nestedScrollView3 = this.i1;
            if (nestedScrollView3 == null) {
                nestedScrollView3 = null;
            }
            nestedScrollView3.setLayoutParams(new LinearLayout.LayoutParams(iah0.a(300), -2));
            NestedScrollView nestedScrollView4 = this.i1;
            if (nestedScrollView4 == null) {
                nestedScrollView4 = null;
            }
            nestedScrollView4.setBackgroundResource(R.drawable.vk_bg_subscription_horizontal);
            View view3 = this.l1;
            if (view3 == null) {
                view3 = null;
            }
            view3.setVisibility(8);
            NestedScrollView nestedScrollView5 = this.i1;
            if (nestedScrollView5 == null) {
                nestedScrollView5 = null;
            }
            nestedScrollView5.getViewTreeObserver().addOnGlobalLayoutListener(new dfv0(this));
            i2 = R.layout.vk_subscription_button_vertical;
        }
        if (i != 1 && Zn() && getResources().getDisplayMetrics().widthPixels < iah0.a(f)) {
            z = true;
        }
        LayoutInflater from = LayoutInflater.from(mo2getContext());
        FrameLayout frameLayout = this.j1;
        if (frameLayout == null) {
            frameLayout = null;
        }
        frameLayout.removeAllViews();
        View inflate = from.inflate(i2, (ViewGroup) null);
        FrameLayout frameLayout2 = this.j1;
        if (frameLayout2 == null) {
            frameLayout2 = null;
        }
        frameLayout2.addView(inflate);
        if (z) {
            float f2 = 4;
            f4m.l(iah0.a(f2), iah0.a(f2), inflate);
        }
        FrameLayout frameLayout3 = this.j1;
        if (frameLayout3 == null) {
            frameLayout3 = null;
        }
        TextView textView = (TextView) frameLayout3.findViewById(R.id.positive_button);
        if (z) {
            textView.setTextSize(13.0f);
            textView.setLetterSpacing(0.02f);
        }
        boolean Zn = Zn();
        if (Zn) {
            string = getString(R.string.vk_subscription_try_free);
        } else {
            if (Zn) {
                throw new NoWhenBranchMatchedException();
            }
            string = getString(R.string.vk_create_subscription_confirm);
        }
        textView.setText(string);
        jjc.g(textView, new q8i0(this, 28));
        FrameLayout frameLayout4 = this.j1;
        TextView textView2 = (TextView) (frameLayout4 != null ? frameLayout4 : null).findViewById(R.id.negative_button);
        if (z) {
            textView2.setTextSize(13.0f);
            textView2.setLetterSpacing(0.02f);
        }
        textView2.setText(getString(R.string.vk_bottomsheet_confirmation_cancel));
        textView2.setTextColor(krv0.m(R.attr.vk_ui_text_accent_themed, textView2.getContext()));
        jjc.g(textView2, new qjm0(this, 10));
    }

    public final boolean Zn() {
        WebSubscriptionInfo webSubscriptionInfo = this.g1;
        if (webSubscriptionInfo == null) {
            webSubscriptionInfo = null;
        }
        return webSubscriptionInfo.i > 0;
    }

    @Override // xsna.dw20, androidx.fragment.app.d, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        if (!this.p1) {
            ew3 ew3Var = this.n1;
            if (ew3Var == null) {
                ew3Var = null;
            }
            ew3Var.invoke();
        }
        this.p1 = false;
        dismiss();
    }

    @Override // xsna.dw20, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Yn(configuration.orientation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        String string;
        String string2;
        WebImageSize a;
        q0o0 q0o0Var = this instanceof q0o0 ? (q0o0) this : null;
        prw.h(this, q0o0Var != null ? q0o0Var.tag() : "VkSdkDialogFragment", null);
        View inflate = LayoutInflater.from(mo2getContext()).inflate(R.layout.vk_subscription_sheet_dialog, (ViewGroup) null, false);
        VKReplacerView vKReplacerView = (VKReplacerView) inflate.findViewById(R.id.image);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.description);
        TextView textView3 = (TextView) inflate.findViewById(R.id.condition);
        TextView textView4 = (TextView) inflate.findViewById(R.id.balance);
        TextView textView5 = (TextView) inflate.findViewById(R.id.payment_setting);
        this.h1 = (LinearLayout) inflate.findViewById(R.id.full_content_container);
        this.i1 = (NestedScrollView) inflate.findViewById(R.id.subscribe_content_container);
        this.j1 = (FrameLayout) inflate.findViewById(R.id.subs_buttons_container);
        this.l1 = inflate.findViewById(R.id.separator);
        this.k1 = inflate.findViewById(R.id.scrim_view);
        ifx0 ifx0Var = e370.c;
        if (ifx0Var == null) {
            ifx0Var = null;
        }
        VKImageController<View> create = ifx0Var.b().create(requireContext());
        WebApiApplication webApiApplication = this.f1;
        if (webApiApplication == null) {
            webApiApplication = null;
        }
        int i = webApiApplication.f() ? R.string.vk_subscription_in_game : R.string.vk_subscription_in_miniapp;
        WebSubscriptionInfo webSubscriptionInfo = this.g1;
        if ((webSubscriptionInfo == null ? null : webSubscriptionInfo).f != null) {
            if (webSubscriptionInfo == null) {
                webSubscriptionInfo = null;
            }
            string = webSubscriptionInfo.f;
        } else {
            WebApiApplication webApiApplication2 = this.f1;
            if (webApiApplication2 == null) {
                webApiApplication2 = null;
            }
            string = getString(i, webApiApplication2.c);
        }
        textView.setText(string);
        WebSubscriptionInfo webSubscriptionInfo2 = this.g1;
        if (webSubscriptionInfo2 == null) {
            webSubscriptionInfo2 = null;
        }
        String str = webSubscriptionInfo2.o;
        textView2.setVisibility((str == null || drm0.N(str)) ? 8 : 0);
        WebSubscriptionInfo webSubscriptionInfo3 = this.g1;
        if (webSubscriptionInfo3 == null) {
            webSubscriptionInfo3 = null;
        }
        textView2.setText(webSubscriptionInfo3.o);
        Context requireContext = requireContext();
        WebSubscriptionInfo webSubscriptionInfo4 = this.g1;
        if (webSubscriptionInfo4 == null) {
            webSubscriptionInfo4 = null;
        }
        String f = enj.f(R.plurals.vk_subscription_every_days, webSubscriptionInfo4.m, requireContext);
        Context requireContext2 = requireContext();
        WebSubscriptionInfo webSubscriptionInfo5 = this.g1;
        if (webSubscriptionInfo5 == null) {
            webSubscriptionInfo5 = null;
        }
        String f2 = enj.f(R.plurals.vk_votes_plural, webSubscriptionInfo5.h, requireContext2);
        if (Zn()) {
            Context requireContext3 = requireContext();
            WebSubscriptionInfo webSubscriptionInfo6 = this.g1;
            if (webSubscriptionInfo6 == null) {
                webSubscriptionInfo6 = null;
            }
            textView3.setText(enj.f(R.plurals.vk_subscription_free_days, webSubscriptionInfo6.i, requireContext3));
            textView4.setText(getString(R.string.vk_subscription_after, f2, f));
        } else {
            textView3.setText(getString(R.string.vk_subscription_condition, f2, f));
            Context requireContext4 = requireContext();
            WebSubscriptionInfo webSubscriptionInfo7 = this.g1;
            if (webSubscriptionInfo7 == null) {
                webSubscriptionInfo7 = null;
            }
            textView4.setText(getString(R.string.vk_confirm_payment_your_balance, enj.f(R.plurals.vk_votes_plural, webSubscriptionInfo7.g, requireContext4)));
        }
        WebSubscriptionInfo webSubscriptionInfo8 = this.g1;
        if (webSubscriptionInfo8 == null) {
            webSubscriptionInfo8 = null;
        }
        WebPhoto webPhoto = webSubscriptionInfo8.e;
        String str2 = (webPhoto == null || (a = webPhoto.a(iah0.a((float) 72))) == null) ? null : a.b;
        if (str2 == null || drm0.N(str2)) {
            vKReplacerView.setVisibility(8);
        } else {
            vKReplacerView.a(((com.vk.core.ui.image.c) create).getView());
            create.f(str2, new VKImageController.b(14.0f, null, false, 0, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, 65534));
        }
        String string3 = getString(R.string.vk_in_paiment_settings);
        if (Zn()) {
            Context requireContext5 = requireContext();
            int i2 = bix0.a;
            Context requireContext6 = requireContext();
            WebSubscriptionInfo webSubscriptionInfo9 = this.g1;
            string2 = requireContext5.getString(R.string.vk_next_bill_will_payment_settings, bix0.a((int) (webSubscriptionInfo9 != null ? webSubscriptionInfo9 : null).n, requireContext6), string3);
        } else {
            string2 = requireContext().getString(R.string.vk_you_can_cancel_subscription_always, string3);
        }
        int H = drm0.H(string2) - string3.length();
        int H2 = drm0.H(string2);
        SpannableString spannableString = new SpannableString(string2);
        efv0 efv0Var = new efv0(this);
        textView5.setLinksClickable(true);
        textView5.setMovementMethod(LinkMovementMethod.getInstance());
        spannableString.setSpan(efv0Var, H, H2, 33);
        textView5.setText(spannableString);
        Yn(getResources().getConfiguration().orientation);
        dw20.Rn(this, inflate, 2);
        return super.yn(bundle);
    }
}
