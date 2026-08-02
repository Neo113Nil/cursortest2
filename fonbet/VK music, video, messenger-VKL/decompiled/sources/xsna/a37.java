package xsna;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.vk.auth.enteremail.binding.BindEnteredEmailArgs;
import com.vk.auth.enteremail.binding.BindEnteredEmailScreenData;
import com.vk.auth.verification.base.ui.VkCheckEditText;
import com.vk.core.view.components.button.VkButton;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vkontakte.android.R;

/* compiled from: BindEnteredEmailFragment.kt */
/* loaded from: classes15.dex */
public final class a37 extends a66<x27> implements y27 {
    public TextView s;
    public VkCheckEditText t;
    public VkButton u;
    public TextView v;
    public io.reactivex.rxjava3.disposables.c w;
    public ProgressBar x;
    public boolean y;
    public int z;

    /* compiled from: BindEnteredEmailFragment.kt */
    public static final class a {
        public static Bundle a(BindEnteredEmailArgs bindEnteredEmailArgs) {
            String str = bindEnteredEmailArgs.b;
            String str2 = bindEnteredEmailArgs.c;
            boolean z = bindEnteredEmailArgs.d;
            Integer num = bindEnteredEmailArgs.e;
            int intValue = num != null ? num.intValue() : 60;
            Integer num2 = bindEnteredEmailArgs.f;
            BindEnteredEmailScreenData bindEnteredEmailScreenData = new BindEnteredEmailScreenData(str, str2, z, intValue, num2 != null ? num2.intValue() : 6);
            Bundle bundle = new Bundle();
            bundle.putParcelable("screen_args_key", bindEnteredEmailScreenData);
            return bundle;
        }
    }

    @Override // xsna.y27
    public final void F6(String str) {
        TextView textView;
        TextView textView2 = this.v;
        if (textView2 != null) {
            textView2.setVisibility(str != null ? 0 : 8);
        }
        if (str == null || (textView = this.v) == null) {
            return;
        }
        textView.setText(getString(R.string.vk_auth_bind_entered_email_resend_timeout_format, str));
    }

    @Override // xsna.y27
    public final void Pc() {
        View view = getView();
        if (view != null) {
            view.postDelayed(new cs2(this, 2), 150L);
        }
    }

    @Override // xsna.a66, xsna.x65
    public final void S(boolean z) {
        ProgressBar progressBar = this.x;
        if (progressBar != null) {
            progressBar.setVisibility(z ? 0 : 8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return wn(R.layout.vk_bind_entered_email_fragment, layoutInflater, viewGroup);
    }

    @Override // xsna.a66, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        io.reactivex.rxjava3.disposables.c cVar = this.w;
        if (cVar != null) {
            cVar.dispose();
        }
        this.w = null;
    }

    @Override // xsna.a66, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (this.y) {
            this.y = false;
            View view = getView();
            if (view != null) {
                view.post(new z27(this, 0));
            }
        }
    }

    @Override // xsna.a66, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.y = true;
    }

    @Override // xsna.a66, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.s = (TextView) view.findViewById(R.id.bind_entered_email_subtitle);
        this.t = (VkCheckEditText) view.findViewById(R.id.bind_entered_email_edit_text);
        this.u = (VkButton) view.findViewById(R.id.bind_entered_email_retry_button);
        this.v = (TextView) view.findViewById(R.id.bind_entered_email_timer_text);
        this.x = (ProgressBar) view.findViewById(R.id.bind_entered_email_progress_bar);
        Object obj = this.o;
        if (obj == null) {
            obj = null;
        }
        ((x27) obj).y0(this);
        VkCheckEditText vkCheckEditText = this.t;
        if (vkCheckEditText != null) {
            vkCheckEditText.setDigitsNumber(this.z);
        }
        VkCheckEditText vkCheckEditText2 = this.t;
        this.w = vkCheckEditText2 != null ? hg1.h(new qno0(vkCheckEditText2.c), new com.vk.im.engine.internal.storage.delegates.messages.b(this, 12)) : null;
        VkButton vkButton = this.u;
        if (vkButton != null) {
            jjc.g(vkButton, new r7(this, 10));
        }
    }

    @Override // xsna.y27
    public final void q4(String str) {
        VkCheckEditText vkCheckEditText = this.t;
        if (vkCheckEditText != null) {
            vkCheckEditText.setText(str);
        }
        VkCheckEditText vkCheckEditText2 = this.t;
        if (vkCheckEditText2 != null) {
            vkCheckEditText2.setSelection(str.length());
        }
    }

    @Override // xsna.y27
    public final void qf(boolean z) {
        VkButton vkButton = this.u;
        if (vkButton != null) {
            vkButton.setVisibility(z ? 0 : 8);
        }
    }

    @Override // xsna.y27
    public final void setSubtitle(String str) {
        String string = getString(R.string.vk_auth_bind_entered_email_subtitle_format, str);
        SpannableString spannableString = new SpannableString(string);
        int K = drm0.K(0, 6, string, str, false);
        int length = str.length() + K;
        if (K != -1) {
            spannableString.setSpan(new ForegroundColorSpan(krv0.m(R.attr.vk_ui_text_primary, requireContext())), K, length, 33);
        }
        TextView textView = this.s;
        if (textView != null) {
            textView.setText(spannableString);
        }
    }

    @Override // xsna.y27
    public final void th() {
        VkCheckEditText vkCheckEditText = this.t;
        if (vkCheckEditText != null) {
            vkCheckEditText.setText("");
        }
        VkCheckEditText vkCheckEditText2 = this.t;
        if (vkCheckEditText2 != null) {
            vkCheckEditText2.setSelection(0);
        }
        VkCheckEditText vkCheckEditText3 = this.t;
        if (vkCheckEditText3 != null) {
            vkCheckEditText3.h(getString(R.string.vk_auth_wrong_code));
        }
    }

    @Override // xsna.a66
    public final x27 tn(Bundle bundle) {
        BindEnteredEmailScreenData bindEnteredEmailScreenData;
        Bundle arguments = getArguments();
        if (arguments == null || (bindEnteredEmailScreenData = (BindEnteredEmailScreenData) arguments.getParcelable("screen_args_key")) == null) {
            throw new IllegalStateException("Opening fragment without sid arg");
        }
        this.z = bindEnteredEmailScreenData.f;
        return new c37(bindEnteredEmailScreenData, bundle);
    }

    @Override // xsna.a66, xsna.arf0
    public final SchemeStatSak$EventScreen u5() {
        return SchemeStatSak$EventScreen.EMAIL_VERIFICATION;
    }

    @Override // xsna.x65
    public final void wm(boolean z) {
        VkButton vkButton = this.u;
        if (vkButton != null) {
            vkButton.setEnabled(!z);
        }
        VkCheckEditText vkCheckEditText = this.t;
        if (vkCheckEditText != null) {
            vkCheckEditText.setIsEnabled(!z);
        }
    }
}
